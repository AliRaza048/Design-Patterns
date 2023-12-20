/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibilityDesignPattern.newchain;

/**
 *
 * @author fa20-bse-048
 */
// DatabaseLogger.java

public class DatabaseLogger extends AbstractLogger {

    public DatabaseLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Database::Logger: " + message);
    }
}