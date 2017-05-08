package com.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jerry on 2017/5/5.
 */
@Data
@NoArgsConstructor
public class Book {
    private String isbn;
    private String title;

    public Book(final String isbn, final String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book : { isbn : " + isbn + " , title : " + title + " }";
    }
}
