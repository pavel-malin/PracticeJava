package com.company;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args){
        byte num = 23;
        int num_1 = 22;
        float num_2 = 34.34f; // 32bit
        double num_3 = 3233.33d; // 64bit
        boolean isTrue = true; // true=1, false=0
        char sym = 'R';
        Scanner str = new Scanner(System.in);

        System.out.println(num);
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(isTrue);
        System.out.println(sym);
        System.out.println("You string is:" + str.nextLine()); // nextInt int


        Scanner num_4 = new Scanner(System.in);
        int first, second, result; // float
        System.out.println("Enter first num: ");
        first = num_4.nextInt(); // nextFloat => float
        System.out.println("Enter second num: ");
        second = num_4.nextInt(); // nextFloat => float
        result = first + second; // float /
        result /= 2; // result / 2, ++(+1), --(-1)
        System.out.println("Result is " + result);
    }
}
