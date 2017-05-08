package com.example.repositories;

import com.example.entities.Book;

import java.util.Optional;

/**
 * Created by jerry on 2017/5/5.
 */
public interface BookRepository {

    Optional<Book> getByIsbn(String isbn);
}
