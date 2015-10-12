/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author skaza
 */
public class FileHandler {

    public void openFileAndDivideNumbers() {
        int num1, num2;
        String fileName;
        Scanner keyboardInput = new Scanner(System.in);

        MyMath math = new MyMath();

        System.out.println("Enter file name (with extension):");
        fileName = keyboardInput.next();
        System.out.println("You entered: "+fileName);

        File inputFile = new File(fileName);

        try {
            Scanner fileScanner = new Scanner(inputFile);
            num1 = fileScanner.nextInt();
            num2 = fileScanner.nextInt();
            double result = math.quotient(num1, num2);
            System.out.println("The result of " + num1 + "/" + num2 + " is " + result);
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist!");
        } catch (InputMismatchException e) {
            System.out.println("The quotient method takes only integers.");
        } catch (ArithmeticException e) {
            System.out.println("Here is what I know: ");
            System.out.println(e);
        } finally {

        }
    }

}
