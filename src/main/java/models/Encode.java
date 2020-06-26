package models;

import java.util.List;
import java.util.ArrayList;

public class Encode {
    private String mInputString;
    private Integer mCipherKey;
    private char[] mAlphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

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

}
