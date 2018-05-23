package zti.aspectj.lab.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zti.aspectj.lab.aop.data.Dao2;

@Service
public class Controller2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething(){

		return dao2.retrieveSomething();
	}
}