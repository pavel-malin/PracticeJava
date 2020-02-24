package com.company;

public class Computer {
    class Proccessor {
        private boolean isStart = false;

        public void start () {
            isStart = true;
        }

        public void shutdown () {
            isStart = false;
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.print("isStart = " + isStart);
        }

        public void shutdown () {
            isStart = false;
            System.out.print("isStart = " + isStart);
        }
    }

    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();
}
