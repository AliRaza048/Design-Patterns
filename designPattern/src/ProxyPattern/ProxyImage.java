/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author Bilal computer
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (!isSupportedFormat(fileName)) {
            System.out.println("Unsupported image format. Displaying placeholder.");
        } else {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
    }

    private boolean isSupportedFormat(String fileName) {
        // Check for supported formats (e.g., jpg, png)
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }
}
