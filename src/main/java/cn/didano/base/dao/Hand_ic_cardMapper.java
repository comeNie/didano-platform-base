package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Hand_icCardAndSchool_id;
import cn.didano.base.model.Hand_ic_card;
import cn.didano.base.model.Tb_ic_card;

public interface Hand_ic_cardMapper {
	List<Tb_ic_card> selectNoeIcInfo(Tb_ic_card ic);
	
	List<Tb_ic_card> select_between_icInfo(Hand_icCardAndSchool_id hciCard);
	
	List<Tb_ic_card> select_ICMaxNumber(int school_id);
	
	int updateInfoByid(int id);
	
	int updateInfoByic_number(Tb_ic_card td);
	
	int updateIcCardInfo(Hand_ic_card h);
}