package com.company;
import java.util.Scanner;

public class Function {
    public static void main(String[] args){
        func(3, 4); // int temp = func(3, 4);
        readArray(); // System.out.print(temp);
    }
    public static int[] readArray (){
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        return arr;
    }
    public static void func (int a, int b) { // int
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.print(result); // return result func(2,3);

    }
}
