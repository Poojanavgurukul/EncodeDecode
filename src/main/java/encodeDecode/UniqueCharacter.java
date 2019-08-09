package encodeDecode;

import java.util.HashSet;

public class UniqueCharacter {
    public HashSet<Character>getUniqueCharacter(String input){
        HashSet<Character>listOfUniqueCharacter=new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            listOfUniqueCharacter.add(input.charAt(i));
        }
        return listOfUniqueCharacter;
    }
}
