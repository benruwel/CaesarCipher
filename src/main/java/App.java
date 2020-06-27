import models.Encode;

public class App {
    public static void main(String[] args){
        Encode testEncode = new Encode("Hello xorld", 3);
        System.out.println(testEncode.loopThroughInputCharArray());
        System.out.println(testEncode.addCipherKeyToInputIndices());
    }
}

