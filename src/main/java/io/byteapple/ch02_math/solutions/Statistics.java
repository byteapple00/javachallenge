package io.byteapple.ch02_math.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    public static void calcSumAndCountAllNumbersDivBy_2_Or_7(int maximum) {
        int count = 0;
        int sum = 0;
        for (int i = 2; i < maximum; i++){
            if (i % 2 == 0 || i % 7 == 0){
                count++;
                sum += i;
            }
        }
        System.out.println(String.format("Count %d - Sum %d", count, sum));
    }
    @Test
    public static void test() {
//        assertEquals(0,calc(6,7));
//        assertEquals(6, calc(3,4));
//        assertEquals(5,calc(5,5) );
    }
    public static void main(String[] args) {
        calcSumAndCountAllNumbersDivBy_2_Or_7(3);
        calcSumAndCountAllNumbersDivBy_2_Or_7(8);
        calcSumAndCountAllNumbersDivBy_2_Or_7(15);
    }
}
