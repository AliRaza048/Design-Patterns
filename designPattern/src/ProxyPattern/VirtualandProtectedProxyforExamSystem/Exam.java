/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProxyPattern.VirtualandProtectedProxyforExamSystem;

/**
 *
 * @author Bilal computer
 */
public interface Exam {
    void loadContent();
    void displayResults(User user);

    public void submitAnswer(String id, String students_Answer);
}


