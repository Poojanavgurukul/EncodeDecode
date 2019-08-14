package encodeDecodeTest;

import encodeDecode.*;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class EncodeDecodeTest {
   @Test public void dataShouldReadFromTheFile() throws IOException {
        ReaderInput readerInput=new ReaderInput();
        String expected="POOJA";
        String actual= readerInput.read("/Users/pooja/encodingDecoding/Input");
        assertEquals(expected,actual);
    }
}
