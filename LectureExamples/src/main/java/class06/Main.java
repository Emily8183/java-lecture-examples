package class06;

import class06.books.Book;
import class06.books.UsedBook;
import class06.merchandise.Apparel;
import class06.merchandise.Drinkware;

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

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(usedBook1);
        System.out.println(usedBook2);
        System.out.println(mug);
        System.out.println(tumbler);
        System.out.println(hat);
        System.out.println(tShirt);

        hat.increaseQuantity(5);
        System.out.println(hat.getQuantity());

        mug.decreaseQuantity(1);
        System.out.println(mug.getQuantity());

        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(usedBook1.describe());
        System.out.println(usedBook2.describe());
        System.out.println(mug.describe());
        System.out.println(tumbler.describe());
        System.out.println(hat.describe());
        System.out.println(tShirt.describe());

    }

}
