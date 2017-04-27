package cn.didano.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Vd_auth_switch;
import cn.didano.base.model.View_staff_channel;

public interface Hand_auth_switchMapper {
	List<Vd_auth_switch> select_auth_switch(@Param("school_id") Integer school_id);
	List<View_staff_channel> select_switch_by_staff(Tb_staffData tb_staffData);
}