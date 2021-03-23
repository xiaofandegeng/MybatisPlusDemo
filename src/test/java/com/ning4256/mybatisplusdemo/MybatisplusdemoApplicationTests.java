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

        User user = userMapper.selectById(1374390672945180673L);
        user.setName("lisi");
        int res = userMapper.updateById(user);
        System.out.println("res: " + res);
    }

    @Test
    void addUser() {
        User user = new User();
        user.setAge(18);
        user.setName("xiaowangTest11");
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
