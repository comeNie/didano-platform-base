package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Bs_pay;
import cn.didano.base.model.Bs_payExample;

public interface Bs_payMapper {
    long countByExample(Bs_payExample example);

    int deleteByExample(Bs_payExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bs_pay record);

    int insertSelective(Bs_pay record);

    List<Bs_pay> selectByExample(Bs_payExample example);

    Bs_pay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bs_pay record, @Param("example") Bs_payExample example);

    int updateByExample(@Param("record") Bs_pay record, @Param("example") Bs_payExample example);

    int updateByPrimaryKeySelective(Bs_pay record);

    int updateByPrimaryKey(Bs_pay record);
}