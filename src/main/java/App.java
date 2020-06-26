import models.Encode;

public class App {
    public static void main(String[] args){
        Encode testEncode = new Encode("Hello world", 3);
        System.out.println("Alphabet: " + testEncode.loopThroughAlphabet());
    }
}

