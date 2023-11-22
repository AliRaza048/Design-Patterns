/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.decorator.filedecorators;

/**
 *
 * @author Bilal computer
 */

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String filePath = "C:\\Users\\Bilal computer\\Downloads\\Documents\\OutputDemo.txt";
        
        DataSourceDecorator encoded = new UTF8Decorator(
                                         new CompressionDecorator(
                                             new EncryptionDecorator(
                                                  new FileDataSource(filePath))));
        
        // Write data
        encoded.writeData(salaryRecords);

        // Read data and print
        DataSource plain = new FileDataSource(filePath);
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
