package ru.calculator.calculatorHW;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.ObjectUtils.isEmpty;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String answerCalculator(){
        return calculatorService.answerCalculator();
    }

    @GetMapping (path = "/plus")
    public String plus (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping (path = "/minus")
    public String minus (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping (path = "/multiply")
    public String multiply (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            return "Ошибка! Не передан один из параметров";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping (path = "/divide")
    public String divide (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if (isEmpty(num1) || isEmpty(num2)) {
            return "Ошибка! Не передан один из параметров";
        }
        if (num2 == 0) {
            return "Ошибка! Деление на 0 невозможно";
        }
        return num1 + " + " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
