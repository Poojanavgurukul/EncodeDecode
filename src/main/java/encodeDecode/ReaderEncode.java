package encodeDecode;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderEncode {
    public void read(){
        try{
            FileReader fr=new FileReader("encodedMessages.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
