package encodeDecodeTest;

import encodeDecode.*;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class EncodeDecodeTest {
    @Test public void stringShouldEncodeInBinary(){
        String expexted= "011001100110111101101111";
        String userInput = "foo";
        Encode encode=new Encode();
        assertEquals(expexted,encode.encoder(userInput, EncodeDecodeTable.generateBinaryTable()));
    }
    @Test public void encodedMessageShouldDecode(){
        String expected="foo";
        String userInput = "foo";
        Encode encode=new Encode();
        Decode decode=new Decode();
        String encodedData = encode.encoder(userInput, EncodeDecodeTable.generateBinaryTable());
        String decodeData = decode.decoder(encodedData, EncodeDecodeTable.generateBinaryTable());
        assertEquals(expected,decodeData);
    }
    @Test public void dataShouldReadFromTheFile() throws IOException {
        String expected="011001100110111101101111";
        String userInput = "foo";
        Encode encode=new Encode();
        WriterEncode writerEncode=new WriterEncode();
        ReaderEncode readerEncode=new ReaderEncode();
        String encodedData = encode.encoder(userInput, EncodeDecodeTable.generateBinaryTable());
        writerEncode.writer(encodedData);
        String actual=readerEncode.read();
        assertEquals(expected,actual);
    }
}
