package io.cxh.j2ee.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 用单例模式生成一SqlSessionFactory
 *
 * Created by Administrator on 2017/3/9.
 */
public class SqlSessionFactoryUtil {

    private SqlSessionFactoryUtil() {}

    private static SqlSessionFactory sqlSessionFactory;

    static {
        java.io.InputStream is = SqlSessionFactoryUtil.class.getResourceAsStream("/SqlMapConfig.xml");

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    public static SqlSessionFactory getSqlSessionFactory () {
        return sqlSessionFactory;
    }
}
