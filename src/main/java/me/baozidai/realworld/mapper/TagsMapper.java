package me.baozidai.realworld.mapper;

import static me.baozidai.realworld.mapper.TagsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import me.baozidai.realworld.model.Tags;
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
public interface TagsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Tags>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    BasicColumn[] selectList = BasicColumn.columnList(id, tagName);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TagsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="tag_name", property="tagName", jdbcType=JdbcType.VARCHAR)
    })
    List<Tags> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TagsResult")
    Optional<Tags> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default int insert(Tags row) {
        return MyBatis3Utils.insert(this::insert, row, tags, c ->
            c.map(id).toProperty("id")
            .map(tagName).toProperty("tagName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default int insertMultiple(Collection<Tags> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, tags, c ->
            c.map(id).toProperty("id")
            .map(tagName).toProperty("tagName")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default int insertSelective(Tags row) {
        return MyBatis3Utils.insert(this::insert, row, tags, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(tagName).toPropertyWhenPresent("tagName", row::getTagName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default Optional<Tags> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default List<Tags> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default List<Tags> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7031903+08:00", comments="Source Table: public.tags")
    default Optional<Tags> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7046974+08:00", comments="Source Table: public.tags")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tags, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7046974+08:00", comments="Source Table: public.tags")
    static UpdateDSL<UpdateModel> updateAllColumns(Tags row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(tagName).equalTo(row::getTagName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7046974+08:00", comments="Source Table: public.tags")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Tags row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(tagName).equalToWhenPresent(row::getTagName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7046974+08:00", comments="Source Table: public.tags")
    default int updateByPrimaryKey(Tags row) {
        return update(c ->
            c.set(tagName).equalTo(row::getTagName)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2026-02-12T17:26:17.7046974+08:00", comments="Source Table: public.tags")
    default int updateByPrimaryKeySelective(Tags row) {
        return update(c ->
            c.set(tagName).equalToWhenPresent(row::getTagName)
            .where(id, isEqualTo(row::getId))
        );
    }
}