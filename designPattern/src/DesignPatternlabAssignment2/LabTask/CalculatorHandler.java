/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.LabTask;

/**
 *
 * @author Bilal computer
 */
abstract class CalculatorHandler {
    protected CalculatorHandler nextHandler;

    public void setNextHandler(CalculatorHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract int compute(int a, int b);
}

