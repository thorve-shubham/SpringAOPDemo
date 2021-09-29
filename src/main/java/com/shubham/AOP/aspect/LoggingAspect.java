package com.shubham.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution (public void addAccount())")
    public void loggingAspect(){
        System.out.println("////////////Before Aspect Implementation////////////");
    }
}
