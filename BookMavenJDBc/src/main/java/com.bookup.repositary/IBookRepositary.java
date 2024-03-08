package com.bookup.repositary;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.bookup.model.Book;

import java.util.List;

public interface IBookRepositary {
    void addBook(Book book);
    void updateBook(int bookId,double price);
    void deleteBook(int bookId);
    Book getById(int bookId) throws IdNotFoundException;

    List<Book> findAll();
    List<Book> findByAuthor(String author) throws BookNotFoundException;
    List<Book> findByLessPrice(double price) throws BookNotFoundException;
    List<Book> findByAuthorcategory (String author,String category) throws BookNotFoundException;
}
