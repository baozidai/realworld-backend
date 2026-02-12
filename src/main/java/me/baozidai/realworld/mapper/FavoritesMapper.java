package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.FavoritesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.Favorites;
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
public interface FavoritesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Favorites>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    BasicColumn[] selectList = BasicColumn.columnList(userId, articleId, createTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="FavoritesResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Favorites> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("FavoritesResult")
    Optional<Favorites> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, favorites, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, favorites, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    default int deleteByPrimaryKey(Integer userId_, Integer articleId_) {
        return delete(c -> 
            c.where(userId, isEqualTo(userId_))
            .and(articleId, isEqualTo(articleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    default int insert(Favorites row) {
        return MyBatis3Utils.insert(this::insert, row, favorites, c ->
            c.map(userId).toProperty("userId")
            .map(articleId).toProperty("articleId")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    default int insertMultiple(Collection<Favorites> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, favorites, c ->
            c.map(userId).toProperty("userId")
            .map(articleId).toProperty("articleId")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6968313+08:00", comments="Source Table: public.favorites")
    default int insertSelective(Favorites row) {
        return MyBatis3Utils.insert(this::insert, row, favorites, c ->
            c.map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(articleId).toPropertyWhenPresent("articleId", row::getArticleId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default Optional<Favorites> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, favorites, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default List<Favorites> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, favorites, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default List<Favorites> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, favorites, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default Optional<Favorites> selectByPrimaryKey(Integer userId_, Integer articleId_) {
        return selectOne(c ->
            c.where(userId, isEqualTo(userId_))
            .and(articleId, isEqualTo(articleId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, favorites, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    static UpdateDSL<UpdateModel> updateAllColumns(Favorites row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(row::getUserId)
                .set(articleId).equalTo(row::getArticleId)
                .set(createTime).equalTo(row::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Favorites row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(row::getUserId)
                .set(articleId).equalToWhenPresent(row::getArticleId)
                .set(createTime).equalToWhenPresent(row::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default int updateByPrimaryKey(Favorites row) {
        return update(c ->
            c.set(createTime).equalTo(row::getCreateTime)
            .where(userId, isEqualTo(row::getUserId))
            .and(articleId, isEqualTo(row::getArticleId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6978314+08:00", comments="Source Table: public.favorites")
    default int updateByPrimaryKeySelective(Favorites row) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(row::getCreateTime)
            .where(userId, isEqualTo(row::getUserId))
            .and(articleId, isEqualTo(row::getArticleId))
        );
    }
}