package com.company;

public class StaticFinal {

    public static void main(String[] args) {
        int x = Math.mult(12, 23);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        a.x = 24;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);

    }
}
