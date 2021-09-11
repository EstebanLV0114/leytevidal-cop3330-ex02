package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "What is the input string?" );

        String text = scan.nextLine();

        int stringChars = text.length();

        System.out.println(text + " has " + stringChars + " characters");

    }
}
