package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Tb_staff;
import cn.didano.base.model.Hand_staffTransit4PhoneBook;
import cn.didano.base.model.Tb_student;

public interface Hand_Staff_icMapper {
	List<Hand_staffTransit4PhoneBook> selectStaff_icCard(Integer school_id);
	
	List<Hand_staffTransit4PhoneBook> selectStaff_icCardandType(Integer school_id);
	
	List<Hand_staffTransit4PhoneBook> selectStaff_name(Tb_staff tb_staff);
	
	List<Hand_staffTransit4PhoneBook> selectStaff_icCardType(Tb_staff tb_staff);
	
	Hand_staffTransit4PhoneBook selectInfoByic_number(Tb_staff tb_staff);
	
	int updateByic_number(Tb_staff tb_staff);
	
	List<Hand_staffTransit4PhoneBook> selectStaffType(Tb_staff tb_staff);
}