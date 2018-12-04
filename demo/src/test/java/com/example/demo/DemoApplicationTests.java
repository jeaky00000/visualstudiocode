package com.example.demo;

import java.util.Date;
import java.util.List;

import com.mysql.cj.log.Log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

	@Autowired
	RedisTemplate<String, String> redisTemplate;


	@Autowired
	AmqpTemplate rabbitTemplate;

	@Test
	public void contextLoads() throws Exception {
		for(int i= 0 ; i < 100; i++)
		{
			rabbitTemplate.convertAndSend("user_queue", "hello " + new Date());
			Thread.sleep(1000);
		}
			
	}


	@Test
	public void test(){
		redisTemplate.opsForValue().set("t2", "v2");
		redisTemplate.opsForHash().put("hashkey", "name", "zhai");
		redisTemplate.opsForHash().put("hashkey", "age", "20");
		List<Object> values = redisTemplate.opsForHash().values("hashkey");
		values.stream().forEach(o->System.out.println(o.toString()));
		System.out.print("redis test............................");
	}
}
