package encodeDecode;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReaderInput {
    public  String read(String path)throws IOException {
            File file=new File(path);
            Scanner scanner = new Scanner(file);
            return String.valueOf(scanner.next());
    }
}
