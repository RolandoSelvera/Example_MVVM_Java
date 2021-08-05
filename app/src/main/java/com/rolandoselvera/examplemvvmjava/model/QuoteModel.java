package com.rolandoselvera.examplemvvmjava.model;

public class QuoteModel {
    private String quote;
    private String book;
    private String author;

    public QuoteModel(String quote, String book, String author) {
        this.quote = quote;
        this.book = book;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}