package behavioral.strategy;

import behavioral.strategy.engine.*;

import java.math.BigDecimal;

public class MainEngine {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(43.65);
        BigDecimal b = new BigDecimal(16.78);
        Calculator calculator = new Calculator();

        calculator.setOperatorStrategy(new AdditionStrategy());
        System.out.println("Addition: "+ calculator.doBusiness(a,b));

        calculator.setOperatorStrategy(new SubtractionStrategy());
        System.out.println("Subtraction: "+ calculator.doBusiness(a,b));

        calculator.setOperatorStrategy(new MultiplicationStrategy());
        System.out.println("Multiplication: "+ calculator.doBusiness(a,b));

        calculator.setOperatorStrategy(new DivisionStrategy());
        System.out.println("Division: "+ calculator.doBusiness(a,b));
    }


}
