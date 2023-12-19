/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.CompositePatternLab;

/**
 *
 * @author Bilal computer
 */
public class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, double salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        this.salary += this.salary * bonusPercentage / 100.0;
    }

    // Additional methods specific to DOO
}

