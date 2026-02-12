package me.baozidai.realworld.model;

import jakarta.annotation.Generated;

public class ArticleTags {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.641831+08:00", comments="Source field: public.article_tags.article_id")
    private Integer articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6452547+08:00", comments="Source field: public.article_tags.tag_id")
    private Integer tagId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6435677+08:00", comments="Source field: public.article_tags.article_id")
    public Integer getArticleId() {
        return articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6452547+08:00", comments="Source field: public.article_tags.article_id")
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6452547+08:00", comments="Source field: public.article_tags.tag_id")
    public Integer getTagId() {
        return tagId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6460329+08:00", comments="Source field: public.article_tags.tag_id")
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}