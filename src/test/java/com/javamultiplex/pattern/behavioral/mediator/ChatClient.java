package com.javamultiplex.pattern.behavioral.mediator;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 11/09/20 11:50 pm
 * @copyright www.javamultiplex.com
 */
public class ChatClient {

    @Test
    public void shouldSendMessageToEveryone() {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("Hi All");
    }
}
