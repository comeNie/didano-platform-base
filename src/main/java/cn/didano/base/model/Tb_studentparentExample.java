package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tb_studentparentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_studentparentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRfidIsNull() {
            addCriterion("rfid is null");
            return (Criteria) this;
        }

        public Criteria andRfidIsNotNull() {
            addCriterion("rfid is not null");
            return (Criteria) this;
        }

        public Criteria andRfidEqualTo(String value) {
            addCriterion("rfid =", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotEqualTo(String value) {
            addCriterion("rfid <>", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidGreaterThan(String value) {
            addCriterion("rfid >", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidGreaterThanOrEqualTo(String value) {
            addCriterion("rfid >=", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLessThan(String value) {
            addCriterion("rfid <", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLessThanOrEqualTo(String value) {
            addCriterion("rfid <=", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLike(String value) {
            addCriterion("rfid like", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotLike(String value) {
            addCriterion("rfid not like", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidIn(List<String> values) {
            addCriterion("rfid in", values, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotIn(List<String> values) {
            addCriterion("rfid not in", values, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidBetween(String value1, String value2) {
            addCriterion("rfid between", value1, value2, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotBetween(String value1, String value2) {
            addCriterion("rfid not between", value1, value2, "rfid");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(Byte value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(Byte value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(Byte value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(Byte value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Byte value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<Byte> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<Byte> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(Byte value1, Byte value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(Byte value1, Byte value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationTitleIsNull() {
            addCriterion("relation_title is null");
            return (Criteria) this;
        }

        public Criteria andRelationTitleIsNotNull() {
            addCriterion("relation_title is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTitleEqualTo(String value) {
            addCriterion("relation_title =", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleNotEqualTo(String value) {
            addCriterion("relation_title <>", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleGreaterThan(String value) {
            addCriterion("relation_title >", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("relation_title >=", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleLessThan(String value) {
            addCriterion("relation_title <", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleLessThanOrEqualTo(String value) {
            addCriterion("relation_title <=", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleLike(String value) {
            addCriterion("relation_title like", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleNotLike(String value) {
            addCriterion("relation_title not like", value, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleIn(List<String> values) {
            addCriterion("relation_title in", values, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleNotIn(List<String> values) {
            addCriterion("relation_title not in", values, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleBetween(String value1, String value2) {
            addCriterion("relation_title between", value1, value2, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andRelationTitleNotBetween(String value1, String value2) {
            addCriterion("relation_title not between", value1, value2, "relationTitle");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("qrcode_url is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("qrcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("qrcode_url =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("qrcode_url <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("qrcode_url >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_url >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("qrcode_url <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qrcode_url <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("qrcode_url like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("qrcode_url not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("qrcode_url in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("qrcode_url not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("qrcode_url between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("qrcode_url not between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyIsNull() {
            addCriterion("qrcode_school_key is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyIsNotNull() {
            addCriterion("qrcode_school_key is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyEqualTo(String value) {
            addCriterion("qrcode_school_key =", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyNotEqualTo(String value) {
            addCriterion("qrcode_school_key <>", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyGreaterThan(String value) {
            addCriterion("qrcode_school_key >", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_school_key >=", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyLessThan(String value) {
            addCriterion("qrcode_school_key <", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyLessThanOrEqualTo(String value) {
            addCriterion("qrcode_school_key <=", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyLike(String value) {
            addCriterion("qrcode_school_key like", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyNotLike(String value) {
            addCriterion("qrcode_school_key not like", value, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyIn(List<String> values) {
            addCriterion("qrcode_school_key in", values, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyNotIn(List<String> values) {
            addCriterion("qrcode_school_key not in", values, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyBetween(String value1, String value2) {
            addCriterion("qrcode_school_key between", value1, value2, "qrcodeSchoolKey");
            return (Criteria) this;
        }

        public Criteria andQrcodeSchoolKeyNotBetween(String value1, String value2) {
            addCriterion("qrcode_school_key not between", value1, value2, "qrcodeSchoolKey");
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