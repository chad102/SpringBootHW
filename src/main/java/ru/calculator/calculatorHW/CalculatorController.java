package ru.calculator.calculatorHW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String plus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.plus(num1, num2);
    }

    @GetMapping (path = "/minus")
    public String minus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.minus(num1, num2);
    }

    @GetMapping (path = "/multiply")
    public String multiply (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping (path = "/divide")
    public String divide (@RequestParam(required = false) int num1, @RequestParam(required = false) int num2){
        return calculatorService.divide(num1, num2);
    }
}
