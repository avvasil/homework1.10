package pro.sky;

import java.util.Objects;

public class Book {
    private final String bookName;
    private Author authorName;
    private int publishingYear;



    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Название '" + bookName + '\'' +
                ", Имя автора " + authorName + '\'' +
                ", год издания " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}


