package encodeDecodeTest;

import encodeDecode.UniqueCharacter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    @Test public void itShouldGiveTheNumberOfUniqueCharacter(){
       String character="pooja";
       int expected=4;
       assertEquals(expected, UniqueCharacter.getUniqueCharacter(character).size());
    }
}
