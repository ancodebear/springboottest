package com.hyq.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * PROJECT springboottest
 * createdate 2019/7/23 17:13
 *
 * @author hyq
 * @version 1.0
 */
@Aspect
@Component
public class ServersLogger {
    @Before("execution(* com.hyq.servers.*servers.*(..))")
    public void before(JoinPoint jp){
        Class targetClass=jp.getTarget().getClass();
        String method=jp.getSignature().getName();
        Logger logger= LoggerFactory.getLogger(targetClass);
        logger.info("the method : {} in class {} will be used", method,targetClass.getName());
    }

    @After("execution(* com.hyq.servers.*servers.*(..))")
    public void after(JoinPoint jp){
        Class targetClass=jp.getTarget().getClass();
        String method=jp.getSignature().getName();
        Logger logger= LoggerFactory.getLogger(targetClass);
        logger.debug("the method : {} in class {} was be used", method,targetClass.getName());
    }

    @AfterReturning(value = "execution(* com.hyq.servers.*servers.*(..))",returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        Class targetClass=jp.getTarget().getClass();
        String method=jp.getSignature().getName();
        Logger logger= LoggerFactory.getLogger(targetClass);
        logger.debug("the method : {} in class {} was be used and the result is {}", method,targetClass.getName(),result);
    }

    @AfterThrowing(value = "execution(* com.hyq.servers.*servers.*(..))",throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e){
        Class targetClass=jp.getTarget().getClass();
        String method=jp.getSignature().getName();
        Logger logger= LoggerFactory.getLogger(targetClass);
        logger.error("the method : {} in class {} was be exception {}", method,targetClass.getName(),e.getMessage());
    }
}
