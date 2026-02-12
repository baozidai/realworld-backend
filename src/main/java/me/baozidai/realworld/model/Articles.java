package me.baozidai.realworld.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class Articles {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6852482+08:00", comments="Source field: public.articles.body")
    private String body;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.title")
    public String getTitle() {
        return title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6832044+08:00", comments="Source field: public.articles.title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6847157+08:00", comments="Source field: public.articles.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6852482+08:00", comments="Source field: public.articles.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6852482+08:00", comments="Source field: public.articles.body")
    public String getBody() {
        return body;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6852482+08:00", comments="Source field: public.articles.body")
    public void setBody(String body) {
        this.body = body;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6857755+08:00", comments="Source field: public.articles.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}