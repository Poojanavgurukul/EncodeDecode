package encodeDecode;

public class Client {
    public static void main(String[] args) {
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
        readerEncode.read();
        System.out.println();
        readerDecode.read();
    }
}
