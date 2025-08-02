#include <stdio.h>
#include <string.h>

typedef struct Book {
    int bid, price;
    float rating;
    char bname[20], category[20], authorName[20];
} Book;

void addBookById(Book *, int *);
void displayBook(Book *, int);
void searchByBookName(Book *, int);
void searchById(Book *, int);
void searchByAuthorName(Book *, int);
void searchByrating(Book *, int);
void searchByCategory(Book *, int);
void removeBook(Book *, int *);
void updateBookById(Book *a1, int );
void sortBooks(Book *a1, int );

void main() {
    Book arr[3];
    int count = 0, n;

    do {
    	printf("\n ************* BOOK LIBRARY ************\n ");
        printf("\n1: Add Book By Id\n2: Display Books\n3: Search By Book Name\n4: Search By ID\n5: Search By Author Name\n6: Search By Rating\n");
        printf("7: Search By Category\n8: Remove Book by ID\n9: Update Book by ID\n10: Sort Books\n0: Exit\n");
        printf("\nEnter your choice:");
		scanf("%d", &n);

        switch (n) {
            case 1: addBookById(arr, &count); 
			break;
            case 2: displayBook(arr, count); 
			break;
            case 3: searchByBookName(arr, count); 
			break;
            case 4: searchById(arr, count); 
			break;
            case 5: searchByAuthorName(arr, count); 
			break;
            case 6: searchByRating(arr, count); 
			break;
            case 7: searchByCategory(arr, count); 
			break;
            case 8: removeBook(arr, &count); 
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
void addBookById(Book *a1, int *size) {
    int num;
    printf("\nEnter the Book ID: ");
    scanf("%d", &num);

    for (int i = 0; i < *size; i++) {
        if (num == a1[i].bid) {
            printf("Book with this ID already exists!\n");
            return;
        }
    }

    int pos = *size;
    a1[pos].bid = num;
    
//	printf("Enter Book ID: ");
//  scanf("%d", &a1[pos].Bid);
    getchar();
    
	printf("Enter Book Name: ");
    fgets(a1[pos].bname, sizeof(a1[pos].bname), stdin);
    a1[pos].bname[strcspn(a1[pos].bname, "\n")] = '\0';

    printf("Enter Author Name: ");
    fgets(a1[pos].authorName, sizeof(a1[pos].authorName), stdin);
    a1[pos].authorName[strcspn(a1[pos].authorName, "\n")] = '\0';

    printf("Enter Price: ");
    scanf("%d", &a1[pos].price);
	getchar();
	
    printf("Enter Category: ");
    fgets(a1[pos].category, sizeof(a1[pos].category), stdin);
    a1[pos].category[strcspn(a1[pos].category, "\n")] = '\0';

    printf("Enter Rating : ");
    scanf("%f", &a1[pos].rating);
    if(a1[pos].rating <= 10)
	{

	}
	else 
	{
    	printf("Invalid rating! Rating should be less than or equal to 10.\n");
    	printf("Enter the Rating : ");
    	scanf("%f", &a1[pos].rating);
	}
    (*size)++;
    printf("Book added successfully!\n");
    

}

// Display Books
void displayBook(Book *a1, int size) {
    if (size == 0) {
        printf("No books to display.\n");
        return;
    }

    for (int i = 0; i < size; i++) {
        printf("\n------ Book Details %d ------\n", i + 1);
        printf("Book ID     : %d\n", a1[i].bid);
        printf("Book Name   : %s\n", a1[i].bname);
        printf("Author Name : %s\n", a1[i].authorName);
        printf("Price       : %d\n", a1[i].price);
        printf("Category    : %s\n", a1[i].category);
        printf("Rating      : %.2f\n", a1[i].rating);
    }
}

// Search by Book Name
void searchByBookName(Book *a1, int size) {
    char name[20];
    int found = 0;
    printf("\nEnter Book Name to search: ");
    getchar();
    fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = '\0';
	
	for (int i = 0; i < size; i++) {
        if (strcmp(a1[i].bname, name) == 0) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].bid);
            printf("***Book Name : %s\n", a1[i].bname);
            printf("Author Name : %s\n", a1[i].authorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].category);
            printf("Rating      : %.2f\n", a1[i].rating);
            found = 1;
        }
    }
    if (!found)
        printf("Book '%s' is not available.\n", name);
}

