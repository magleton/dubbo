package com.gx.gmall.services;

import com.gx.gmall.entities.UserAddress;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {
    /**
     * 获取用户地址列表信息
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
