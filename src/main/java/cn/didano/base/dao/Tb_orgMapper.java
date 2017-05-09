package cn.didano.base.dao;

import cn.didano.base.model.Tb_org;
import cn.didano.base.model.Tb_orgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_orgMapper {
    long countByExample(Tb_orgExample example);

    int deleteByExample(Tb_orgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_org record);

    int insertSelective(Tb_org record);

    List<Tb_org> selectByExample(Tb_orgExample example);

    Tb_org selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_org record, @Param("example") Tb_orgExample example);

    int updateByExample(@Param("record") Tb_org record, @Param("example") Tb_orgExample example);

    int updateByPrimaryKeySelective(Tb_org record);

    int updateByPrimaryKey(Tb_org record);
}