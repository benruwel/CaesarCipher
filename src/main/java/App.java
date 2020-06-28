import models.Encode;

import java.util.Arrays;

public class App {
    public static void main(String[] args){
        Encode testEncode = new Encode("Hello world", 3);
        System.out.println( testEncode.getInputString());
        System.out.println(testEncode.convertCipheredChars());
    }
}

