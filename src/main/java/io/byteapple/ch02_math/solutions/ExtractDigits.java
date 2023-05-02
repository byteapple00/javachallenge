package io.byteapple.ch02_math.solutions;


public class ExtractDigits {
    public static void extractDigits(int input){
        while(input / 10 >= 0){
            if (input == 0){
                break;
            }
            System.out.println(input % 10);
            input = input / 10;
        }
    }
    public static void extractDigitsRecursive(int input){
        if (input / 10 != 0){
            extractDigitsRecursive(input / 10 );
        }
        System.out.println(input % 10);
    }
    public static void main (String ...args){
        extractDigits(123);
        extractDigitsRecursive(-123312321);
    }
}
