package io.cxh.j2ee.dao;

import io.cxh.j2ee.mapper.UserMapper;
import io.cxh.j2ee.model.User;
import io.cxh.j2ee.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 封装UserDao
 * Created by Administrator on 2017/3/9.
 */
public class UserDao {

    /**
     * 查询所有用户信息
     * @return 用户列表
     */
    public List<User> selectAll() {

        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.selectAll();
        sqlSession.close();
        return users;
    }

    /**
     * 根据ID 查询用户
     * @param id 用户id
     * @return 被查询的用户
     */
    public User selectById(int id) {

        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectById(id);
        sqlSession.close();
        return user;
    }

    /**
     * 插入用户数据
     * @param user 用户
     * @return 插入用户的个数
     */
    public int insert(User user) {

        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int insert = mapper.insert(user);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }

    /**
     * 根据id 删除用户
     * @param id 用户id
     * @return 删除用户的个数
     */
    public int deleteById(int id) {

        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int deleteCount = mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
        return deleteCount;
    }

    /**
     * 更新用户数据
     * @param user 用户
     * @return 更新的用户的个数
     */
    public int update(User user) {

        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int updateCount = mapper.update(user);
        sqlSession.commit();
        sqlSession.close();
        return updateCount;
    }

    /**
     * 可选择的更新用户属性
     * @param user 用户
     * @return 更新的用户的个数
     */
    public int updateSelective(User user) {

        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int updateSelectiveCount = mapper.updateSelective(user);
        sqlSession.commit();
        sqlSession.close();
        return updateSelectiveCount;
    }

}
