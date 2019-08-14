package encodeDecode;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Client {
    public static void main(String[] args) throws IOException {
        ReaderInput readerInput =new ReaderInput();
        Encode encode = new Encode();
        BitsRepresentTableInBinary bitsRepresentTableInBinary=new BitsRepresentTableInBinary();
        BitsTableWriter bitsTableWriter=new BitsTableWriter();
        Bits bits=new Bits();
        Writer writer=new Writer();
        ByteConverter byteConverter = new ByteConverter();
        UniqueCharacter uniqueCharacter=new UniqueCharacter();
        String userInput=readerInput.read("/Users/pooja/encodingDecoding/Input");
        Set<Character> uniqueCharactersSet = uniqueCharacter.getUniqueCharacter(userInput);
        int bit = bits.getBits(uniqueCharactersSet.size());
        Map<Character, String> bitsTable = bitsRepresentTableInBinary.generateTableInBinary(bit, uniqueCharactersSet);
        bitsTableWriter.write(bitsTable);
        List<Boolean> userInputEncoded = encode.encoder(userInput, bitsTable);
        byte[] bytes = byteConverter.toBytes(userInputEncoded);
        writer.writer(bytes,"/Users/pooja/encodingDecoding/EncodedMessage");
    }
}
