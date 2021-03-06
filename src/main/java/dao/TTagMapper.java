package dao;

import dao.po.TTag;
import dao.po.TTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int countByExample(TTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int deleteByExample(TTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Delete({
        "delete from t_tag",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Insert({
        "insert into t_tag (creator, tag)",
        "values (#{creator,jdbcType=CHAR}, #{tag,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=String.class)
    int insert(TTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int insertSelective(TTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    List<TTag> selectByExample(TTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Select({
        "select",
        "id, creator, tag",
        "from t_tag",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    TTag selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") TTag record, @Param("example") TTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int updateByExample(@Param("record") TTag record, @Param("example") TTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int updateByPrimaryKeySelective(TTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Update({
        "update t_tag",
        "set creator = #{creator,jdbcType=CHAR},",
          "tag = #{tag,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TTag record);
}