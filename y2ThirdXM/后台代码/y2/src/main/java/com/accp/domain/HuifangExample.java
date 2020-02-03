package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HuifangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuifangExample() {
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

        public Criteria andHuifangidIsNull() {
            addCriterion("huifangid is null");
            return (Criteria) this;
        }

        public Criteria andHuifangidIsNotNull() {
            addCriterion("huifangid is not null");
            return (Criteria) this;
        }

        public Criteria andHuifangidEqualTo(Integer value) {
            addCriterion("huifangid =", value, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidNotEqualTo(Integer value) {
            addCriterion("huifangid <>", value, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidGreaterThan(Integer value) {
            addCriterion("huifangid >", value, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("huifangid >=", value, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidLessThan(Integer value) {
            addCriterion("huifangid <", value, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidLessThanOrEqualTo(Integer value) {
            addCriterion("huifangid <=", value, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidIn(List<Integer> values) {
            addCriterion("huifangid in", values, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidNotIn(List<Integer> values) {
            addCriterion("huifangid not in", values, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidBetween(Integer value1, Integer value2) {
            addCriterion("huifangid between", value1, value2, "huifangid");
            return (Criteria) this;
        }

        public Criteria andHuifangidNotBetween(Integer value1, Integer value2) {
            addCriterion("huifangid not between", value1, value2, "huifangid");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNull() {
            addCriterion("chepai is null");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNotNull() {
            addCriterion("chepai is not null");
            return (Criteria) this;
        }

        public Criteria andChepaiEqualTo(String value) {
            addCriterion("chepai =", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotEqualTo(String value) {
            addCriterion("chepai <>", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThan(String value) {
            addCriterion("chepai >", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThanOrEqualTo(String value) {
            addCriterion("chepai >=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThan(String value) {
            addCriterion("chepai <", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThanOrEqualTo(String value) {
            addCriterion("chepai <=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLike(String value) {
            addCriterion("chepai like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotLike(String value) {
            addCriterion("chepai not like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiIn(List<String> values) {
            addCriterion("chepai in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotIn(List<String> values) {
            addCriterion("chepai not in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiBetween(String value1, String value2) {
            addCriterion("chepai between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotBetween(String value1, String value2) {
            addCriterion("chepai not between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andHfneironIsNull() {
            addCriterion("hfNeiRon is null");
            return (Criteria) this;
        }

        public Criteria andHfneironIsNotNull() {
            addCriterion("hfNeiRon is not null");
            return (Criteria) this;
        }

        public Criteria andHfneironEqualTo(String value) {
            addCriterion("hfNeiRon =", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironNotEqualTo(String value) {
            addCriterion("hfNeiRon <>", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironGreaterThan(String value) {
            addCriterion("hfNeiRon >", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironGreaterThanOrEqualTo(String value) {
            addCriterion("hfNeiRon >=", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironLessThan(String value) {
            addCriterion("hfNeiRon <", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironLessThanOrEqualTo(String value) {
            addCriterion("hfNeiRon <=", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironLike(String value) {
            addCriterion("hfNeiRon like", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironNotLike(String value) {
            addCriterion("hfNeiRon not like", value, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironIn(List<String> values) {
            addCriterion("hfNeiRon in", values, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironNotIn(List<String> values) {
            addCriterion("hfNeiRon not in", values, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironBetween(String value1, String value2) {
            addCriterion("hfNeiRon between", value1, value2, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfneironNotBetween(String value1, String value2) {
            addCriterion("hfNeiRon not between", value1, value2, "hfneiron");
            return (Criteria) this;
        }

        public Criteria andHfdateIsNull() {
            addCriterion("hfdate is null");
            return (Criteria) this;
        }

        public Criteria andHfdateIsNotNull() {
            addCriterion("hfdate is not null");
            return (Criteria) this;
        }

        public Criteria andHfdateEqualTo(Date value) {
            addCriterion("hfdate =", value, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateNotEqualTo(Date value) {
            addCriterion("hfdate <>", value, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateGreaterThan(Date value) {
            addCriterion("hfdate >", value, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateGreaterThanOrEqualTo(Date value) {
            addCriterion("hfdate >=", value, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateLessThan(Date value) {
            addCriterion("hfdate <", value, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateLessThanOrEqualTo(Date value) {
            addCriterion("hfdate <=", value, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateIn(List<Date> values) {
            addCriterion("hfdate in", values, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateNotIn(List<Date> values) {
            addCriterion("hfdate not in", values, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateBetween(Date value1, Date value2) {
            addCriterion("hfdate between", value1, value2, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfdateNotBetween(Date value1, Date value2) {
            addCriterion("hfdate not between", value1, value2, "hfdate");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoIsNull() {
            addCriterion("hfXiaoGuo is null");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoIsNotNull() {
            addCriterion("hfXiaoGuo is not null");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoEqualTo(String value) {
            addCriterion("hfXiaoGuo =", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoNotEqualTo(String value) {
            addCriterion("hfXiaoGuo <>", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoGreaterThan(String value) {
            addCriterion("hfXiaoGuo >", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoGreaterThanOrEqualTo(String value) {
            addCriterion("hfXiaoGuo >=", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoLessThan(String value) {
            addCriterion("hfXiaoGuo <", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoLessThanOrEqualTo(String value) {
            addCriterion("hfXiaoGuo <=", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoLike(String value) {
            addCriterion("hfXiaoGuo like", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoNotLike(String value) {
            addCriterion("hfXiaoGuo not like", value, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoIn(List<String> values) {
            addCriterion("hfXiaoGuo in", values, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoNotIn(List<String> values) {
            addCriterion("hfXiaoGuo not in", values, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoBetween(String value1, String value2) {
            addCriterion("hfXiaoGuo between", value1, value2, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andHfxiaoguoNotBetween(String value1, String value2) {
            addCriterion("hfXiaoGuo not between", value1, value2, "hfxiaoguo");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andHfguwenIsNull() {
            addCriterion("hfGuWen is null");
            return (Criteria) this;
        }

        public Criteria andHfguwenIsNotNull() {
            addCriterion("hfGuWen is not null");
            return (Criteria) this;
        }

        public Criteria andHfguwenEqualTo(String value) {
            addCriterion("hfGuWen =", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenNotEqualTo(String value) {
            addCriterion("hfGuWen <>", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenGreaterThan(String value) {
            addCriterion("hfGuWen >", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenGreaterThanOrEqualTo(String value) {
            addCriterion("hfGuWen >=", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenLessThan(String value) {
            addCriterion("hfGuWen <", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenLessThanOrEqualTo(String value) {
            addCriterion("hfGuWen <=", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenLike(String value) {
            addCriterion("hfGuWen like", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenNotLike(String value) {
            addCriterion("hfGuWen not like", value, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenIn(List<String> values) {
            addCriterion("hfGuWen in", values, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenNotIn(List<String> values) {
            addCriterion("hfGuWen not in", values, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenBetween(String value1, String value2) {
            addCriterion("hfGuWen between", value1, value2, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andHfguwenNotBetween(String value1, String value2) {
            addCriterion("hfGuWen not between", value1, value2, "hfguwen");
            return (Criteria) this;
        }

        public Criteria andShuomingIsNull() {
            addCriterion("shuoming is null");
            return (Criteria) this;
        }

        public Criteria andShuomingIsNotNull() {
            addCriterion("shuoming is not null");
            return (Criteria) this;
        }

        public Criteria andShuomingEqualTo(String value) {
            addCriterion("shuoming =", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotEqualTo(String value) {
            addCriterion("shuoming <>", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingGreaterThan(String value) {
            addCriterion("shuoming >", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingGreaterThanOrEqualTo(String value) {
            addCriterion("shuoming >=", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingLessThan(String value) {
            addCriterion("shuoming <", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingLessThanOrEqualTo(String value) {
            addCriterion("shuoming <=", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingLike(String value) {
            addCriterion("shuoming like", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotLike(String value) {
            addCriterion("shuoming not like", value, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingIn(List<String> values) {
            addCriterion("shuoming in", values, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotIn(List<String> values) {
            addCriterion("shuoming not in", values, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingBetween(String value1, String value2) {
            addCriterion("shuoming between", value1, value2, "shuoming");
            return (Criteria) this;
        }

        public Criteria andShuomingNotBetween(String value1, String value2) {
            addCriterion("shuoming not between", value1, value2, "shuoming");
            return (Criteria) this;
        }

        public Criteria andBei1IsNull() {
            addCriterion("bei1 is null");
            return (Criteria) this;
        }

        public Criteria andBei1IsNotNull() {
            addCriterion("bei1 is not null");
            return (Criteria) this;
        }

        public Criteria andBei1EqualTo(String value) {
            addCriterion("bei1 =", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotEqualTo(String value) {
            addCriterion("bei1 <>", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1GreaterThan(String value) {
            addCriterion("bei1 >", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1GreaterThanOrEqualTo(String value) {
            addCriterion("bei1 >=", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1LessThan(String value) {
            addCriterion("bei1 <", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1LessThanOrEqualTo(String value) {
            addCriterion("bei1 <=", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1Like(String value) {
            addCriterion("bei1 like", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotLike(String value) {
            addCriterion("bei1 not like", value, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1In(List<String> values) {
            addCriterion("bei1 in", values, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotIn(List<String> values) {
            addCriterion("bei1 not in", values, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1Between(String value1, String value2) {
            addCriterion("bei1 between", value1, value2, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei1NotBetween(String value1, String value2) {
            addCriterion("bei1 not between", value1, value2, "bei1");
            return (Criteria) this;
        }

        public Criteria andBei2IsNull() {
            addCriterion("bei2 is null");
            return (Criteria) this;
        }

        public Criteria andBei2IsNotNull() {
            addCriterion("bei2 is not null");
            return (Criteria) this;
        }

        public Criteria andBei2EqualTo(String value) {
            addCriterion("bei2 =", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotEqualTo(String value) {
            addCriterion("bei2 <>", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2GreaterThan(String value) {
            addCriterion("bei2 >", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2GreaterThanOrEqualTo(String value) {
            addCriterion("bei2 >=", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2LessThan(String value) {
            addCriterion("bei2 <", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2LessThanOrEqualTo(String value) {
            addCriterion("bei2 <=", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2Like(String value) {
            addCriterion("bei2 like", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotLike(String value) {
            addCriterion("bei2 not like", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2In(List<String> values) {
            addCriterion("bei2 in", values, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotIn(List<String> values) {
            addCriterion("bei2 not in", values, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2Between(String value1, String value2) {
            addCriterion("bei2 between", value1, value2, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotBetween(String value1, String value2) {
            addCriterion("bei2 not between", value1, value2, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei3IsNull() {
            addCriterion("bei3 is null");
            return (Criteria) this;
        }

        public Criteria andBei3IsNotNull() {
            addCriterion("bei3 is not null");
            return (Criteria) this;
        }

        public Criteria andBei3EqualTo(String value) {
            addCriterion("bei3 =", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotEqualTo(String value) {
            addCriterion("bei3 <>", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3GreaterThan(String value) {
            addCriterion("bei3 >", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3GreaterThanOrEqualTo(String value) {
            addCriterion("bei3 >=", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3LessThan(String value) {
            addCriterion("bei3 <", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3LessThanOrEqualTo(String value) {
            addCriterion("bei3 <=", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3Like(String value) {
            addCriterion("bei3 like", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotLike(String value) {
            addCriterion("bei3 not like", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3In(List<String> values) {
            addCriterion("bei3 in", values, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotIn(List<String> values) {
            addCriterion("bei3 not in", values, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3Between(String value1, String value2) {
            addCriterion("bei3 between", value1, value2, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotBetween(String value1, String value2) {
            addCriterion("bei3 not between", value1, value2, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei4IsNull() {
            addCriterion("bei4 is null");
            return (Criteria) this;
        }

        public Criteria andBei4IsNotNull() {
            addCriterion("bei4 is not null");
            return (Criteria) this;
        }

        public Criteria andBei4EqualTo(String value) {
            addCriterion("bei4 =", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotEqualTo(String value) {
            addCriterion("bei4 <>", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4GreaterThan(String value) {
            addCriterion("bei4 >", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4GreaterThanOrEqualTo(String value) {
            addCriterion("bei4 >=", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4LessThan(String value) {
            addCriterion("bei4 <", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4LessThanOrEqualTo(String value) {
            addCriterion("bei4 <=", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4Like(String value) {
            addCriterion("bei4 like", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotLike(String value) {
            addCriterion("bei4 not like", value, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4In(List<String> values) {
            addCriterion("bei4 in", values, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotIn(List<String> values) {
            addCriterion("bei4 not in", values, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4Between(String value1, String value2) {
            addCriterion("bei4 between", value1, value2, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei4NotBetween(String value1, String value2) {
            addCriterion("bei4 not between", value1, value2, "bei4");
            return (Criteria) this;
        }

        public Criteria andBei5IsNull() {
            addCriterion("bei5 is null");
            return (Criteria) this;
        }

        public Criteria andBei5IsNotNull() {
            addCriterion("bei5 is not null");
            return (Criteria) this;
        }

        public Criteria andBei5EqualTo(String value) {
            addCriterion("bei5 =", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotEqualTo(String value) {
            addCriterion("bei5 <>", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5GreaterThan(String value) {
            addCriterion("bei5 >", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5GreaterThanOrEqualTo(String value) {
            addCriterion("bei5 >=", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5LessThan(String value) {
            addCriterion("bei5 <", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5LessThanOrEqualTo(String value) {
            addCriterion("bei5 <=", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5Like(String value) {
            addCriterion("bei5 like", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotLike(String value) {
            addCriterion("bei5 not like", value, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5In(List<String> values) {
            addCriterion("bei5 in", values, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotIn(List<String> values) {
            addCriterion("bei5 not in", values, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5Between(String value1, String value2) {
            addCriterion("bei5 between", value1, value2, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei5NotBetween(String value1, String value2) {
            addCriterion("bei5 not between", value1, value2, "bei5");
            return (Criteria) this;
        }

        public Criteria andBei6IsNull() {
            addCriterion("bei6 is null");
            return (Criteria) this;
        }

        public Criteria andBei6IsNotNull() {
            addCriterion("bei6 is not null");
            return (Criteria) this;
        }

        public Criteria andBei6EqualTo(String value) {
            addCriterion("bei6 =", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6NotEqualTo(String value) {
            addCriterion("bei6 <>", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6GreaterThan(String value) {
            addCriterion("bei6 >", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6GreaterThanOrEqualTo(String value) {
            addCriterion("bei6 >=", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6LessThan(String value) {
            addCriterion("bei6 <", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6LessThanOrEqualTo(String value) {
            addCriterion("bei6 <=", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6Like(String value) {
            addCriterion("bei6 like", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6NotLike(String value) {
            addCriterion("bei6 not like", value, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6In(List<String> values) {
            addCriterion("bei6 in", values, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6NotIn(List<String> values) {
            addCriterion("bei6 not in", values, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6Between(String value1, String value2) {
            addCriterion("bei6 between", value1, value2, "bei6");
            return (Criteria) this;
        }

        public Criteria andBei6NotBetween(String value1, String value2) {
            addCriterion("bei6 not between", value1, value2, "bei6");
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