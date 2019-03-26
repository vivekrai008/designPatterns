package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */
public class IntToBinaryExpression implements Expression {

    private int num;

    public IntToBinaryExpression(int num) {
        this.num = num;
    }

    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(this.num);
    }
}
