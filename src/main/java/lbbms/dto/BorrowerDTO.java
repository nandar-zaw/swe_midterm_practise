package lbbms.dto;

import lbbms.model.Book;
import org.json.JSONObject;

public record BorrowerDTO(
         Integer borrowerId,
         String firstName,
         String lastName,
         String email,
         BookDTO borrowedBook
) {
    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("borrowerId", this.borrowerId);
        jsonObject.put("firstName", this.firstName);
        jsonObject.put("lastName", this.lastName);
        jsonObject.put("email", this.email);
        if(this.borrowedBook != null)
            jsonObject.put("borrowedBook", this.borrowedBook.toJSON());
        else
            jsonObject.put("borrowedBook", "null");
        return jsonObject;
    }
}
