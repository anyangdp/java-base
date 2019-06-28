package com.design.chainOfResponsibilityPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/21
 * @Des
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
