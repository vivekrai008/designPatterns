package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */

//Interpreter context class that will do the actual interpretation
//Next we need to create different type of Expressions that will consume the interpreter context class

public class InterpreterContext {

    public String getBinaryFormat(int num) {
        return Integer.toBinaryString(num);
    }

    public String getHexaDecimalFormat(int num) {
        return Integer.toHexString(num);
    }

}
