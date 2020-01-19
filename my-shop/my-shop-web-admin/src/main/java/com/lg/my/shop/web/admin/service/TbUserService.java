package com.lg.my.shop.web.admin.service;

import com.lg.my.shop.commons.dto.BaseResult;
import com.lg.my.shop.commons.dto.PageInfo;
import com.lg.my.shop.commons.persistence.BaseService;
import com.lg.my.shop.domain.TbUser;

import java.util.List;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/12 8:44
 */
public interface TbUserService extends BaseService<TbUser> {
    /**
     * 用户登录
     *
     * @param email
     * @param password
     * @return
     */
    TbUser login(String email, String password);
}
