package me.baozidai.realworld.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class RealworldUsers {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source field: public.realworld_users.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.bio")
    private String bio;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.image")
    private String image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.created_time")
    private Date createdTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.last_update_time")
    private Date lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source field: public.realworld_users.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.bio")
    public String getBio() {
        return bio;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.image")
    public String getImage() {
        return image;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.image")
    public void setImage(String image) {
        this.image = image;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7003417+08:00", comments="Source field: public.realworld_users.created_time")
    public Date getCreatedTime() {
        return createdTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.created_time")
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.last_update_time")
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.last_update_time")
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source field: public.realworld_users.password")
    public void setPassword(String password) {
        this.password = password;
    }
}