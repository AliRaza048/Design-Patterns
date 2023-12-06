/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProxyPattern.VirtualandProtectedProxyforExamSystem;

/**
 *
 * @author Bilal computer
 */
public class User {
    private String id;
    private String type; // "student" or "teacher"

    public User(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
