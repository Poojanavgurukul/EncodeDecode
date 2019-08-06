package encodeDecode;
import java.io.FileWriter;

public class WriterEncode {
    public void  writer(String data){
        try {
            FileWriter fileWriter=new FileWriter("encodedMessages.txt");
            fileWriter.write(data);
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
