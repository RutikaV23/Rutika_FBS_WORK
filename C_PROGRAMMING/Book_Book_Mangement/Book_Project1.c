#include <stdio.h>
#include <string.h>

typedef struct Book {
    int Bid, price;
    float Rating;
    char Bname[20], Category[20], AuthorName[20];
} Book;

void AddBookById(Book *, int *);
void displayBook(Book *, int);
void SearchByBookName(Book *, int);
void SearchById(Book *, int);
void SearchByAuthorName(Book *, int);
void SearchByRating(Book *, int);
void SearchByCategory(Book *, int);
void RemoveBook(Book *, int *);
void updateBookById(Book *a1, int SIZE);
void sortBooks(Book *a1, int SIZE);

void main() {
    Book arr[30];
    int count = 0, n;

    do {
    	printf("\n ************* BOOK LIBRARY ************\n ");
        printf("\n1: Add Book By Id\n2: Display Books\n3: Search By Book Name\n4: Search By ID\n5: Search By Author Name\n6: Search By Rating\n");
        printf("7: Search By Category\n8: Remove Book by ID\n9: Update Book by ID\n10: Sort Books\n0: Exit\n");
        printf("\nEnter your choice:");
		scanf("%d", &n);

        switch (n) {
            case 1: AddBookById(arr, &count); 
			break;
            case 2: displayBook(arr, count); 
			break;
            case 3: SearchByBookName(arr, count); 
			break;
            case 4: SearchById(arr, count); 
			break;
            case 5: SearchByAuthorName(arr, count); 
			break;
            case 6: SearchByRating(arr, count); 
			break;
            case 7: SearchByCategory(arr, count); 
			break;
            case 8: RemoveBook(arr, &count); 
			break;
            case 9: updateBookById(arr, count); 
			break;
			case 10: sortBooks(arr, count); 
			break;
            case 0: printf("Exiting...\n"); 
			break;
            default: printf("Invalid Number\n");
        }

    } while (n != 0);
}

// Add Book
void AddBookById(Book *a1, int *SIZE) {
    int num;
    printf("\nEnter the Book ID: ");
    scanf("%d", &num);

    for (int i = 0; i < *SIZE; i++) {
        if (num == a1[i].Bid) {
            printf("Book with this ID already exists!\n");
            return;
        }
    }

    int pos = *SIZE;
    a1[pos].Bid = num;
//	printf("Enter Book ID: ");
//    scanf("%d", &a1[pos].Bid);
    getchar();
    
	printf("Enter Book Name: ");
    fgets(a1[pos].Bname, sizeof(a1[pos].Bname), stdin);
    a1[pos].Bname[strcspn(a1[pos].Bname, "\n")] = '\0';

    printf("Enter Author Name: ");
    fgets(a1[pos].AuthorName, sizeof(a1[pos].AuthorName), stdin);
    a1[pos].AuthorName[strcspn(a1[pos].AuthorName, "\n")] = '\0';

    printf("Enter Price: ");
    scanf("%d", &a1[pos].price);
	getchar();
	
    printf("Enter Category: ");
    fgets(a1[pos].Category, sizeof(a1[pos].Category), stdin);
    a1[pos].Category[strcspn(a1[pos].Category, "\n")] = '\0';

    printf("Enter Rating : ");
    scanf("%f", &a1[pos].Rating);
    if(a1[pos].Rating <= 10)
	{
		printf("");
	}
	else 
	{
    	printf("Invalid rating! Rating should be less than or equal to 10.\n");
	}
    (*SIZE)++;
    printf("Book added successfully!\n");
}

// Display Books
void displayBook(Book *a1, int SIZE) {
    if (SIZE == 0) {
        printf("No books to display.\n");
        return;
    }

    for (int i = 0; i < SIZE; i++) {
        printf("\n------ Book Details %d ------\n", i + 1);
        printf("Book ID     : %d\n", a1[i].Bid);
        printf("Book Name   : %s\n", a1[i].Bname);
        printf("Author Name : %s\n", a1[i].AuthorName);
        printf("Price       : %d\n", a1[i].price);
        printf("Category    : %s\n", a1[i].Category);
        printf("Rating      : %.2f\n", a1[i].Rating);
    }
}

// Search by Book Name
void SearchByBookName(Book *a1, int SIZE) {
    char name[20];
    int found = 0;
    printf("\nEnter Book Name to search: ");
    fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = '\0';
	
	for (int i = 0; i < SIZE; i++) {
        if (strcmp(a1[i].Bname, name) == 0) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].Bid);
            printf("***Book Name : %s\n", a1[i].Bname);
            printf("Author Name : %s\n", a1[i].AuthorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].Category);
            printf("Rating      : %.2f\n", a1[i].Rating);
            found = 1;
        }
    }
    if (!found)
        printf("Book '%s' is not available.\n", name);
}

// Search by ID
void SearchById(Book *a1, int SIZE) {
    int id, found = 0;
    printf("Enter Book ID to search: ");
    scanf("%d", &id);
    for (int i = 0; i < SIZE; i++) {
        if (a1[i].Bid == id) {
            printf("\nBook Found:\n");
            printf("***Book ID  : %d\n", a1[i].Bid);
            printf("Book Name   : %s\n", a1[i].Bname);
            printf("Author Name : %s\n", a1[i].AuthorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].Category);
            printf("Rating      : %.2f\n", a1[i].Rating);
            found = 1;
        }
    }
    if (!found)
        printf("Book ID %d is not available.\n", id);
}

