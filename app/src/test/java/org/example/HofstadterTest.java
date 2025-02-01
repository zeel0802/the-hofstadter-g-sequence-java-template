package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HofstadterTest {

    @Test
    void testGSequence() {
        assertEquals(0, Hofstadter.gSequence(0));
        assertEquals(1, Hofstadter.gSequence(1));
        assertEquals(1, Hofstadter.gSequence(2));
        assertEquals(2, Hofstadter.gSequence(3));
        assertEquals(3, Hofstadter.gSequence(4));
        assertEquals(3, Hofstadter.gSequence(5));
        assertEquals(4, Hofstadter.gSequence(6));
        assertEquals(4, Hofstadter.gSequence(7));
    }

    @Test
    void testHigherValues() {
        assertEquals(5, Hofstadter.gSequence(8));
        assertEquals(6, Hofstadter.gSequence(9));
        assertEquals(6, Hofstadter.gSequence(10));
        assertEquals(7, Hofstadter.gSequence(11));
    }
}
