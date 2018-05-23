package zti.aspectj.lab.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zti.aspectj.lab.aop.business.Controller1;
import zti.aspectj.lab.aop.business.Controller2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAopTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Controller1 controller1;

	@Autowired
	private Controller2 controller2;

	@Test
	public void invokeAOPStuff() {
		logger.info(controller1.calculateSomething());
		logger.info(controller2.calculateSomething());
	}
}

	
