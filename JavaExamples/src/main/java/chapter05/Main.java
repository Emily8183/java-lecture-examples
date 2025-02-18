//Chapter5 的思维导图在figma

package chapter05;

public class Main {

    public static void main(String[] args) {


        // TODO: Print the first available ID number if a book object were to be created
        System.out.println(Book.getNextIdNum());

        // TODO: After instantiating each book object:
        //  print its id number, then
        //  print the next available ID number now stored at the class level

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        System.out.println("This book " + book1.getTitle() + "'s Id number is " + book1.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        System.out.println("This book " + book2.getTitle() + "'s Id number is " + book2.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book3 = new Book("1984", "George Orwell");
        System.out.println("This book " + book3.getTitle() + "'s Id number is " + book3.getBookId());
        System.out.println(Book.getNextIdNum());


        // TODO: Test the toString() method of the Book class by printing the first book

        System.out.println("Test first book's toString: " + book1); //直接call book1，不需要再加toString()， Implicit call


        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();


        // TODO: Test the toString() method of the Library class by printing the library
        System.out.println("Test the library's toString: " + library);

        // TODO: Create a second set of the same books as above
        Book book4 = new Book("Contact", "Carl Sagan", 430);
        Book book5 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book6 = new Book("1984", "George Orwell");


        // TODO: Create a second library and add all three new books to it
        Library library2 = new Library();

        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);

        library2.printAvailableBooks();


        // TODO: Use the strict equality operator to compare the identity of the two libraries
        System.out.println("\nAre the two libraries identical?" );
        System.out.println(library == library2);


        // TODO: Now use the equals() method to compare their contents
        System.out.println("\nAre the two libraries equal?"); //待定，equal还没有做
        System.out.println("tbc");

    }
}
