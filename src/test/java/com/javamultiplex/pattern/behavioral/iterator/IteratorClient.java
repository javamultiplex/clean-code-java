package com.javamultiplex.pattern.behavioral.iterator;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 09/09/20 10:01 pm
 * @copyright www.javamultiplex.com
 */
public class IteratorClient {

    @Test
    public void shouldIteratorTopic(){
        Topic[] topics={
                new Topic("topic1"),
                new Topic("topic2"),
                new Topic("topic3"),
                new Topic("topic4"),
                new Topic("topic5")
        };

        List<Topic> topicList=new TopicList(topics);
        Iterator<Topic> iterator = topicList.iterator();
        while (iterator.hasNext()){
            Topic topic = iterator.next();
            System.out.println(topic.getName());
        }
    }
}
