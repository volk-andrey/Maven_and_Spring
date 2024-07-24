package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class ControllerCalculator {
    private final CalculatorServiceInterface calculatorService;

    public ControllerCalculator(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    public String calculatorHello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String calculatorSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " +  num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " +  num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " +  num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " +  num2 + " = " + calculatorService.divide(num1, num2);
    }
}
