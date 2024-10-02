class Book {
    private String title;
    private String author;
    private String isbn;
    private static int totalBooks = 8; // Initialize with the total number of books
    private static int takenBooks = totalBooks; // Initialize with the total number of books

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Instance method: Borrow a book
    public void borrowBook() {
        // Implement borrowing logic (e.g., update availability status)
        // For now, let's just decrement totalBooks
        totalBooks--;
    }

    // Instance method: Return a book
    public void returnBook() {
        // Implement returning logic (e.g., update availability status)
        // For now, let's just increment totalBooks
        totalBooks++;
    }

    // Static method: Get total number of books
    public static int getTotalBooks() {
        return totalBooks;
    }
    public static int getTakenBooks() {
        return takenBooks;
    }
    public void displayBooks(){
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Example usage
class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        book1.borrowBook();
        book2.borrowBook();

        System.out.println("Total books in the library: " + Book.getTotalBooks()); // Should be 0
        System.err.println("Books taken from the library: " + (Book.getTakenBooks() - Book.getTotalBooks())); // Should be 0
        book1.displayBooks();
        book2.displayBooks();
    }
}
