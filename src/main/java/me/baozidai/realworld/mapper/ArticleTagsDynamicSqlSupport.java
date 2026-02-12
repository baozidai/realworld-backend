package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ArticleTagsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6533637+08:00", comments="Source Table: public.article_tags")
    public static final ArticleTags articleTags = new ArticleTags();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6543702+08:00", comments="Source field: public.article_tags.article_id")
    public static final SqlColumn<Integer> articleId = articleTags.articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6543702+08:00", comments="Source field: public.article_tags.tag_id")
    public static final SqlColumn<Integer> tagId = articleTags.tagId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6543702+08:00", comments="Source Table: public.article_tags")
    public static final class ArticleTags extends AliasableSqlTable<ArticleTags> {
        public final SqlColumn<Integer> articleId = column("article_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> tagId = column("tag_id", JDBCType.INTEGER);

        public ArticleTags() {
            super("public.article_tags", ArticleTags::new);
        }
    }
}