/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern.VirtualandProtectedProxyforExamSystem;

import ProxyPattern.VirtualandProtectedProxyforExamSystem.Exam;
import ProxyPattern.VirtualandProtectedProxyforExamSystem.VirtualExamProxy;

/**
 *
 * @author Bilal computer
 */
public class ExamSystemDemo {
    public static void main(String[] args) {
        Exam exam = new ExamProxy("Math Exam");
        User student = new User("student1", "student");
        User teacher = new User("teacher1", "teacher");

        exam.loadContent();
        exam.submitAnswer(student.getId(), "Student's Answer");
        exam.displayResults(student);
        exam.displayResults(teacher);
    }
}
