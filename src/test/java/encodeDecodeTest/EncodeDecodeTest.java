package encodeDecodeTest;

import encodeDecode.*;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class EncodeDecodeTest {
   @Test public void dataShouldReadFromTheFile() throws IOException {
        String expected="FOO";
        String userInput = "foo";
        Encode encode=new Encode();
        WriterEncode writerEncode=new WriterEncode();
        ReaderEncode readerEncode=new ReaderEncode();
        EncodeDecodeTable table=new EncodeDecodeTable();
        byte[] encodedData = encode.encoder(userInput, table.generateUpperBinaryTable());
        writerEncode.writer(encodedData);
        String actual=readerEncode.read();
        assertEquals(expected,actual);
    }
}
