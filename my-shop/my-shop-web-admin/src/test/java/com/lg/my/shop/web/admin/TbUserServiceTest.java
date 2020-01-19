package com.lg.my.shop.web.admin;

import com.lg.my.shop.domain.TbUser;
import com.lg.my.shop.web.admin.dao.TbUserDao;
import com.lg.my.shop.web.admin.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

/**
 * @author Leron
 * @version 1.0.0
 * @create 2019/12/12 8:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void testSelectAll() {
        List<TbUser> tbUsers = tbUserService.selectAll();
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }


    @Test
    public void testInsert() {
        TbUser tbUser = new TbUser();
        tbUser.setEmail("admin@admin.com");
        tbUser.setPassword(DigestUtils.md5DigestAsHex("admin".getBytes()));
        tbUser.setPhone("15888888888");
        tbUser.setUsername("Lusifer");
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());
        tbUserService.save(tbUser);
    }


    @Test
    public void testMD5() {
        System.out.println(DigestUtils.md5DigestAsHex("123456".getBytes()));
    }


    @Test
    public void testDelete() {
        tbUserService.delete(38L);
    }

    @Test
    public void testGetById() {
        System.out.println(tbUserService.getById(36L).getUsername());
    }

    @Test
    public void testUpdate() {
        TbUser tbUser = tbUserService.getById(36L);
        tbUser.setUsername("Lusifer");

        tbUserService.update(tbUser);
    }

}