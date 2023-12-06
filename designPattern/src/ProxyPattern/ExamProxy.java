/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author Bilal computer
 */
public class ExamProxy implements Exam {
    private RealExam realExam;
    private String examContent;

    public ExamProxy(String examContent) {
        this.examContent = examContent;
    }

    @Override
    public void loadExam() {
        if (realExam == null) {
            realExam = new RealExam(examContent);
        }
    }
    @Override
    public void submitAnswer(String studentId, String answer) {
        if (realExam == null) {
            loadExam(); // Ensure the real exam is loaded
        }
        realExam.submitAnswer(studentId, answer);
    }

    @Override
    public void displayResults(User user) {
        if (realExam == null) {
            System.out.println("Exam not loaded yet.");
        } else {
            realExam.displayResults(user);
        }
    }
}
