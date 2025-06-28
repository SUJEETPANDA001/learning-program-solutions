package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);
    
    public static void main(String[] args) {
        String user = "Alice";
        int age = 30;
        double score = 95.5;
        boolean isAdmin = true;
        
        // Simple parameter substitution
        logger.info("User {} logged in", user);
        
        // Multiple parameters
        logger.debug("User {} is {} years old and scored {}", user, age, score);
        
        // Conditional logging
        if (logger.isDebugEnabled()) {
            logger.debug("Detailed debug information: {}", getDetailedInfo());
        }
        
        // Error with exception
        try {
            throw new RuntimeException("Simulated error");
        } catch (Exception e) {
            logger.error("Error processing request for user {}", user, e);
        }
        
        // Complex parameter
        logger.warn("Admin access granted: {}", isAdmin);
    }
    
    private static String getDetailedInfo() {
        return "This is expensive to compute debug information";
    }
}