package cn.didano.video.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 新增互动的模板
 * @author guitar
 *
 */
@ApiModel
public class In_InteractiveModel_add {

	@ApiModelProperty(value = "模板名字",required=true)
	private String name;
	@ApiModelProperty(value = "正确答案",required=true)
	private String correct;
	@ApiModelProperty(value = "准备",required=true)
	private String prepare;
	@ApiModelProperty(value = "问题",required=true)
	private String question;
	@ApiModelProperty(value = "回答正确",required=true)
	private String answerOk;
	@ApiModelProperty(value = "回答错误",required=true)
	private String answerError;
	@ApiModelProperty(value = "再见",required=true)
	private String goodbye;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	public String getPrepare() {
		return prepare;
	}
	public void setPrepare(String prepare) {
		this.prepare = prepare;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswerOk() {
		return answerOk;
	}
	public void setAnswerOk(String answerOk) {
		this.answerOk = answerOk;
	}
	public String getAnswerError() {
		return answerError;
	}
	public void setAnswerError(String answerError) {
		this.answerError = answerError;
	}
	public String getGoodbye() {
		return goodbye;
	}
	public void setGoodbye(String goodbye) {
		this.goodbye = goodbye;
	}
	
}
