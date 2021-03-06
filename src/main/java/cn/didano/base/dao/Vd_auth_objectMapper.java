package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Vd_auth_object;
import cn.didano.base.model.Vd_auth_objectExample;

public interface Vd_auth_objectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    long countByExample(Vd_auth_objectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int deleteByExample(Vd_auth_objectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int insert(Vd_auth_object record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int insertSelective(Vd_auth_object record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    List<Vd_auth_object> selectByExample(Vd_auth_objectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    Vd_auth_object selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Vd_auth_object record, @Param("example") Vd_auth_objectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Vd_auth_object record, @Param("example") Vd_auth_objectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Vd_auth_object record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vd_auth_object
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Vd_auth_object record);
}