package org.dinuka.kafkademo.controller;


import org.dinuka.kafkademo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kafka")
public class KafkaMessage {

    @Autowired
    Producer producer;


    @GetMapping("/produce")
    public void produceMessage(@RequestParam("message") String message){
         producer.sendMessage(message);
    }
}
