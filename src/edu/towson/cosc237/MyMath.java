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
public class MyMath {

    public double quotient(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException();
        }
        return (double) numerator / denominator;
    }
}
