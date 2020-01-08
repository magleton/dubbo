package com.gx.gmall.services;

import com.gx.gmall.entities.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     *
     * @param userId
     */
    List<UserAddress> initOrder(String userId);
}
