package cn.didano.pingxx.webhook;
import java.util.List;

import cn.didano.pingxx.webhook.sec.Data;

public class Refunds {
	private String object;

	private String url;

	private boolean has_more;

	private List<Data> data;

	public void setObject(String object) {
		this.object = object;
	}

	public String getObject() {
		return this.object;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}

	public boolean getHas_more() {
		return this.has_more;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public List<Data> getData() {
		return this.data;
	}

}