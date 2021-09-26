package by.tms.operations;

import org.springframework.stereotype.Component;

@Component
public class Multiplication implements MathOperation{

    @Override
    public String getName() {
        return "multiplication";
    }

    @Override
    public double getCalculate(double num1, double num2) {
        return num1 * num2;
    }


}
