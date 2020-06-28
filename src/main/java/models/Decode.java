package models;

public class Decode {

    private String mInputCipheredString;
    private Integer mCipherKey;
    private String mAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Decode(String inputCipheredString, Integer cipherKey) {
        this.mInputCipheredString = inputCipheredString;
        this.mCipherKey = cipherKey;
    }

}
