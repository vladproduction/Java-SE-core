package com.vladproduction.demo_anonymous;

public class BookService {
    Bookable bookable = new Bookable() {
        @Override
        public int priceDays(int days, double dailyPrice) {
            return days * (int)dailyPrice;
        }
    };

    public static void main(String[] args) {
        BookService bookService = new BookService();
        bookService.bookable.priceDays(2, 50);
    }
}
interface Bookable {
    int priceDays(int days, double priceForDay);
}
