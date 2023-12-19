/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatternlabAssignment2.CompositePatternLab;

/**
 *
 * @author Bilal computer
 */
public class CompositePatternDemo {
   public static void main(String[] args) {
   
      Employee CEO = new Employee("John","CEO", 30000);

      Employee headSales = new Employee("Robert","Head Sales", 20000);

      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

      Employee clerk1 = new Employee("Laura","Marketing", 10000);
      Employee clerk2 = new Employee("Bob","Marketing", 10000);

      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

      CEO.add(headSales);
      CEO.add(headMarketing);

      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);

      headMarketing.add(clerk1);
      headMarketing.add(clerk2);

      //print all employees of the organization
      System.out.println(CEO); 
      
      for (Employee headEmployee : CEO.getSubordinates()) {
         System.out.println(headEmployee);
         
         for (Employee employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }
      // Creating the director of the university
        Director director = new Director("John", 50000);

        // Creating heads of departments
        HOD hodScience = new HOD("Michel", 30000, "Science");
        HOD hodArts = new HOD("Robert", 30000, "Arts");

        // Creating teachers for each department
        Teacher scienceTeacher1 = new Teacher("Laura", 20000, "PhD", "Active");
        Teacher scienceTeacher2 = new Teacher("Bob", 20000, "MSc", "Active");
        Teacher artsTeacher1 = new Teacher("Richard", 20000, "PhD", "Active");
        Teacher artsTeacher2 = new Teacher("Rob", 20000, "MSc", "Active");

        // Creating a Departmental Operational Officer
        DOO doo = new DOO("Alice", 25000, "Senior");

        // Constructing the organization tree
        director.add(hodScience);
        director.add(hodArts);
        director.add(doo);

        hodScience.add(scienceTeacher1);
        hodScience.add(scienceTeacher2);

        hodArts.add(artsTeacher1);
        hodArts.add(artsTeacher2);

        // EmployeeController to manage and display the organization structure
        EmployeeController controller = new EmployeeController();
        controller.generateOrganogram(director);

        // Activate bonus for the entire structure
        controller.activateBonus(director, "Yearly", 10);
   }
}