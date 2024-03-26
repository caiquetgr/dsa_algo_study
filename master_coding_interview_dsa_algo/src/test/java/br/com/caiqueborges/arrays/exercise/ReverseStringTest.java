package br.com.caiqueborges.arrays.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void shouldReverseAString() {
        assertEquals("?uoy era woh", ReverseString.reverse("how are you?"));
    }

}