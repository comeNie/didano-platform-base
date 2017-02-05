package cn.didano.pingxx.webhook;

public class Root {
	private String id;

	private int created;

	private boolean livemode;

	private String type;

	private Data data;

	private String object;

	private int pending_webhooks;

	private String request;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setCreated(int created) {
		this.created = created;
	}

	public int getCreated() {
		return this.created;
	}

	public void setLivemode(boolean livemode) {
		this.livemode = livemode;
	}

	public boolean getLivemode() {
		return this.livemode;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Data getData() {
		return this.data;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getObject() {
		return this.object;
	}

	public void setPending_webhooks(int pending_webhooks) {
		this.pending_webhooks = pending_webhooks;
	}

	public int getPending_webhooks() {
		return this.pending_webhooks;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getRequest() {
		return this.request;
	}

}