package com.api_learing.api_learing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ImportAutoConfiguration(exclude = SecurityAutoConfiguration.class)
class ApiLearingApplicationTests {
	@Test
	void contextLoads() {
	}
}
