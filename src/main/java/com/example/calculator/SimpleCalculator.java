package com.example.calculator;

public class SimpleCalculator {

    private Integer saveNum;

    public SimpleCalculator() {}

    public boolean isPositive(Integer a) {
        return a > 0;
    }

    public boolean isNegative(Integer a) {
        return a < 0 ;
    }

    public Integer subtraction(Integer a, Integer b) {
        return a - b;
    }

    public Integer addition(Integer a, Integer b) {
        return a + b;
    }

    public Integer getLargeNum(Integer a, Integer b) {
        return a >= b? a: b;
    }

    public double division(Double a, Double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("division on 0");
        }
        return a / b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public void setSaveNum(Integer saveNum) {
        this.saveNum = saveNum;
    }

    public Integer getSaveNum() {
        return saveNum;
    }

    public Integer getFactorial(Integer factorial) {
        Integer result = 1;
        while(factorial != 1) {
            result = multiply(result, factorial);
            factorial--;
        }
        return result;
    }
}
