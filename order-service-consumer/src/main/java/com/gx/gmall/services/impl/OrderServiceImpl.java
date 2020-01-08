package com.gx.gmall.services.impl;

import com.gx.gmall.entities.UserAddress;
import com.gx.gmall.services.OrderService;
import com.gx.gmall.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID为 : " + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
