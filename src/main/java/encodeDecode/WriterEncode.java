package encodeDecode;
import java.io.FileWriter;

public class WriterEncode {
    public void  writer(byte[] data){
        try {
            FileWriter fileWriter=new FileWriter("encodedMessages.txt");
            fileWriter.write(String.valueOf(data));
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
