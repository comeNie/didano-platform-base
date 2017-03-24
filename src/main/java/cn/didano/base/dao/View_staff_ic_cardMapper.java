package cn.didano.base.dao;

import cn.didano.base.model.View_staff_ic_card;
import cn.didano.base.model.View_staff_ic_cardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface View_staff_ic_cardMapper {
    long countByExample(View_staff_ic_cardExample example);

    int deleteByExample(View_staff_ic_cardExample example);

    int insert(View_staff_ic_card record);

    int insertSelective(View_staff_ic_card record);

    List<View_staff_ic_card> selectByExample(Integer schoolid);

    int updateByExampleSelective(@Param("record") View_staff_ic_card record, @Param("example") View_staff_ic_cardExample example);

    int updateByExample(@Param("record") View_staff_ic_card record, @Param("example") View_staff_ic_cardExample example);
}