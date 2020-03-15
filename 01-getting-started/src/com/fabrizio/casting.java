package com.fabrizio;

public class casting {

    public static void main(String[] args){
        // implicit casting
        // byte > short > int > long > double
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}
