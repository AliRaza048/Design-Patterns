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
// ChainPatternDemo.java

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger warningLogger = new DatabaseLogger(AbstractLogger.WARNING);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    private static AbstractLogger getErrorChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        return errorLogger;
    }

    private static AbstractLogger getWarningChainOfLoggers() {
        AbstractLogger warningLogger = new DatabaseLogger(AbstractLogger.WARNING);
        return warningLogger;
    }

    private static AbstractLogger getInfoChainOfLoggers() {
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

        loggerChain.logMessage(AbstractLogger.WARNING,
                "This is a warning DatabaseLogger.");

        AbstractLogger errorChain = getErrorChainOfLoggers();
        AbstractLogger warningChain = getWarningChainOfLoggers();
        AbstractLogger infoChain = getInfoChainOfLoggers();

        errorChain.logMessage(AbstractLogger.ERROR,
                "This is another error information.");

        warningChain.logMessage(AbstractLogger.WARNING,
                "This is another warning DatabaseLogger.");

        infoChain.logMessage(AbstractLogger.INFO,
                "This is another information.");
    }
}