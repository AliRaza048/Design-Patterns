/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern.VirtualandProtectedProxyforExamSystem;

/**
 *
 * @author Bilal computer
 */
public class VirtualExamProxy implements Exam {
    private RealExam examContent;
    private String content;

    public VirtualExamProxy(String content) {
        this.content = content;
    }

    @Override
    public void loadContent() {
        if (examContent == null) {
            examContent = new RealExam(content);
        }
    }

    @Override
    public void displayResults(User user) {
        if (examContent == null) {
            System.out.println("Exam content is not loaded yet.");
        } else {
            examContent.displayResults(user);
        }
    }

    @Override
    public void submitAnswer(String id, String students_Answer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
