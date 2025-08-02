package lbbms.dao;

import lbbms.model.Book;
import lbbms.model.Borrower;

public class BorrowerDAO {
    private static BorrowerDAO INSTANCE;
    private Borrower[] borrowers = null;
    public BorrowerDAO() {
    }
    public static BorrowerDAO getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BorrowerDAO();
        }
        return INSTANCE;
    }
    private void loadData(){
        this.borrowers = new Borrower[]{
                new Borrower(101, "Alice", "Johnson", "alice.j@example.com",   new Book(102, "1984", "George Orwell", 1949, true)),
                new Borrower(102, "Bob", "Smith", "bob.smith@example.com", new Book(105, "Pride and Prejudice", "Jane Austen", 1813, true)),
                new Borrower(103, "Carol", "Lee", "carol.lee@example.com", null),
                new Borrower(104, "David", "Kim", "david.kim@example.com", new Book(101, "To Kill a mocking bird", "Harper Lee", 1960, true)) ,
                new Borrower(105, "Eva", "Brown", "eva.brown@example.com", null)
            };
    }
    public Borrower[] getAllBorrowers() {
        if(borrowers == null || borrowers.length == 0) {
            loadData();
        }
        return borrowers;
    }
}
