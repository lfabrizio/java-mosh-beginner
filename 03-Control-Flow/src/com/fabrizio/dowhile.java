package com.fabrizio;

import java.util.Scanner;

public class dowhile {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = "";
            do {
                System.out.println("INput: ");
                input = scanner .next().toLowerCase();
                System.out.println(input);
            }  while (!input.equals("quit"));
            }
    }

