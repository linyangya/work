package com.yinda.nbminer.model;

import java.util.ArrayList;
import java.util.List;

public class LteNasEsmBearerContextStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LteNasEsmBearerContextStateExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andBearerIdIsNull() {
            addCriterion("bearer_id is null");
            return (Criteria) this;
        }

        public Criteria andBearerIdIsNotNull() {
            addCriterion("bearer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBearerIdEqualTo(String value) {
            addCriterion("bearer_id =", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotEqualTo(String value) {
            addCriterion("bearer_id <>", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdGreaterThan(String value) {
            addCriterion("bearer_id >", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdGreaterThanOrEqualTo(String value) {
            addCriterion("bearer_id >=", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdLessThan(String value) {
            addCriterion("bearer_id <", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdLessThanOrEqualTo(String value) {
            addCriterion("bearer_id <=", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdLike(String value) {
            addCriterion("bearer_id like", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotLike(String value) {
            addCriterion("bearer_id not like", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdIn(List<String> values) {
            addCriterion("bearer_id in", values, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotIn(List<String> values) {
            addCriterion("bearer_id not in", values, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdBetween(String value1, String value2) {
            addCriterion("bearer_id between", value1, value2, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotBetween(String value1, String value2) {
            addCriterion("bearer_id not between", value1, value2, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerStateIsNull() {
            addCriterion("bearer_state is null");
            return (Criteria) this;
        }

        public Criteria andBearerStateIsNotNull() {
            addCriterion("bearer_state is not null");
            return (Criteria) this;
        }

        public Criteria andBearerStateEqualTo(String value) {
            addCriterion("bearer_state =", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateNotEqualTo(String value) {
            addCriterion("bearer_state <>", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateGreaterThan(String value) {
            addCriterion("bearer_state >", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateGreaterThanOrEqualTo(String value) {
            addCriterion("bearer_state >=", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateLessThan(String value) {
            addCriterion("bearer_state <", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateLessThanOrEqualTo(String value) {
            addCriterion("bearer_state <=", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateLike(String value) {
            addCriterion("bearer_state like", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateNotLike(String value) {
            addCriterion("bearer_state not like", value, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateIn(List<String> values) {
            addCriterion("bearer_state in", values, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateNotIn(List<String> values) {
            addCriterion("bearer_state not in", values, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateBetween(String value1, String value2) {
            addCriterion("bearer_state between", value1, value2, "bearerState");
            return (Criteria) this;
        }

        public Criteria andBearerStateNotBetween(String value1, String value2) {
            addCriterion("bearer_state not between", value1, value2, "bearerState");
            return (Criteria) this;
        }

        public Criteria andConnectionIdIsNull() {
            addCriterion("connection_id is null");
            return (Criteria) this;
        }

        public Criteria andConnectionIdIsNotNull() {
            addCriterion("connection_id is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionIdEqualTo(Integer value) {
            addCriterion("connection_id =", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdNotEqualTo(Integer value) {
            addCriterion("connection_id <>", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdGreaterThan(Integer value) {
            addCriterion("connection_id >", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("connection_id >=", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdLessThan(Integer value) {
            addCriterion("connection_id <", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("connection_id <=", value, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdIn(List<Integer> values) {
            addCriterion("connection_id in", values, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdNotIn(List<Integer> values) {
            addCriterion("connection_id not in", values, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdBetween(Integer value1, Integer value2) {
            addCriterion("connection_id between", value1, value2, "connectionId");
            return (Criteria) this;
        }

        public Criteria andConnectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("connection_id not between", value1, value2, "connectionId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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