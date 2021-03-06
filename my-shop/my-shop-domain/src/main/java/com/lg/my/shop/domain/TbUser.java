package com.lg.my.shop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lg.my.shop.commons.persistence.BaseEntity;
import com.lg.my.shop.commons.utils.RegexpUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/11 17:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbUser extends BaseEntity {
    @Length(min = 6, max = 20, message = "姓名的长度必须介于 6 - 20 位之间")
    private String username;

    @JsonIgnore
    private String password;

    @Pattern(regexp = RegexpUtils.PHONE, message = "手机号格式不正确")
    private String phone;

    @Pattern(regexp = RegexpUtils.EMAIL, message = "邮箱格式不正确")
    private String email;
}
