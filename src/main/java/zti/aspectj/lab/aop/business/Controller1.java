package zti.aspectj.lab.aop.business;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zti.aspectj.lab.aop.data.Dao1;
import zti.aspectj.lab.aop.TrackTime;

@Service
public class Controller1 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Dao1 dao1;
	
	@TrackTime
	public String calculateSomething(){

		String value = dao1.retrieveSomething();
		logger.info("Message from controller - {}", value);
		return value;
	}
}