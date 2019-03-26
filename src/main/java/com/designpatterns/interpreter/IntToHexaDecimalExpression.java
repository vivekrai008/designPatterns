package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */
public class IntToHexaDecimalExpression implements Expression {

    private int num;

    public IntToHexaDecimalExpression(int num) {
        this.num = num;
    }


    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexaDecimalFormat(this.num);
    }
}
