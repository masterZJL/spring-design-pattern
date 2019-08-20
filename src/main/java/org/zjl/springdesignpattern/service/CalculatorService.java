package org.zjl.springdesignpattern.service;

import org.springframework.stereotype.Service;

public interface CalculatorService {
    String type();
    double calculate(double fee);
}
