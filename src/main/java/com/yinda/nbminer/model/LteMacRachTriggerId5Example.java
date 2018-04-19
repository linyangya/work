package com.yinda.nbminer.model;

import java.util.ArrayList;
import java.util.List;

public class LteMacRachTriggerId5Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LteMacRachTriggerId5Example() {
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

        public Criteria andSubpacketSubpacketSizeIsNull() {
            addCriterion("subpacket_subpacket_size is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeIsNotNull() {
            addCriterion("subpacket_subpacket_size is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeEqualTo(String value) {
            addCriterion("subpacket_subpacket_size =", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeNotEqualTo(String value) {
            addCriterion("subpacket_subpacket_size <>", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeGreaterThan(String value) {
            addCriterion("subpacket_subpacket_size >", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_subpacket_size >=", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeLessThan(String value) {
            addCriterion("subpacket_subpacket_size <", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeLessThanOrEqualTo(String value) {
            addCriterion("subpacket_subpacket_size <=", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeLike(String value) {
            addCriterion("subpacket_subpacket_size like", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeNotLike(String value) {
            addCriterion("subpacket_subpacket_size not like", value, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeIn(List<String> values) {
            addCriterion("subpacket_subpacket_size in", values, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeNotIn(List<String> values) {
            addCriterion("subpacket_subpacket_size not in", values, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeBetween(String value1, String value2) {
            addCriterion("subpacket_subpacket_size between", value1, value2, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketSubpacketSizeNotBetween(String value1, String value2) {
            addCriterion("subpacket_subpacket_size not between", value1, value2, "subpacketSubpacketSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonIsNull() {
            addCriterion("subpacket_rach_reason_v3_rach_reason is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_rach_reason is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason =", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason <>", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason >", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason >=", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason <", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason <=", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonLike(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason like", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_reason not like", value, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_rach_reason in", values, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_rach_reason not in", values, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_rach_reason between", value1, value2, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachReasonNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_rach_reason not between", value1, value2, "subpacketRachReasonV3RachReason");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionIsNull() {
            addCriterion("subpacket_rach_reason_v3_rach_contention is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_rach_contention is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention =", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention <>", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention >", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention >=", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention <", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention <=", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionLike(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention like", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_rach_contention not like", value, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_rach_contention in", values, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_rach_contention not in", values, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_rach_contention between", value1, value2, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RachContentionNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_rach_contention not between", value1, value2, "subpacketRachReasonV3RachContention");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdIsNull() {
            addCriterion("subpacket_rach_reason_v3_maching_id is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_maching_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id =", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id <>", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id >", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id >=", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id <", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id <=", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdLike(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id like", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_maching_id not like", value, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_maching_id in", values, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_maching_id not in", values, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_maching_id between", value1, value2, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MachingIdNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_maching_id not between", value1, value2, "subpacketRachReasonV3MachingId");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleIsNull() {
            addCriterion("subpacket_rach_reason_v3_preamble is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_preamble is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble =", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble <>", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble >", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble >=", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble <", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble <=", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleLike(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble like", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble not like", value, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_preamble in", values, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_preamble not in", values, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_preamble between", value1, value2, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_preamble not between", value1, value2, "subpacketRachReasonV3Preamble");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskIsNull() {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask =", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask <>", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask >", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask >=", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask <", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask <=", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskLike(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask like", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask not like", value, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask in", values, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask not in", values, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask between", value1, value2, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3PreambleRaMaskNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_preamble_ra_mask not between", value1, value2, "subpacketRachReasonV3PreambleRaMask");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeIsNull() {
            addCriterion("subpacket_rach_reason_v3_msg_size is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_msg_size is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size =", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size <>", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size >", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size >=", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size <", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size <=", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeLike(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size like", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_msg_size not like", value, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_msg_size in", values, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_msg_size not in", values, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_msg_size between", value1, value2, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3MsgSizeNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_msg_size not between", value1, value2, "subpacketRachReasonV3MsgSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelIsNull() {
            addCriterion("subpacket_rach_reason_v3_ge_level is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_ge_level is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level =", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level <>", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level >", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level >=", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level <", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level <=", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelLike(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level like", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_ge_level not like", value, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_ge_level in", values, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_ge_level not in", values, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_ge_level between", value1, value2, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3GeLevelNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_ge_level not between", value1, value2, "subpacketRachReasonV3GeLevel");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnIsNull() {
            addCriterion("subpacket_rach_reason_v3_radio_condn is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_radio_condn is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn =", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn <>", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn >", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn >=", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn <", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn <=", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnLike(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn like", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_radio_condn not like", value, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_radio_condn in", values, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_radio_condn not in", values, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_radio_condn between", value1, value2, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3RadioCondnNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_radio_condn not between", value1, value2, "subpacketRachReasonV3RadioCondn");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiIsNull() {
            addCriterion("subpacket_rach_reason_v3_crnti is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiIsNotNull() {
            addCriterion("subpacket_rach_reason_v3_crnti is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti =", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiNotEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti <>", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiGreaterThan(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti >", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti >=", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiLessThan(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti <", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti <=", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiLike(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti like", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiNotLike(String value) {
            addCriterion("subpacket_rach_reason_v3_crnti not like", value, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_crnti in", values, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiNotIn(List<String> values) {
            addCriterion("subpacket_rach_reason_v3_crnti not in", values, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_crnti between", value1, value2, "subpacketRachReasonV3Crnti");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachReasonV3CrntiNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_reason_v3_crnti not between", value1, value2, "subpacketRachReasonV3Crnti");
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