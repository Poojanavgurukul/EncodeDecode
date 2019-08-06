package encodeDecode;

import java.io.FileReader;

public class ReaderDecode {

    public void read(){
        try{
            FileReader fr=new FileReader("decodedMessages.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
