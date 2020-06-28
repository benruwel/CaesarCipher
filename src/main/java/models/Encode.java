package models;

import java.util.List;
import java.util.ArrayList;

public class Encode {
    private String mInputString;
    private Integer mCipherKey;
    private String mEncodedString;
    private String mAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Encode(String inputString, Integer cipherKey ) {
        this.mInputString = inputString;
        this.mCipherKey = cipherKey;
    }

    public String getInputString() {
        return mInputString.toUpperCase();
    }

    public Integer getInputCipherKey() {
        return mCipherKey;
    }

    public char[] convertInputToCharArray() {
        return getInputString().toCharArray();
    }

    public Integer getAlphabetIndex(char inputChar) {
        return mAlphabets.indexOf(inputChar);
    }

    public List<Integer> loopThroughInputCharArray() {
        List<Integer> alphabetCharacterIndex = new ArrayList<>();
        for (char inputChar : convertInputToCharArray()) {
            alphabetCharacterIndex.add(getAlphabetIndex(inputChar));
        }
        return alphabetCharacterIndex;
    }
    public List<Integer> addCipherKeyToInputIndices() {
        List<Integer> alphabetCharacterIndexWithCipher = new ArrayList<>();
        for (Integer inputIndex : loopThroughInputCharArray())
            if (inputIndex >= 0) {
                inputIndex = (inputIndex + getInputCipherKey()) % 26;
                alphabetCharacterIndexWithCipher.add(inputIndex);
            } else {
                alphabetCharacterIndexWithCipher.add(inputIndex);
            }
        return alphabetCharacterIndexWithCipher;
    }

    public List<Character> convertCipheredIndicesToCharArray(){
        List<Character> cipheredCharacters = new ArrayList<>();
        for (Integer cipherIndex : addCipherKeyToInputIndices()) {
            if (cipherIndex >= 0){
                cipheredCharacters.add(mAlphabets.charAt(cipherIndex));
            }else {
                cipheredCharacters.add(' ');
            }
        }
        return cipheredCharacters;
    }

    public String convertCipheredCharsToStrings() {
        StringBuilder builder = new StringBuilder(convertCipheredIndicesToCharArray().size());
        String builtString;
        for (Character chr : convertCipheredIndicesToCharArray()) {
            builder.append(chr);
        }
        builtString = builder.toString();
        mEncodedString = builtString;
        return mEncodedString;
    }

    public String getEncodedString() {
        return mEncodedString;
    }

}
