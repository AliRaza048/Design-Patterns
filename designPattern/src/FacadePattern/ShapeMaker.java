/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePattern;

/**
 *
 * @author Bilal computer
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape triangle;
    private Shape hexagon;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        triangle = new Triangle();
        hexagon = new Hexagon();
    }

    public void drawCircle(String... args) {
        circle.draw(args);
    }
    public void drawRectangle(String... args) {
        rectangle.draw(args);
    }
    public void drawSquare(String... args) {
        square.draw(args);
    }
    public void drawTriangle(String... args) {
        triangle.draw(args);
    }
    public void drawHexagon(String... args) {
        hexagon.draw(args);
    }
}


