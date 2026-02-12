package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.ArticlesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.Articles;
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
public interface ArticlesMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Articles>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    BasicColumn[] selectList = BasicColumn.columnList(id, title, description, body, userId, createTime, lastUpdateTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6877891+08:00", comments="Source Table: public.articles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ArticlesResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Articles> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6877891+08:00", comments="Source Table: public.articles")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ArticlesResult")
    Optional<Articles> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, articles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, articles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default int insert(Articles row) {
        return MyBatis3Utils.insert(this::insert, row, articles, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(description).toProperty("description")
            .map(body).toProperty("body")
            .map(userId).toProperty("userId")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default int insertMultiple(Collection<Articles> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, articles, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(description).toProperty("description")
            .map(body).toProperty("body")
            .map(userId).toProperty("userId")
            .map(createTime).toProperty("createTime")
            .map(lastUpdateTime).toProperty("lastUpdateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default int insertSelective(Articles row) {
        return MyBatis3Utils.insert(this::insert, row, articles, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(body).toPropertyWhenPresent("body", row::getBody)
            .map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(lastUpdateTime).toPropertyWhenPresent("lastUpdateTime", row::getLastUpdateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default Optional<Articles> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, articles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default List<Articles> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, articles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6887918+08:00", comments="Source Table: public.articles")
    default List<Articles> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, articles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6903006+08:00", comments="Source Table: public.articles")
    default Optional<Articles> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6903006+08:00", comments="Source Table: public.articles")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, articles, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6903006+08:00", comments="Source Table: public.articles")
    static UpdateDSL<UpdateModel> updateAllColumns(Articles row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(title).equalTo(row::getTitle)
                .set(description).equalTo(row::getDescription)
                .set(body).equalTo(row::getBody)
                .set(userId).equalTo(row::getUserId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(lastUpdateTime).equalTo(row::getLastUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6906143+08:00", comments="Source Table: public.articles")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Articles row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(title).equalToWhenPresent(row::getTitle)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(body).equalToWhenPresent(row::getBody)
                .set(userId).equalToWhenPresent(row::getUserId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(lastUpdateTime).equalToWhenPresent(row::getLastUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source Table: public.articles")
    default int updateByPrimaryKey(Articles row) {
        return update(c ->
            c.set(title).equalTo(row::getTitle)
            .set(description).equalTo(row::getDescription)
            .set(body).equalTo(row::getBody)
            .set(userId).equalTo(row::getUserId)
            .set(createTime).equalTo(row::getCreateTime)
            .set(lastUpdateTime).equalTo(row::getLastUpdateTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6913108+08:00", comments="Source Table: public.articles")
    default int updateByPrimaryKeySelective(Articles row) {
        return update(c ->
            c.set(title).equalToWhenPresent(row::getTitle)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(body).equalToWhenPresent(row::getBody)
            .set(userId).equalToWhenPresent(row::getUserId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(lastUpdateTime).equalToWhenPresent(row::getLastUpdateTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}