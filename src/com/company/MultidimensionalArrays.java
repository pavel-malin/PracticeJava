package com.company;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args){
        char[][] array = new char[3][]; // float[] array = new float[] {12.23f,354.45f};
        for (int i = 0; i < array.length; i++)
            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.print(array[0][0]);

    }
}
