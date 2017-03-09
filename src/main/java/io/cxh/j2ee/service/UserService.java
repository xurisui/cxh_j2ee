package io.cxh.j2ee.service;

import io.cxh.j2ee.dao.UserDao;
import io.cxh.j2ee.model.User;

import java.util.Date;
import java.util.List;

/**
 *
 * Created by Administrator on 2017/3/9.
 */
public class UserService {

    private UserDao userDao = new UserDao();

    /**
     * 添加用户
     * @param name 用户名
     * @param birthday 生日
     * @param sex 性别
     * @param address 地址
     * @param score 分数
     */
    public void addUser(String name,
                        Date birthday,
                        String sex,
                        String address,
                        Integer score) {

        User user = new User(
                System.currentTimeMillis(),
                name,
                birthday,
                sex,
                address,
                score);
        //插入
        userDao.insert(user);
    }

    /**
     * 获取所有用户
     * @return 用户列表
     */
    public List<User> getAllUsers() {

        List<User> users = userDao.selectAll();
        users.sort((u1, u2) -> Long.valueOf(u2.getId()).compareTo(u1.getId()));
        return users;
    }

    /**
     * 通过id 获取用户
     * @param id 用户id
     * @return 返回获取的用户
     */
    public User getUserById(int id) {

        return userDao.selectById(id);
    }

}
