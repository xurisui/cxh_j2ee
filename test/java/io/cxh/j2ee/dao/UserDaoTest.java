package io.cxh.j2ee.dao;

import io.cxh.j2ee.model.User;
import junit.framework.TestCase;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/9.
 */
public class UserDaoTest extends TestCase {

    public void testSelectAll() throws Exception {

        List<User> users = new UserDao().selectAll();
        System.out.println(users.size());
    }


    public void testInsert() {
        User user = new User(System.currentTimeMillis(), "username", new Date(), "sex", "address", 23);
        new UserDao().insert(user);
    }

}
