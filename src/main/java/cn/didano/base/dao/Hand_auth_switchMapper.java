package cn.didano.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Vd_auth_switch;

public interface Hand_auth_switchMapper {
	List<Vd_auth_switch> select_auth_switch(@Param("school_id") Integer school_id);
}