package cn.didano.base.dao;

import cn.didano.base.model.Tb_ic_card;
import cn.didano.base.model.Tb_ic_cardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_ic_cardMapper {
    long countByExample(Tb_ic_cardExample example);

    int deleteByExample(Tb_ic_cardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_ic_card record);

    int insertSelective(Tb_ic_card record);

    List<Tb_ic_card> selectByExample(Tb_ic_cardExample example);

    Tb_ic_card selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_ic_card record, @Param("example") Tb_ic_cardExample example);

    int updateByExample(@Param("record") Tb_ic_card record, @Param("example") Tb_ic_cardExample example);

    int updateByPrimaryKeySelective(Tb_ic_card record);

    int updateByPrimaryKey(Tb_ic_card record);
}