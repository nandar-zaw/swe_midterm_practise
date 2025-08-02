package lbbms.app;

import lbbms.service.BorrowerService;
import lbbms.util.JSONConverterUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LBBMSApp {
    public static void main(String[] args) {
        var borrowerService = new BorrowerService();
        var borrowers = borrowerService.getBorrowerWithBorrowedBooks();
        var borrowerJSON = JSONConverterUtil.convertBorrowerArrToJSON(borrowers);
        System.out.println(borrowerJSON);

    }
}