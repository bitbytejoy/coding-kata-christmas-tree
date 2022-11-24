package com.hextrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainTest {
    @ParameterizedTest
    @CsvSource(value = {
        "0,'I'",
        "1,'X\nI'",
        "2,' X\nXXX\n I'",
        "3,'  X\n XXX\nXXXXX\n  I'",
        "4,'   X\n  XXX\n XXXXX\nXXXXXXX\n   I'",
        "5,'    X\n   XXX\n  XXXXX\n XXXXXXX\nXXXXXXXXX\n    I'",
        "-1,'I'",
        "-2,'I'",
        Integer.MIN_VALUE + ",'I'",
    })
    void christmasTree_whenHeight_thenRenderTree(int height, String expected) {
        System.out.println("expected");
        System.out.println(expected);
        Assertions.assertEquals(expected, Main.christmasTree(height));
    }
}