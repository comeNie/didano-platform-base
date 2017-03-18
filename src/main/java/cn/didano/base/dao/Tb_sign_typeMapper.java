package cn.didano.base.dao;

import cn.didano.base.model.tb_sign_type;
import cn.didano.base.model.tb_sign_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_sign_typeMapper {
    long countByExample(tb_sign_typeExample example);

    int deleteByExample(tb_sign_typeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tb_sign_type record);

    int insertSelective(tb_sign_type record);

    List<tb_sign_type> selectByExample(tb_sign_typeExample example);

    tb_sign_type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tb_sign_type record, @Param("example") tb_sign_typeExample example);

    int updateByExample(@Param("record") tb_sign_type record, @Param("example") tb_sign_typeExample example);

    int updateByPrimaryKeySelective(tb_sign_type record);

    int updateByPrimaryKey(tb_sign_type record);
}