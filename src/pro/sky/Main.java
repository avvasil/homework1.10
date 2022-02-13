package pro.sky;

public class Main {

    public static void main(String[] args) {

//task 1
        Author author1 = new Author("Иван", "Иванов");
        Author author2 = new Author("Степан", "Петров");
        Book book1 = new Book("Детство", author1, 1964);
        Book book2 = new Book("Моря и океаны", author2, 1996);

        System.out.println(author1.toString());
        System.out.println(book1.toString());
    }
}