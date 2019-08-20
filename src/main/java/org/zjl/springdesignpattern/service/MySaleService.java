package org.zjl.springdesignpattern.service;

import org.springframework.stereotype.Service;

/**
 * 计算商品打折后价格的服务（我自己的）
 */
@Service
public class MySaleService {


    /**
     *
     * @param type 用户级别
     * @param fee 价格
     * @return 折扣后的价格
     */
    public double getFee(String type, double fee) {
        if ("normal".equals(type)) {
            return fee;
        } else if ("vip".equals(type)) {
            return fee * 0.85;
        }
        return fee;
    }
}
