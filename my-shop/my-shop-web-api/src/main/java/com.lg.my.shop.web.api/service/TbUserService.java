package com.lg.my.shop.web.api.service;

import com.lg.my.shop.domain.TbUser;

/**
 * 会员管理
 *
 * @author Leron
 * @version 1.0.0
 * @date 2019/1/15 9:11
 */
public interface TbUserService {

    /**
     * 登录
     * @param tbUser
     * @return
     */
    TbUser login(TbUser tbUser);
}
