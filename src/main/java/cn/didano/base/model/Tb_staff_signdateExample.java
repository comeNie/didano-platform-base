package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tb_staff_signdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_staff_signdateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andSignTimestampIsNull() {
            addCriterion("sign_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andSignTimestampIsNotNull() {
            addCriterion("sign_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimestampEqualTo(Long value) {
            addCriterion("sign_timestamp =", value, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampNotEqualTo(Long value) {
            addCriterion("sign_timestamp <>", value, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampGreaterThan(Long value) {
            addCriterion("sign_timestamp >", value, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("sign_timestamp >=", value, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampLessThan(Long value) {
            addCriterion("sign_timestamp <", value, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampLessThanOrEqualTo(Long value) {
            addCriterion("sign_timestamp <=", value, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampIn(List<Long> values) {
            addCriterion("sign_timestamp in", values, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampNotIn(List<Long> values) {
            addCriterion("sign_timestamp not in", values, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampBetween(Long value1, Long value2) {
            addCriterion("sign_timestamp between", value1, value2, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignTimestampNotBetween(Long value1, Long value2) {
            addCriterion("sign_timestamp not between", value1, value2, "signTimestamp");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNull() {
            addCriterion("sign_status is null");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNotNull() {
            addCriterion("sign_status is not null");
            return (Criteria) this;
        }

        public Criteria andSignStatusEqualTo(Byte value) {
            addCriterion("sign_status =", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotEqualTo(Byte value) {
            addCriterion("sign_status <>", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThan(Byte value) {
            addCriterion("sign_status >", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_status >=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThan(Byte value) {
            addCriterion("sign_status <", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sign_status <=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusIn(List<Byte> values) {
            addCriterion("sign_status in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotIn(List<Byte> values) {
            addCriterion("sign_status not in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusBetween(Byte value1, Byte value2) {
            addCriterion("sign_status between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sign_status not between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSetIntimeIsNull() {
            addCriterion("set_intime is null");
            return (Criteria) this;
        }

        public Criteria andSetIntimeIsNotNull() {
            addCriterion("set_intime is not null");
            return (Criteria) this;
        }

        public Criteria andSetIntimeEqualTo(Date value) {
            addCriterionForJDBCTime("set_intime =", value, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("set_intime <>", value, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeGreaterThan(Date value) {
            addCriterionForJDBCTime("set_intime >", value, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("set_intime >=", value, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeLessThan(Date value) {
            addCriterionForJDBCTime("set_intime <", value, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("set_intime <=", value, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeIn(List<Date> values) {
            addCriterionForJDBCTime("set_intime in", values, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("set_intime not in", values, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("set_intime between", value1, value2, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetIntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("set_intime not between", value1, value2, "setIntime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeIsNull() {
            addCriterion("set_outtime is null");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeIsNotNull() {
            addCriterion("set_outtime is not null");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeEqualTo(Date value) {
            addCriterionForJDBCTime("set_outtime =", value, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("set_outtime <>", value, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("set_outtime >", value, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("set_outtime >=", value, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeLessThan(Date value) {
            addCriterionForJDBCTime("set_outtime <", value, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("set_outtime <=", value, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeIn(List<Date> values) {
            addCriterionForJDBCTime("set_outtime in", values, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("set_outtime not in", values, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("set_outtime between", value1, value2, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andSetOuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("set_outtime not between", value1, value2, "setOuttime");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterionForJDBCTime("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterionForJDBCTime("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterionForJDBCTime("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Date value) {
            addCriterionForJDBCTime("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Date value) {
            addCriterionForJDBCTime("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Date> values) {
            addCriterionForJDBCTime("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andInImgIsNull() {
            addCriterion("in_img is null");
            return (Criteria) this;
        }

        public Criteria andInImgIsNotNull() {
            addCriterion("in_img is not null");
            return (Criteria) this;
        }

        public Criteria andInImgEqualTo(String value) {
            addCriterion("in_img =", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgNotEqualTo(String value) {
            addCriterion("in_img <>", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgGreaterThan(String value) {
            addCriterion("in_img >", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgGreaterThanOrEqualTo(String value) {
            addCriterion("in_img >=", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgLessThan(String value) {
            addCriterion("in_img <", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgLessThanOrEqualTo(String value) {
            addCriterion("in_img <=", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgLike(String value) {
            addCriterion("in_img like", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgNotLike(String value) {
            addCriterion("in_img not like", value, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgIn(List<String> values) {
            addCriterion("in_img in", values, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgNotIn(List<String> values) {
            addCriterion("in_img not in", values, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgBetween(String value1, String value2) {
            addCriterion("in_img between", value1, value2, "inImg");
            return (Criteria) this;
        }

        public Criteria andInImgNotBetween(String value1, String value2) {
            addCriterion("in_img not between", value1, value2, "inImg");
            return (Criteria) this;
        }

        public Criteria andOutImgIsNull() {
            addCriterion("out_img is null");
            return (Criteria) this;
        }

        public Criteria andOutImgIsNotNull() {
            addCriterion("out_img is not null");
            return (Criteria) this;
        }

        public Criteria andOutImgEqualTo(String value) {
            addCriterion("out_img =", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgNotEqualTo(String value) {
            addCriterion("out_img <>", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgGreaterThan(String value) {
            addCriterion("out_img >", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgGreaterThanOrEqualTo(String value) {
            addCriterion("out_img >=", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgLessThan(String value) {
            addCriterion("out_img <", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgLessThanOrEqualTo(String value) {
            addCriterion("out_img <=", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgLike(String value) {
            addCriterion("out_img like", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgNotLike(String value) {
            addCriterion("out_img not like", value, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgIn(List<String> values) {
            addCriterion("out_img in", values, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgNotIn(List<String> values) {
            addCriterion("out_img not in", values, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgBetween(String value1, String value2) {
            addCriterion("out_img between", value1, value2, "outImg");
            return (Criteria) this;
        }

        public Criteria andOutImgNotBetween(String value1, String value2) {
            addCriterion("out_img not between", value1, value2, "outImg");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}