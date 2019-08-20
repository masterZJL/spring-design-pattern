package org.zjl.springdesignpattern.service.impl;

import org.springframework.stereotype.Service;
import org.zjl.springdesignpattern.service.CalculatorService;

@Service
public class SvipCalculatorImpl implements CalculatorService {
    @Override
    public String type() {
        return "svip";
    }

    @Override
    public double calculate(double fee) {
        return fee * 0.7;
    }
}
