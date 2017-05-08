package cn.didano.base.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Hand_auth_switchMapper;
import cn.didano.base.dao.View_channel_infoMapper;
import cn.didano.base.dao.View_channel_info_onMapper;
import cn.didano.base.dao.View_staff_channelMapper;
import cn.didano.base.dao.View_student_channelMapper;
import cn.didano.base.model.Tb_staffData;
import cn.didano.base.model.Vd_auth_switch;
import cn.didano.base.model.View_channel_info;
import cn.didano.base.model.View_channel_infoExample;
import cn.didano.base.model.View_channel_info_on;
import cn.didano.base.model.View_channel_info_onExample;
import cn.didano.base.model.View_staff_channel;
import cn.didano.base.model.View_staff_channelExample;
import cn.didano.base.model.View_student_channel;
import cn.didano.base.model.View_student_channelExample;
import cn.didano.video.constant.OwnerType;

/**
 * @author stephen
 */
@Service
public class ViewChannelService {
	@Autowired
	private View_student_channelMapper view_student_channelMapper;
	@Autowired
	private View_staff_channelMapper view_staff_channelMapper;
	@Autowired
	private View_channel_infoMapper view_channel_infoMapper;
	@Autowired
	private View_channel_info_onMapper view_channel_info_onMapper;
	@Autowired
	private AuthSwitchService authSwitchService;
	@Autowired
	private Hand_auth_switchMapper hand_auth_switchMapper;

	/**
	 * 查询当前学生id，可以看到的所有视频频道，从学生家长身份去看，权限来自于学生
	 * 
	 * @return
	 */
	public List<View_student_channel> selectVideosByStudent(int studentId) {
		// 查看当前学生是否被关闭（默认都开放，没付费的关闭）
		Vd_auth_switch one = authSwitchService.selectOne(studentId, OwnerType.STUDENT.getIndex());
		if (one != null && one.getIsUse() == true) {
			View_student_channelExample condition = new View_student_channelExample();
			View_student_channelExample.Criteria criteria = condition.createCriteria();
			criteria.andStudentIdEqualTo(studentId);
			return view_student_channelMapper.selectByExample(condition);
		} else {// 开关关闭，都关闭
			List<View_student_channel> empty = new ArrayList<View_student_channel>();
			return empty;
		}
	}

	/**
	 * 查询当前老师生id，可以看到的所有视频频道
	 * 
	 * @return
	 */
	public List<View_staff_channel> selectVideosByStaff(int staffId) {
		View_staff_channelExample condition = new View_staff_channelExample();
		View_staff_channelExample.Criteria criteria = condition.createCriteria();
		criteria.andStaffIdEqualTo(staffId);
		return view_staff_channelMapper.selectByExample(condition);

	}
	
	/**
	 * 查询所有，状态，未启用，启用的
	 * 
	 * @return
	 */
	public List<View_channel_info> selectAllView_channel_info() {
		View_channel_infoExample condition = new View_channel_infoExample();
		return view_channel_infoMapper.selectByExample(condition);
	}
	
	/**
	 * 查询所有，状态是启用的
	 * 
	 * @return
	 */
	public List<View_channel_info_on> selectAllView_channel_info_on() {
		View_channel_info_onExample condition = new View_channel_info_onExample();
		return view_channel_info_onMapper.selectByExample(condition);
	}
	
	/**
	 * 查询所有属于班级的视频通道
	 * 
	 * @return
	 */
	public List<View_staff_channel> selectAllView_channel_info_staff(Tb_staffData tb_staffData) {
		return hand_auth_switchMapper.select_switch_by_staff(tb_staffData);
	}
	
	
}
