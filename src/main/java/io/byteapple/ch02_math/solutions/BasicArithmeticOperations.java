package io.byteapple.ch02_math.solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicArithmeticOperations {
    public static int calc(final int a, final int b) {
        return (a * b / 2) % 7;
    }

    @Test
    public static void test() {
        assertEquals(0,calc(6,7));
        assertEquals(6, calc(3,4));
        assertEquals(5,calc(5,5) );
    }
    public static void main(String[] args) {
        test();
    }
}
