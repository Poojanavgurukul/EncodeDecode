package encodeDecode;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        String userInput = "foo";
        Encode encode = new Encode();
        Decode decode=new Decode();
        WriterEncode writerEncode =new WriterEncode();
        WriterDecode writerDecode =new WriterDecode();
        ReaderEncode readerEncode =new ReaderEncode();
        ReaderDecode readerDecode=new ReaderDecode();
        String encodedData = encode.encoder(userInput, EncodeDecodeTable.generateBinaryTable());
        String decodeData = decode.decoder(encodedData, EncodeDecodeTable.generateBinaryTable());
        writerEncode.writer(encodedData);
        writerDecode.write(decodeData);
        System.out.println(readerEncode.read());
        readerDecode.read();
    }
}
