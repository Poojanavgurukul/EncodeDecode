import java.util.List;

public class Client {
    public static void main(String[] args) {
        String userInput = "foo";
        Encode encode = new Encode();
        Decode decode=new Decode();
        List<String> encodedData = encode.encoder(userInput, EncodeDecodeTable.generateBinaryTable());
        String decodeData = decode.decoder(encodedData, EncodeDecodeTable.generateBinaryTable());
        System.out.println(encodedData);
        System.out.println(decodeData);
    }
}
