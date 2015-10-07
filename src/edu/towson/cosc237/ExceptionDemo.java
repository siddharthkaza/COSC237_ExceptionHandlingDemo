/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public class ExceptionDemo {
    public static void main (String[] args) {
        IThrowExceptions pitcher = new IThrowExceptions();
        
        try {
            System.out.println(pitcher.quotient(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero. Can't do it.");
        }
    }
}
