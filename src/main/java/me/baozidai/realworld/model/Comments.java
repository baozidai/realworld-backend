package me.baozidai.realworld.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class Comments {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.body")
    private String body;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.article_id")
    private Integer articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source field: public.comments.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.body")
    public String getBody() {
        return body;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.body")
    public void setBody(String body) {
        this.body = body;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.article_id")
    public Integer getArticleId() {
        return articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.article_id")
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source field: public.comments.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source field: public.comments.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source field: public.comments.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source field: public.comments.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}