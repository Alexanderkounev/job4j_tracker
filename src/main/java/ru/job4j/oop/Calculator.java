package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sumAllOperation(int k) {
        return sum(k) + multiply(k) + minus(k) + divide(k);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rsl2 = Calculator.minus(10);
        System.out.println(rsl2);
        int rsl3 = calculator.divide(10);
        System.out.println(rsl3);
        int rsl4 = calculator.sumAllOperation(5);
        System.out.println(rsl4);
    }
}
