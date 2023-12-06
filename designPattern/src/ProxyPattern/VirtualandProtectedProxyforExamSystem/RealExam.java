/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern.VirtualandProtectedProxyforExamSystem;

/**
 *
 * @author Bilal computer
 */


import java.util.HashMap;
import java.util.Map;

public class RealExam implements Exam {
    private String content;
    private Map<String, String> studentAnswers = new HashMap<>();

    public RealExam(String content) {
        this.content = content;
        System.out.println("Loading exam content: " + content);
    }

    @Override
    public void loadContent() {
        // Load the actual exam content
    }

    @Override
    public void displayResults(User user) {
        // Display results based on user type (student or teacher)
        // Students see only their results, teachers see all results
    }

    public void submitAnswer(String studentId, String answer) {
        studentAnswers.put(studentId, answer);
    }
}


