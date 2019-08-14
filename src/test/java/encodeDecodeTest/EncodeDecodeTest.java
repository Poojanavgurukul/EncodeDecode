package encodeDecodeTest;

import encodeDecode.*;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class EncodeDecodeTest {
   @Test public void dataShouldReadFromTheFile() throws IOException {
        Encode encode=new Encode();
        ReaderInput readerInput=new ReaderInput();
        Writer writer =new Writer();
        EncodeDecodeTable table=new EncodeDecodeTable();
        String expected="POOJA";
        String actual= readerInput.read("/Users/pooja/encodingDecoding/encodedMessages.txt");
        assertEquals(expected,actual);
    }
}
