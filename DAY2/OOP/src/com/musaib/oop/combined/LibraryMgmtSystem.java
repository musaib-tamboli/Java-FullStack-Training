package com.musaib.oop.combined;
interface IssueBook {
    void issueBook();
}

abstract class Library {
    abstract void displayBook();
}

class Book extends Library implements IssueBook {

    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void displayBook() {
        System.out.println("Book: " + bookName);
    }

    public void issueBook() {
        System.out.println(bookName + " Issued");
    }
}

public class LibraryMgmtSystem {
    public static void main(String[] args) {

        Book b = new Book();

        b.setBookName("Java Programming");

        b.displayBook();
        b.issueBook();
    }
}
