package cn.didano.base.dao;

import cn.didano.base.model.Vd_websocket_log;
import cn.didano.base.model.Vd_websocket_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Vd_websocket_logMapper {
    long countByExample(Vd_websocket_logExample example);

    int deleteByExample(Vd_websocket_logExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vd_websocket_log record);

    int insertSelective(Vd_websocket_log record);

    List<Vd_websocket_log> selectByExample(Vd_websocket_logExample example);

    Vd_websocket_log selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vd_websocket_log record, @Param("example") Vd_websocket_logExample example);

    int updateByExample(@Param("record") Vd_websocket_log record, @Param("example") Vd_websocket_logExample example);

    int updateByPrimaryKeySelective(Vd_websocket_log record);

    int updateByPrimaryKey(Vd_websocket_log record);
}