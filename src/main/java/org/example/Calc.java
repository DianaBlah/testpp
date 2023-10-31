package org.example;

public class Calc {

    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Пример: %d + %d = %d\n", a, b, result);
        return result;
    }
    public int minus(int a, int b){
        int result;
        result = a - b;
        System.out.println("Если из " + a + " вычесть " + b + " получится " + result);
        return result;
    }
}
