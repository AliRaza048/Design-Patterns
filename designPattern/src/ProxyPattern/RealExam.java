/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern;

/**
 *
 * @author Bilal computer
 */
import java.util.HashMap;
import java.util.Map;

public class RealExam implements Exam {
    private String examContent;
    private Map<String, String> studentAnswers = new HashMap<>();

    public RealExam(String examContent) {
        this.examContent = examContent;
        loadExam();
    }

    @Override
    public void loadExam() {
        System.out.println("Loading exam: " + examContent);
    }

    @Override
    public void submitAnswer(String studentId, String answer) {
        studentAnswers.put(studentId, answer);
    }

    @Override
    public void displayResults(User user) {
        if ("teacher".equals(user.getType())) {
            System.out.println("Showing all student answers: " + studentAnswers);
        } else {
            System.out.println("Showing results for " + user.getId() + ": " + studentAnswers.get(user.getId()));
        }
    }
}
