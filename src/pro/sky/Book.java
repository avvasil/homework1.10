package pro.sky;

import java.util.Objects;

public class Book {
    private final String bookName;
    private Author author;
    private int publishingYear;



    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Название '" + bookName + '\'' +
                ", Имя автора " + getAuthorName().toString() + '\'' +
                ", год издания " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishingYear);
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}


