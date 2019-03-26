package com.designpatterns.interpreter;

/**
 * Created by rai.vivek on 26/03/19.
 */
public class ExpressionFactory {

    public static Expression getExpression(String str) throws UnsupportedExpressionException {
        if(str.contains("Binary")) {
            return new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if(str.contains("HexaDecimal")) {
            return new IntToHexaDecimalExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            throw new UnsupportedExpressionException("Expression not supported");
        }
    }
}
