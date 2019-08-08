package encodeDecode;
import java.util.Map;

public class Encode {
    public byte[] encoder(String userInput, Map<Integer,String> table){
        byte[] encodedData = new byte[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            String encodedValue = table.get((int) character);
            encodedData[i] = Byte.parseByte(encodedValue, 2);
        }
        return encodedData;
    }
}
