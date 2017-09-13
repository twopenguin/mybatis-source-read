package com.zcd.mybatis.mapper;

import com.zcd.mybatis.pojo.City;

import java.util.List;

/**
 * Created by zhangyida on 2017/9/8.
 */
public interface CityMapper {

    List<City> getAll();
//    City findByName(String cityName);

}
