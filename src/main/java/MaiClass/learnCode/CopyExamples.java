package MaiClass.learnCode;

import java.util.Arrays;

public class CopyExamples {

    public static void main(String[] args) throws CloneNotSupportedException {
//        example1();

        Book pinokkio = new Book("Pinokkio", 1950, new Author("Collodi"));
        pinokkio.print();
        System.out.println(pinokkio.hashCode());

        Book miracle = new Book(pinokkio); //pinokkio.clone();
        miracle.setName("Miracle");
        miracle.setYear(2000);
        miracle.getAuthor().setAuthorName("Kesey");
        miracle.print();
        System.out.println(miracle.hashCode());

        pinokkio.print();
    }

    public static void example1() {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        System.out.println("A array: " + Arrays.toString(a));
        System.out.println("B array: " + Arrays.toString(b));
        System.out.println(a + " " + b);
        System.out.println(a.hashCode() + " " + b.hashCode());

        System.out.println();

        b[1] = 1000;

        System.out.println("A array: " + Arrays.toString(a));
        System.out.println("B array: " + Arrays.toString(b));
        System.out.println(a + " " + b);
        System.out.println(a.hashCode() + " " + b.hashCode());
    }
}

class Author {//implements Cloneable {
    private String authorName;
    public Author(String authorName) {
        this.authorName = authorName;
    }
    public Author(Author author) {this(author.getAuthorName()); }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}

class Book {// implements Cloneable {
    private String name;
    private int year;
    private Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Book(Book book) {
        this(book.getName(), book.getYear(), new Author(book.getAuthor()));
    }

    public void print() {
        System.out.println("Name of book: " + name + ", year of book: " + year + ", author is " + getAuthor().getAuthorName());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

//    @Override
//    protected Book clone() throws CloneNotSupportedException {
//        Book bookCopy = (Book) super.clone();
//        bookCopy.setAuthor((Author) getAuthor().clone());
//
//        return bookCopy;
//    }
}