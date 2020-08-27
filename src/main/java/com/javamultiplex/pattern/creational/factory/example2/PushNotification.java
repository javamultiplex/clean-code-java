package com.javamultiplex.pattern.creational.factory.example2;

/**
 * @author Rohit Agarwal on 25/08/20 12:18 am
 * @copyright www.javamultiplex.com
 */
public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending push notification");
    }
}
