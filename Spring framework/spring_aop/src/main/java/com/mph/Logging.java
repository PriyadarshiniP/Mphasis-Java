package com.mph;

public class Logging {

    public void beforeAdvice() {
        System.out.println("going to setup email service");
    }

    public void afterAdvice() {
        System.out.println("Email service completed.");
    }

    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning:" + retVal.toString());
    }

    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
