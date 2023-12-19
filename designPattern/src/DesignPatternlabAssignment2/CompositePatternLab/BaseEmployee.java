/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.CompositePatternLab;

/**
 *
 * @author Bilal computer
 */
public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected double salary;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Implement giveBonus in a way that's common for all employees, or make it abstract to force subclasses to implement it
    @Override
    public abstract void giveBonus(int bonusPercentage);
}

