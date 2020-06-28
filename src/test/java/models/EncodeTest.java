package models;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {
        Encode testEncode = new Encode("Calm down", 2);
        assertEquals(true, testEncode instanceof Encode);
    }

    @Test
    public void newEncode_getsInputString() {
        Encode testEncode = new Encode("CALM DOWN", 2);
        assertEquals("CALM DOWN", testEncode.getInputString());
    }
    @Test
    public void newEncode_getsInputCipherKey() {
        Encode testEncode = new Encode("CALM DOWN", 2);
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
        assertEquals(expectedOutput, testEncode.getAlphabetIndex('A'));
    }
    @Test
    public void runEncode_getIndexOfInputCharInAlphabets_loopThroughInputCharArray(){
        Encode testEncode = new Encode("Hello world", 2);
        List<Integer> expectedOutput = new ArrayList<>();
        for (char expectedInputChar : testEncode.convertInputToCharArray()) {
            expectedOutput.add(testEncode.getAlphabetIndex(expectedInputChar));
        }
        assertEquals(expectedOutput, testEncode.loopThroughInputCharArray());
    }

    @Test
    public void runEncode_incrementingCharIndexByTheCipherKey_addCipherKeyToInputIndices() {
        Encode testEncode = new Encode("Hello world", 2);
        
    }
}