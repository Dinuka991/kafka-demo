package org.dinuka.kafkademo.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

   @KafkaListener(topics = "my_topic_1", groupId = "group_id")
    public void consumeMessage(String receivedMessage){
        System.out.println("Consumed message: "+receivedMessage);
    }


}
