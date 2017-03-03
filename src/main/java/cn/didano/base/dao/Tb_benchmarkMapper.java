package cn.didano.base.dao;

import cn.didano.base.model.Tb_benchmark;
import cn.didano.base.model.Tb_benchmarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_benchmarkMapper {
    long countByExample(Tb_benchmarkExample example);

    int deleteByExample(Tb_benchmarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_benchmark record);

    int insertSelective(Tb_benchmark record);

    List<Tb_benchmark> selectByExample(Tb_benchmarkExample example);

    Tb_benchmark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_benchmark record, @Param("example") Tb_benchmarkExample example);

    int updateByExample(@Param("record") Tb_benchmark record, @Param("example") Tb_benchmarkExample example);

    int updateByPrimaryKeySelective(Tb_benchmark record);

    int updateByPrimaryKey(Tb_benchmark record);
}