package encodeDecode;

import java.util.List;

public class Decode {
    public String decoder(List<String> encodedData, List<String> table){
        StringBuilder decodedData= new StringBuilder();
        for (String encodedElement:encodedData) {
            decodedData.append((char) table.indexOf(encodedElement));
        }
        return decodedData.toString();
    }
}
