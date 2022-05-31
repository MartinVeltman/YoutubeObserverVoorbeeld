package com.company;

public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println("Hey " + name + " " + title + " Video uploaded");
    }

    @Override
    public void subscribeChannel(Channel ch) {
        channel = ch;
    }
}
