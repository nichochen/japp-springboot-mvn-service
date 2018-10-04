package sh.openenv.demo.spring.japp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sh.openenv.demo.spring.japp.controllers.AppController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JappApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testGreeting() {
		AppController app = new AppController();
		assertNotNull(app.greeting());
	}
	
	@Test
	public void testListProducts() {
		AppController app = new AppController();
		assertNotNull(app.listProducts());
	}

}
