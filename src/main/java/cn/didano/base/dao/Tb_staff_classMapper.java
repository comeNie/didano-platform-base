package cn.didano.base.dao;

import cn.didano.base.model.Tb_staff_class;
import cn.didano.base.model.Tb_staff_classExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_staff_classMapper {
    long countByExample(Tb_staff_classExample example);

    int deleteByExample(Tb_staff_classExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_staff_class record);

    int insertSelective(Tb_staff_class record);

    List<Tb_staff_class> selectByExample(Tb_staff_classExample example);

    Tb_staff_class selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_staff_class record, @Param("example") Tb_staff_classExample example);

    int updateByExample(@Param("record") Tb_staff_class record, @Param("example") Tb_staff_classExample example);

    int updateByPrimaryKeySelective(Tb_staff_class record);

    int updateByPrimaryKey(Tb_staff_class record);
}