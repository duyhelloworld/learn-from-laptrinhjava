package com.duyhelloworld.jpalearning;
// import org.springframework.context.ApplicationContext;

// import com.duyhelloworld.jpalearning.entity.UserEntity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class JpaLearningApplication {
	public static void main(String[] args) {
		// ApplicationContext context = SpringApplication.run(JpaLearningApplication.class, args);
		// UserRepository userRepository = context.getBean(UserRepository.class);
		// userRepository.findAll()
		// 		.forEach(System.out::println);
		// UserEntity user = userRepository.findById(1).get();
		// System.out.println(user.toString());
		SpringApplication.run(JpaLearningApplication.class, args);
	}
}
