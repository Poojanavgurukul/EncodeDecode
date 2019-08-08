package encodeDecode;
import java.io.File;
import java.io.FileOutputStream;

public class WriterEncode {
    public void  writer(byte[] data){
        File file = new File("encodedMessages.txt");
        try(FileOutputStream fileOutputStream= new FileOutputStream(file))
        {
            fileOutputStream.write(data);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
