package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String title) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(title);
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers(title);
    }
}
