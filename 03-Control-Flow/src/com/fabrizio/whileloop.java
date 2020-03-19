package com.fabrizio;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class whileloop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("quit")) {
        System.out.println("Input: ");
        input = scanner.next().toLowerCase();
        System.out.println(input);


}}
}
