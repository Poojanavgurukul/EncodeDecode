package encodeDecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncodeDecodeTable {
    public static Map<Integer,String> table=new HashMap<>();
    public static Map<Integer,String> generateBinaryTable(){
        for (int i = 0; i < 256; i++) {
            String binaryNumber= Integer.toBinaryString(i);
            StringBuilder zero=new StringBuilder();
            for (int j = 0; j <8-binaryNumber.length(); j++) {
               zero.append("0");
            }
            zero.append(binaryNumber);
            table.put(i,zero.toString());
        }
        return table;
    }
}
