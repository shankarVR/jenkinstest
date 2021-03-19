package com.test.jenkinstest;

import com.test.model.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
class JenkinstestApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testusername(){
		User u = new User("Shankar", "V", "R", 39);
		Assert.assertEquals("Shankar,V",u.getUser());
	}
}
