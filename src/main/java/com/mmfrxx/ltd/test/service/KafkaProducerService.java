package com.mmfrxx.ltd.test.service;

import com.mmfrxx.ltd.test.config.ProducerConfiguration;
import com.mmfrxx.ltd.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaProducerService {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC  = "kafkaDemo";

    public void sendUser(User user){
        System.out.println("sending User: \n" + user + "\nto kafka kafkaDemo topic.");
        kafkaTemplate.send(TOPIC, user);
    }

}
