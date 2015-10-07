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
public class ArrayStore {
    private final int[] intArray = {1,2,3,4,5,6,2,1,6,2};
    
    /**
     * retrieves a particular element
     * @param which
     * @return 
     */
    public int retrive(int which) {
        return intArray[which];
    }
}
