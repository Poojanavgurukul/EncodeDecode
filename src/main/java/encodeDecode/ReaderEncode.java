package encodeDecode;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReaderEncode {
    public  String read()throws IOException {
            File fr=new File("encodedMessages.txt");
            Scanner sc = new Scanner(fr);
            String input = sc.next();
            return  input;
    }
}
