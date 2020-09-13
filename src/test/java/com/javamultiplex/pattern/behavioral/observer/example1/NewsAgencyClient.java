package com.javamultiplex.pattern.behavioral.observer.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 13/09/20 11:07 am
 * @copyright www.javamultiplex.com
 */
public class NewsAgencyClient {

    @Test
    public void shouldNotifyObservers() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        Assertions.assertEquals(observer.getNews(), "news");

    }
}
