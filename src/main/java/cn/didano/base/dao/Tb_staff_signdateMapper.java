package cn.didano.base.dao;

import cn.didano.base.model.Tb_staff_signdate;
import cn.didano.base.model.Tb_staff_signdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_staff_signdateMapper {
    long countByExample(Tb_staff_signdateExample example);

    int deleteByExample(Tb_staff_signdateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tb_staff_signdate record);

    int insertSelective(Tb_staff_signdate record);

    List<Tb_staff_signdate> selectByExample(Tb_staff_signdateExample example);

    Tb_staff_signdate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tb_staff_signdate record, @Param("example") Tb_staff_signdateExample example);

    int updateByExample(@Param("record") Tb_staff_signdate record, @Param("example") Tb_staff_signdateExample example);

    int updateByPrimaryKeySelective(Tb_staff_signdate record);

    int updateByPrimaryKey(Tb_staff_signdate record);
}