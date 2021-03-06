package dao;

import dao.po.TTaskmember;
import dao.po.TTaskmemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TTaskmemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int countByExample(TTaskmemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int deleteByExample(TTaskmemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Delete({
        "delete from t_taskmember",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Insert({
        "insert into t_taskmember (teamid, userid)",
        "values (#{teamid,jdbcType=CHAR}, #{userid,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=String.class)
    int insert(TTaskmember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int insertSelective(TTaskmember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    List<TTaskmember> selectByExample(TTaskmemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Select({
        "select",
        "id, teamid, userid",
        "from t_taskmember",
        "where id = #{id,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    TTaskmember selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") TTaskmember record, @Param("example") TTaskmemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int updateByExample(@Param("record") TTaskmember record, @Param("example") TTaskmemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    int updateByPrimaryKeySelective(TTaskmember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_taskmember
     *
     * @mbggenerated Sun Jul 01 14:21:19 CST 2018
     */
    @Update({
        "update t_taskmember",
        "set teamid = #{teamid,jdbcType=CHAR},",
          "userid = #{userid,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TTaskmember record);
}