package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the order amount?" );
        double oamount = sc.nextDouble();
        sc.nextLine();
        System.out.println("What is the state?" );
        String state = sc.nextLine();
        if (state .equals("WI")){
            System.out.println("The Subtotal is $"+oamount);
            double taxamount = oamount * 0.055;
            System.out.println("The tax is $"+taxamount);
            double taxtotal = oamount + taxamount;
            System.out.println("The total is $"+taxtotal);
        }
        else{
            System.out.println("The total is $"+oamount);
        }

    }
}
