package com.lg.my.shop.web.api.dao;

import com.lg.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

/**
 * 会员管理
 *
 * @author Leron
 * @version 1.0.0
 * @date 2019/1/15 9:11
 */
@Repository
public interface TbUserDao {
    /**
     * 登录
     * @param tbUser
     * @return
     */
    TbUser login(TbUser tbUser);
}
