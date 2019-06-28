package com.design.review.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
public class Publisher {
    private List<Subscriber> subscribers;
    private boolean pubStatus = false;

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    /**
     * 订阅
     * @param subscriber
     */
    protected void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    /**
     * 取消订阅
     * @param subscriber
     */
    protected void unsubscribe(Subscriber subscriber) {
        if (this.subscribers.contains(subscriber)) {
            this.subscribers.remove(subscriber);
        }
    }

    /**
     * 通知所有订阅者
     * @param publisher
     * @param articleName
     */
    protected void notifySubscribers(String publisher, String articleName) {
        if (this.pubStatus == false) {
            return;
        }
        for (Subscriber subscriber : this.subscribers) {
            subscriber.receive(publisher, articleName);
        }
        this.clearPubStatus();
    }

    protected void setPubStatus() {
        this.pubStatus = true;
    }

    protected void clearPubStatus() {
        this.pubStatus = false;
    }
}
