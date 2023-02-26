package com.geekster.studentinfo.service;

import com.geekster.studentinfo.model.Book;

import java.util.List;

public interface Ibook {
    public List<Book> getBook(int id);
    public void addBook(Book book);
    public void deleteBook(int id);
    public void updateBook(int id, Book newBook);
}
