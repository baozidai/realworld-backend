package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class ArticlesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6867891+08:00", comments="Source Table: public.articles")
    public static final Articles articles = new Articles();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6867891+08:00", comments="Source field: public.articles.id")
    public static final SqlColumn<Integer> id = articles.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6867891+08:00", comments="Source field: public.articles.title")
    public static final SqlColumn<String> title = articles.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6867891+08:00", comments="Source field: public.articles.description")
    public static final SqlColumn<String> description = articles.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6867891+08:00", comments="Source field: public.articles.body")
    public static final SqlColumn<String> body = articles.body;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6877891+08:00", comments="Source field: public.articles.user_id")
    public static final SqlColumn<Integer> userId = articles.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6877891+08:00", comments="Source field: public.articles.create_time")
    public static final SqlColumn<Date> createTime = articles.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6877891+08:00", comments="Source field: public.articles.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = articles.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6867891+08:00", comments="Source Table: public.articles")
    public static final class Articles extends AliasableSqlTable<Articles> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> body = column("body", JDBCType.VARCHAR);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public Articles() {
            super("public.articles", Articles::new);
        }
    }
}