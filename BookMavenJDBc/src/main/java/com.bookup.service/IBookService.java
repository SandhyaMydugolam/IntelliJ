package com.bookup.service;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.bookup.model.Book;

import java.util.List;

public interface IBookService {
    void addBook(Book book);

    void updateBook(int bookId, double price);

    void deleteBook(int bookId);

    List<Book> getAll();

    List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException;

    List<Book> getByAuthorContains(String author) throws BookNotFoundException;

    List<Book> getByCategory(String Category) throws BookNotFoundException;

    List<Book> getBypriceLessThan(double price) throws BookNotFoundException;

    List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;

    Book getById(int bookId) throws IdNotFoundException;

    List<Book> getByAuthorContainsAndCategory();
}


