package zti.aspectj.lab.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TimeTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("@annotation(zti.aspectj.lab.aop.TrackTime)")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		joinPoint.proceed();
		
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} is {}", joinPoint, timeTaken);
	}
}
