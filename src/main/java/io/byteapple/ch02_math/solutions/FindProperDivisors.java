package io.byteapple.ch02_math.solutions;

import java.util.ArrayList;
import java.util.List;

public class FindProperDivisors {
    public static  List<Integer> findProperDivisors(final int value){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= value / 2; i++){
            if (value % i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static void main (String ...args){
        findProperDivisors(6  );
        findProperDivisors(7);
        findProperDivisors(24);
    }
}
