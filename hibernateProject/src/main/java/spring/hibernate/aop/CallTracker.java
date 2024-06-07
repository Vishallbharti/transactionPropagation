package spring.hibernate.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CallTracker {
	
	@Pointcut("within(spring.hibernate.service.*)")
	public void logMethodPoint() {
		
	}
	
	@Before("logMethodPoint()")
	public void logBeforeMethodCall() {
		System.out.println("Method is starting...");
	}
	
	
	@After("logMethodPoint()")
	public void logAfterMethodCall() {
		System.out.println("Method Execution is comleted!");
	}

}
