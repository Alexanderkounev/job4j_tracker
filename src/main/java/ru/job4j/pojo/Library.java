package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Clean code", 35);
        Book book1 = new Book("Helicopter", 56);
        Book book2 = new Book("Car Price", 32);
        Book book3 = new Book("Java", 562);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getNumberOfPages() + " pages.");
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getNumberOfPages() + " pages.");
        }
        System.out.println();
        for (Book bk : books) {
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " - " + bk.getNumberOfPages() + " pages.");
            }
        }
    }
}
