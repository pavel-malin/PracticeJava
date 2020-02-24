package com.company; // company.com, youtube.com == com.youtube

public class PackagesAndScope {  // Main

    int x = 0;

    public static void main(String[] args) {
        int x = 1;
//        System.out.print(this.x);  // this.x good this Main, not Main the error
        System.out.print(x);
    }
}
