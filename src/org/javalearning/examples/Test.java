package org.javalearning.examples;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        Book b1 = new Book(10023);
        Book b2 = new Book(10053);
        Book b3 = new Book(10088);
        Book b4 = new Book(10099);
        Book b5 = new Book(12000);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        System.out.println(books.size());
        System.out.println(books.contains(new Book(12000)));
        System.out.println(books.remove(new Book(10099)));
        System.out.println(books.size());
    }
}

class Book {
    private int isbn;
    public Book(int isbn) {
        super();
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int hashCode() {
        return isbn;
    }
    public boolean equals(Object obj) {
        boolean res = false;
        Book b = (Book) obj;
        if (b.getIsbn() == isbn) {
            res = true;
        }
        return res;
    }
}
