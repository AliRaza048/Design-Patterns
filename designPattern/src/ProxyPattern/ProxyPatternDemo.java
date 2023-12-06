/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author Bilal computer
 */
public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      image.display();
      System.out.println("\n");
      Exam exam = new ExamProxy("Math Exam");
        User student1 = new User("student1", "student");
        User teacher = new User("teacher1", "teacher");

        // Loading the exam
        exam.loadExam();

        // Submitting answers
        exam.submitAnswer(student1.getId(), "Answer by Student 1");

        // Displaying results
        exam.displayResults(student1); // Shows only student1's results
        exam.displayResults(teacher);
   }
}