package com.company;

public interface Subject {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers(String title);

    void upload(String title);
}
