package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LingliaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LingliaoExample() {
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

        public Criteria andLlidIsNull() {
            addCriterion("llid is null");
            return (Criteria) this;
        }

        public Criteria andLlidIsNotNull() {
            addCriterion("llid is not null");
            return (Criteria) this;
        }

        public Criteria andLlidEqualTo(Integer value) {
            addCriterion("llid =", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotEqualTo(Integer value) {
            addCriterion("llid <>", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidGreaterThan(Integer value) {
            addCriterion("llid >", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("llid >=", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidLessThan(Integer value) {
            addCriterion("llid <", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidLessThanOrEqualTo(Integer value) {
            addCriterion("llid <=", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidIn(List<Integer> values) {
            addCriterion("llid in", values, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotIn(List<Integer> values) {
            addCriterion("llid not in", values, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidBetween(Integer value1, Integer value2) {
            addCriterion("llid between", value1, value2, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotBetween(Integer value1, Integer value2) {
            addCriterion("llid not between", value1, value2, "llid");
            return (Criteria) this;
        }

        public Criteria andWxdannoIsNull() {
            addCriterion("wxDanNo is null");
            return (Criteria) this;
        }

        public Criteria andWxdannoIsNotNull() {
            addCriterion("wxDanNo is not null");
            return (Criteria) this;
        }

        public Criteria andWxdannoEqualTo(String value) {
            addCriterion("wxDanNo =", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoNotEqualTo(String value) {
            addCriterion("wxDanNo <>", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoGreaterThan(String value) {
            addCriterion("wxDanNo >", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoGreaterThanOrEqualTo(String value) {
            addCriterion("wxDanNo >=", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoLessThan(String value) {
            addCriterion("wxDanNo <", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoLessThanOrEqualTo(String value) {
            addCriterion("wxDanNo <=", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoLike(String value) {
            addCriterion("wxDanNo like", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoNotLike(String value) {
            addCriterion("wxDanNo not like", value, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoIn(List<String> values) {
            addCriterion("wxDanNo in", values, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoNotIn(List<String> values) {
            addCriterion("wxDanNo not in", values, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoBetween(String value1, String value2) {
            addCriterion("wxDanNo between", value1, value2, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andWxdannoNotBetween(String value1, String value2) {
            addCriterion("wxDanNo not between", value1, value2, "wxdanno");
            return (Criteria) this;
        }

        public Criteria andLldateIsNull() {
            addCriterion("lldate is null");
            return (Criteria) this;
        }

        public Criteria andLldateIsNotNull() {
            addCriterion("lldate is not null");
            return (Criteria) this;
        }

        public Criteria andLldateEqualTo(Date value) {
            addCriterion("lldate =", value, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateNotEqualTo(Date value) {
            addCriterion("lldate <>", value, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateGreaterThan(Date value) {
            addCriterion("lldate >", value, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateGreaterThanOrEqualTo(Date value) {
            addCriterion("lldate >=", value, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateLessThan(Date value) {
            addCriterion("lldate <", value, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateLessThanOrEqualTo(Date value) {
            addCriterion("lldate <=", value, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateIn(List<Date> values) {
            addCriterion("lldate in", values, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateNotIn(List<Date> values) {
            addCriterion("lldate not in", values, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateBetween(Date value1, Date value2) {
            addCriterion("lldate between", value1, value2, "lldate");
            return (Criteria) this;
        }

        public Criteria andLldateNotBetween(Date value1, Date value2) {
            addCriterion("lldate not between", value1, value2, "lldate");
            return (Criteria) this;
        }

        public Criteria andLlperpleIsNull() {
            addCriterion("llperple is null");
            return (Criteria) this;
        }

        public Criteria andLlperpleIsNotNull() {
            addCriterion("llperple is not null");
            return (Criteria) this;
        }

        public Criteria andLlperpleEqualTo(String value) {
            addCriterion("llperple =", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleNotEqualTo(String value) {
            addCriterion("llperple <>", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleGreaterThan(String value) {
            addCriterion("llperple >", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleGreaterThanOrEqualTo(String value) {
            addCriterion("llperple >=", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleLessThan(String value) {
            addCriterion("llperple <", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleLessThanOrEqualTo(String value) {
            addCriterion("llperple <=", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleLike(String value) {
            addCriterion("llperple like", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleNotLike(String value) {
            addCriterion("llperple not like", value, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleIn(List<String> values) {
            addCriterion("llperple in", values, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleNotIn(List<String> values) {
            addCriterion("llperple not in", values, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleBetween(String value1, String value2) {
            addCriterion("llperple between", value1, value2, "llperple");
            return (Criteria) this;
        }

        public Criteria andLlperpleNotBetween(String value1, String value2) {
            addCriterion("llperple not between", value1, value2, "llperple");
            return (Criteria) this;
        }

        public Criteria andWuliaoidIsNull() {
            addCriterion("wuLiaoid is null");
            return (Criteria) this;
        }

        public Criteria andWuliaoidIsNotNull() {
            addCriterion("wuLiaoid is not null");
            return (Criteria) this;
        }

        public Criteria andWuliaoidEqualTo(Integer value) {
            addCriterion("wuLiaoid =", value, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidNotEqualTo(Integer value) {
            addCriterion("wuLiaoid <>", value, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidGreaterThan(Integer value) {
            addCriterion("wuLiaoid >", value, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wuLiaoid >=", value, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidLessThan(Integer value) {
            addCriterion("wuLiaoid <", value, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidLessThanOrEqualTo(Integer value) {
            addCriterion("wuLiaoid <=", value, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidIn(List<Integer> values) {
            addCriterion("wuLiaoid in", values, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidNotIn(List<Integer> values) {
            addCriterion("wuLiaoid not in", values, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidBetween(Integer value1, Integer value2) {
            addCriterion("wuLiaoid between", value1, value2, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andWuliaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("wuLiaoid not between", value1, value2, "wuliaoid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenIsNull() {
            addCriterion("fuwuguwen is null");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenIsNotNull() {
            addCriterion("fuwuguwen is not null");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenEqualTo(String value) {
            addCriterion("fuwuguwen =", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenNotEqualTo(String value) {
            addCriterion("fuwuguwen <>", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenGreaterThan(String value) {
            addCriterion("fuwuguwen >", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenGreaterThanOrEqualTo(String value) {
            addCriterion("fuwuguwen >=", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenLessThan(String value) {
            addCriterion("fuwuguwen <", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenLessThanOrEqualTo(String value) {
            addCriterion("fuwuguwen <=", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenLike(String value) {
            addCriterion("fuwuguwen like", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenNotLike(String value) {
            addCriterion("fuwuguwen not like", value, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenIn(List<String> values) {
            addCriterion("fuwuguwen in", values, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenNotIn(List<String> values) {
            addCriterion("fuwuguwen not in", values, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenBetween(String value1, String value2) {
            addCriterion("fuwuguwen between", value1, value2, "fuwuguwen");
            return (Criteria) this;
        }

        public Criteria andFuwuguwenNotBetween(String value1, String value2) {
            addCriterion("fuwuguwen not between", value1, value2, "fuwuguwen");
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