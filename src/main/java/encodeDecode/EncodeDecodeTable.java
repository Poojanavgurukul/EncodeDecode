package encodeDecode;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecodeTable {
    private Map<Integer,String> table=new HashMap<>();
    public  Map<Integer,String> generateBinaryTable(){
        for (int i = 0; i < 256; i++) {
            String binaryNumber;
            binaryNumber = Integer.toBinaryString(i);
            String zero = "0".repeat(8 - binaryNumber.length()) + binaryNumber;
            table.put(i, zero);
        }
        return table;
    }
    public Map<Integer, String> generateUpperBinaryTable() {

        Map<Integer, String> encoding = new HashMap<>();
        int diff = 'a' - 'A';

        for (char i = 'A'; i < 'z'; i++) {
            if (i >= 'a') {
                encoding.put((int) i, Integer.toBinaryString(i - diff));
            } else {
                encoding.put((int) i, Integer.toBinaryString(i));
            }
        }

        return encoding;
    }
}
