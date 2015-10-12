/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

import java.util.Scanner;

/**
 *
 * @author skaza
 */
public class ExceptionDemo {
    public static void main (String[] args) {
        //Using the Math class - expect an Arithmetic Exception
        Scanner keyboard = new Scanner(System.in);        
        MyMath myMath = new MyMath();
        
        try {
            System.out.println(myMath.quotient(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero. Can't do it.");
        }
        
        //using the ArrayStore - Expect an ArrayIndexOutOfBounds
        ArrayStore as = new ArrayStore();
        System.out.print("Which array element do you want? ");
        int which = keyboard.nextInt();
        
        System.out.println("The element is "+ as.retrieve(which));
        
        //using the FileHandler - Expect multiple exceptions
        //where will you handle them? here or in the FileHandler
        
        FileHandler fileH = new FileHandler();
        fileH.openFileAndDivideNumbers();
        
            
    }
}
