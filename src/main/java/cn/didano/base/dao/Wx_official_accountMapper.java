package cn.didano.base.dao;

import cn.didano.base.model.Wx_official_account;
import cn.didano.base.model.Wx_official_accountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wx_official_accountMapper {
    long countByExample(Wx_official_accountExample example);

    int deleteByExample(Wx_official_accountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wx_official_account record);

    int insertSelective(Wx_official_account record);

    List<Wx_official_account> selectByExample(Wx_official_accountExample example);

    Wx_official_account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wx_official_account record, @Param("example") Wx_official_accountExample example);

    int updateByExample(@Param("record") Wx_official_account record, @Param("example") Wx_official_accountExample example);

    int updateByPrimaryKeySelective(Wx_official_account record);

    int updateByPrimaryKey(Wx_official_account record);
}