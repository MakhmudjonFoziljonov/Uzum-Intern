package library.service;

import library.db.DbConnection;
import library.model.Book;

import java.util.List;


public class BookService {

    public String createBook(String name, Double price, Integer year, String author) {
        Book book = new Book();
        book.setName(name);
        book.setPrice(price);
        book.setYear(year);
        book.setAuthorName(author);
        DbConnection.books.add(book);

        return "Book Created bro!";
    }

    public Book getBookWithId(String bookId) {
        for (int i = 0; i < DbConnection.books.size(); i++) {
            Book book = DbConnection.books.get(i);
            if (book.getId().equals(bookId)) {
                return book;
            }
        }
        return new Book();
    }

    public List<Book> showBookList() {
        return DbConnection.books;
    }

    public String deleteBook() {
        for (Book book1 : DbConnection.books) {
            if (book1.getVisible().equals(Boolean.TRUE))
                book1.setVisible(Boolean.FALSE);
        }
        return "Book Deleted!";
    }

}
