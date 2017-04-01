package cn.didano.base.dao;

import cn.didano.base.model.Hand_student4MailListHasParents;
import cn.didano.base.model.Hand_student4MailListHasParentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Hand_student4MailListHasParentsMapper {
    long countByExample(Hand_student4MailListHasParentsExample example);

    int deleteByExample(Hand_student4MailListHasParentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hand_student4MailListHasParents record);

    int insertSelective(Hand_student4MailListHasParents record);

    List<Hand_student4MailListHasParents> selectByExample(Hand_student4MailListHasParentsExample example);

    Hand_student4MailListHasParents selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hand_student4MailListHasParents record, @Param("example") Hand_student4MailListHasParentsExample example);

    int updateByExample(@Param("record") Hand_student4MailListHasParents record, @Param("example") Hand_student4MailListHasParentsExample example);

    int updateByPrimaryKeySelective(Hand_student4MailListHasParents record);

    int updateByPrimaryKey(Hand_student4MailListHasParents record);
}