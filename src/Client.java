import java.util.List;

public class Client {
    public static void main(String[] args) {
        String userInput = "foo";
        Encode encoding = new Encode();
        List<String> encodedData = encoding.encoding(userInput, EncodeTable.generateBinaryTable());
        System.out.println(encodedData);
    }
}
