package chapter05;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    // FIELDS

    // TODO: Ensure books cannot be overwritten by another object
    // Also, make books available to package

    final ArrayList<Book> books = new ArrayList<>();


    // OVERRIDE SPECIAL METHODS

    // TODO: Write a custom toString() method to print a list of all books
    // Use the StringBuilder class and iterate over books
    @Override
    public String toString() {
        StringBuilder printAllBooks = new StringBuilder();
        for (Book book : books) {
            printAllBooks.append(book.toString());
        }
        //  return printAllBooks.toString();
        return "\n" + printAllBooks; //auto converted to String
    }

    // TODO: Write a custom equals() method to compare the contents of books
    // Use the @Override annotation
    // First include a reference check, null check, class check, and cast (see chapter 5.3.2.2)
    // Then compare the size of the books lists
    // Finally, loop through both lists and compare the books using findBook()


    // INSTANCE METHODS

    public void addBook(Book book) {
        books.add(book);
    } //Since the Library class does not create books itself, it needs the book to be provided as an argument.

    public int findBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public void printAvailableBooks() { //it just looks at the books list that already exists inside the Library object, so no need to add parameters
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
