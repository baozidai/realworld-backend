package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CommentsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source Table: public.comments")
    public static final Comments comments = new Comments();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source field: public.comments.id")
    public static final SqlColumn<Integer> id = comments.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source field: public.comments.body")
    public static final SqlColumn<String> body = comments.body;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source field: public.comments.article_id")
    public static final SqlColumn<Integer> articleId = comments.articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source field: public.comments.user_id")
    public static final SqlColumn<Integer> userId = comments.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source field: public.comments.create_time")
    public static final SqlColumn<Date> createTime = comments.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6923144+08:00", comments="Source Table: public.comments")
    public static final class Comments extends AliasableSqlTable<Comments> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> body = column("body", JDBCType.VARCHAR);

        public final SqlColumn<Integer> articleId = column("article_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public Comments() {
            super("public.comments", Comments::new);
        }
    }
}