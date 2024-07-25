package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    private int num1;
    private int num2;
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2){
        return num1 / num2;
    }
}
