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
        Scanner keyboard = new Scanner (System.in);
        
        IThrowExceptions pitcher = new IThrowExceptions();
        
        try {
            System.out.println(pitcher.quotient(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero. Can't do it.");
        }
        
        ArrayStore as = new ArrayStore();
        System.out.print("Which array element do you want?");
        int which = keyboard.nextInt();
        
        System.out.println("The element is "+ as.retrieve(which));
        
    }
}
