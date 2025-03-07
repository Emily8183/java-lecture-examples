package chapter06;

public class Book {

    // FIELDS

    private static int nextIdNum = 1;

    private final String bookId;
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;
    private int timesCheckedOut = 0;


    // CONSTRUCTORS

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.bookId = generateBookId(); // last because other fields must already have values
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }


    // GETTERS & SETTERS

    public static int getNextIdNum() {
        return nextIdNum;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getTimesCheckedOut() {
        return timesCheckedOut;
    }

    public void setTimesCheckedOut(int timesCheckedOut) {
        this.timesCheckedOut = timesCheckedOut;
    }


    // OVERRIDE SPECIAL METHODS

    @Override
    public String toString() {
        String availability = isAvailable() ? "Available for checkout" : "CURRENTLY UNAVAILABLE";
        String timePlural = timesCheckedOut == 1 ? "" : "s";
        return getTitleAndAuthor() + "\n" +
                numPages + " pages" +
                "\nBook " + bookId + " checked out " +
                timesCheckedOut + " time" + timePlural +
                "\n" + availability;
    }


    // INSTANCE METHODS

    public boolean isAvailable() {
        return available;
    }

    private String generateBookId() {
        String id = Utils.getInitials(author) + "-" + title.substring(0, 3).toUpperCase() + "-" + nextIdNum;
        nextIdNum++;
        return id;
    }

    public String getTitleAndAuthor() {
        return title + " by " + author;
    }

    public void checkOut() {
        timesCheckedOut++;
        available = false;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked out of the library.");
    }

    public void checkIn() {
        available = true;
        System.out.println("\n" + getTitleAndAuthor() + " has been checked in.");
    }

}
