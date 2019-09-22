package com.joe.transactonal.demo.service.impl;

import com.joe.transactonal.demo.entity.Order;
import com.joe.transactonal.demo.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {
    @Override
    public void save(Order order) {
        log.info("============保存订单成功：" + order.getOrderId());
    }
}
