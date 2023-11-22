/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.decorator;

/**
 *
 * @author Bilal computer
 */
public class Rectangle implements Shape {
   private double price = 10.0; // Price for the rectangle

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

   @Override
   public double getPrice() {
      return price;
   }
}