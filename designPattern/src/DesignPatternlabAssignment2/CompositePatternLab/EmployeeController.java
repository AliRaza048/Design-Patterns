/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.CompositePatternLab;

/**
 *
 * @author Bilal computer
 */
public class EmployeeController {
    // Method to generate the organogram
    public void generateOrganogram(IEmployee employee) {
        // Implementation to generate a tree-like structure of the organization
    }

    // Method to activate bonuses
    public void activateBonus(IEmployee employee, String bonusType, int percentageOfBonus) {
        employee.giveBonus(percentageOfBonus);
        // Further implementation
    }
}

