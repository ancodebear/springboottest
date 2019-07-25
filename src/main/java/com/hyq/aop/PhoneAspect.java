package com.hyq.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * PROJECT springboottest
 * createdate 2019/7/24 9:04
 *
 * @author hyq
 * @version 1.0
 */
@Aspect
@Component
public class PhoneAspect {
    @Before("execution(* com.hyq.entity.Phone.fun())")
    public void method1(){
        System.out.println("DDDDDDDDDD");
        System.out.println("EEEEEEEEEE");
    }
}

