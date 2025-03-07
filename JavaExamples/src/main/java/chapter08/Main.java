//继承interface的话，也要override
//create a new UsedBook object but the type is Book (in order to be more flexible), 需要casting:
//System.out.println(((UsedBook) usedBook3).getCondition());

package chapter08;

import chapter08.books.Book;
import chapter08.books.UsedBook;
import chapter08.merchandise.Apparel;
import chapter08.merchandise.Drinkware;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Pride and Prejudice", "This timeless classic showcases Austen's wit and winsome characters", 12.49, 6, "Jane Austen", "Romantic Fiction", "Paperback");
        Book book2 = new Book("The Fellowship of the Ring", "The first book of the Lord of the Rings trilogy", 18.99, 3, "JRR Tolkien", "Fantasy Fiction", "Hardcover");
        UsedBook usedBook1 = new UsedBook("Fahrenheit 451", "A masterpiece of dystopian storytelling", 6.50, 1, "Ray Bradbury", "Dystopian Fiction", "Hardcover", "Good");
        UsedBook usedBook2 = new UsedBook("A Pocket Full of Rye", "Miss Marple does it again with this twisty murder mystery", 4.75, 1, "Agatha Christie", "Mystery Fiction", "Paperback", "Fair");
        Drinkware mug = new Drinkware("Ahsoka Mug", "Have coffee with Ahsoka every day!", 13.99, 3, "Mugs", "Star Wars", "Ceramic", 15);
        Drinkware tumbler = new Drinkware("The Little Mermaid Tumbler", "Keep cool with one of Ariel's newfangled contraptions", 16.49, 2, "Tumblers", "Disney", "Metal", 24);
        Apparel hat = new Apparel("Captain America Hat", "Feel like a supersoldier in this classic hat with Captain America's shield", 19.99, 5, "Hats", "Marvel", new String[]{"OS"}, new String[]{"navy", "gray"});
        Apparel tShirt = new Apparel("Batman T-shirt", "Don the classic Batman logo with this minimalist design", 24.49, 4, "T-Shirts", "DC", new String[]{"XS", "S", "M", "L", "XL"}, new String[]{"black"});


        // TODO: Create a UsedBook of type Book, try to check its condition, and then cast it to UsedBook to try again
        Book usedBook3 = new UsedBook(
                "Contact",
                "The classic novel made into a movie",
                26.75,
                1,
                "Carl Sagan",
                "Science Fiction",
                "Hardcover",
                "Very Good"
        );

        System.out.println(((UsedBook) usedBook3).getCondition()); //因为usedBook3是以Book为type创建的，所以需要case一下
        // to tell Java explicitly that usedBook3 is actually a UsedBook object by using casting

        /* INTERFACES */
        // TODO: Test both percent discounts and flat discounts on an Apparel object and a UsedBook object
        // Notice the currentPrice has changed
        hat.applyFlatDiscount(3);
        System.out.println(hat);

        // Notice the new currentPrice is 50% of the original price, not previously discounted
        hat.applyPercentDiscount(0.5);
        System.out.println(hat);

        System.out.println(usedBook2);

        // A UsedBook implementation of discounts will calculate on previous discounts
        usedBook2.applyFlatDiscount(2);
        System.out.println(usedBook2);

        usedBook2.applyPercentDiscount(0.5);
        System.out.println(usedBook2);

    }

}
