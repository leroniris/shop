package com.lg.my.shop.domain;

import com.lg.my.shop.commons.persistence.BaseTreeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 内容类目实体类
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/16 18:08
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbContentCategory extends BaseTreeEntity {
    @Length(min = 1, max = 20, message = "分类名称必须介于 1 - 20 位之间")
    private String name;
    private Integer status;

    @NotNull(message = "排序不能为空")
    private Integer sortOrder;
    private Boolean isParent;
    private TbContentCategory parent;
}

