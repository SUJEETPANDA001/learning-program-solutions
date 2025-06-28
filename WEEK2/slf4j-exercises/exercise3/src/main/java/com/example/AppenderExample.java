package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);
    
    public static void main(String[] args) {
        logger.trace("TRACE message - should not appear in file appender");
        logger.debug("DEBUG message - should appear in file appender");
        logger.info("INFO message - should appear in both console and file");
        logger.warn("WARN message - should appear in both console and file");
        logger.error("ERROR message - should appear in both console and file");
    }
}