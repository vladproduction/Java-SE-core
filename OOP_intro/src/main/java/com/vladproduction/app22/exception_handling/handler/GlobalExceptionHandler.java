package com.vladproduction.app22.exception_handling.handler;

import com.vladproduction.app22.exception_handling.util.ExceptionUtils;

import java.util.logging.Logger;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler{

    private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class.getName());

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        LOGGER.severe(()->String.format("Uncaught exception in thread: %s", t.getName()));
        ExceptionUtils.logException(e);
    }

    public static void registerGlobalHandler(){
        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
    }

}
