package com.company;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        float [] name = new float[] {23.23f,34.12f,56.23f};  // [5] int --> float
        System.out.println(name[1]);
        // name = new int[5];
        // name[0] = 23; name[1] = 12;

        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}
