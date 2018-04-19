package com.yinda.nbminer.model;

import java.util.ArrayList;
import java.util.List;

public class UlDcchNbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UlDcchNbExample() {
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

        public Criteria andPktVersionIsNull() {
            addCriterion("pkt_version is null");
            return (Criteria) this;
        }

        public Criteria andPktVersionIsNotNull() {
            addCriterion("pkt_version is not null");
            return (Criteria) this;
        }

        public Criteria andPktVersionEqualTo(String value) {
            addCriterion("pkt_version =", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionNotEqualTo(String value) {
            addCriterion("pkt_version <>", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionGreaterThan(String value) {
            addCriterion("pkt_version >", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionGreaterThanOrEqualTo(String value) {
            addCriterion("pkt_version >=", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionLessThan(String value) {
            addCriterion("pkt_version <", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionLessThanOrEqualTo(String value) {
            addCriterion("pkt_version <=", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionLike(String value) {
            addCriterion("pkt_version like", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionNotLike(String value) {
            addCriterion("pkt_version not like", value, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionIn(List<String> values) {
            addCriterion("pkt_version in", values, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionNotIn(List<String> values) {
            addCriterion("pkt_version not in", values, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionBetween(String value1, String value2) {
            addCriterion("pkt_version between", value1, value2, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andPktVersionNotBetween(String value1, String value2) {
            addCriterion("pkt_version not between", value1, value2, "pktVersion");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorIsNull() {
            addCriterion("rrc_release_number-major-minor is null");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorIsNotNull() {
            addCriterion("rrc_release_number-major-minor is not null");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorEqualTo(String value) {
            addCriterion("rrc_release_number-major-minor =", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorNotEqualTo(String value) {
            addCriterion("rrc_release_number-major-minor <>", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorGreaterThan(String value) {
            addCriterion("rrc_release_number-major-minor >", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorGreaterThanOrEqualTo(String value) {
            addCriterion("rrc_release_number-major-minor >=", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorLessThan(String value) {
            addCriterion("rrc_release_number-major-minor <", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorLessThanOrEqualTo(String value) {
            addCriterion("rrc_release_number-major-minor <=", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorLike(String value) {
            addCriterion("rrc_release_number-major-minor like", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorNotLike(String value) {
            addCriterion("rrc_release_number-major-minor not like", value, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorIn(List<String> values) {
            addCriterion("rrc_release_number-major-minor in", values, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorNotIn(List<String> values) {
            addCriterion("rrc_release_number-major-minor not in", values, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorBetween(String value1, String value2) {
            addCriterion("rrc_release_number-major-minor between", value1, value2, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRrcReleaseNumberMajorMinorNotBetween(String value1, String value2) {
            addCriterion("rrc_release_number-major-minor not between", value1, value2, "rrcReleaseNumberMajorMinor");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdIsNull() {
            addCriterion("radio_bearer_id is null");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdIsNotNull() {
            addCriterion("radio_bearer_id is not null");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdEqualTo(String value) {
            addCriterion("radio_bearer_id =", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdNotEqualTo(String value) {
            addCriterion("radio_bearer_id <>", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdGreaterThan(String value) {
            addCriterion("radio_bearer_id >", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdGreaterThanOrEqualTo(String value) {
            addCriterion("radio_bearer_id >=", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdLessThan(String value) {
            addCriterion("radio_bearer_id <", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdLessThanOrEqualTo(String value) {
            addCriterion("radio_bearer_id <=", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdLike(String value) {
            addCriterion("radio_bearer_id like", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdNotLike(String value) {
            addCriterion("radio_bearer_id not like", value, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdIn(List<String> values) {
            addCriterion("radio_bearer_id in", values, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdNotIn(List<String> values) {
            addCriterion("radio_bearer_id not in", values, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdBetween(String value1, String value2) {
            addCriterion("radio_bearer_id between", value1, value2, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andRadioBearerIdNotBetween(String value1, String value2) {
            addCriterion("radio_bearer_id not between", value1, value2, "radioBearerId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdIsNull() {
            addCriterion("physical_cell_id is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdIsNotNull() {
            addCriterion("physical_cell_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdEqualTo(String value) {
            addCriterion("physical_cell_id =", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdNotEqualTo(String value) {
            addCriterion("physical_cell_id <>", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdGreaterThan(String value) {
            addCriterion("physical_cell_id >", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdGreaterThanOrEqualTo(String value) {
            addCriterion("physical_cell_id >=", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdLessThan(String value) {
            addCriterion("physical_cell_id <", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdLessThanOrEqualTo(String value) {
            addCriterion("physical_cell_id <=", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdLike(String value) {
            addCriterion("physical_cell_id like", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdNotLike(String value) {
            addCriterion("physical_cell_id not like", value, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdIn(List<String> values) {
            addCriterion("physical_cell_id in", values, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdNotIn(List<String> values) {
            addCriterion("physical_cell_id not in", values, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdBetween(String value1, String value2) {
            addCriterion("physical_cell_id between", value1, value2, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andPhysicalCellIdNotBetween(String value1, String value2) {
            addCriterion("physical_cell_id not between", value1, value2, "physicalCellId");
            return (Criteria) this;
        }

        public Criteria andFreqIsNull() {
            addCriterion("freq is null");
            return (Criteria) this;
        }

        public Criteria andFreqIsNotNull() {
            addCriterion("freq is not null");
            return (Criteria) this;
        }

        public Criteria andFreqEqualTo(String value) {
            addCriterion("freq =", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotEqualTo(String value) {
            addCriterion("freq <>", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThan(String value) {
            addCriterion("freq >", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThanOrEqualTo(String value) {
            addCriterion("freq >=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThan(String value) {
            addCriterion("freq <", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThanOrEqualTo(String value) {
            addCriterion("freq <=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLike(String value) {
            addCriterion("freq like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotLike(String value) {
            addCriterion("freq not like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqIn(List<String> values) {
            addCriterion("freq in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotIn(List<String> values) {
            addCriterion("freq not in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqBetween(String value1, String value2) {
            addCriterion("freq between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotBetween(String value1, String value2) {
            addCriterion("freq not between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andSysframenumIsNull() {
            addCriterion("sysframenum is null");
            return (Criteria) this;
        }

        public Criteria andSysframenumIsNotNull() {
            addCriterion("sysframenum is not null");
            return (Criteria) this;
        }

        public Criteria andSysframenumEqualTo(String value) {
            addCriterion("sysframenum =", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumNotEqualTo(String value) {
            addCriterion("sysframenum <>", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumGreaterThan(String value) {
            addCriterion("sysframenum >", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumGreaterThanOrEqualTo(String value) {
            addCriterion("sysframenum >=", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumLessThan(String value) {
            addCriterion("sysframenum <", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumLessThanOrEqualTo(String value) {
            addCriterion("sysframenum <=", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumLike(String value) {
            addCriterion("sysframenum like", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumNotLike(String value) {
            addCriterion("sysframenum not like", value, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumIn(List<String> values) {
            addCriterion("sysframenum in", values, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumNotIn(List<String> values) {
            addCriterion("sysframenum not in", values, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumBetween(String value1, String value2) {
            addCriterion("sysframenum between", value1, value2, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSysframenumNotBetween(String value1, String value2) {
            addCriterion("sysframenum not between", value1, value2, "sysframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumIsNull() {
            addCriterion("subframenum is null");
            return (Criteria) this;
        }

        public Criteria andSubframenumIsNotNull() {
            addCriterion("subframenum is not null");
            return (Criteria) this;
        }

        public Criteria andSubframenumEqualTo(String value) {
            addCriterion("subframenum =", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumNotEqualTo(String value) {
            addCriterion("subframenum <>", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumGreaterThan(String value) {
            addCriterion("subframenum >", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumGreaterThanOrEqualTo(String value) {
            addCriterion("subframenum >=", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumLessThan(String value) {
            addCriterion("subframenum <", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumLessThanOrEqualTo(String value) {
            addCriterion("subframenum <=", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumLike(String value) {
            addCriterion("subframenum like", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumNotLike(String value) {
            addCriterion("subframenum not like", value, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumIn(List<String> values) {
            addCriterion("subframenum in", values, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumNotIn(List<String> values) {
            addCriterion("subframenum not in", values, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumBetween(String value1, String value2) {
            addCriterion("subframenum between", value1, value2, "subframenum");
            return (Criteria) this;
        }

        public Criteria andSubframenumNotBetween(String value1, String value2) {
            addCriterion("subframenum not between", value1, value2, "subframenum");
            return (Criteria) this;
        }

        public Criteria andPduNumberIsNull() {
            addCriterion("pdu_number is null");
            return (Criteria) this;
        }

        public Criteria andPduNumberIsNotNull() {
            addCriterion("pdu_number is not null");
            return (Criteria) this;
        }

        public Criteria andPduNumberEqualTo(String value) {
            addCriterion("pdu_number =", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberNotEqualTo(String value) {
            addCriterion("pdu_number <>", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberGreaterThan(String value) {
            addCriterion("pdu_number >", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pdu_number >=", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberLessThan(String value) {
            addCriterion("pdu_number <", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberLessThanOrEqualTo(String value) {
            addCriterion("pdu_number <=", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberLike(String value) {
            addCriterion("pdu_number like", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberNotLike(String value) {
            addCriterion("pdu_number not like", value, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberIn(List<String> values) {
            addCriterion("pdu_number in", values, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberNotIn(List<String> values) {
            addCriterion("pdu_number not in", values, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberBetween(String value1, String value2) {
            addCriterion("pdu_number between", value1, value2, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andPduNumberNotBetween(String value1, String value2) {
            addCriterion("pdu_number not between", value1, value2, "pduNumber");
            return (Criteria) this;
        }

        public Criteria andMsgLengthIsNull() {
            addCriterion("msg_length is null");
            return (Criteria) this;
        }

        public Criteria andMsgLengthIsNotNull() {
            addCriterion("msg_length is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLengthEqualTo(String value) {
            addCriterion("msg_length =", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthNotEqualTo(String value) {
            addCriterion("msg_length <>", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthGreaterThan(String value) {
            addCriterion("msg_length >", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthGreaterThanOrEqualTo(String value) {
            addCriterion("msg_length >=", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthLessThan(String value) {
            addCriterion("msg_length <", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthLessThanOrEqualTo(String value) {
            addCriterion("msg_length <=", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthLike(String value) {
            addCriterion("msg_length like", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthNotLike(String value) {
            addCriterion("msg_length not like", value, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthIn(List<String> values) {
            addCriterion("msg_length in", values, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthNotIn(List<String> values) {
            addCriterion("msg_length not in", values, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthBetween(String value1, String value2) {
            addCriterion("msg_length between", value1, value2, "msgLength");
            return (Criteria) this;
        }

        public Criteria andMsgLengthNotBetween(String value1, String value2) {
            addCriterion("msg_length not between", value1, value2, "msgLength");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiIsNull() {
            addCriterion("sib_mask_in_si is null");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiIsNotNull() {
            addCriterion("sib_mask_in_si is not null");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiEqualTo(String value) {
            addCriterion("sib_mask_in_si =", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiNotEqualTo(String value) {
            addCriterion("sib_mask_in_si <>", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiGreaterThan(String value) {
            addCriterion("sib_mask_in_si >", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiGreaterThanOrEqualTo(String value) {
            addCriterion("sib_mask_in_si >=", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiLessThan(String value) {
            addCriterion("sib_mask_in_si <", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiLessThanOrEqualTo(String value) {
            addCriterion("sib_mask_in_si <=", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiLike(String value) {
            addCriterion("sib_mask_in_si like", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiNotLike(String value) {
            addCriterion("sib_mask_in_si not like", value, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiIn(List<String> values) {
            addCriterion("sib_mask_in_si in", values, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiNotIn(List<String> values) {
            addCriterion("sib_mask_in_si not in", values, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiBetween(String value1, String value2) {
            addCriterion("sib_mask_in_si between", value1, value2, "sibMaskInSi");
            return (Criteria) this;
        }

        public Criteria andSibMaskInSiNotBetween(String value1, String value2) {
            addCriterion("sib_mask_in_si not between", value1, value2, "sibMaskInSi");
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