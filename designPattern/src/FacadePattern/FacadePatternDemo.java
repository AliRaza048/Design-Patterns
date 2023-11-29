/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author Bilal computer
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle("Red");
        shapeMaker.drawRectangle("Green", "Filled");
        shapeMaker.drawSquare("Blue", "Small", "Outlined");
        shapeMaker.drawTriangle("Yellow", "Medium");
        shapeMaker.drawHexagon("Purple", "Large", "Dotted");
    }
}

