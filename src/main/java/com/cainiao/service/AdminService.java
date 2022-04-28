package com.cainiao.service;

import com.cainiao.pojo.Admin;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2021-08-22 22:20
 */

public interface AdminService {
    /**
     * 完成登陆判断
     *
     * @return
     */
    Admin login(String name, String password);
}
