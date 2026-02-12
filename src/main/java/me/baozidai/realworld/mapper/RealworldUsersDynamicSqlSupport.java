package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RealworldUsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.700868+08:00", comments="Source Table: public.realworld_users")
    public static final RealworldUsers realworldUsers = new RealworldUsers();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.id")
    public static final SqlColumn<Integer> id = realworldUsers.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.email")
    public static final SqlColumn<String> email = realworldUsers.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.username")
    public static final SqlColumn<String> username = realworldUsers.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.bio")
    public static final SqlColumn<String> bio = realworldUsers.bio;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.image")
    public static final SqlColumn<String> image = realworldUsers.image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.created_time")
    public static final SqlColumn<Date> createdTime = realworldUsers.createdTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.last_update_time")
    public static final SqlColumn<Date> lastUpdateTime = realworldUsers.lastUpdateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source field: public.realworld_users.password")
    public static final SqlColumn<String> password = realworldUsers.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    public static final class RealworldUsers extends AliasableSqlTable<RealworldUsers> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> bio = column("bio", JDBCType.VARCHAR);

        public final SqlColumn<String> image = column("image", JDBCType.VARCHAR);

        public final SqlColumn<Date> createdTime = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastUpdateTime = column("last_update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public RealworldUsers() {
            super("public.realworld_users", RealworldUsers::new);
        }
    }
}