package me.baozidai.realworld.model;

import jakarta.annotation.Generated;

public class Tags {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.tag_name")
    private String tagName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.tag_name")
    public String getTagName() {
        return tagName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}