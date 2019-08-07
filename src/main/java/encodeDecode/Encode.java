package encodeDecode;
import java.util.Map;

public class Encode {
    public String encoder(String userInput, Map<Integer,String> table){
        String encodedData= "";
        for (int i = 0; i <userInput.length() ; i++) {
            encodedData+=table.get((int) userInput.charAt(i));
        }
        return encodedData;
    }
}
