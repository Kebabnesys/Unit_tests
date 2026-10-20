package com.example.word_counter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Test01_EmptyChar() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = Counter.countChars(givenString);
        assertEquals( expectedValue, actualValue);
    }
    @Test
    public void Test03_notEmptyChar() {
        String givenString = "e";
        int expectedValue = 1;
        int actualValue = Counter.countChars(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test05_null() {
        String givenString = null;
        int expectedValue = 0;
        int actualValue = Counter.countChars(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test06_CoupleWords() {
        String givenString = "labas labs viso";
        int expectedValue = 3;
        int actualValue = Counter.countWords(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test07_EmptyWords() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = Counter.countWords(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test08_TwoSentences() {
        String givenString = "Where is everyone going? Bingo?";
        int expectedValue = 2;
        int actualValue = Counter.countSentences(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test09_Number() {
        String givenString = "67420";
        int expectedValue = 5;
        int actualValue = Counter.countNumbers(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test10_CharSpaces() {
        String givenString = "    ";
        int expectedValue = 4;
        int actualValue = Counter.countChars(givenString);
        assertEquals( expectedValue, actualValue);
    }

    @Test
    public void Test11_EmptySentence() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = Counter.countSentences(givenString);
        assertEquals( expectedValue, actualValue);
    }
}
