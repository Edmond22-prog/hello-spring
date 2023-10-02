package com.example.hellospring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.hellospring.model.HelloSpringBoot;
import com.example.hellospring.service.BusinessService;

@SpringBootTest
class HellospringApplicationTests {
	@Autowired
	private BusinessService businessService;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetHelloSprintBoot() {
		String expectedResult = "Hello Spring Boot !";

		HelloSpringBoot helloSpringBoot = businessService.getHelloSprintBoot();
		assertEquals(helloSpringBoot.toString(), expectedResult);
	}

}
