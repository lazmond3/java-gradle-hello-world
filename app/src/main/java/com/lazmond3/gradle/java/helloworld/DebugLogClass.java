package com.lazmond3.gradle.java.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebugLogClass {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void logFunction() {
        logger.trace("Hello Trace");
        logger.debug("Hello Debug");
        logger.info("Hello Info");
        logger.warn("Hello Warn");
        logger.error("Hello Error");
    }
}
