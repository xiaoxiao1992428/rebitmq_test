package com.hrt.rebitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hrt.rebitmq.model.User;
import com.hrt.rebitmq.rebit.fanout.FanoutSender;
import com.hrt.rebitmq.rebit.object.ObjectSender;
import com.hrt.rebitmq.rebit.topic.TopicSender;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class RabbitMQApplication implements  ApplicationRunner  {

	@Autowired
	public FanoutSender sender;
	@Autowired
	public TopicSender topicSender;
	@Autowired
	public ObjectSender objSender;
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMQApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		sender.send();
		
//		topicSender.send();
//		topicSender.send1();
//		topicSender.send2();
		
		User user = new User();
		user.setName("xxx");
		user.setPass("123456");
		objSender.send(user);
		
	}
}
