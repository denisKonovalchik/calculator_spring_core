package by.tms.operations;

import org.springframework.stereotype.Component;

@Component
public class Addition implements MathOperation {

    @Override
    public String getName() {
        return "addition";
    }

    @Override
    public double getCalculate(double num1, double num2) {
        return num1 + num2;
    }


}
