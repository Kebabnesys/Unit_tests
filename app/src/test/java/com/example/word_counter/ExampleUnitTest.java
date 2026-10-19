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
    public void Test01_EmptyString() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = Counter.countChars(givenString);
        assertEquals( expectedValue, actualValue);
    }
}
