package com.epam.calculator;

import com.epam.calculator.entity.Calculator;
import com.epam.calculator.entity.Sign;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Uladzislau_Zhukouski on 9/8/2016.
 */
public class Main {

    private static final String YES = "y";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Double> arguments = new ArrayList<>();
        System.out.println("Enter first argument");
        Double first = Double.parseDouble(sc.next());
        arguments.add(first);
        while (flag) {
            System.out.println("Enter another arguments");
            Double argument = Double.parseDouble(sc.next());
            arguments.add(argument);
            System.out.println("Do you want to continue? if yes type y");
            if (!sc.next().equalsIgnoreCase(YES)) break;
        }

        System.out.println("Enter the sign of operation");
        Sign sign = new Sign(sc.next());
        Calculator calculator = new Calculator();

        System.out.println("Result=" + calculator.doCalc(arguments, sign));
    }

}
