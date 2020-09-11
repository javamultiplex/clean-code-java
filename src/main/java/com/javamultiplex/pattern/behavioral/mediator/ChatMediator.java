package com.javamultiplex.pattern.behavioral.mediator;

public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}