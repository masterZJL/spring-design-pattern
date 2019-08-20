package org.zjl.springdesignpattern.service.impl;

import org.springframework.stereotype.Service;
import org.zjl.springdesignpattern.service.CalculatorService;

@Service
public class VipCalculatorImpl implements CalculatorService {
    @Override
    public String type() {
        return "vip";
    }

    @Override
    public double calculate(double fee) {
        return fee * 0.85;
    }
}
