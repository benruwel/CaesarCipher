package models;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void loopThroughCharArray_storingCharIndexInArray_Integer(){
        Encode testEncode = new Encode("Hello world", 2);
        List<Integer> expectedOutput = new ArrayList<>();
        for (char expectedInputChar : testEncode.convertInputToCharArray()) {
            expectedOutput.add(testEncode.getAlphabetIndex(expectedInputChar));
        }
        assertEquals(expectedOutput, testEncode.loopThroughInputCharArray());
    }

    @Test
    public void addCipherKeyToInputIndices_incrementingCharIndexByTheCipherKey_Integer() {
        Encode testEncode = new Encode("Hello world", 2);
        List<Integer> expectedOutput = new ArrayList<>();
        Integer[] expectedIntArray = {9, 6, 13, 13, 16, -1, 24, 16, 19, 13, 5};
        expectedOutput.addAll(Arrays.asList(expectedIntArray));
        assertEquals(expectedOutput, testEncode.addCipherKeyToInputIndices());
        }
    @Test
    public void convertCipheredIndicesToCharArray_getCharsFromAlphabetWithIndices_ListCharacter() {
        Encode testEncode = new Encode("Hello world", 2);
        List<Character> expectedOutput = new ArrayList<>();
        Character[] expectedCharArray = {'J', 'G', 'N', 'N', 'Q',' ', 'Y', 'Q', 'T', 'N', 'F'};
        expectedOutput.addAll(Arrays.asList(expectedCharArray));
        assertEquals(expectedOutput, testEncode.convertCipheredIndicesToCharArray());
    }

    @Test
    public void convertCipheredChars_charsToString_String() {
        Encode testEncode = new Encode("Hello world", 2);
        String expectedOutput = "JGNNQ YQTNF";
        assertEquals(expectedOutput, testEncode.convertCipheredChars());
    }
}