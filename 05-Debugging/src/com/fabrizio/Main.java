package com.fabrizio;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        printNumbers( 4);
        System.out.println("finish");
    }

    public static void printNumbers(int limit) {
        for (int i = 0; i < limit; i += 2)
            System.out.println(i);
    }
}
