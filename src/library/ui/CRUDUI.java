package library.ui;

import library.controller.BookController;
import library.model.Book;
import library.util.ScannerUtil;

import java.util.List;
import java.util.Scanner;

public class CRUDUI {
    BookController bookController = new BookController();

    public void menuUi() {
        while (true) {
            int option = menu();
            switch (option) {
                case 1 -> createBook();
                case 2 -> getBookList();
                case 3 -> {
                    System.out.println("Enter Book Id: ");
                    String bookId = new Scanner(System.in).nextLine();
                    getBookWithId(bookId);
                }
                case 4 -> deleteBook();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void deleteBook() {
        System.out.print(bookController.deleteBook());
    }

    private void getBookList() {
        List<Book> list = bookController.getBookList();
        list.forEach(System.out::println);
    }

    private void createBook() {
        System.out.print("Enter name: ");
        String name = new Scanner(System.in).next();

        System.out.print("Enter price: ");
        Double price = ScannerUtil.SCANNER_NUM.nextDouble();

        System.out.print("Enter year: ");
        Integer year = ScannerUtil.SCANNER_NUM.nextInt();

        System.out.print("Enter Author name: ");
        String author = new Scanner(System.in).nextLine();

        String result = bookController.createBook(name, price, year, author);
        System.out.print(result);
    }

    private void getBookWithId(String bookId) {
        System.out.println(bookController.getBookWithId(bookId));
    }

    private int menu() {
        String menu = """
                \n
                *******BOOK*****
                1.Create Book
                2.Show Book List
                3.Get Book With Id
                4.Delete Book
                """;
        System.out.println(menu);
        return ScannerUtil.getAction();
    }
}

