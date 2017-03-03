package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tb_student_detectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_student_detectionExample() {
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

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andStateTypeIsNull() {
            addCriterion("state_type is null");
            return (Criteria) this;
        }

        public Criteria andStateTypeIsNotNull() {
            addCriterion("state_type is not null");
            return (Criteria) this;
        }

        public Criteria andStateTypeEqualTo(Integer value) {
            addCriterion("state_type =", value, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeNotEqualTo(Integer value) {
            addCriterion("state_type <>", value, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeGreaterThan(Integer value) {
            addCriterion("state_type >", value, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_type >=", value, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeLessThan(Integer value) {
            addCriterion("state_type <", value, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("state_type <=", value, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeIn(List<Integer> values) {
            addCriterion("state_type in", values, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeNotIn(List<Integer> values) {
            addCriterion("state_type not in", values, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeBetween(Integer value1, Integer value2) {
            addCriterion("state_type between", value1, value2, "stateType");
            return (Criteria) this;
        }

        public Criteria andStateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("state_type not between", value1, value2, "stateType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeIsNull() {
            addCriterion("recognition_type is null");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeIsNotNull() {
            addCriterion("recognition_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeEqualTo(Integer value) {
            addCriterion("recognition_type =", value, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeNotEqualTo(Integer value) {
            addCriterion("recognition_type <>", value, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeGreaterThan(Integer value) {
            addCriterion("recognition_type >", value, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recognition_type >=", value, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeLessThan(Integer value) {
            addCriterion("recognition_type <", value, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recognition_type <=", value, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeIn(List<Integer> values) {
            addCriterion("recognition_type in", values, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeNotIn(List<Integer> values) {
            addCriterion("recognition_type not in", values, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeBetween(Integer value1, Integer value2) {
            addCriterion("recognition_type between", value1, value2, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andRecognitionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recognition_type not between", value1, value2, "recognitionType");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureIsNull() {
            addCriterion("env_temperature is null");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureIsNotNull() {
            addCriterion("env_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureEqualTo(Float value) {
            addCriterion("env_temperature =", value, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureNotEqualTo(Float value) {
            addCriterion("env_temperature <>", value, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureGreaterThan(Float value) {
            addCriterion("env_temperature >", value, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("env_temperature >=", value, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureLessThan(Float value) {
            addCriterion("env_temperature <", value, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("env_temperature <=", value, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureIn(List<Float> values) {
            addCriterion("env_temperature in", values, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureNotIn(List<Float> values) {
            addCriterion("env_temperature not in", values, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureBetween(Float value1, Float value2) {
            addCriterion("env_temperature between", value1, value2, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andEnvTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("env_temperature not between", value1, value2, "envTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureIsNull() {
            addCriterion("raw_temperature is null");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureIsNotNull() {
            addCriterion("raw_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureEqualTo(Float value) {
            addCriterion("raw_temperature =", value, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureNotEqualTo(Float value) {
            addCriterion("raw_temperature <>", value, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureGreaterThan(Float value) {
            addCriterion("raw_temperature >", value, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("raw_temperature >=", value, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureLessThan(Float value) {
            addCriterion("raw_temperature <", value, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("raw_temperature <=", value, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureIn(List<Float> values) {
            addCriterion("raw_temperature in", values, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureNotIn(List<Float> values) {
            addCriterion("raw_temperature not in", values, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureBetween(Float value1, Float value2) {
            addCriterion("raw_temperature between", value1, value2, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andRawTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("raw_temperature not between", value1, value2, "rawTemperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdIsNull() {
            addCriterion("temperature_threshold is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdIsNotNull() {
            addCriterion("temperature_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdEqualTo(Float value) {
            addCriterion("temperature_threshold =", value, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdNotEqualTo(Float value) {
            addCriterion("temperature_threshold <>", value, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdGreaterThan(Float value) {
            addCriterion("temperature_threshold >", value, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdGreaterThanOrEqualTo(Float value) {
            addCriterion("temperature_threshold >=", value, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdLessThan(Float value) {
            addCriterion("temperature_threshold <", value, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdLessThanOrEqualTo(Float value) {
            addCriterion("temperature_threshold <=", value, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdIn(List<Float> values) {
            addCriterion("temperature_threshold in", values, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdNotIn(List<Float> values) {
            addCriterion("temperature_threshold not in", values, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdBetween(Float value1, Float value2) {
            addCriterion("temperature_threshold between", value1, value2, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andTemperatureThresholdNotBetween(Float value1, Float value2) {
            addCriterion("temperature_threshold not between", value1, value2, "temperatureThreshold");
            return (Criteria) this;
        }

        public Criteria andFirstIsNull() {
            addCriterion("first is null");
            return (Criteria) this;
        }

        public Criteria andFirstIsNotNull() {
            addCriterion("first is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEqualTo(Byte value) {
            addCriterion("first =", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotEqualTo(Byte value) {
            addCriterion("first <>", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThan(Byte value) {
            addCriterion("first >", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThanOrEqualTo(Byte value) {
            addCriterion("first >=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThan(Byte value) {
            addCriterion("first <", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThanOrEqualTo(Byte value) {
            addCriterion("first <=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstIn(List<Byte> values) {
            addCriterion("first in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotIn(List<Byte> values) {
            addCriterion("first not in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstBetween(Byte value1, Byte value2) {
            addCriterion("first between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotBetween(Byte value1, Byte value2) {
            addCriterion("first not between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andLastestIsNull() {
            addCriterion("lastest is null");
            return (Criteria) this;
        }

        public Criteria andLastestIsNotNull() {
            addCriterion("lastest is not null");
            return (Criteria) this;
        }

        public Criteria andLastestEqualTo(Byte value) {
            addCriterion("lastest =", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotEqualTo(Byte value) {
            addCriterion("lastest <>", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestGreaterThan(Byte value) {
            addCriterion("lastest >", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestGreaterThanOrEqualTo(Byte value) {
            addCriterion("lastest >=", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestLessThan(Byte value) {
            addCriterion("lastest <", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestLessThanOrEqualTo(Byte value) {
            addCriterion("lastest <=", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestIn(List<Byte> values) {
            addCriterion("lastest in", values, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotIn(List<Byte> values) {
            addCriterion("lastest not in", values, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestBetween(Byte value1, Byte value2) {
            addCriterion("lastest between", value1, value2, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotBetween(Byte value1, Byte value2) {
            addCriterion("lastest not between", value1, value2, "lastest");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdIsNull() {
            addCriterion("terminal_img_id is null");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdIsNotNull() {
            addCriterion("terminal_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdEqualTo(String value) {
            addCriterion("terminal_img_id =", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdNotEqualTo(String value) {
            addCriterion("terminal_img_id <>", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdGreaterThan(String value) {
            addCriterion("terminal_img_id >", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_img_id >=", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdLessThan(String value) {
            addCriterion("terminal_img_id <", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdLessThanOrEqualTo(String value) {
            addCriterion("terminal_img_id <=", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdLike(String value) {
            addCriterion("terminal_img_id like", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdNotLike(String value) {
            addCriterion("terminal_img_id not like", value, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdIn(List<String> values) {
            addCriterion("terminal_img_id in", values, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdNotIn(List<String> values) {
            addCriterion("terminal_img_id not in", values, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdBetween(String value1, String value2) {
            addCriterion("terminal_img_id between", value1, value2, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIdNotBetween(String value1, String value2) {
            addCriterion("terminal_img_id not between", value1, value2, "terminalImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdIsNull() {
            addCriterion("file_img_id is null");
            return (Criteria) this;
        }

        public Criteria andFileImgIdIsNotNull() {
            addCriterion("file_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileImgIdEqualTo(Integer value) {
            addCriterion("file_img_id =", value, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdNotEqualTo(Integer value) {
            addCriterion("file_img_id <>", value, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdGreaterThan(Integer value) {
            addCriterion("file_img_id >", value, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_img_id >=", value, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdLessThan(Integer value) {
            addCriterion("file_img_id <", value, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_img_id <=", value, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdIn(List<Integer> values) {
            addCriterion("file_img_id in", values, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdNotIn(List<Integer> values) {
            addCriterion("file_img_id not in", values, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdBetween(Integer value1, Integer value2) {
            addCriterion("file_img_id between", value1, value2, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andFileImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_img_id not between", value1, value2, "fileImgId");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlIsNull() {
            addCriterion("org_img_url is null");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlIsNotNull() {
            addCriterion("org_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlEqualTo(String value) {
            addCriterion("org_img_url =", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlNotEqualTo(String value) {
            addCriterion("org_img_url <>", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlGreaterThan(String value) {
            addCriterion("org_img_url >", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("org_img_url >=", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlLessThan(String value) {
            addCriterion("org_img_url <", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlLessThanOrEqualTo(String value) {
            addCriterion("org_img_url <=", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlLike(String value) {
            addCriterion("org_img_url like", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlNotLike(String value) {
            addCriterion("org_img_url not like", value, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlIn(List<String> values) {
            addCriterion("org_img_url in", values, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlNotIn(List<String> values) {
            addCriterion("org_img_url not in", values, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlBetween(String value1, String value2) {
            addCriterion("org_img_url between", value1, value2, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andOrgImgUrlNotBetween(String value1, String value2) {
            addCriterion("org_img_url not between", value1, value2, "orgImgUrl");
            return (Criteria) this;
        }

        public Criteria andWeichatNumIsNull() {
            addCriterion("weichat_num is null");
            return (Criteria) this;
        }

        public Criteria andWeichatNumIsNotNull() {
            addCriterion("weichat_num is not null");
            return (Criteria) this;
        }

        public Criteria andWeichatNumEqualTo(Integer value) {
            addCriterion("weichat_num =", value, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumNotEqualTo(Integer value) {
            addCriterion("weichat_num <>", value, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumGreaterThan(Integer value) {
            addCriterion("weichat_num >", value, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("weichat_num >=", value, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumLessThan(Integer value) {
            addCriterion("weichat_num <", value, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumLessThanOrEqualTo(Integer value) {
            addCriterion("weichat_num <=", value, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumIn(List<Integer> values) {
            addCriterion("weichat_num in", values, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumNotIn(List<Integer> values) {
            addCriterion("weichat_num not in", values, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumBetween(Integer value1, Integer value2) {
            addCriterion("weichat_num between", value1, value2, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andWeichatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("weichat_num not between", value1, value2, "weichatNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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