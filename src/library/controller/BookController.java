package library.controller;

import library.model.Book;
import library.service.BookService;

import java.util.List;


public class BookController {
    BookService bookService = new BookService();

    public String createBook(String name, Double price, Integer year, String author) {
        return bookService.createBook(name, price, year, author);
    }

    public Book getBookWithId(String bookId) {
        return bookService.getBookWithId(bookId);
    }
    public List<Book> getBookList() {
        return bookService.showBookList();
    }

    public String deleteBook() {
        return bookService.deleteBook();
    }

}
