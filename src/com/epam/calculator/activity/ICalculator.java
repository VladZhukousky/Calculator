package com.epam.calculator.activity;


import com.epam.calculator.entity.Sign;

import java.util.List;

/**
 * Created by Uladzislau_Zhukouski on 9/8/2016.
 */
public interface ICalculator {
    public double doCalc(List<Double> arguments, Sign sign);
}
