package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class FollowingsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    public static final Followings followings = new Followings();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source field: public.followings.following_id")
    public static final SqlColumn<Integer> followingId = followings.followingId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source field: public.followings.follower_id")
    public static final SqlColumn<Integer> followerId = followings.followerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    public static final class Followings extends AliasableSqlTable<Followings> {
        public final SqlColumn<Integer> followingId = column("following_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> followerId = column("follower_id", JDBCType.INTEGER);

        public Followings() {
            super("public.followings", Followings::new);
        }
    }
}