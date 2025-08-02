package lbbms.service;

import lbbms.dao.BorrowerDAO;
import lbbms.dto.BookDTO;
import lbbms.dto.BorrowerDTO;
import lbbms.model.Book;
import lbbms.model.Borrower;

import java.util.Arrays;
import java.util.Comparator;

public class BorrowerService {
    private final BorrowerDAO borrowerDAO;

    public BorrowerService() {
        this.borrowerDAO = BorrowerDAO.getInstance();
    }
    public BorrowerDTO[] getBorrowerWithBorrowedBooks() {
        var borrowers = borrowerDAO.getAllBorrowers();
        return Arrays.stream(borrowers)
                .map( b -> new BorrowerDTO(
                        b.getBorrowerId(),
                        b.getFirstName(),
                        b.getLastName(),
                        b.getEmail(),
                        (b.getBorrowedBook()!= null)? new BookDTO(
                                b.getBorrowedBook().getBookId(),
                                b.getBorrowedBook().getTitle(),
                                b.getBorrowedBook().getAuthor(),
                                b.getBorrowedBook().getYearPublished(),
                                b.getBorrowedBook().isBorrowed()
                        ): null))
                .sorted(Comparator.comparing(BorrowerDTO::lastName,Comparator.naturalOrder()))
                .toArray(BorrowerDTO[]::new);

    }

}
