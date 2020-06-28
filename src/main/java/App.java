import models.Decode;
import models.Encode;

import java.io.Console;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();
        System.out.println("Hello Stranger, ");
        System.out.println("Welcome to Caesar Cipher");
        System.out.println("What do you want to do today?");
        System.out.println("A: Encode");
        System.out.println("B: Decode");

        String userChoice = myConsole.readLine();

        if (userChoice.startsWith("A") || userChoice.startsWith("a")) {

        System.out.println("Enter the word(s) you wish to Encrypt:");
        String inputString = myConsole.readLine();
        System.out.println("Enter your preferred Cipher key:");
        String cipherKeyString = myConsole.readLine();
        Integer cipherKey = Integer.parseInt(cipherKeyString);

        Encode runEncode = new Encode(inputString, cipherKey);
        String cipheredString = runEncode.convertCipheredCharsToStrings();
        System.out.println(cipheredString);
        } else if (userChoice.equals("B") || userChoice.startsWith("b")) {

        System.out.println("Enter the string you want to decrypt");
        String cipheredString = myConsole.readLine();
        System.out.println("Now enter the cipher key to unlock the hidden message");
        String decipherKeyString = myConsole.readLine();
        Integer decipherKey = Integer.parseInt(decipherKeyString);

        Decode runDecode = new Decode(cipheredString, decipherKey);
        String decipheredString = runDecode.convertDecipheredCharToString();
        System.out.println("Your message is: " + decipheredString);
        } else {
            System.out.println("Sorry didn't catch that :(");
        }


    }
}

