package lbbms.dto;

import org.json.JSONObject;

public record BookDTO(
         Integer bookId,
         String title,
         String author,
         Integer yearPublished,
         boolean isBorrowed) {
    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("bookId", this.bookId);
        jsonObject.put("title", this.title);
        jsonObject.put("author", this.author);
        jsonObject.put("yearPublished", this.yearPublished);
        jsonObject.put("isBorrowed", this.isBorrowed);
        return jsonObject;
    }


}
