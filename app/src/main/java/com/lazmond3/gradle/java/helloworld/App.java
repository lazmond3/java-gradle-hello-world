/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.lazmond3.gradle.java.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void logFunction() {
        logger.trace("Hello Trace");
        logger.debug("Hello Debug");
        logger.info("Hello Info");
        logger.warn("Hello Warn");
        logger.error("Hello Error");
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        new App().logFunction();
        new DebugLogClass().logFunction();
        new InfoLogClass().logFunction();
        new WarnLogClass().logFunction();
        new ErrorLogClass().logFunction();

    }
}
