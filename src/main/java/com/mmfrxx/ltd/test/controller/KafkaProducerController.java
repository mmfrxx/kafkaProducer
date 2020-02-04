package com.mmfrxx.ltd.test.controller;

import com.mmfrxx.ltd.test.model.User;
import com.mmfrxx.ltd.test.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {
    @Autowired
    KafkaProducerService kafkaProducerService;


    @PostMapping(value = "/publishUser", consumes = "application/json")
    public ResponseEntity<String> publishMessage(@RequestBody User user){
        kafkaProducerService.sendUser(user);
        return new ResponseEntity<String>("Published Successfully", HttpStatus.OK);
    }
}
