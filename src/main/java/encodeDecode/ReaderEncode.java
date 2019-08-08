package encodeDecode;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReaderEncode {
    public  String read()throws IOException {
            File file=new File("encodedMessages.txt");
            Scanner scanner = new Scanner(file);
        String input = scanner.next();
        return input;
    }
}
