package com.lg.my.shop.web.api.service;

import com.lg.my.shop.domain.TbContent;

import java.util.List;

public interface TbContentService {
    /**
     * 根据类别 ID 查询内容列表
     * @param categoryId
     * @return
     */
    List<TbContent> selectByCategoryId(Long categoryId);
}
