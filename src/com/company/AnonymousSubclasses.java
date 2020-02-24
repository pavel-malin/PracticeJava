package com.company;

public class AnonymousSubclasses {

    public static void main(String[] args) {
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.transfer.start();

        new Computer() { // anonymous class
            void superComp () {
                this.i7.start();
                this.transfer.start();
            }
        };
    }
}
