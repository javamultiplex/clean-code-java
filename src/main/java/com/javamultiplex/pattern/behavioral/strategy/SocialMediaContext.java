package com.javamultiplex.pattern.behavioral.strategy;

public class SocialMediaContext {
    ISocialMediaStrategy smStrategy;

    public SocialMediaContext(ISocialMediaStrategy smStrategy) {
        this.smStrategy = smStrategy;
    }

    public void connect(String name) {
        smStrategy.connectTo(name);
    }
}