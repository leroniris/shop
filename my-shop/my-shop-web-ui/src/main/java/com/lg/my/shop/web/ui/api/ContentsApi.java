package com.lg.my.shop.web.ui.api;

import com.lg.my.shop.commons.utils.HttpClientUtils;
import com.lg.my.shop.commons.utils.MapperUtils;
import com.lg.my.shop.web.ui.dto.TbContent;

import java.util.List;

/**
 * 内容管理接口
 *
 * @author Leron
 * @version 1.0.0
 * @date 2020/1/15 14:57
 */
public class ContentsApi {

    /**
     * 请求幻灯片
     *
     * @return
     */
    public static List<TbContent> ppt() {
        List<TbContent> tbContents = null;
        String result = HttpClientUtils.doGet(API.API_CONTENTS_PPT);
        try {
            tbContents = MapperUtils.json2listByTree(result, "data", TbContent.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tbContents;
    }
}
