package ru.calculator.calculatorHW;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String answerCalculator(){
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus (Integer num1, Integer num2){
        return num1 + num2;
    }

    public Integer minus (Integer num1, Integer num2){
        return num1 - num2;
    }

    public Integer multiply (Integer num1, Integer num2){
        return num1 * num2;
    }

    public Integer divide (Integer num1, Integer num2){
        return num1/num2;
    }
}
