package com.myorg.cardatabase01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import com.myorg.cardatabase01.web.CarController;
@SpringBootTest
class Cardatabase01ApplicationTests
{
	@Autowired
	private CarController controller;
	@Test
	@DisplayName("First example test case")
	void contextLoads()
	{
		assertThat(controller).isNotOfAnyClassIn();
	}

}
