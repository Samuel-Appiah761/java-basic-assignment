package com.company;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {

        while(true){
            int age;
            Scanner myAge= new Scanner(System.in);
            System.out.print("Enter your age: ");
            age = myAge.nextInt();

            if (age <= 12){
                System.out.println("The person is a child: " +age);
            }
            else if ( age >=13 && age <=19){



                System.out.println("You are a teenager: " +age);
            }
            else {
                System.out.println(" You are an adult: " +age);
            }
        }
    }
}
