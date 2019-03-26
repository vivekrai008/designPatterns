package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */

/*
    - Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to
      deal with this grammar
    - The best example of interpreter design pattern is java compiler that interprets the java source code into byte
      code that is understandable by JVM. Google Translator is also an example of interpreter pattern where the input
      can be in any language and we can get the output interpreted in another language.
    - To implement interpreter pattern, we need to create Interpreter context engine that will do the interpretation work.
      Then we need to create different Expression implementations that will consume the functionalities provided by the interpreter context.
      Finally we need to create the client that will take the input from user and decide which Expression to use and then generate output for the user.
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
