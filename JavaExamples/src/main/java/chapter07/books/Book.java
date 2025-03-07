//Chapter7 是练习abstract
//construction: super(xxxxx,xxxxx);
//method: super.toString();
//super class中的abstract method, no body, must completed by concrete class

package chapter07.books;

import chapter07.Common;
import chapter07.Product;

// TODO: Refactor class to inherit from Product
public class Book extends Product {
    private String author;
    private String genre;
    private String format;

    public Book(String name, String desc, double price, int quantity, String author, String genre, String format) {

        super(name,desc,price,quantity);
        this.author = author;
        this.genre = genre;
        this.format = format;
//        nextId++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return  super.toString() +  //super.toString()
                "Author: " + author + Common.newline +
                "Genre: " + genre + Common.newline +
                "Format: " + format + Common.newline;
    }

    // TODO: Define describe() as required by Product
    @Override
    public String describe(){
        return getName() + " by " + author + Common.newline +
                getDesc() + Common.newline +
                genre + Common.pipe + format + Common.pipe + getPrice() + Common.newline; //TODO: complete Common
    }
}
