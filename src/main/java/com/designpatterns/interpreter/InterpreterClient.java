package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */
public class InterpreterClient {

    private InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    private String interpret(String str) throws UnsupportedExpressionException {
        Expression expression = ExpressionFactory.getExpression(str);
        return expression.interpret(interpreterContext);
    }

    public static void main(String args[]) throws UnsupportedExpressionException {
        String str1 = "28 in Binary";
        String str2 = "28 in HexaDecimal";

        InterpreterClient interpreterClient = new InterpreterClient(new InterpreterContext());

        System.out.println(str1 + " = " + interpreterClient.interpret(str1));
        System.out.println(str2 + " = " + interpreterClient.interpret(str2));
    }
}
