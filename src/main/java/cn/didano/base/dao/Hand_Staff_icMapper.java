package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Tb_staff;

public interface Hand_Staff_icMapper {
	List<Tb_staff> selectStaff_icCard(Integer school_id);
	
	List<Tb_staff> selectStaff_icCardandType(Integer school_id);
	
	List<Tb_staff> selectStaff_name(Tb_staff tb_staff);
	
	List<Tb_staff> selectStaff_icCardType(Tb_staff tb_staff);
}