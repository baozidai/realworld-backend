package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.ArticleTagsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.ArticleTags;
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
public interface ArticleTagsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<ArticleTags>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6756693+08:00", comments="Source Table: public.article_tags")
    BasicColumn[] selectList = BasicColumn.columnList(articleId, tagId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6565617+08:00", comments="Source Table: public.article_tags")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ArticleTagsResult", value = {
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<ArticleTags> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6635213+08:00", comments="Source Table: public.article_tags")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ArticleTagsResult")
    Optional<ArticleTags> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6650348+08:00", comments="Source Table: public.article_tags")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, articleTags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6670475+08:00", comments="Source Table: public.article_tags")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, articleTags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6690455+08:00", comments="Source Table: public.article_tags")
    default int deleteByPrimaryKey(Integer articleId_, Integer tagId_) {
        return delete(c -> 
            c.where(articleId, isEqualTo(articleId_))
            .and(tagId, isEqualTo(tagId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6700513+08:00", comments="Source Table: public.article_tags")
    default int insert(ArticleTags row) {
        return MyBatis3Utils.insert(this::insert, row, articleTags, c ->
            c.map(articleId).toProperty("articleId")
            .map(tagId).toProperty("tagId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6725688+08:00", comments="Source Table: public.article_tags")
    default int insertMultiple(Collection<ArticleTags> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, articleTags, c ->
            c.map(articleId).toProperty("articleId")
            .map(tagId).toProperty("tagId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6735728+08:00", comments="Source Table: public.article_tags")
    default int insertSelective(ArticleTags row) {
        return MyBatis3Utils.insert(this::insert, row, articleTags, c ->
            c.map(articleId).toPropertyWhenPresent("articleId", row::getArticleId)
            .map(tagId).toPropertyWhenPresent("tagId", row::getTagId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6776846+08:00", comments="Source Table: public.article_tags")
    default Optional<ArticleTags> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, articleTags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6776846+08:00", comments="Source Table: public.article_tags")
    default List<ArticleTags> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, articleTags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6786827+08:00", comments="Source Table: public.article_tags")
    default List<ArticleTags> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, articleTags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6786827+08:00", comments="Source Table: public.article_tags")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, articleTags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6801909+08:00", comments="Source Table: public.article_tags")
    static UpdateDSL<UpdateModel> updateAllColumns(ArticleTags row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(articleId).equalTo(row::getArticleId)
                .set(tagId).equalTo(row::getTagId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.6801909+08:00", comments="Source Table: public.article_tags")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ArticleTags row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(articleId).equalToWhenPresent(row::getArticleId)
                .set(tagId).equalToWhenPresent(row::getTagId);
    }
}