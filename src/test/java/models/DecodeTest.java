package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        assertEquals(true, testDecode instanceof Decode);
    }

    @Test
    public void newEncode_getsCipheredString() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        assertEquals("SWKEM DTQYP", testDecode.getInputCipheredString());
    }
    @Test
    public void newEncode_getsCipherKey() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        Integer expectedOutput = 2;
        assertEquals(expectedOutput, testDecode.getCipherKey());
    }

    @Test
    public void runEncode_storeChar_CharArray() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        char [] expectedOutput = testDecode.getInputCipheredString().toCharArray();
        assertArrayEquals(expectedOutput, testDecode.convertInputToCharArray());
    }

    @Test
    public void runEncode_getAlphabetIndex() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        Integer expectedOutput = "abc".indexOf('a');
        assertEquals(expectedOutput, testDecode.getAlphabetIndex('A'));
    }
    @Test
    public void loopThroughCharArray_storingCharIndexInArray_Integer(){
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        List<Integer> expectedOutput = new ArrayList<>();
        for (char expectedInputChar : testDecode.convertInputToCharArray()) {
            expectedOutput.add(testDecode.getAlphabetIndex(expectedInputChar));
        }
        assertEquals(expectedOutput, testDecode.loopThroughInputCharArray());
    }

    @Test
    public void redactCipherKeyFromInputIndices_decrementingCharIndexByTheCipherKey_Integer() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        List<Integer> expectedOutput = new ArrayList<>();
        Integer[] expectedIntArray = {16, 20, 8, 2, 10, -1, 1, 17, 14, 22, 13};
        expectedOutput.addAll(Arrays.asList(expectedIntArray));
        assertEquals(expectedOutput, testDecode.redactCipherKeyFromInputIndices());
    }
    @Test
    public void convertDecipheredIndicesToCharArray_getCharsFromAlphabetWithIndices_ListCharacter() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        List<Character> expectedOutput = new ArrayList<>();
        Character[] expectedCharArray = {'Q', 'U', 'I', 'C', 'K',' ', 'B', 'R', 'O', 'W', 'N'};
        expectedOutput.addAll(Arrays.asList(expectedCharArray));
        assertEquals(expectedOutput, testDecode.convertDecipheredIndicesToCharArray());
    }

    @Test
    public void convertDecipheredCharToString_charsToString_String() {
        Decode testDecode = new Decode("SWKEM DTQYP", 2);
        String expectedOutput = "QUICK BROWN";
        assertEquals(expectedOutput, testDecode.convertDecipheredCharToString());
    }
}