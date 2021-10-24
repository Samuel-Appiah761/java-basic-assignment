package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int y = 20;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a Value");
        x = myObj.nextInt();
        int addResult = x + y;
        System.out.println("add opp: " + addResult);


        int z;
        int q = 60;
        Scanner myclass = new Scanner(System.in);
        System.out.println("Enter value");
        z = myclass.nextInt();
        int subResult = z - q;
        System.out.println("sub opp: " + subResult);

        int o;
        int r = 20;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value");
        o = scan.nextInt();
        int multiplyResult = o * r;
        System.out.println("multiply opp: " + multiplyResult);

        int j;
        int t = 4;
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter a value");
        j = myscan.nextInt();
        int divideResult = t / j;
        System.out.println("divide opp: " + divideResult);

        int u;
        int i = 5;
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter a value");
        u = answer.nextInt();
        int modResult = u % i;
        System.out.println("mod opp: " + modResult);


        String v;
        Scanner ok = new Scanner(System.in);
        System.out.println("Type your text");
        v = ok.next();
        System.out.println("Let's eat");


    }
}
