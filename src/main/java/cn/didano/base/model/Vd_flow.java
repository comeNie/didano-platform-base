package cn.didano.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class Vd_flow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.vd_channel_id
     *
     * @mbg.generated
     */
    private Integer vdChannelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.day_flow
     *
     * @mbg.generated
     */
    private BigDecimal dayFlow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.sum_flow
     *
     * @mbg.generated
     */
    private BigDecimal sumFlow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vd_flow.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.id
     *
     * @return the value of vd_flow.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.id
     *
     * @param id the value for vd_flow.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.vd_channel_id
     *
     * @return the value of vd_flow.vd_channel_id
     *
     * @mbg.generated
     */
    public Integer getVdChannelId() {
        return vdChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.vd_channel_id
     *
     * @param vdChannelId the value for vd_flow.vd_channel_id
     *
     * @mbg.generated
     */
    public void setVdChannelId(Integer vdChannelId) {
        this.vdChannelId = vdChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.day_flow
     *
     * @return the value of vd_flow.day_flow
     *
     * @mbg.generated
     */
    public BigDecimal getDayFlow() {
        return dayFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.day_flow
     *
     * @param dayFlow the value for vd_flow.day_flow
     *
     * @mbg.generated
     */
    public void setDayFlow(BigDecimal dayFlow) {
        this.dayFlow = dayFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.created
     *
     * @return the value of vd_flow.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.created
     *
     * @param created the value for vd_flow.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.updated
     *
     * @return the value of vd_flow.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.updated
     *
     * @param updated the value for vd_flow.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.sum_flow
     *
     * @return the value of vd_flow.sum_flow
     *
     * @mbg.generated
     */
    public BigDecimal getSumFlow() {
        return sumFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.sum_flow
     *
     * @param sumFlow the value for vd_flow.sum_flow
     *
     * @mbg.generated
     */
    public void setSumFlow(BigDecimal sumFlow) {
        this.sumFlow = sumFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vd_flow.deleted
     *
     * @return the value of vd_flow.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vd_flow.deleted
     *
     * @param deleted the value for vd_flow.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}