package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.FollowingsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.Followings;
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
public interface FollowingsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Followings>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    BasicColumn[] selectList = BasicColumn.columnList(followingId, followerId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FollowingsResult", value = {
        @Result(column="following_id", property="followingId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="follower_id", property="followerId", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<Followings> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FollowingsResult")
    Optional<Followings> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, followings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, followings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default int deleteByPrimaryKey(Integer followingId_, Integer followerId_) {
        return delete(c -> 
            c.where(followingId, isEqualTo(followingId_))
            .and(followerId, isEqualTo(followerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default int insert(Followings row) {
        return MyBatis3Utils.insert(this::insert, row, followings, c ->
            c.map(followingId).toProperty("followingId")
            .map(followerId).toProperty("followerId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default int insertMultiple(Collection<Followings> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, followings, c ->
            c.map(followingId).toProperty("followingId")
            .map(followerId).toProperty("followerId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default int insertSelective(Followings row) {
        return MyBatis3Utils.insert(this::insert, row, followings, c ->
            c.map(followingId).toPropertyWhenPresent("followingId", row::getFollowingId)
            .map(followerId).toPropertyWhenPresent("followerId", row::getFollowerId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default Optional<Followings> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, followings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default List<Followings> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, followings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default List<Followings> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, followings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, followings, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    static UpdateDSL<UpdateModel> updateAllColumns(Followings row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(followingId).equalTo(row::getFollowingId)
                .set(followerId).equalTo(row::getFollowerId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6988299+08:00", comments="Source Table: public.followings")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Followings row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(followingId).equalToWhenPresent(row::getFollowingId)
                .set(followerId).equalToWhenPresent(row::getFollowerId);
    }
}