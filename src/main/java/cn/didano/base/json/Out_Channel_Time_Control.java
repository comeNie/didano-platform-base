package cn.didano.base.json;

import java.util.ArrayList;
import java.util.List;

import cn.didano.base.model.Vd_auth_time_control;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Out_Channel_Time_Control {
	@ApiModelProperty(value = "ID")
    private Integer id;
	@ApiModelProperty(value = "频道名称")
    private String name;
	@ApiModelProperty(value = "描述")
    private String des;
	@ApiModelProperty(value = "类型")
    private Byte type;
	@ApiModelProperty(value = "状态")
    private Byte status;
	@ApiModelProperty(value = "时间控制数目")
	private int controls_num;
	@ApiModelProperty(value = "时间控制列表")
    private List<Vd_auth_time_control> controls = new ArrayList<Vd_auth_time_control>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public int getControls_num() {
		return controls_num;
	}

	public void setControls_num(int controls_num) {
		this.controls_num = controls_num;
	}

	public List<Vd_auth_time_control> getControls() {
		return controls;
	}

	public void setControls(List<Vd_auth_time_control> controls) {
		this.controls = controls;
	}

	@Override
	public String toString() {
		return "Out_Channel_Time_Control [id=" + id + ", name=" + name + ", des=" + des + ", type=" + type + ", status="
				+ status + ", controls_num=" + controls_num + ", controls=" + controls + "]";
	}
   
}