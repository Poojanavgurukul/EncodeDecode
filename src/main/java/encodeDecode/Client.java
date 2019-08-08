package encodeDecode;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        String userInput = "foo";
        Encode encode = new Encode();
        Decode decode=new Decode();
        EncodeDecodeTable table=new EncodeDecodeTable();
        WriterEncode writerEncode =new WriterEncode();
        WriterDecode writerDecode =new WriterDecode();
        ReaderEncode readerEncode =new ReaderEncode();
        ReaderDecode readerDecode=new ReaderDecode();
        byte[] userInputEncoded = encode.encoder(userInput,table.generateUpperBinaryTable());
        writerEncode.writer(userInputEncoded);
       // writerDecode.write(decodeData);
       System.out.println(readerEncode.read());
        //readerDecode.read();
    }
}
