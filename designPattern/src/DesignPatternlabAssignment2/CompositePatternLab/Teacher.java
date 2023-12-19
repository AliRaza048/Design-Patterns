/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.CompositePatternLab;

/**
 *
 * @author Bilal computer
 */
public class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, double salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        this.salary += this.salary * bonusPercentage / 100.0;
    }

    // Additional methods specific to Teacher
}
