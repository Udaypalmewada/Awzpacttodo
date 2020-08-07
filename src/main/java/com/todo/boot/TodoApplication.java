package com.todo.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * TodoApplication
 * @author UDAY JAVA
 *TodoApplication main spring boot initializer
 */
@SpringBootApplication
@ComponentScan("com.todo.boot")
public class TodoApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(TodoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		LOGGER.info("Simple log  Application Up time{}", System.currentTimeMillis());
	}

}
