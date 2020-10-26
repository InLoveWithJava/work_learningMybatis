package com.example.demo.controller;

import com.example.demo.model.Region;
import com.example.demo.mapper.RegionMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("regions")
public class RegionController {

    private RegionMapper regionMapper;

    public RegionController(RegionMapper regionMapper) {
        this.regionMapper = regionMapper;
    }

    @GetMapping("get/all")
    public List<Region> findAll() {
        return regionMapper.findAll();
    }

    @GetMapping("get/{id}")
    public Region findById(@PathVariable Integer id) {
        return regionMapper.findById(id);
    }

    @PostMapping("add")
    public void addRegion(@RequestBody Region region) {
        regionMapper.insert(region);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        regionMapper.deleteById(id);
    }

    @PutMapping("update/{id}")
    public void updateById(@RequestBody Region region, @PathVariable Integer id) {
        regionMapper.updateById(region, id);
    }
}
