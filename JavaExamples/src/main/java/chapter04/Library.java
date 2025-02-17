package chapter04;

import java.util.ArrayList;

public class Library {

    // TODO: Declare a field, books, as an ArrayList of Book objects
    // Give it private access
    private ArrayList<String> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object

    // TODO: Define a public method, addBook()
    public void addBook(Book book) { //TODO: complete the book class
        books.add(book);
    }

    // TODO: Define a public method, printAvailableBooks()
    // It should print only books that aren't checked out
    public void printAvailableBooks() {
        System.out.println(remainBooks); //TODO: set up the variable for remainBooks
    }

}
