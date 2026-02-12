package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.RealworldUsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.RealworldUsers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface RealworldUsersMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RealworldUsers>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    BasicColumn[] selectList = BasicColumn.columnList(id, email, username, bio, image, createdTime, lastUpdateTime, password);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RealworldUsersResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="bio", property="bio", jdbcType=JdbcType.VARCHAR),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    List<RealworldUsers> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RealworldUsersResult")
    Optional<RealworldUsers> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, realworldUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, realworldUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    default int insert(RealworldUsers row) {
        return MyBatis3Utils.insert(this::insert, row, realworldUsers, c ->
            c.map(id).toProperty("id")
            .map(email).toProperty("email")
            .map(username).toProperty("username")
            .map(bio).toProperty("bio")
            .map(image).toProperty("image")
            .map(createdTime).toProperty("createdTime")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(password).toProperty("password")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7011738+08:00", comments="Source Table: public.realworld_users")
    default int insertMultiple(Collection<RealworldUsers> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, realworldUsers, c ->
            c.map(id).toProperty("id")
            .map(email).toProperty("email")
            .map(username).toProperty("username")
            .map(bio).toProperty("bio")
            .map(image).toProperty("image")
            .map(createdTime).toProperty("createdTime")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
            .map(password).toProperty("password")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default int insertSelective(RealworldUsers row) {
        return MyBatis3Utils.insert(this::insert, row, realworldUsers, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(email).toPropertyWhenPresent("email", row::getEmail)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(bio).toPropertyWhenPresent("bio", row::getBio)
            .map(image).toPropertyWhenPresent("image", row::getImage)
            .map(createdTime).toPropertyWhenPresent("createdTime", row::getCreatedTime)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", row::getLastUpdateTime)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default Optional<RealworldUsers> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, realworldUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default List<RealworldUsers> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, realworldUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default List<RealworldUsers> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, realworldUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default Optional<RealworldUsers> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, realworldUsers, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    static UpdateDSL<UpdateModel> updateAllColumns(RealworldUsers row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(email).equalTo(row::getEmail)
                .set(username).equalTo(row::getUsername)
                .set(bio).equalTo(row::getBio)
                .set(image).equalTo(row::getImage)
                .set(createdTime).equalTo(row::getCreatedTime)
                .set(lastUpdateTime).equalTo(row::getLastUpdateTime)
                .set(password).equalTo(row::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RealworldUsers row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(bio).equalToWhenPresent(row::getBio)
                .set(image).equalToWhenPresent(row::getImage)
                .set(createdTime).equalToWhenPresent(row::getCreatedTime)
                .set(lastUpdateTime).equalToWhenPresent(row::getLastUpdateTime)
                .set(password).equalToWhenPresent(row::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7021812+08:00", comments="Source Table: public.realworld_users")
    default int updateByPrimaryKey(RealworldUsers row) {
        return update(c ->
            c.set(email).equalTo(row::getEmail)
            .set(username).equalTo(row::getUsername)
            .set(bio).equalTo(row::getBio)
            .set(image).equalTo(row::getImage)
            .set(createdTime).equalTo(row::getCreatedTime)
            .set(lastUpdateTime).equalTo(row::getLastUpdateTime)
            .set(password).equalTo(row::getPassword)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.realworld_users")
    default int updateByPrimaryKeySelective(RealworldUsers row) {
        return update(c ->
            c.set(email).equalToWhenPresent(row::getEmail)
            .set(username).equalToWhenPresent(row::getUsername)
            .set(bio).equalToWhenPresent(row::getBio)
            .set(image).equalToWhenPresent(row::getImage)
            .set(createdTime).equalToWhenPresent(row::getCreatedTime)
            .set(lastUpdateTime).equalToWhenPresent(row::getLastUpdateTime)
            .set(password).equalToWhenPresent(row::getPassword)
            .where(id, isEqualTo(row::getId))
        );
    }
}