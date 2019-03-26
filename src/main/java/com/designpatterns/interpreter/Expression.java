package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */
public interface Expression {
    String interpret(InterpreterContext interpreterContext);
}
