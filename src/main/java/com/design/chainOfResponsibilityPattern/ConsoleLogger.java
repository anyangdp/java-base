package com.design.chainOfResponsibilityPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/21
 * @Des
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
