package encodeDecode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Encode {
    public List<Boolean> encoder(String userInput, Map<Character,String> table){
        List<Boolean> encodedData = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            String encodedBitsForACharacter = table.get(character);

            String[] splits = encodedBitsForACharacter.split("");
            for (String split : splits) {
                if (split.equals("0")) {
                    encodedData.add(false);
                } else {
                    encodedData.add(true);
                }
            }
        }
        return encodedData;
    }
}
