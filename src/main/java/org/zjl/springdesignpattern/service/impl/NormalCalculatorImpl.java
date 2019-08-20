package org.zjl.springdesignpattern.service.impl;

import org.springframework.stereotype.Service;
import org.zjl.springdesignpattern.service.CalculatorService;

@Service
public class NormalCalculatorImpl implements CalculatorService {
    @Override
    public String type() {
        return "normal";
    }

    @Override
    public double calculate(double fee) {
        return fee;
    }
}
