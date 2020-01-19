package com.lg.my.shop.web.admin.service;

import com.lg.my.shop.commons.dto.BaseResult;
import com.lg.my.shop.commons.dto.PageInfo;
import com.lg.my.shop.commons.persistence.BaseService;
import com.lg.my.shop.domain.TbContent;

import java.util.List;
import java.util.Map;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/17 15:00
 */
public interface TbContentService extends BaseService<TbContent> {
    /**
     * 根据类目 ID 删除内容
     * @param categoryIds
     */
    void deleteByCategoryId(String[] categoryIds);
}
