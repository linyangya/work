package com.yinda.nbminer.model;

import java.util.ArrayList;
import java.util.List;

public class LteMacRachTriggerId3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LteMacRachTriggerId3Example() {
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

        public Criteria andSubpacketRachConfigV6PreambleInitPowerIsNull() {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerIsNotNull() {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power =", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerNotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power <>", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerGreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power >", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power >=", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerLessThan(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power <", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power <=", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerLike(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power like", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerNotLike(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power not like", value, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power in", values, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerNotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power not in", values, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power between", value1, value2, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleInitPowerNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_preamble_Init_power not between", value1, value2, "subpacketRachConfigV6PreambleInitPower");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepIsNull() {
            addCriterion("subpacket_rach_config_v6_power_ramping_step is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepIsNotNull() {
            addCriterion("subpacket_rach_config_v6_power_ramping_step is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step =", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepNotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step <>", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepGreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step >", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step >=", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepLessThan(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step <", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step <=", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepLike(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step like", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepNotLike(String value) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step not like", value, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step in", values, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepNotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step not in", values, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step between", value1, value2, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PowerRampingStepNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_power_ramping_step not between", value1, value2, "subpacketRachConfigV6PowerRampingStep");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3IsNull() {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3IsNotNull() {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3EqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 =", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3NotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 <>", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3GreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 >", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3GreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 >=", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3LessThan(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 <", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3LessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 <=", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3Like(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 like", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3NotLike(String value) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 not like", value, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3In(List<String> values) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 in", values, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3NotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 not in", values, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3Between(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 between", value1, value2, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6DeltaPreambleMsg3NotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_delta_preamble_msg3 not between", value1, value2, "subpacketRachConfigV6DeltaPreambleMsg3");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeIsNull() {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeIsNotNull() {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size =", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeNotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size <>", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeGreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size >", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size >=", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeLessThan(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size <", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size <=", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeLike(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size like", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeNotLike(String value) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size not like", value, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size in", values, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeNotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size not in", values, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size between", value1, value2, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6RsrpThreshPrachListSizeNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_rsrp_thresh_prach_list_size not between", value1, value2, "subpacketRachConfigV6RsrpThreshPrachListSize");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListIsNull() {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListIsNotNull() {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list =", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListNotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list <>", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListGreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list >", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list >=", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListLessThan(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list <", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list <=", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListLike(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list like", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListNotLike(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list not like", value, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list in", values, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListNotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list not in", values, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list between", value1, value2, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeListNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_list not between", value1, value2, "subpacketRachConfigV6PrachParamCeList");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaIsNull() {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaIsNotNull() {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na =", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaNotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na <>", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaGreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na >", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na >=", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaLessThan(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na <", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na <=", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaLike(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na like", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaNotLike(String value) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na not like", value, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na in", values, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaNotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na not in", values, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na between", value1, value2, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PrachParamCeNaNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_prach_param_ce_na not between", value1, value2, "subpacketRachConfigV6PrachParamCeNa");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeIsNull() {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce is null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeIsNotNull() {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce is not null");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce =", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeNotEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce <>", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeGreaterThan(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce >", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeGreaterThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce >=", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeLessThan(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce <", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeLessThanOrEqualTo(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce <=", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeLike(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce like", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeNotLike(String value) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce not like", value, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce in", values, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeNotIn(List<String> values) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce not in", values, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce between", value1, value2, "subpacketRachConfigV6PreambleTransMaxCe");
            return (Criteria) this;
        }

        public Criteria andSubpacketRachConfigV6PreambleTransMaxCeNotBetween(String value1, String value2) {
            addCriterion("subpacket_rach_config_v6_preamble_trans_max_ce not between", value1, value2, "subpacketRachConfigV6PreambleTransMaxCe");
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