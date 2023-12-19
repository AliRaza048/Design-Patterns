/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.CompositePatternLab;

/**
 *
 * @author Bilal computer
 */
import java.util.ArrayList;
import java.util.List;

public class Director extends BaseEmployee {
    private List<IEmployee> subordinates;

    public Director(String name, double salary) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
    }

    public void add(IEmployee e) {
        subordinates.add(e);
    }

    public void remove(IEmployee e) {
        subordinates.remove(e);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        this.salary += this.salary * bonusPercentage / 100.0;
        for (IEmployee employee : subordinates) {
            employee.giveBonus(bonusPercentage);
        }
    }
}
