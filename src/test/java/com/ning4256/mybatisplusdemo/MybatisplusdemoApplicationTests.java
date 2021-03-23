package com.ning4256.mybatisplusdemo;

import com.ning4256.mybatisplusdemo.entity.User;
import com.ning4256.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void  updateUser() {
        User user = new User();
        user.setId(1374384193030709250L);
        user.setName("lisi");
        int res = userMapper.updateById(user);
        System.out.println("res: " + res);
    }

    @Test
    void addUser() {
        User user = new User();
        user.setAge(18);
        user.setName("xiaoli111");
        user.setEmail("441255@qq.com");
        int res = userMapper.insert(user);
        System.out.println(res);

    }

    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
