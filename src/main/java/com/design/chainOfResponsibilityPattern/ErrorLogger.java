package com.design.chainOfResponsibilityPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/21
 * @Des
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
