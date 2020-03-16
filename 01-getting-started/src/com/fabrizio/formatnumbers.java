package com.fabrizio;

import java.text.NumberFormat;

public class formatnumbers {
    public static void main(String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
