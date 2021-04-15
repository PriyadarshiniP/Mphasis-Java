package com.mph;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;


@Aspect
public class Logging {

    @Pointcut("execution(* com.mph.*.sendMessage(..))")
    private void selectAll() {
    }

    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("going to setup email service");
    }

    @AfterReturning(pointcut = "selectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning:" + retVal.toString());
    }

    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("Email service completed.");
    }


    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}

