package models;

import java.util.List;
import java.util.ArrayList;

public class Encode {
    private String mInputString;
    private Integer mCipherKey;
    private String mAlphabets = "abcdefghijklmnopqrstuvwxyz";

    public Encode(String inputString, Integer cipherKey ) {
        this.mInputString = inputString;
        this.mCipherKey = cipherKey;
    }

    public String getInputString() {
        return mInputString;
    }

    public Integer getInputCipherKey() {
        return mCipherKey;
    }

    public char[] convertInputToCharArray() {
        return this.mInputString.toCharArray();
    }

    public Integer getAlphabetIndex() {
        return mAlphabets.indexOf('a');
    }

    public Character loopThroughAlphabet() {
        List<Character> alphabetCharacter = new ArrayList<>();
        for (int i = 0; i < convertInputToCharArray().length ; i++) {
            alphabetCharacter.add(convertInputToCharArray()[i]);
        }

    }

}
