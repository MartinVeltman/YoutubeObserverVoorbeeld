package com.company;

public interface Observer {
    void update(String title);

    void subscribeChannel(Channel ch);
}
