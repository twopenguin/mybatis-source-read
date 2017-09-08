package com.zcd.mybatis.plugin;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by admin on 2017/9/7.
 */
public class Entrance {

    public static void main(String[] args) {

    }

    public static SqlSession openSession() throws IOException {
        String resource = "com/accp/mybatis/data/Configuration.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
    }

}
