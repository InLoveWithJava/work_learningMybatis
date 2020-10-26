package com.example.demo.mapper;

import com.example.demo.model.Region;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegionMapper {
    List<Region> findAll();

    Region findById(Integer id);

    void deleteById(Integer id);

    void insert(Region region);

    void updateById(Region region, Integer id);
}
