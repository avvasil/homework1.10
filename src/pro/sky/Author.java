package pro.sky;

import java.util.Objects;

public class Author {

    private final String authorFirstName;
    private final String authorLastName;
    private Author authorName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString() {
        return "Автор:  " +
                "Имя '" + authorFirstName + '\'' +
                " Фамилия  '" + authorLastName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLastName, author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getGetAuthorLastName() {
        return this.authorLastName;
    }
}


