package com.calculator;

public class Calculator {

    public void someMethod() {
        int x = 5;
        int y = 3;
        int sum = x + y;
        int sub = x - y;
        System.out.println(sum);
        System.out.println(sub);
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
    }
}
