package com.example.demo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.example.demo.UserService.*(..))")
    public void userServiceMethods(){
    }

    @Before("userServiceMethods()")
    public void logBeforeMethod(){
        System.out.println("Before Method");
    }

    @AfterReturning("userServiceMethods()")
    public void logAfterMethod(){
        System.out.println("After Method");
    }

    public void logAfterThrowingMethod(){
        System.out.println("After Throwing Method");
    }
}
