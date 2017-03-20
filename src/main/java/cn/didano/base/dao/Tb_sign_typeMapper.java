package cn.didano.base.dao;

import cn.didano.base.model.Tb_sign_type;
import cn.didano.base.model.Tb_sign_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_sign_typeMapper {
    long countByExample(Tb_sign_typeExample example);

    int deleteByExample(Tb_sign_typeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_sign_type record);

    int insertSelective(Tb_sign_type record);

    List<Tb_sign_type> selectByExample(Tb_sign_typeExample example);

    Tb_sign_type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_sign_type record, @Param("example") Tb_sign_typeExample example);

    int updateByExample(@Param("record") Tb_sign_type record, @Param("example") Tb_sign_typeExample example);

    int updateByPrimaryKeySelective(Tb_sign_type record);

    int updateByPrimaryKey(Tb_sign_type record);
}