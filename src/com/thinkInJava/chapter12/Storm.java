package com.thinkInJava.chapter12;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 */
public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
