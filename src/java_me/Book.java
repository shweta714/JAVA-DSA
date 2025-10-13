package java_me;

public class Book {
	String title;
    static int totalBooks = 0;   

    // Constructor
    public Book(String title) {
        this.title = title;
        totalBooks++; 
    }

    public static void main(String[] args) {
        Book b1 = new Book("IKIGAI");
        System.out.println("Created book: " + b1.title);
        System.out.println("Total books: " + Book.totalBooks);

        Book b2 = new Book("Atomic Habits");
        System.out.println("\nCreated book: " + b2.title);
        System.out.println("Total books: " + Book.totalBooks);
    }
}

