package com.javamultiplex.pattern.behavioral.iterator;

/**
 * @author Rohit Agarwal on 09/09/20 9:54 pm
 * @copyright www.javamultiplex.com
 */
public class TopicIterator implements Iterator<Topic> {

    private int position;
    private final Topic[] topics;

    public TopicIterator(Topic[] topics) {
        this.position = 0;
        this.topics = topics;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    @Override
    public boolean hasNext() {
        return position < topics.length;
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }
}
