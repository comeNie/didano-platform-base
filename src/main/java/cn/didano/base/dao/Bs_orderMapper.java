package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Bs_order;
import cn.didano.base.model.Bs_orderExample;

public interface Bs_orderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    long countByExample(Bs_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int deleteByExample(Bs_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int insert(Bs_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int insertSelective(Bs_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    List<Bs_order> selectByExample(Bs_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    Bs_order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Bs_order record, @Param("example") Bs_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Bs_order record, @Param("example") Bs_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Bs_order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bs_order record);
}