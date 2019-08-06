package encodeDecodeTest;

import encodeDecode.Decode;
import encodeDecode.Encode;
import encodeDecode.EncodeDecodeTable;
import org.junit.Test;

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
}
