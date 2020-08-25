package com.javamultiplex.pattern.creational.factory.example2;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 25/08/20 12:24 am
 * @copyright www.javamultiplex.com
 */
public class NotificationClient {

    @Test
    public void shouldCreatePushNotification() {
        Notification notification = NotificationFactory.createNotification(NotificationChannel.PUSH);
        notification.notifyUser();
    }

    @Test
    public void shouldCreateSMSNotification() {
        Notification notification = NotificationFactory.createNotification(NotificationChannel.SMS);
        notification.notifyUser();
    }

    @Test
    public void shouldCreateEmailNotification() {
        Notification notification = NotificationFactory.createNotification(NotificationChannel.EMAIL);
        notification.notifyUser();
    }

}
