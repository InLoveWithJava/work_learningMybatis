package com.example.demo.model;

public class Region {
    private Integer id;
    private String name;
    private String abbreviate;

    public Region() {}

    public Region(String name, String abbreviate) {
        this.name = name;
        this.abbreviate = abbreviate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public void setAbbreviate(String abbreviate) {
        this.abbreviate = abbreviate;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviate='" + abbreviate + '\'' +
                '}';
    }
}
