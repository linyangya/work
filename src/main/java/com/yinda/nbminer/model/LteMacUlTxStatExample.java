package com.yinda.nbminer.model;

import java.util.ArrayList;
import java.util.List;

public class LteMacUlTxStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LteMacUlTxStatExample() {
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

        public Criteria andNumberOfSubpacketsIsNull() {
            addCriterion("number_of_subpackets is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsIsNotNull() {
            addCriterion("number_of_subpackets is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsEqualTo(String value) {
            addCriterion("number_of_subpackets =", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsNotEqualTo(String value) {
            addCriterion("number_of_subpackets <>", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsGreaterThan(String value) {
            addCriterion("number_of_subpackets >", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsGreaterThanOrEqualTo(String value) {
            addCriterion("number_of_subpackets >=", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsLessThan(String value) {
            addCriterion("number_of_subpackets <", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsLessThanOrEqualTo(String value) {
            addCriterion("number_of_subpackets <=", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsLike(String value) {
            addCriterion("number_of_subpackets like", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsNotLike(String value) {
            addCriterion("number_of_subpackets not like", value, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsIn(List<String> values) {
            addCriterion("number_of_subpackets in", values, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsNotIn(List<String> values) {
            addCriterion("number_of_subpackets not in", values, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsBetween(String value1, String value2) {
            addCriterion("number_of_subpackets between", value1, value2, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andNumberOfSubpacketsNotBetween(String value1, String value2) {
            addCriterion("number_of_subpackets not between", value1, value2, "numberOfSubpackets");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdIsNull() {
            addCriterion("subpackets_structure0_subpacket_id is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_id =", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_id <>", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_id >", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_id >=", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_id <", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_id <=", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdLike(String value) {
            addCriterion("subpackets_structure0_subpacket_id like", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_id not like", value, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_id in", values, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_id not in", values, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_id between", value1, value2, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketIdNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_id not between", value1, value2, "subpacketsStructure0SubpacketId");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeIsNull() {
            addCriterion("subpackets_structure0_subpacket_subpacket_size is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_subpacket_size is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size =", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size <>", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size >", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size >=", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size <", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size <=", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeLike(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size like", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size not like", value, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size in", values, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size not in", values, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size between", value1, value2, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketSubpacketSizeNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_subpacket_size not between", value1, value2, "subpacketsStructure0SubpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples =", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples <>", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples >", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples >=", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples <", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples <=", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples like", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples not like", value, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples in", values, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples not in", values, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples between", value1, value2, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfSamplesNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_samples not between", value1, value2, "subpacketsStructure0SubpacketUTSV1NumberOfSamples");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr =", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr <>", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr >", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr >=", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr <", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr <=", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr like", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr not like", value, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr in", values, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr not in", values, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr between", value1, value2, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfPaddingBsrNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_padding_bsr not between", value1, value2, "subpacketsStructure0SubpacketUTSV1NumberOfPaddingBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr =", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr <>", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr >", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr >=", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr <", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr <=", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr like", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr not like", value, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr in", values, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr not in", values, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr between", value1, value2, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfRegularBsrNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_regular_bsr not between", value1, value2, "subpacketsStructure0SubpacketUTSV1numberOfRegularBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr =", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr <>", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr >", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr >=", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr <", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr <=", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr like", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr not like", value, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr in", values, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr not in", values, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr between", value1, value2, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1numberOfPeriodicBsrNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1number_of_periodic_bsr not between", value1, value2, "subpacketsStructure0SubpacketUTSV1numberOfPeriodicBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr =", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr <>", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr >", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr >=", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr <", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr <=", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr like", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr not like", value, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr in", values, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr not in", values, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr between", value1, value2, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1NumberOfCancelBsrNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_number_of_cancel_bsr not between", value1, value2, "subpacketsStructure0SubpacketUTSV1NumberOfCancelBsr");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received =", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received <>", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received >", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received >=", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received <", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received <=", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received like", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received not like", value, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received in", values, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received not in", values, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received between", value1, value2, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantReceivedNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_received not between", value1, value2, "subpacketsStructure0SubpacketUTSV1GrantReceived");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedIsNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedIsNotNull() {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized =", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedNotEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized <>", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedGreaterThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized >", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedGreaterThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized >=", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedLessThan(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized <", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedLessThanOrEqualTo(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized <=", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized like", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedNotLike(String value) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized not like", value, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized in", values, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedNotIn(List<String> values) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized not in", values, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized between", value1, value2, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
            return (Criteria) this;
        }

        public Criteria andSubpacketsStructure0SubpacketUTSV1GrantUtilizedNotBetween(String value1, String value2) {
            addCriterion("subpackets_structure0_subpacket_u_t_s_v1_grant_utilized not between", value1, value2, "subpacketsStructure0SubpacketUTSV1GrantUtilized");
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