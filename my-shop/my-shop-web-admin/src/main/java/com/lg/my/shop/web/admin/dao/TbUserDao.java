package com.lg.my.shop.web.admin.dao;

import com.lg.my.shop.commons.persistence.BaseDao;
import com.lg.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/11 17:32
 */
@Repository
public interface TbUserDao extends BaseDao<TbUser> {

    /**
     * 根据邮箱查询用户信息
     *
     * @param email
     * @return
     */
    public TbUser getByEmail(String email);

}
