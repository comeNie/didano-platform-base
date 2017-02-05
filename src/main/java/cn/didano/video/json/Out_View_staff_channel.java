package cn.didano.video.json;

import java.util.ArrayList;
import java.util.List;

import cn.didano.base.model.View_staff_channel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Out_View_staff_channel extends View_staff_channel{
	@ApiModelProperty(value = "当前是否开放")
    private boolean on = false;
	@ApiModelProperty(value = "开放时间组")//时间控制集合
    private List<String> start_ends = new ArrayList<String>();
    
    public Out_View_staff_channel(){
    }

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public List<String> getStart_ends() {
		return start_ends;
	}

	public void setStart_ends(List<String> start_ends) {
		this.start_ends = start_ends;
	}

	@Override
	public String toString() {
		return "Out_View_staff_channel [on=" + on + "]";
	}
}