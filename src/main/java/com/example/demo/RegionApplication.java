package com.example.demo;

import com.example.demo.model.Region;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Region.class)
@SpringBootApplication
public class RegionApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegionApplication.class, args);
    }
}
