package com.zcd.mybatis.plugin;

import com.zcd.mybatis.mapper.CityMapper;
import com.zcd.mybatis.pojo.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by admin on 2017/9/7.
 */
public class Entrance {

    public static void main(String[] args) {
        try {
            SqlSession session = openSession();
            CityMapper mapper = session.getMapper(CityMapper.class);
            List<City> cities = mapper.getAll();
            System.out.println(cities);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession() throws IOException {
        String resource = "Configuration.xml";
        Reader reader = Resources.getResourceAsReader(resource);
//         sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, "development");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
