package com.lg.my.shop.commons.persistence;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类的基类
 *
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/13 20:40
 */
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = -2520949757123577715L;

    private Long id;
    private Date created;
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
