package encodeDecode;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecodeTable {
    private static Map<Integer,String> table=new HashMap<>();
    public static Map<Integer,String> generateBinaryTable(){
        for (int i = 0; i < 256; i++) {
            String binaryNumber;
            binaryNumber = Integer.toBinaryString(i);
            String zero = "0".repeat(8 - binaryNumber.length()) + binaryNumber;
            table.put(i, zero);
        }
        return table;
    }
}
