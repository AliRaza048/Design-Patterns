/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.decorator;

/**
 *
 * @author Bilal computer
 */
public class Circle implements Shape {
   private final double price = 7.0; // Price for the circle

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

   @Override
   public double getPrice() {
      return price;
   }
}
