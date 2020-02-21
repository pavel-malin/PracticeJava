package com.company;

public class Cycle {
    public static void main(String[] args) {
        // for (int i = 100; i > 10; i -= 10)
        //     System.out.println(i);

          boolean isTrue = true;
            int j = 0;
            while (j < 100) {
          //  while (isTrue) { // j < 20
                j += 1;
                if (j % 2 == 0)
                    continue;
                System.out.println(j);
           //     j += 2;
           //     if (j > 10)
            //       isTrue = false; // break;
            }

//        int x = 0;
//        do {
//            x++;
//            System.out.println(x);
//        } while (x < 0);

    }
}

