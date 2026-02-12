package me.baozidai.realworld.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class Favorites {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.article_id")
    private Integer articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.article_id")
    public Integer getArticleId() {
        return articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.article_id")
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}