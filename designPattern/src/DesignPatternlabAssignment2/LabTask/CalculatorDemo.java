/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.LabTask;

/**
 *
 * @author Bilal computer
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorHandler adder = new Adder();
        CalculatorHandler subtractor = new Subtractor();
        CalculatorHandler multiplier = new Multiplier();
        CalculatorHandler divider = new Divider();

        adder.setNextHandler(subtractor);
        subtractor.setNextHandler(multiplier);
        multiplier.setNextHandler(divider);

        System.out.println("Addition: " + adder.compute(10, 5));
        System.out.println("Subtraction: " + subtractor.compute(10, 5));
        System.out.println("Multiplication: " + multiplier.compute(10, 5));
        System.out.println("Division: " + divider.compute(10, 5));
    }
}

