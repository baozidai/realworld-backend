package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.CommentsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.Comments;
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
public interface CommentsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Comments>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    BasicColumn[] selectList = BasicColumn.columnList(id, body, articleId, userId, createTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source Table: public.comments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CommentsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="body", property="body", jdbcType=JdbcType.VARCHAR),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Comments> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source Table: public.comments")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CommentsResult")
    Optional<Comments> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source Table: public.comments")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, comments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.693311+08:00", comments="Source Table: public.comments")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, comments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default int insert(Comments row) {
        return MyBatis3Utils.insert(this::insert, row, comments, c ->
            c.map(id).toProperty("id")
            .map(body).toProperty("body")
            .map(articleId).toProperty("articleId")
            .map(userId).toProperty("userId")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default int insertMultiple(Collection<Comments> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, comments, c ->
            c.map(id).toProperty("id")
            .map(body).toProperty("body")
            .map(articleId).toProperty("articleId")
            .map(userId).toProperty("userId")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default int insertSelective(Comments row) {
        return MyBatis3Utils.insert(this::insert, row, comments, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(body).toPropertyWhenPresent("body", row::getBody)
            .map(articleId).toPropertyWhenPresent("articleId", row::getArticleId)
            .map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default Optional<Comments> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, comments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default List<Comments> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, comments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6943108+08:00", comments="Source Table: public.comments")
    default List<Comments> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, comments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6953126+08:00", comments="Source Table: public.comments")
    default Optional<Comments> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6953126+08:00", comments="Source Table: public.comments")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, comments, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6953126+08:00", comments="Source Table: public.comments")
    static UpdateDSL<UpdateModel> updateAllColumns(Comments row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(body).equalTo(row::getBody)
                .set(articleId).equalTo(row::getArticleId)
                .set(userId).equalTo(row::getUserId)
                .set(createTime).equalTo(row::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6953126+08:00", comments="Source Table: public.comments")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Comments row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(body).equalToWhenPresent(row::getBody)
                .set(articleId).equalToWhenPresent(row::getArticleId)
                .set(userId).equalToWhenPresent(row::getUserId)
                .set(createTime).equalToWhenPresent(row::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6953126+08:00", comments="Source Table: public.comments")
    default int updateByPrimaryKey(Comments row) {
        return update(c ->
            c.set(body).equalTo(row::getBody)
            .set(articleId).equalTo(row::getArticleId)
            .set(userId).equalTo(row::getUserId)
            .set(createTime).equalTo(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6953126+08:00", comments="Source Table: public.comments")
    default int updateByPrimaryKeySelective(Comments row) {
        return update(c ->
            c.set(body).equalToWhenPresent(row::getBody)
            .set(articleId).equalToWhenPresent(row::getArticleId)
            .set(userId).equalToWhenPresent(row::getUserId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}