package cn.didano.base.dao;

import cn.didano.base.model.Wx_official_account_info;
import cn.didano.base.model.Wx_official_account_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wx_official_account_infoMapper {
    long countByExample(Wx_official_account_infoExample example);

    int deleteByExample(Wx_official_account_infoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Wx_official_account_info record);

    int insertSelective(Wx_official_account_info record);

    List<Wx_official_account_info> selectByExample(Wx_official_account_infoExample example);

    Wx_official_account_info selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Wx_official_account_info record, @Param("example") Wx_official_account_infoExample example);

    int updateByExample(@Param("record") Wx_official_account_info record, @Param("example") Wx_official_account_infoExample example);

    int updateByPrimaryKeySelective(Wx_official_account_info record);

    int updateByPrimaryKey(Wx_official_account_info record);
}