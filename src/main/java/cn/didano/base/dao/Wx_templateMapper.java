package cn.didano.base.dao;

import cn.didano.base.model.Wx_template;
import cn.didano.base.model.Wx_templateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wx_templateMapper {
    long countByExample(Wx_templateExample example);

    int deleteByExample(Wx_templateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wx_template record);

    int insertSelective(Wx_template record);

    List<Wx_template> selectByExample(Wx_templateExample example);

    Wx_template selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wx_template record, @Param("example") Wx_templateExample example);

    int updateByExample(@Param("record") Wx_template record, @Param("example") Wx_templateExample example);

    int updateByPrimaryKeySelective(Wx_template record);

    int updateByPrimaryKey(Wx_template record);
}