package com.khoubyari.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.apache.log4j.*;

@Aspect
@Component
public class RestControllerAspect {
	private static Logger logger = Logger.getLogger("retailone");

    @Before("execution(public * com.khoubyari.example.api.rest.*Controller.*(..))")
    public void logBeforeRestCall(JoinPoint pjp) throws Throwable {
        System.out.println(":::::AOP Before REST call:::::" + pjp);
        logger.info(":::::AOP Before REST call:::::");
        
    }
}
