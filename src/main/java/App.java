import models.Encode;
import models.Decode;

public class App {
    public static void main(String[] args){
        Encode testEncode = new Encode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 2);
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
       // System.out.println(testEncode.convertCipheredChars());
        System.out.println(testDecode.convertDecipheredIndicesToCharArray());
    }
}

