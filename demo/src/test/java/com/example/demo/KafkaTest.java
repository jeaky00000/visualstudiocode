package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class KafkaTest {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @Test
    public void send(){
        kafkaTemplate.send("test_topic", "kafka messages...............");
    }


}
