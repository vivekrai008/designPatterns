package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */
public class UnsupportedExpressionException extends Exception {
    public UnsupportedExpressionException(String message) {
        super(message);
    }
}
