package encodeDecode;

public class Bits {

  public int getBits(int numberOfUniqueCharacter){
       for (int i = 1; i <numberOfUniqueCharacter ; i++) {
           int pow=(int)Math.pow(2,i);
           if (numberOfUniqueCharacter<pow){
               return i;
           }
       }
     return 0;
    }
}
