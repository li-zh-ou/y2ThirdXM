package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JungongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JungongExample() {
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

        public Criteria andIshegeIsNull() {
            addCriterion("isHeGe is null");
            return (Criteria) this;
        }

        public Criteria andIshegeIsNotNull() {
            addCriterion("isHeGe is not null");
            return (Criteria) this;
        }

        public Criteria andIshegeEqualTo(String value) {
            addCriterion("isHeGe =", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeNotEqualTo(String value) {
            addCriterion("isHeGe <>", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeGreaterThan(String value) {
            addCriterion("isHeGe >", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeGreaterThanOrEqualTo(String value) {
            addCriterion("isHeGe >=", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeLessThan(String value) {
            addCriterion("isHeGe <", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeLessThanOrEqualTo(String value) {
            addCriterion("isHeGe <=", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeLike(String value) {
            addCriterion("isHeGe like", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeNotLike(String value) {
            addCriterion("isHeGe not like", value, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeIn(List<String> values) {
            addCriterion("isHeGe in", values, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeNotIn(List<String> values) {
            addCriterion("isHeGe not in", values, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeBetween(String value1, String value2) {
            addCriterion("isHeGe between", value1, value2, "ishege");
            return (Criteria) this;
        }

        public Criteria andIshegeNotBetween(String value1, String value2) {
            addCriterion("isHeGe not between", value1, value2, "ishege");
            return (Criteria) this;
        }

        public Criteria andYujitimeIsNull() {
            addCriterion("YuJiTime is null");
            return (Criteria) this;
        }

        public Criteria andYujitimeIsNotNull() {
            addCriterion("YuJiTime is not null");
            return (Criteria) this;
        }

        public Criteria andYujitimeEqualTo(Date value) {
            addCriterion("YuJiTime =", value, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeNotEqualTo(Date value) {
            addCriterion("YuJiTime <>", value, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeGreaterThan(Date value) {
            addCriterion("YuJiTime >", value, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("YuJiTime >=", value, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeLessThan(Date value) {
            addCriterion("YuJiTime <", value, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeLessThanOrEqualTo(Date value) {
            addCriterion("YuJiTime <=", value, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeIn(List<Date> values) {
            addCriterion("YuJiTime in", values, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeNotIn(List<Date> values) {
            addCriterion("YuJiTime not in", values, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeBetween(Date value1, Date value2) {
            addCriterion("YuJiTime between", value1, value2, "yujitime");
            return (Criteria) this;
        }

        public Criteria andYujitimeNotBetween(Date value1, Date value2) {
            addCriterion("YuJiTime not between", value1, value2, "yujitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeIsNull() {
            addCriterion("ShiJiTime is null");
            return (Criteria) this;
        }

        public Criteria andShijitimeIsNotNull() {
            addCriterion("ShiJiTime is not null");
            return (Criteria) this;
        }

        public Criteria andShijitimeEqualTo(Date value) {
            addCriterion("ShiJiTime =", value, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeNotEqualTo(Date value) {
            addCriterion("ShiJiTime <>", value, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeGreaterThan(Date value) {
            addCriterion("ShiJiTime >", value, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ShiJiTime >=", value, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeLessThan(Date value) {
            addCriterion("ShiJiTime <", value, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeLessThanOrEqualTo(Date value) {
            addCriterion("ShiJiTime <=", value, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeIn(List<Date> values) {
            addCriterion("ShiJiTime in", values, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeNotIn(List<Date> values) {
            addCriterion("ShiJiTime not in", values, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeBetween(Date value1, Date value2) {
            addCriterion("ShiJiTime between", value1, value2, "shijitime");
            return (Criteria) this;
        }

        public Criteria andShijitimeNotBetween(Date value1, Date value2) {
            addCriterion("ShiJiTime not between", value1, value2, "shijitime");
            return (Criteria) this;
        }

        public Criteria andWugongIsNull() {
            addCriterion("WuGong is null");
            return (Criteria) this;
        }

        public Criteria andWugongIsNotNull() {
            addCriterion("WuGong is not null");
            return (Criteria) this;
        }

        public Criteria andWugongEqualTo(String value) {
            addCriterion("WuGong =", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongNotEqualTo(String value) {
            addCriterion("WuGong <>", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongGreaterThan(String value) {
            addCriterion("WuGong >", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongGreaterThanOrEqualTo(String value) {
            addCriterion("WuGong >=", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongLessThan(String value) {
            addCriterion("WuGong <", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongLessThanOrEqualTo(String value) {
            addCriterion("WuGong <=", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongLike(String value) {
            addCriterion("WuGong like", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongNotLike(String value) {
            addCriterion("WuGong not like", value, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongIn(List<String> values) {
            addCriterion("WuGong in", values, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongNotIn(List<String> values) {
            addCriterion("WuGong not in", values, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongBetween(String value1, String value2) {
            addCriterion("WuGong between", value1, value2, "wugong");
            return (Criteria) this;
        }

        public Criteria andWugongNotBetween(String value1, String value2) {
            addCriterion("WuGong not between", value1, value2, "wugong");
            return (Criteria) this;
        }

        public Criteria andZhijianIsNull() {
            addCriterion("ZhiJian is null");
            return (Criteria) this;
        }

        public Criteria andZhijianIsNotNull() {
            addCriterion("ZhiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZhijianEqualTo(String value) {
            addCriterion("ZhiJian =", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianNotEqualTo(String value) {
            addCriterion("ZhiJian <>", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianGreaterThan(String value) {
            addCriterion("ZhiJian >", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiJian >=", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianLessThan(String value) {
            addCriterion("ZhiJian <", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianLessThanOrEqualTo(String value) {
            addCriterion("ZhiJian <=", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianLike(String value) {
            addCriterion("ZhiJian like", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianNotLike(String value) {
            addCriterion("ZhiJian not like", value, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianIn(List<String> values) {
            addCriterion("ZhiJian in", values, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianNotIn(List<String> values) {
            addCriterion("ZhiJian not in", values, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianBetween(String value1, String value2) {
            addCriterion("ZhiJian between", value1, value2, "zhijian");
            return (Criteria) this;
        }

        public Criteria andZhijianNotBetween(String value1, String value2) {
            addCriterion("ZhiJian not between", value1, value2, "zhijian");
            return (Criteria) this;
        }

        public Criteria andWugongrenIsNull() {
            addCriterion("WuGongRen is null");
            return (Criteria) this;
        }

        public Criteria andWugongrenIsNotNull() {
            addCriterion("WuGongRen is not null");
            return (Criteria) this;
        }

        public Criteria andWugongrenEqualTo(String value) {
            addCriterion("WuGongRen =", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenNotEqualTo(String value) {
            addCriterion("WuGongRen <>", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenGreaterThan(String value) {
            addCriterion("WuGongRen >", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenGreaterThanOrEqualTo(String value) {
            addCriterion("WuGongRen >=", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenLessThan(String value) {
            addCriterion("WuGongRen <", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenLessThanOrEqualTo(String value) {
            addCriterion("WuGongRen <=", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenLike(String value) {
            addCriterion("WuGongRen like", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenNotLike(String value) {
            addCriterion("WuGongRen not like", value, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenIn(List<String> values) {
            addCriterion("WuGongRen in", values, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenNotIn(List<String> values) {
            addCriterion("WuGongRen not in", values, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenBetween(String value1, String value2) {
            addCriterion("WuGongRen between", value1, value2, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongrenNotBetween(String value1, String value2) {
            addCriterion("WuGongRen not between", value1, value2, "wugongren");
            return (Criteria) this;
        }

        public Criteria andWugongchufaIsNull() {
            addCriterion("WuGongChuFa is null");
            return (Criteria) this;
        }

        public Criteria andWugongchufaIsNotNull() {
            addCriterion("WuGongChuFa is not null");
            return (Criteria) this;
        }

        public Criteria andWugongchufaEqualTo(Double value) {
            addCriterion("WuGongChuFa =", value, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaNotEqualTo(Double value) {
            addCriterion("WuGongChuFa <>", value, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaGreaterThan(Double value) {
            addCriterion("WuGongChuFa >", value, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaGreaterThanOrEqualTo(Double value) {
            addCriterion("WuGongChuFa >=", value, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaLessThan(Double value) {
            addCriterion("WuGongChuFa <", value, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaLessThanOrEqualTo(Double value) {
            addCriterion("WuGongChuFa <=", value, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaIn(List<Double> values) {
            addCriterion("WuGongChuFa in", values, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaNotIn(List<Double> values) {
            addCriterion("WuGongChuFa not in", values, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaBetween(Double value1, Double value2) {
            addCriterion("WuGongChuFa between", value1, value2, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andWugongchufaNotBetween(Double value1, Double value2) {
            addCriterion("WuGongChuFa not between", value1, value2, "wugongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongciIsNull() {
            addCriterion("FanGongCi is null");
            return (Criteria) this;
        }

        public Criteria andFangongciIsNotNull() {
            addCriterion("FanGongCi is not null");
            return (Criteria) this;
        }

        public Criteria andFangongciEqualTo(Integer value) {
            addCriterion("FanGongCi =", value, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciNotEqualTo(Integer value) {
            addCriterion("FanGongCi <>", value, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciGreaterThan(Integer value) {
            addCriterion("FanGongCi >", value, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciGreaterThanOrEqualTo(Integer value) {
            addCriterion("FanGongCi >=", value, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciLessThan(Integer value) {
            addCriterion("FanGongCi <", value, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciLessThanOrEqualTo(Integer value) {
            addCriterion("FanGongCi <=", value, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciIn(List<Integer> values) {
            addCriterion("FanGongCi in", values, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciNotIn(List<Integer> values) {
            addCriterion("FanGongCi not in", values, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciBetween(Integer value1, Integer value2) {
            addCriterion("FanGongCi between", value1, value2, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongciNotBetween(Integer value1, Integer value2) {
            addCriterion("FanGongCi not between", value1, value2, "fangongci");
            return (Criteria) this;
        }

        public Criteria andFangongIsNull() {
            addCriterion("FanGong is null");
            return (Criteria) this;
        }

        public Criteria andFangongIsNotNull() {
            addCriterion("FanGong is not null");
            return (Criteria) this;
        }

        public Criteria andFangongEqualTo(String value) {
            addCriterion("FanGong =", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongNotEqualTo(String value) {
            addCriterion("FanGong <>", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongGreaterThan(String value) {
            addCriterion("FanGong >", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongGreaterThanOrEqualTo(String value) {
            addCriterion("FanGong >=", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongLessThan(String value) {
            addCriterion("FanGong <", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongLessThanOrEqualTo(String value) {
            addCriterion("FanGong <=", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongLike(String value) {
            addCriterion("FanGong like", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongNotLike(String value) {
            addCriterion("FanGong not like", value, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongIn(List<String> values) {
            addCriterion("FanGong in", values, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongNotIn(List<String> values) {
            addCriterion("FanGong not in", values, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongBetween(String value1, String value2) {
            addCriterion("FanGong between", value1, value2, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongNotBetween(String value1, String value2) {
            addCriterion("FanGong not between", value1, value2, "fangong");
            return (Criteria) this;
        }

        public Criteria andFangongrenIsNull() {
            addCriterion("FanGongRen is null");
            return (Criteria) this;
        }

        public Criteria andFangongrenIsNotNull() {
            addCriterion("FanGongRen is not null");
            return (Criteria) this;
        }

        public Criteria andFangongrenEqualTo(String value) {
            addCriterion("FanGongRen =", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenNotEqualTo(String value) {
            addCriterion("FanGongRen <>", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenGreaterThan(String value) {
            addCriterion("FanGongRen >", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenGreaterThanOrEqualTo(String value) {
            addCriterion("FanGongRen >=", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenLessThan(String value) {
            addCriterion("FanGongRen <", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenLessThanOrEqualTo(String value) {
            addCriterion("FanGongRen <=", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenLike(String value) {
            addCriterion("FanGongRen like", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenNotLike(String value) {
            addCriterion("FanGongRen not like", value, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenIn(List<String> values) {
            addCriterion("FanGongRen in", values, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenNotIn(List<String> values) {
            addCriterion("FanGongRen not in", values, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenBetween(String value1, String value2) {
            addCriterion("FanGongRen between", value1, value2, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongrenNotBetween(String value1, String value2) {
            addCriterion("FanGongRen not between", value1, value2, "fangongren");
            return (Criteria) this;
        }

        public Criteria andFangongchufaIsNull() {
            addCriterion("FanGongChuFa is null");
            return (Criteria) this;
        }

        public Criteria andFangongchufaIsNotNull() {
            addCriterion("FanGongChuFa is not null");
            return (Criteria) this;
        }

        public Criteria andFangongchufaEqualTo(Double value) {
            addCriterion("FanGongChuFa =", value, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaNotEqualTo(Double value) {
            addCriterion("FanGongChuFa <>", value, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaGreaterThan(Double value) {
            addCriterion("FanGongChuFa >", value, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaGreaterThanOrEqualTo(Double value) {
            addCriterion("FanGongChuFa >=", value, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaLessThan(Double value) {
            addCriterion("FanGongChuFa <", value, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaLessThanOrEqualTo(Double value) {
            addCriterion("FanGongChuFa <=", value, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaIn(List<Double> values) {
            addCriterion("FanGongChuFa in", values, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaNotIn(List<Double> values) {
            addCriterion("FanGongChuFa not in", values, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaBetween(Double value1, Double value2) {
            addCriterion("FanGongChuFa between", value1, value2, "fangongchufa");
            return (Criteria) this;
        }

        public Criteria andFangongchufaNotBetween(Double value1, Double value2) {
            addCriterion("FanGongChuFa not between", value1, value2, "fangongchufa");
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