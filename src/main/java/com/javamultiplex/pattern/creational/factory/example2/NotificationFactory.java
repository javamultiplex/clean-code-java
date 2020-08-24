package com.javamultiplex.pattern.creational.factory.example2;

/**
 * @author Rohit Agarwal on 25/08/20 12:20 am
 * @copyright www.javamultiplex.com
 */
public final class NotificationFactory {

    public static Notification createNotification(final NotificationChannel notificationChannel) {
        if (notificationChannel == NotificationChannel.SMS) {
            return new SMSNotification();
        } else if (notificationChannel == NotificationChannel.EMAIL) {
            return new EmailNotification();
        } else if (notificationChannel == NotificationChannel.PUSH) {
            return new PushNotification();
        }
        throw new UnsupportedOperationException("Notification channel not supported");
    }
}
