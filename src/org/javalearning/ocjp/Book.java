package org.javalearning.ocjp;

public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int hashCode() {
        return ISBN;
    }

    @Override public boolean equals(Object obj) {
        if(!(obj instanceof Book))
            return false;
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }

    private class BookReader {
        public int getPage() {
            return pageCount;
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.ISBN = 123;
        b1.author = "Test";
        b1.title = "T1";
        b1.pageCount = 200;
        System.out.println(b1);
        Book b2 = new Book();
        b2.ISBN = 123;
        System.out.println(b1.equals(b2));

        String s1 = "Canada";
        String s2 = new String(s1);
        if (s1 == s2)
            System.out.println("s1 == s2");
        if(s1.equals(s2))
            System.out.println("s1.equals(s2)");
        BookReader br = new Book().new BookReader();
        System.out.println(br.getPage());
    }
}
