package encodeDecode;
import java.io.File;
import java.io.FileOutputStream;

public class Writer {
    public void  writer(byte[] data,String path){
        File file = new File(path);
        try(FileOutputStream fileOutputStream= new FileOutputStream(file))
        {
            fileOutputStream.write(data);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
