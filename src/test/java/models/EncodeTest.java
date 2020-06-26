package models;

import org.junit.*;
import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {
        Encode testEncode = new Encode("Calm down", 2);
        assertEquals(true, testEncode instanceof Encode);
    }

    @Test
    public void newEncode_getsInputString() {
        Encode testEncode = new Encode("Calm down", 2);
        assertEquals("Calm down", testEncode.getInputString());
    }
    @Test
    public void newEncode_getsInputCipherKey() {
        Encode testEncode = new Encode("Calm down", 2);
        Integer expectedOutput = 2;
        assertEquals(expectedOutput, testEncode.getInputCipherKey());
    }

    @Test
    public void runEncode_storeChar_CharArray() {
        Encode testEncode = new Encode("Hello world", 2);
        char [] expectedOutput = testEncode.getInputString().toCharArray();
        assertArrayEquals(expectedOutput, testEncode.convertInputToCharArray());
    }

    @Test
    public void runEncode_getAlphabetIndex() {
        Encode testEncode = new Encode("Hello world", 2);
        Integer expectedOutput = "abc".indexOf('a');
        assertEquals(expectedOutput, testEncode.getAlphabetIndex());
    }
}