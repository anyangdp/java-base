package com.design.review.观察者模式.使用jdk中Observer;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
public class Test {
    public static void main(String[] args) {
        WeChatAccounts accounts = new WeChatAccounts("张三");
        WeChatClient client = new WeChatClient("client1");
        WeChatClient client2 = new WeChatClient("client2");
        WeChatClient client3 = new WeChatClient("client3");

        accounts.addObserver(client);
        accounts.addObserver(client2);
        accounts.addObserver(client3);

        accounts.publishArticles("今日头条", "一夜暴富");
    }
}
