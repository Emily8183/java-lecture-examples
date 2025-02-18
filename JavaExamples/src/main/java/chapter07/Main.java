package chapter07;


import chapter07.books.Book;

public class Main {

    public static void main(String[] args) {

        // TODO: Create several objects from the non-abstract classes
        Book book1 = new Book("Pride and Prejudice", "This timeless classic showcases Austen's wit and winsome characters", 12.49, 6, "Jane Austen", "Romantic Fiction", "Paperback");
        Book book2 = new Book("The Fellowship of the Ring", "The first book of the Lord of the Rings trilogy", 18.99, 3, "JRR Tolkien", "Fantasy Fiction", "Hardcover");


        // TODO: Print each object created above
        System.out.println(book1);
        System.out.println(book2);


        // TODO: Increase the quantity of an apparel object by 5, then print the new quantity



        // TODO: Decrease the quantity of a drinkware object by 1, then print the new quantity


        // TODO: Describe each object created above

    }

}
