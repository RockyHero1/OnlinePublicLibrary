package com.onlinePublicLibrary.onlinePublicLibrary;

import java.util.ArrayList;

public class OnlinePublicLibrary {

    ArrayList<Book> books;

    public OnlinePublicLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> showAllBooks() {
        return books;
    }
}
