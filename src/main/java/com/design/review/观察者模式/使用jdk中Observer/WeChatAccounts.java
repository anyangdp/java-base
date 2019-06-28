package com.design.review.观察者模式.使用jdk中Observer;

import java.util.Observable;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
public class WeChatAccounts extends Observable {
    private String name;

    public WeChatAccounts(String name) {
        this.name = name;
    }

    public void publishArticles(String articleName, String content) {
        System.out.println(String.format("\n<%s>微信公众号 发布了一篇推送，文章名称为 <%s>，内容为 <%s> ", this.name, articleName, content));
        /**
         * 设置true
         */
        setChanged();
        /**
         * 通知观察者们
         */
        notifyObservers(new WechatNotice(this.name, articleName));
    }
}
