package lbbms.dao;

import lbbms.model.Book;

public class BookDAO {
    private static BookDAO INSTANCE;
    private Book[] books = null;
    public BookDAO() {
    }
    public BookDAO getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BookDAO();
        }
        return INSTANCE;
    }
    private void loadData(){
        this.books = new Book[]{
                new Book(101, "To Kill a mocking bird", "Harper Lee", 1960, false),
                new Book(102, "1984", "George Orwell", 1949, false),
                new Book(103, "The Great Gatsby", "F. Scott Fitzgerald", 1925, false),
                new Book(104, "The Catcher in the Rye", "J.D. Salinger", 1951, false),
                new Book(105, "Pride and Prejudice", "Jane Austen", 1813, false)
        };
    }
    public Book[] getAllBooks() {
        if(books == null || books.length == 0) {
            loadData();
        }
        return books;
    }

}
