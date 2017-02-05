package cn.didano.pingxx.webhook;

public class Object {
	private String id;

	private String object;

	private int created;

	private boolean livemode;

	private boolean paid;

	private boolean refunded;

	private String app;

	private String channel;

	private String order_no;

	private String client_ip;

	private int amount;

	private int amount_settle;

	private String currency;

	private String subject;

	private String body;

	private Extra extra;

	private int time_paid;

	private int time_expire;

	private String time_settle;

	private String transaction_no;

	private Refunds refunds;

	private int amount_refunded;

	private String failure_code;

	private String failure_msg;

	private Metadata metadata;

	private Credential credential;

	private String description;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getObject() {
		return this.object;
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

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public boolean getPaid() {
		return this.paid;
	}

	public void setRefunded(boolean refunded) {
		this.refunded = refunded;
	}

	public boolean getRefunded() {
		return this.refunded;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApp() {
		return this.app;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_no() {
		return this.order_no;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	public String getClient_ip() {
		return this.client_ip;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount_settle(int amount_settle) {
		this.amount_settle = amount_settle;
	}

	public int getAmount_settle() {
		return this.amount_settle;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return this.body;
	}

	public void setExtra(Extra extra) {
		this.extra = extra;
	}

	public Extra getExtra() {
		return this.extra;
	}

	public void setTime_paid(int time_paid) {
		this.time_paid = time_paid;
	}

	public int getTime_paid() {
		return this.time_paid;
	}

	public void setTime_expire(int time_expire) {
		this.time_expire = time_expire;
	}

	public int getTime_expire() {
		return this.time_expire;
	}

	public void setTime_settle(String time_settle) {
		this.time_settle = time_settle;
	}

	public String getTime_settle() {
		return this.time_settle;
	}

	public void setTransaction_no(String transaction_no) {
		this.transaction_no = transaction_no;
	}

	public String getTransaction_no() {
		return this.transaction_no;
	}

	public void setRefunds(Refunds refunds) {
		this.refunds = refunds;
	}

	public Refunds getRefunds() {
		return this.refunds;
	}

	public void setAmount_refunded(int amount_refunded) {
		this.amount_refunded = amount_refunded;
	}

	public int getAmount_refunded() {
		return this.amount_refunded;
	}

	public void setFailure_code(String failure_code) {
		this.failure_code = failure_code;
	}

	public String getFailure_code() {
		return this.failure_code;
	}

	public void setFailure_msg(String failure_msg) {
		this.failure_msg = failure_msg;
	}

	public String getFailure_msg() {
		return this.failure_msg;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Metadata getMetadata() {
		return this.metadata;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public Credential getCredential() {
		return this.credential;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

}