import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String authorName;
    String category;
    double rating;
    double price;

    Book() { //default constructor
        this(100,"Not Given","Not Given","Not Given",0,0);
    }

    Book(int bookId, String bookName, String authorName, String category, double rating, double price) {
    	//parameterized constructor
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
        this.rating = rating;
        this.price = price;
    }

    
    int getBookId() {
		return bookId;
	}

	void setBookId(int bookId) {
		this.bookId = bookId;
	}

	String getBookName() {
		return bookName;
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String getAuthorName() {
		return authorName;
	}

	void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	String getCategory() {
		return category;
	}

	void setCategory(String category) {
		this.category = category;
	}

	double getRating() {
		return rating;
	}

	void setRating(double rating) {
		this.rating = rating;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void display() {
        System.out.println("ID: " + bookId);
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Category: " + category);
    }
}

class Library {
    int counter = 0;
    int size = 1;
    Book[] bookArr = new Book[size];

    // Add Book
    void addBook() {
    	
    	if(counter >= size) 
    	{
    		size = size + 10;
    		Book[] newArr = new Book[size];
    		for (int i = 0; i < counter; i++)
    		{
                newArr[i] = bookArr[i];      // copy old data
            }
    		bookArr = newArr;
    	}
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            
            for (int i = 0; i < counter; i++) 
            {
                if (id == bookArr[i].bookId) 
                {
                	System.out.print("Book with this ID already exists!\n");
                    return;
                }
            }
            
            sc.nextLine();  // consume newline

            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Rating: ");
            double rating = sc.nextDouble();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            bookArr[counter++] = new Book(id, name, author, category, rating, price);
            System.out.println("Book added successfully!");
        } 
    
 // Display Books
    void displayBooks() {
        if (counter == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < counter; i++) {
        	System.out.println("---------------");
            bookArr[i].display();
            System.out.println("---------------");
        }
    }
    
 // Search by Book Name
    void searchByBookName() 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Book Name to search:");
    	String name = sc.next();
    	int found = 0;
    	
    	for (int i = 0; i < counter; i++) 
    	{
    		if ((bookArr[i].bookName).equals(name)) 
    		{
    			bookArr[i].display();
    			found = 1;
    		}
    	}
    	
    	if (found == 0 )
    		System.out.println(name + " Book is not available.");
    }
    
 // Search by ID
    void searchByBookID() 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Book ID to search:");
    	int id = sc.nextInt();
    	int found = 0;
    	
    	for (int i = 0; i < counter; i++) 
    	{
    		if (id == bookArr[i].bookId) 
    		{
    			bookArr[i].display();
    			found = 1;
    		}
    	}
    	
    	if (found == 0 )
    		System.out.println(id + " Book is not available.");
    }
    
 // Search by Rating
    void searchByRating() 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Rating to search:");
    	double rating = sc.nextDouble();
    	int found = 0;
    	
    	if(rating <= 10 && rating > 0 ) 
    	{
    		for (int i = 0; i < counter; i++) 
        	{
        		if (rating == bookArr[i].rating) 
        		{
        			bookArr[i].display();
        			found = 1;
        		}
        	}
    	}
    	else
    	{
    		System.out.println("The Rating is Invalid ");
    		System.out.println("Enter the rating between 1 to 10 :");
    	}
    	
    	if (found == 0 )
    		System.out.println(rating + " Book is not available.");
     }
    
 // Search by Author Name
    void searchByAuthorName() 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Author Name to search:");
    	String name = sc.nextLine().trim();
    	if(name.isEmpty()) name = sc.nextLine().trim();

    	int found = 0;
    	
    	for(int i = 0; i < counter; i++) 
    	{
    		if ((bookArr[i].authorName).equals(name)) 
    		{
    			bookArr[i].display();
        		System.out.println(name + " Book is available.");
    			found = 1;
    		}
    	}
    	
    	if (found == 0 )
    		System.out.println(name + "'s Book is not available.");
     }
    
 // Search by Category  
    void searchByCategory() 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Category to search:");
    	String category = sc.next();
    	int found = 0;
    	
    	for (int i = 0; i < counter; i++) 
    	{
    		if ((bookArr[i].category).equals(category)) 
    		{
    			bookArr[i].display();
    			found = 1;
    		}
    	}
    	
    	if (found == 0 )
    		System.out.println(category + "'s  Book is not available.");
     }
    
 // Remove Book
    void removeBook() 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Id to remove:");
    	int id = sc.nextInt();
    	 boolean found = false;
    	
    	for (int i = 0; i < counter; i++) 
    	{
    		if (id == bookArr[i].bookId) 
    		{
    			for (int j = i; j < counter - 1; j++) 
    			{
    				bookArr[j] = bookArr[j + 1];
                }
    			bookArr[counter - 1] = null;
    			counter--;
    			System.out.println("Book deleted successfully!");

    			found = true;
    			break;
    		}
    	}
    	
    	if (!found)
    		System.out.println(id + " is not available.");
     }
    
  //update Book
    void updateBookById() 
    {
    	Scanner sc = new Scanner(System.in);
    	int found = 0;
    	System.out.println("Enter Book ID to update: ");
    	int id = sc.nextInt();
    	
    	for (int i = 0; i < counter; i++) {
            if (bookArr[i].bookId == id) {
                found = 1;
                System.out.println("\nEnter which term you update:\n");
                System.out.println("1: Book Name");
                System.out.println("2: Author Name");
                System.out.println("3: New Price");
                System.out.println("4: New Category");
                System.out.println("5: New Rating ");
                System.out.println("6: Exit... ");
                int n = sc.nextInt();
    			switch (n) 
    			{
                	case 1: System.out.println("Enter new Book Name: ");
                			bookArr[i].bookName = sc.next();
                			break;
                	case 2: System.out.println("Enter new Author Name: ");
                			bookArr[i].authorName = sc.next(); 
                			break;
                	case 3: System.out.println("Enter new Price: ");
                			bookArr[i].price = sc.nextDouble();;
                			break;
    				case 4: System.out.println("Enter new Category: ");
                			bookArr[i].category = sc.next();
                			break;
    				case 5: System.out.println("Enter new Rating: ");
    						bookArr[i].rating = sc.nextDouble();
    						break;
                	case 6: System.out.println("Exiting...\n"); 
    						break;
                	default: System.out.println("Invalid Number\n");
            	}

    			System.out.println("Book updated successfully!\n");
                break;
            }
        }

    }
  //sort Book 
    void sortBooks() {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int choice;

        if (counter == 0) {
        	System.out.println("No books to sort\n");
            return;
        }

        System.out.println("\nSort books by:\n");
        System.out.println("1. Book ID\n");
        System.out.println("2. Price\n");
        System.out.println("3. Rating\n");
        System.out.println("4. Book Name (Alphabetical)\n");
        System.out.println("Enter choice: ");
        choice = sc.nextInt();

        Book temp;

        for (int i = 0; i < counter - 1; i++) {
            for (int j = i + 1; j < counter; j++) {
                int shouldSwap = 0;

                switch (choice) {
                    case 1:
                        if (bookArr[i].bookId > bookArr[j].bookId)
                            shouldSwap = 1;
                        break;
                    case 2:
                        if (bookArr[i].price > bookArr[j].price)
                            shouldSwap = 1;
                        break;
                    case 3:
                        if (bookArr[i].rating > bookArr[j].rating)
                            shouldSwap = 1;
                        break;
                    case 4:
                        if ((bookArr[i].bookName).equals(bookArr[j].bookName) )
                            shouldSwap = 1;
                        break;
                    default:
                        System.out.println("Invalid choice.\n");
                        return;
                }

                if (shouldSwap == 1) {
                    temp = bookArr[i];
                    bookArr[i] = bookArr[j];
                    bookArr[j] = temp;
                }
            }
        }

        System.out.println("\nBooks sorted successfully!\n");
        
    }    
  
}




class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l1 = new Library();

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search By Book Name");
            System.out.println("4. Search by ID");
            System.out.println("5. Search by Rating");
            System.out.println("6. Search by Author Name");
            System.out.println("7. Search by Category ");
            System.out.println("8. Remove Book");
            System.out.println("9. Update Book");
            System.out.println("10. Sort Book");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: l1.addBook(); 
                		break;
                case 2: l1.displayBooks(); 
                		break;
                case 3: l1.searchByBookName(); 
                		break;
                case 4: l1.searchByBookID(); 
                		break;
                case 5: l1.searchByRating(); 
        				break;
                case 6: l1.searchByAuthorName(); 
        				break;
                case 7: l1.searchByCategory(); 
        				break;
                case 8: l1.removeBook(); 
        				break;
                case 9: l1.updateBookById(); 
						break;
                case 10: l1.sortBooks(); 
						break;
                case 11: System.out.println("Exiting..."); 
						return;		
                		
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
