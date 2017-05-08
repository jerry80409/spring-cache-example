package com.example.repositories;

import com.example.entities.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by jerry on 2017/5/5.
 */
@Repository
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("books")
    public Optional<Book> getByIsbn(String isbn) {
        simulateSlowService();
        return Optional.of(new Book(isbn, "Some Book"));
    }

    /**
     * 模擬 slow service 取得 entity
     */
    private void simulateSlowService() {
        try {
            long time = 2000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }
}
