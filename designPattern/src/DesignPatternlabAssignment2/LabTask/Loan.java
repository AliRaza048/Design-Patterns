/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.LabTask;

/**
 *
 * @author Bilal computer
 */
public class Loan {
    private double limit;
    private double interestRate; // Interest rate in percentage

    public Loan(double limit, double interestRate) {
        this.limit = limit;
        this.interestRate = interestRate;
    }

    // Calculate limit after applying interest rate
    public double getInterestBasedLimit() {
        return limit * (1 + interestRate / 100);
    }

    // Example method to approve loan
    public boolean approveLoan(double requestAmount) {
        double effectiveLimit = getInterestBasedLimit();
        return requestAmount <= effectiveLimit;
    }

    // Additional methods can be added as needed
}


