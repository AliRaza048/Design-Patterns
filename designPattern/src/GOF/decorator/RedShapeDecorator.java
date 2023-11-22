/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.decorator;

/**
 *
 * @author Bilal computer
 */
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);      
   }

   @Override
   public void draw() {
      decoratedShape.draw();       
      setRedBorder(decoratedShape);
      computeCost(decoratedShape); // Calculate the cost and display after drawing
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }

   private void computeCost(Shape shape) {
      double totalCost = shape.getPrice() + 5.0; // Additional cost for decoration
      System.out.println("Total Cost: " + totalCost);
   }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}