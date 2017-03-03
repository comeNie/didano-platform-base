package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tb_benchmarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_benchmarkExample() {
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHeight1IsNull() {
            addCriterion("height1 is null");
            return (Criteria) this;
        }

        public Criteria andHeight1IsNotNull() {
            addCriterion("height1 is not null");
            return (Criteria) this;
        }

        public Criteria andHeight1EqualTo(Double value) {
            addCriterion("height1 =", value, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1NotEqualTo(Double value) {
            addCriterion("height1 <>", value, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1GreaterThan(Double value) {
            addCriterion("height1 >", value, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1GreaterThanOrEqualTo(Double value) {
            addCriterion("height1 >=", value, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1LessThan(Double value) {
            addCriterion("height1 <", value, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1LessThanOrEqualTo(Double value) {
            addCriterion("height1 <=", value, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1In(List<Double> values) {
            addCriterion("height1 in", values, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1NotIn(List<Double> values) {
            addCriterion("height1 not in", values, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1Between(Double value1, Double value2) {
            addCriterion("height1 between", value1, value2, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight1NotBetween(Double value1, Double value2) {
            addCriterion("height1 not between", value1, value2, "height1");
            return (Criteria) this;
        }

        public Criteria andHeight2IsNull() {
            addCriterion("height2 is null");
            return (Criteria) this;
        }

        public Criteria andHeight2IsNotNull() {
            addCriterion("height2 is not null");
            return (Criteria) this;
        }

        public Criteria andHeight2EqualTo(Double value) {
            addCriterion("height2 =", value, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2NotEqualTo(Double value) {
            addCriterion("height2 <>", value, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2GreaterThan(Double value) {
            addCriterion("height2 >", value, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2GreaterThanOrEqualTo(Double value) {
            addCriterion("height2 >=", value, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2LessThan(Double value) {
            addCriterion("height2 <", value, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2LessThanOrEqualTo(Double value) {
            addCriterion("height2 <=", value, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2In(List<Double> values) {
            addCriterion("height2 in", values, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2NotIn(List<Double> values) {
            addCriterion("height2 not in", values, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2Between(Double value1, Double value2) {
            addCriterion("height2 between", value1, value2, "height2");
            return (Criteria) this;
        }

        public Criteria andHeight2NotBetween(Double value1, Double value2) {
            addCriterion("height2 not between", value1, value2, "height2");
            return (Criteria) this;
        }

        public Criteria andWeight1IsNull() {
            addCriterion("weight1 is null");
            return (Criteria) this;
        }

        public Criteria andWeight1IsNotNull() {
            addCriterion("weight1 is not null");
            return (Criteria) this;
        }

        public Criteria andWeight1EqualTo(Double value) {
            addCriterion("weight1 =", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1NotEqualTo(Double value) {
            addCriterion("weight1 <>", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1GreaterThan(Double value) {
            addCriterion("weight1 >", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1GreaterThanOrEqualTo(Double value) {
            addCriterion("weight1 >=", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1LessThan(Double value) {
            addCriterion("weight1 <", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1LessThanOrEqualTo(Double value) {
            addCriterion("weight1 <=", value, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1In(List<Double> values) {
            addCriterion("weight1 in", values, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1NotIn(List<Double> values) {
            addCriterion("weight1 not in", values, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1Between(Double value1, Double value2) {
            addCriterion("weight1 between", value1, value2, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight1NotBetween(Double value1, Double value2) {
            addCriterion("weight1 not between", value1, value2, "weight1");
            return (Criteria) this;
        }

        public Criteria andWeight2IsNull() {
            addCriterion("weight2 is null");
            return (Criteria) this;
        }

        public Criteria andWeight2IsNotNull() {
            addCriterion("weight2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeight2EqualTo(Double value) {
            addCriterion("weight2 =", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotEqualTo(Double value) {
            addCriterion("weight2 <>", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2GreaterThan(Double value) {
            addCriterion("weight2 >", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2GreaterThanOrEqualTo(Double value) {
            addCriterion("weight2 >=", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2LessThan(Double value) {
            addCriterion("weight2 <", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2LessThanOrEqualTo(Double value) {
            addCriterion("weight2 <=", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2In(List<Double> values) {
            addCriterion("weight2 in", values, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotIn(List<Double> values) {
            addCriterion("weight2 not in", values, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2Between(Double value1, Double value2) {
            addCriterion("weight2 between", value1, value2, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotBetween(Double value1, Double value2) {
            addCriterion("weight2 not between", value1, value2, "weight2");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
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