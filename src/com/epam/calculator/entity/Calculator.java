package com.epam.calculator.entity;

import com.epam.calculator.activity.ICalculator;

import java.util.List;

/**
 * Created by Uladzislau_Zhukouski on 9/8/2016.
 */
public class Calculator implements ICalculator {

    @Override
    public double doCalc(List<Double> arguments, Sign sign) {
        double result;
        switch (sign.getSign()) {
            case "+":
                result = arguments.stream().mapToDouble(s->s).sum();
                break;
            case "-":
                result = arguments.stream().reduce((s1,s2)-> s1-s2).orElse(0.0);
                break;
            case "*":
                result = arguments.stream().reduce((s1,s2)-> s1*s2).orElse(0.0);
                break;
            case "/":
                result = arguments.stream().reduce((s1,s2)-> s1/s2).orElse(0.0);
                break;
            default:
                throw new UnsupportedOperationException("No such operation defined");

        }

        return result;
    }


}
