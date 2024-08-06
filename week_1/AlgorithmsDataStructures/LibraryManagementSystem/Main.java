package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book(1, "Book 1", "Author 1");
        Book book2 = new Book(2, "Book 2", "Author 2");
        Book book3 = new Book(3, "Book 3", "Author 3");

        // Create library
        Book[] books = {book1, book2, book3};
        Library library = new Library(books);

        // Linear search
        Book searchedBookLinear = library.linearSearchByTitle("Book 2");
        System.out.println("Linear Search:");
        System.out.println(searchedBookLinear);

        // Binary search
        Book searchedBookBinary = library.binarySearchByTitle("Book 2");
        System.out.println("Binary Search:");
        System.out.println(searchedBookBinary);
    }
}
