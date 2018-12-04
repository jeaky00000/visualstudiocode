package com.example.demo.components;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "user_queue")
public class TopicMessagesReceiver{

    @RabbitHandler
    public void process(String msg){
        System.out.println(msg);
    }
}