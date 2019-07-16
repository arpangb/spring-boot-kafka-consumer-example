package com.arpan.kafka.springbootkafkaconsumerexample.listener;

import com.arpan.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-arpan", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed message:: " + message);
    }

    @KafkaListener(topics = "test-arpan-json", groupId = "group_id_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("Consumed message:: " + user);
    }
}
