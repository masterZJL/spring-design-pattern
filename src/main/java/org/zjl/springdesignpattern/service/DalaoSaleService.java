package org.zjl.springdesignpattern.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class DalaoSaleService {

    private Map<String, CalculatorService> serviceMap = new ConcurrentHashMap<>();

    public DalaoSaleService(List<CalculatorService> calculatorServiceList) {
        for (CalculatorService cs : calculatorServiceList) {
            serviceMap.put(cs.type(), cs);
        }
    }

    public double getFee(String type, double fee) {
        CalculatorService calculatorService = serviceMap.get(type);
        if (calculatorService != null) {
            return calculatorService.calculate(fee);
        }
        return fee;
    }
}