// Search by Author Name
void SearchByAuthorName(Book *a1, int SIZE) {
    char name[20];
    int found = 0;
    printf("\nEnter Author Name to search: ");
	fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = '\0';  
	  
    for (int i = 0; i < SIZE; i++) {
        if (strcmp(a1[i].AuthorName, name) == 0) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].Bid);
            printf("Book Name   : %s\n", a1[i].Bname);
            printf("***Author Name : %s\n", a1[i].AuthorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].Category);
            printf("Rating      : %.2f\n", a1[i].Rating);
            found = 1;
        }
    }
    if (!found)
        printf("Author '%s' has no books available.\n", name);
}

// Search by Rating
void SearchByRating(Book *a1, int SIZE) {
    float rating;
    int found = 0;
    printf("Enter Rating to search: ");
    scanf("%f", &rating);
    if(rating <= 10 && rating > 0 )
	{
			for (int i = 0; i < SIZE; i++) {
       		 if (a1[i].Rating == rating) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].Bid);
            printf("Book Name   : %s\n", a1[i].Bname);
            printf("Author Name : %s\n", a1[i].AuthorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].Category);
            printf("***Rating   : %.2f\n", a1[i].Rating);
            found = 1;
        	}
    	}
	}
	else
	{
		printf("The Rating is Invalid \nEnter the rating between 1 to 10 :");
	}
    
    if (!found)
        printf("No books found with Rating %.2f\n", rating);
}

// Search by Category
void SearchByCategory(Book *a1, int SIZE) {
    char category[20];
    int found = 0;
    printf("\nEnter Category to search: ");
    fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = '\0';
    
    for (int i = 0; i < SIZE; i++) {
        if (strcmp(a1[i].Category, category) == 0) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].Bid);
            printf("Book Name   : %s\n", a1[i].Bname);
            printf("Author Name : %s\n", a1[i].AuthorName);
            printf("Price       : %d\n", a1[i].price);
            printf("***Category : %s\n", a1[i].Category);
            printf("Rating      : %.2f\n", a1[i].Rating);
            found = 1;
        }
    }
    if (!found)
        printf("No books found in Category '%s'\n", category);
}

// Remove Book
void RemoveBook(Book *a1, int *SIZE) {
    int id, found = 0;
    printf("Enter Book ID to delete: ");
    scanf("%d", &id);

    for (int i = 0; i < *SIZE; i++) {
        if (a1[i].Bid == id) {
            for (int j = i; j < *SIZE - 1; j++) {
                a1[j] = a1[j + 1];
            }
            (*SIZE)--;
            printf("Book deleted successfully!\n");
            found = 1;
            break;
        }
    }
    if (!found)
        printf("Book with ID %d not found.\n", id);
}

//update Book
void updateBookById(Book *a1, int SIZE) {
    int id,n, found = 0;
    printf("Enter Book ID to update: ");
    scanf("%d", &id);

    for (int i = 0; i < SIZE; i++) {
        if (a1[i].Bid == id) {
            found = 1;
            printf("\nEnter which term you update:\n");
        	printf("1: Book Name\n2: Author Name\n3: New Price\n4: New Category\n5: New Rating\n");
        	scanf("%d",&n);
			switch (n) 
			{
            	case 1: printf("Enter new Book Name: ");
            			scanf("%s", a1[i].Bname);
				break;
            	case 2: printf("Enter new Author Name: ");
            			scanf("%s", a1[i].AuthorName); 
				break;
            	case 3: printf("Enter new Price: ");
            			scanf("%d", &a1[i].price);
				break;
				case 4: printf("Enter new Category: ");
            			scanf("%s", a1[i].Category);
				break;
				case 5: printf("Enter new Rating: ");
						scanf("%f", &a1[i].Rating);
				break;
            	case 0: printf("Exiting...\n"); 
				break;
            	default: printf("Invalid Number\n");
        	}

            printf("Book updated successfully!\n");
            break;
        }
    }

    if (!found) {
        printf("Book with ID %d not found.\n", id);
    }
}

//sort Book
void sortBooks(Book *a1, int SIZE) {
    int choice;

    if (SIZE == 0) {
        printf("No books to sort\n");
        return;
    }

    printf("\nSort books by:\n");
    printf("1. Book ID\n");
    printf("2. Price\n");
    printf("3. Rating\n");
    printf("4. Book Name (Alphabetical)\n");
    printf("Enter choice: ");
    scanf("%d", &choice);

    Book temp;

    for (int i = 0; i < SIZE - 1; i++) {
        for (int j = i + 1; j < SIZE; j++) {
            int shouldSwap = 0;

            switch (choice) {
                case 1:
                    if (a1[i].Bid > a1[j].Bid)
                        shouldSwap = 1;
                    break;
                case 2:
                    if (a1[i].price > a1[j].price)
                        shouldSwap = 1;
                    break;
                case 3:
                    if (a1[i].Rating > a1[j].Rating)
                        shouldSwap = 1;
                    break;
                case 4:
                    if (strcmp(a1[i].Bname, a1[j].Bname) > 0)
                        shouldSwap = 1;
                    break;
                default:
                    printf("Invalid choice.\n");
                    return;
            }

            if (shouldSwap) {
                temp = a1[i];
                a1[i] = a1[j];
                a1[j] = temp;
            }
        }
    }

    printf("\nBooks sorted successfully!\n");
    
}

