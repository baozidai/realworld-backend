package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class FavoritesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source Table: public.favorites")
    public static final Favorites favorites = new Favorites();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.user_id")
    public static final SqlColumn<Integer> userId = favorites.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.article_id")
    public static final SqlColumn<Integer> articleId = favorites.articleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source field: public.favorites.create_time")
    public static final SqlColumn<Date> createTime = favorites.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6958204+08:00", comments="Source Table: public.favorites")
    public static final class Favorites extends AliasableSqlTable<Favorites> {
        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> articleId = column("article_id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public Favorites() {
            super("public.favorites", Favorites::new);
        }
    }
}