/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern.VirtualandProtectedProxyforExamSystem;

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
    public void loadContent() {
        if (realExam == null) {
            realExam = new RealExam(examContent);
        }
    }

    @Override
    public void displayResults(User user) {
        if (realExam == null) {
            System.out.println("Exam not loaded yet.");
        } else {
            realExam.displayResults(user);
        }
    }

    public void submitAnswer(String studentId, String answer) {
        if (realExam == null) {
            loadContent(); // Ensure the real exam is loaded
        }
        realExam.submitAnswer(studentId, answer);
    }
}

