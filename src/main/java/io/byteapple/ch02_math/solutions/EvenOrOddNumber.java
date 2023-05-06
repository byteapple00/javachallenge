package io.byteapple.ch02_math.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOrOddNumber {
    public static boolean isOdd(int a){
        return !(a % 2 == 0);
    }
    @Test
    public static void test() {
        assertEquals(false,isOdd(6));
        assertEquals(true, isOdd(3));

    }
    public static void main(String[] args) {
        test();
    }
}
