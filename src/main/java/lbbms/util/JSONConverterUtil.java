package lbbms.util;

import lbbms.dto.BorrowerDTO;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {
    public static String convertBorrowerArrToJSON(BorrowerDTO[] borrowers){
        JSONArray jsonArray = new JSONArray();
        Arrays.stream(borrowers).forEach(b-> {
            jsonArray.put(b.toJSON());
        });
        return jsonArray.toString(2);

    }
}
