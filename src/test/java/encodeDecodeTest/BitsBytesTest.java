package encodeDecodeTest;

import encodeDecode.Bits;
import encodeDecode.UniqueCharacter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitsBytesTest {
    @Test public void itShouldGiveBits(){
        Bits bits =new Bits();
        UniqueCharacter uniqueCharacter=new UniqueCharacter();
        int expected = 3;
        assertEquals(expected,bits.getBits(uniqueCharacter.getUniqueCharacter("ankita").size()));
    }
}