// Search by ID
void searchById(Book *a1, int size) {
    int id, found = 0;
    printf("Enter Book ID to search: ");
    scanf("%d", &id);
    for (int i = 0; i < size; i++) {
        if (a1[i].bid == id) {
            printf("\nBook Found:\n");
            printf("***Book ID  : %d\n", a1[i].bid);
            printf("Book Name   : %s\n", a1[i].bname);
            printf("Author Name : %s\n", a1[i].authorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].category);
            printf("Rating      : %.2f\n", a1[i].rating);
            found = 1;
        }
    }
    if (!found)
        printf("Book ID %d is not available.\n", id);
}

// Search by Author Name
void searchByAuthorName(Book *a1, int size) {
    char name[20];
    int found = 0;
    printf("\nEnter Author Name to search: ");
    getchar();
	fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = '\0';  
	  
    for (int i = 0; i < size; i++) {
        if (strcmp(a1[i].authorName, name) == 0) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].bid);
            printf("Book Name   : %s\n", a1[i].bname);
            printf("***Author Name : %s\n", a1[i].authorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].category);
            printf("Rating      : %.2f\n", a1[i].rating);
            found = 1;
        }
    }
    if (!found)
        printf("Author '%s' has no books available.\n", name);
}

// Search by Rating
void searchByRating(Book *a1, int size) {
    float rating;
    int found = 0;
    printf("Enter Rating to search: ");
    scanf("%f", &rating);
    if(rating <= 10 && rating > 0 )
	{
			for (int i = 0; i < size; i++) {
       		 if (a1[i].rating == rating) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].bid);
            printf("Book Name   : %s\n", a1[i].bname);
            printf("Author Name : %s\n", a1[i].authorName);
            printf("Price       : %d\n", a1[i].price);
            printf("Category    : %s\n", a1[i].category);
            printf("***Rating   : %.2f\n", a1[i].rating);
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
void searchByCategory(Book *a1, int SIZE) {
    char name[20];
    int found = 0;
    printf("\nEnter Category to search: ");
    getchar();
	fgets(name, sizeof(name), stdin);
	name[strcspn(name, "\n")] = '\0';
	    
    for (int i = 0; i < SIZE; i++) {
        if (strcmp(a1[i].category, name) == 0) {
            printf("\nBook Found:\n");
            printf("Book ID     : %d\n", a1[i].bid);
            printf("Book Name   : %s\n", a1[i].bname);
            printf("Author Name : %s\n", a1[i].authorName);
            printf("Price       : %d\n", a1[i].price);
            printf("***Category : %s\n", a1[i].category);
            printf("Rating      : %.2f\n", a1[i].rating);
            found = 1;
        }
    }
    if (!found)
        printf("No books found in Category '%s'\n", name);
}

// Remove Book
void removeBook(Book *a1, int *size) {
    int id, found = 0;
    printf("Enter Book ID to delete: ");
    scanf("%d", &id);

    for (int i = 0; i < *size; i++) {
        if (a1[i].bid == id) {
            for (int j = i; j < *size - 1; j++) {
                a1[j] = a1[j + 1];
            }
            (*size)--;
            printf("Book deleted successfully!\n");
            found = 1;
            break;
        }
    }
    if (!found)
        printf("Book with ID %d not found.\n", id);
}

//update Book
void updateBookById(Book *a1, int size) {
    int id,n, found = 0;
    printf("Enter Book ID to update: ");
    scanf("%d", &id);

    for (int i = 0; i < size; i++) {
        if (a1[i].bid == id) {
            found = 1;
            printf("\nEnter which term you update:\n");
        	printf("1: Book Name\n2: Author Name\n3: New Price\n4: New Category\n5: New Rating\n");
        	scanf("%d",&n);
			switch (n) 
			{
            	case 1: printf("Enter new Book Name: ");
            			scanf("%s", a1[i].bname);
				break;
            	case 2: printf("Enter new Author Name: ");
            			scanf("%s", a1[i].authorName); 
				break;
            	case 3: printf("Enter new Price: ");
            			scanf("%d", &a1[i].price);
				break;
				case 4: printf("Enter new Category: ");
            			scanf("%s", a1[i].category);
				break;
				case 5: printf("Enter new Rating: ");
						scanf("%f", &a1[i].rating);
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
void sortBooks(Book *a1, int size) {
    int choice;

    if (size == 0) {
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

    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            int shouldSwap = 0;

            switch (choice) {
                case 1:
                    if (a1[i].bid > a1[j].bid)
                        shouldSwap = 1;
                    break;
                case 2:
                    if (a1[i].price > a1[j].price)
                        shouldSwap = 1;
                    break;
                case 3:
                    if (a1[i].rating > a1[j].rating)
                        shouldSwap = 1;
                    break;
                case 4:
                    if (strcmp(a1[i].bname, a1[j].bname) > 0)
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

