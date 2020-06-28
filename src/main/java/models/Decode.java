package models;

import java.util.ArrayList;
import java.util.List;

public class Decode {

    private String mInputCipheredString;
    private Integer mCipherKey;
    private String mDecipheredString;
    private String mAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



    public Decode(String cipheredString, Integer cipherKey) {
        this.mInputCipheredString = cipheredString;
        this.mCipherKey = cipherKey;
    }

    public String getInputCipheredString() {
        return mInputCipheredString.toUpperCase();
    }

    public Integer getCipherKey() {
        return mCipherKey;
    }
    public char[] convertInputToCharArray() {
        return getInputCipheredString().toCharArray();
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
    public List<Integer> redactCipherKeyFromInputIndices() {
        List<Integer> alphabetCharacterIndexWithOutCipher = new ArrayList<>();
        Integer inputIndexAfterDeciphering;
        for (Integer inputIndex : loopThroughInputCharArray())
            if (inputIndex >= 0) {
                inputIndexAfterDeciphering = ((((inputIndex - getCipherKey()) % 26) + 26) % 26);
                alphabetCharacterIndexWithOutCipher.add(inputIndexAfterDeciphering);
            } else {
                alphabetCharacterIndexWithOutCipher.add(inputIndex);
            }
        return alphabetCharacterIndexWithOutCipher;
    }

    public List<Character> convertDecipheredIndicesToCharArray(){
        List<Character> decipheredCharacters = new ArrayList<>();
        for (Integer cipherIndex : redactCipherKeyFromInputIndices()) {
            if (cipherIndex >= 0){
                decipheredCharacters.add(mAlphabets.charAt(cipherIndex));
            }else {
                decipheredCharacters.add(' ');
            }
        }
        return decipheredCharacters;
    }

    public String convertDecipheredCharToString() {
        StringBuilder builder = new StringBuilder(convertDecipheredIndicesToCharArray().size());
        String builtString;
        for (Character chr : convertDecipheredIndicesToCharArray()) {
            builder.append(chr);
        }
        builtString = builder.toString();
        mDecipheredString = builtString;
        return mDecipheredString;
    }
}
