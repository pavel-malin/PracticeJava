package com.company;
import java.util.Scanner;

public class Numbers0 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false; // true
        System.out.print("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 50;

        if (first >= second && isTrue){ // &&(and) ||(or)
            System.out.println("Num is 10\n");
        } else if (first == 45)
            System.out.println("Num is 45");
        else {
            System.out.println("Num is lower than " + second);
        }

        switch (first) {
            case 51:
                System.out.println("Num is equal 51");
                break;
            case 58:
                System.out.println("Num is equal 58");
                break;
            case 48:
                System.out.println("Num is equal 48");
                break;
            default:
                System.out.println("Num is equal something");
        }
    }
}
