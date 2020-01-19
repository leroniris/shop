package com.lg.my.shop.web.admin.dao;

import com.lg.my.shop.commons.persistence.BaseDao;
import com.lg.my.shop.domain.TbContent;
import com.lg.my.shop.domain.TbContentCategory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/17 14:59
 */
@Repository
public interface TbContentDao extends BaseDao<TbContent> {
    /**
     * 根据类目 ID 删除内容
     *
     * @param categoryIds
     */
    void deleteByCategoryId(String[] categoryIds);
}
