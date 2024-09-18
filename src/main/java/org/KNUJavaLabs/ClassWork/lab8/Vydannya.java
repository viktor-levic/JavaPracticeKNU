package org.KNUJavaLabs.ClassWork.lab8;

interface Vydannya {
    void vydaty();
}

abstract class Book implements Vydannya {
    int countOfPages;
    String color;

    Book(int countOfPages, String color) {
        this.countOfPages = countOfPages;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void vydaty() {
        System.out.println("Vydano by Bogdan Kharysh Library with " + this.countOfPages + " and " + this.color + " color");
    }

    public abstract void selling();

    @Override
    public String toString() {
        return "Book{" + "countOfPages=" + countOfPages + ", color='" + color + '\'' + '}';
    }
}

class Dovidnyk extends Book {
    int price;

    Dovidnyk(int countOfPages, String color, int price) {
        super(countOfPages, color);
        this.price = price;
    }

    @Override
    public void selling() {
        System.out.println("The " + this.color + " DOVIDNYK with " + this.countOfPages + ", sold to man in black suit by " + this.price + "$");
    }
}

class Entsyclopedia extends Book {
    int price;

    Entsyclopedia(int countOfPages, String color, int price) {
        super(countOfPages, color);
        this.price = price;
    }

    @Override
    public void selling() {
        System.out.println("The " + this.color + " BOOK with " + this.countOfPages + ", sold to man in black suit by " + this.price + "$");
    }
}