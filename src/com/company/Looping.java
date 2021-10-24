package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Looping {

    private static int TWO = 2;
    private static String EQUAL = " = ";
    private static String SIGN = " x ";

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(TWO + SIGN + i + EQUAL + i * TWO);

            if (i <= 12) {
                System.out.println("You are kid");
            } else if (i > 12 && i <= 19) {
                System.out.println("You are a teenager");
            } else {
                System.out.println("You are an adult");
            }

        }
    }

}




