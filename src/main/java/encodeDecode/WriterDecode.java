package encodeDecode;

import java.io.FileWriter;

public class WriterDecode {
    public void write(String data){
        try {
            FileWriter fileWriter=new FileWriter("decodedMessages.txt");
            fileWriter.write(data);
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
