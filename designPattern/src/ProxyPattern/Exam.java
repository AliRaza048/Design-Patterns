/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author Bilal computer
 */
public interface Exam {
    void loadExam();
    void displayResults(User user);
    void submitAnswer(String studentId, String answer); // New method
}

