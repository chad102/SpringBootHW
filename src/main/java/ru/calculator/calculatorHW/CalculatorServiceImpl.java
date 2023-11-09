package ru.calculator.calculatorHW;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String answerCalculator(){
        return "Добро пожаловать в калькулятор";
    }

    public String plus (int num1, int num2){
        if (StringUtils.isEmpty(Integer.toString(num1)) || StringUtils.isEmpty(Integer.toString(num2))) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus (int num1, int num2){
        if (StringUtils.isEmpty(Integer.toString(num1)) || StringUtils.isEmpty(Integer.toString(num2))) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply (int num1, int num2){
        if (StringUtils.isEmpty(Integer.toString(num1)) || StringUtils.isEmpty(Integer.toString(num2))) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " * " + num2 + " = " + num1 * num2;
    }

    public String divide (int num1, int num2){
        if (num2 == 0) {
            return "Ошибка! Деление на 0 невозможно";
        }
        if (StringUtils.isEmpty(Integer.toString(num1)) || StringUtils.isEmpty(Integer.toString(num2))) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " / " + num2 + " = " + num1/num2;
    }
}
