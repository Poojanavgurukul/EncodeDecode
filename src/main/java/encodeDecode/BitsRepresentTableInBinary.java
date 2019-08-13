package encodeDecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BitsRepresentTableInBinary {
    public Map<Character,String>generateTableInBinary(int bit, Set uniqueCharacters){
        Map<Character,String>table=new HashMap<>();
        int bin=0;
        for (Object word:uniqueCharacters) {
            char word1=(char) word;
            String binaryNumber = Integer.toBinaryString(bin);
            StringBuilder fixed = new StringBuilder();
            for (int i = 0; i <bit-binaryNumber.length() ; i++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.put(word1, fixed.toString());
            bin += 1;

        }return table;
    }
}