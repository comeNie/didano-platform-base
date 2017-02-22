package cn.didano.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.base.dao.Tb_studentMapper;
import cn.didano.base.model.Tb_student;
import cn.didano.base.model.Tb_studentExample;
import cn.didano.base.model.Vd_channel;
import cn.didano.base.model.Vd_channelExample;
import cn.didano.base.model.View_student_channel;
import cn.didano.base.model.View_student_channelExample;
import cn.didano.video.constant.DeletedType;

/**
 * 
 * @author guitar
 *
 */
@Service
public class StudentService {

	@Autowired
	private Tb_studentMapper studentMapper;
	
	/**
	 * 通过id查询
	 */
	public List<Tb_student> selectById(Integer student_id){
		
		Tb_studentExample condition = new Tb_studentExample();
		Tb_studentExample.Criteria criteria=condition.createCriteria();
		criteria.andStudentIdEqualTo(student_id);		
		condition.setOrderByClause("created");		
		criteria.andOrgImgUrlNotLike("");

		return studentMapper.selectByExample(condition);
	}
	
	
}
