package cn.didano.base.dao;

import cn.didano.base.model.Wx_org_official_account;
import cn.didano.base.model.Wx_org_official_accountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wx_org_official_accountMapper {
    long countByExample(Wx_org_official_accountExample example);

    int deleteByExample(Wx_org_official_accountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wx_org_official_account record);

    int insertSelective(Wx_org_official_account record);

    List<Wx_org_official_account> selectByExample(Wx_org_official_accountExample example);

    Wx_org_official_account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wx_org_official_account record, @Param("example") Wx_org_official_accountExample example);

    int updateByExample(@Param("record") Wx_org_official_account record, @Param("example") Wx_org_official_accountExample example);

    int updateByPrimaryKeySelective(Wx_org_official_account record);

    int updateByPrimaryKey(Wx_org_official_account record);
}