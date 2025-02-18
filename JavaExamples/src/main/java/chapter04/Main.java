//Chapter4 的思维导图在whiteboard

package chapter04;

public class Main {

    public static void main(String[] args) {

        // TODO: Instantiate a Library object called library
        Library myLib = new Library();
        //Since no constructor is defined in the Library class, Java automatically provides a default constructor that allows new Library() to work.

        // TODO: Instantiate 3 books — two with numPages and one without
        Book book1 = new Book("Math", "helen", 2);
        Book book2 = new Book("Chinese", "Emily", 5);
        Book book3 = new Book("English", "Kavin", 6);


        // TODO: Add each book to the library
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);

        // TODO: Print available books
        myLib.printAvailableBooks(); //all three books

        // TODO: Check out the first book
        book1.checkOut();

        // TODO: Print available books again
        myLib.printAvailableBooks();

        // TODO: Check out the second book and check in the first book
        book2.checkOut();
        book1.checkIn();

        // TODO: Print available books again
        myLib.printAvailableBooks();

    }
}
