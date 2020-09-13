package com.javamultiplex.pattern.behavioral.observer.example1;

public class NewsChannel implements Channel {
    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}