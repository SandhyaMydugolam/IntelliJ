package com.bookup.service;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.bookup.model.Book;

import java.util.List;

public class BookServiceImpl implements IBookService {
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(int bookId, double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByCategory(String Category) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getBypriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) {
        return null;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory() {
        return null;
    }
}
