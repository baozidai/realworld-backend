package me.baozidai.realworld.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class TagsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    public static final Tags tags = new Tags();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.id")
    public static final SqlColumn<Integer> id = tags.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source field: public.tags.tag_name")
    public static final SqlColumn<String> tagName = tags.tagName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    public static final class Tags extends AliasableSqlTable<Tags> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> tagName = column("tag_name", JDBCType.VARCHAR);

        public Tags() {
            super("public.tags", Tags::new);
        }
    }
}