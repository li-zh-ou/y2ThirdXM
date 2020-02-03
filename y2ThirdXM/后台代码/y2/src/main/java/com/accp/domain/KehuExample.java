package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KehuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andKehuidIsNull() {
            addCriterion("kehuid is null");
            return (Criteria) this;
        }

        public Criteria andKehuidIsNotNull() {
            addCriterion("kehuid is not null");
            return (Criteria) this;
        }

        public Criteria andKehuidEqualTo(Integer value) {
            addCriterion("kehuid =", value, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidNotEqualTo(Integer value) {
            addCriterion("kehuid <>", value, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidGreaterThan(Integer value) {
            addCriterion("kehuid >", value, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kehuid >=", value, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidLessThan(Integer value) {
            addCriterion("kehuid <", value, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidLessThanOrEqualTo(Integer value) {
            addCriterion("kehuid <=", value, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidIn(List<Integer> values) {
            addCriterion("kehuid in", values, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidNotIn(List<Integer> values) {
            addCriterion("kehuid not in", values, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidBetween(Integer value1, Integer value2) {
            addCriterion("kehuid between", value1, value2, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehuidNotBetween(Integer value1, Integer value2) {
            addCriterion("kehuid not between", value1, value2, "kehuid");
            return (Criteria) this;
        }

        public Criteria andKehunoIsNull() {
            addCriterion("KeHuNo is null");
            return (Criteria) this;
        }

        public Criteria andKehunoIsNotNull() {
            addCriterion("KeHuNo is not null");
            return (Criteria) this;
        }

        public Criteria andKehunoEqualTo(String value) {
            addCriterion("KeHuNo =", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotEqualTo(String value) {
            addCriterion("KeHuNo <>", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoGreaterThan(String value) {
            addCriterion("KeHuNo >", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuNo >=", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoLessThan(String value) {
            addCriterion("KeHuNo <", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoLessThanOrEqualTo(String value) {
            addCriterion("KeHuNo <=", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoLike(String value) {
            addCriterion("KeHuNo like", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotLike(String value) {
            addCriterion("KeHuNo not like", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoIn(List<String> values) {
            addCriterion("KeHuNo in", values, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotIn(List<String> values) {
            addCriterion("KeHuNo not in", values, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoBetween(String value1, String value2) {
            addCriterion("KeHuNo between", value1, value2, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotBetween(String value1, String value2) {
            addCriterion("KeHuNo not between", value1, value2, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunameIsNull() {
            addCriterion("KeHuName is null");
            return (Criteria) this;
        }

        public Criteria andKehunameIsNotNull() {
            addCriterion("KeHuName is not null");
            return (Criteria) this;
        }

        public Criteria andKehunameEqualTo(String value) {
            addCriterion("KeHuName =", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameNotEqualTo(String value) {
            addCriterion("KeHuName <>", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameGreaterThan(String value) {
            addCriterion("KeHuName >", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuName >=", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameLessThan(String value) {
            addCriterion("KeHuName <", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameLessThanOrEqualTo(String value) {
            addCriterion("KeHuName <=", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameLike(String value) {
            addCriterion("KeHuName like", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameNotLike(String value) {
            addCriterion("KeHuName not like", value, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameIn(List<String> values) {
            addCriterion("KeHuName in", values, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameNotIn(List<String> values) {
            addCriterion("KeHuName not in", values, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameBetween(String value1, String value2) {
            addCriterion("KeHuName between", value1, value2, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehunameNotBetween(String value1, String value2) {
            addCriterion("KeHuName not between", value1, value2, "kehuname");
            return (Criteria) this;
        }

        public Criteria andKehuaddressIsNull() {
            addCriterion("KeHuAddress is null");
            return (Criteria) this;
        }

        public Criteria andKehuaddressIsNotNull() {
            addCriterion("KeHuAddress is not null");
            return (Criteria) this;
        }

        public Criteria andKehuaddressEqualTo(String value) {
            addCriterion("KeHuAddress =", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressNotEqualTo(String value) {
            addCriterion("KeHuAddress <>", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressGreaterThan(String value) {
            addCriterion("KeHuAddress >", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuAddress >=", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressLessThan(String value) {
            addCriterion("KeHuAddress <", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressLessThanOrEqualTo(String value) {
            addCriterion("KeHuAddress <=", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressLike(String value) {
            addCriterion("KeHuAddress like", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressNotLike(String value) {
            addCriterion("KeHuAddress not like", value, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressIn(List<String> values) {
            addCriterion("KeHuAddress in", values, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressNotIn(List<String> values) {
            addCriterion("KeHuAddress not in", values, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressBetween(String value1, String value2) {
            addCriterion("KeHuAddress between", value1, value2, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andKehuaddressNotBetween(String value1, String value2) {
            addCriterion("KeHuAddress not between", value1, value2, "kehuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressIsNull() {
            addCriterion("ZhuAddress is null");
            return (Criteria) this;
        }

        public Criteria andZhuaddressIsNotNull() {
            addCriterion("ZhuAddress is not null");
            return (Criteria) this;
        }

        public Criteria andZhuaddressEqualTo(String value) {
            addCriterion("ZhuAddress =", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressNotEqualTo(String value) {
            addCriterion("ZhuAddress <>", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressGreaterThan(String value) {
            addCriterion("ZhuAddress >", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuAddress >=", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressLessThan(String value) {
            addCriterion("ZhuAddress <", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressLessThanOrEqualTo(String value) {
            addCriterion("ZhuAddress <=", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressLike(String value) {
            addCriterion("ZhuAddress like", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressNotLike(String value) {
            addCriterion("ZhuAddress not like", value, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressIn(List<String> values) {
            addCriterion("ZhuAddress in", values, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressNotIn(List<String> values) {
            addCriterion("ZhuAddress not in", values, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressBetween(String value1, String value2) {
            addCriterion("ZhuAddress between", value1, value2, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andZhuaddressNotBetween(String value1, String value2) {
            addCriterion("ZhuAddress not between", value1, value2, "zhuaddress");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayIsNull() {
            addCriterion("KeHuBirthday is null");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayIsNotNull() {
            addCriterion("KeHuBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("KeHuBirthday =", value, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("KeHuBirthday <>", value, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("KeHuBirthday >", value, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KeHuBirthday >=", value, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayLessThan(Date value) {
            addCriterionForJDBCDate("KeHuBirthday <", value, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KeHuBirthday <=", value, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("KeHuBirthday in", values, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("KeHuBirthday not in", values, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KeHuBirthday between", value1, value2, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehubirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KeHuBirthday not between", value1, value2, "kehubirthday");
            return (Criteria) this;
        }

        public Criteria andKehutypeIsNull() {
            addCriterion("KeHuType is null");
            return (Criteria) this;
        }

        public Criteria andKehutypeIsNotNull() {
            addCriterion("KeHuType is not null");
            return (Criteria) this;
        }

        public Criteria andKehutypeEqualTo(String value) {
            addCriterion("KeHuType =", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeNotEqualTo(String value) {
            addCriterion("KeHuType <>", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeGreaterThan(String value) {
            addCriterion("KeHuType >", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuType >=", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeLessThan(String value) {
            addCriterion("KeHuType <", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeLessThanOrEqualTo(String value) {
            addCriterion("KeHuType <=", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeLike(String value) {
            addCriterion("KeHuType like", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeNotLike(String value) {
            addCriterion("KeHuType not like", value, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeIn(List<String> values) {
            addCriterion("KeHuType in", values, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeNotIn(List<String> values) {
            addCriterion("KeHuType not in", values, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeBetween(String value1, String value2) {
            addCriterion("KeHuType between", value1, value2, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehutypeNotBetween(String value1, String value2) {
            addCriterion("KeHuType not between", value1, value2, "kehutype");
            return (Criteria) this;
        }

        public Criteria andKehulianxiIsNull() {
            addCriterion("KeHuLianXi is null");
            return (Criteria) this;
        }

        public Criteria andKehulianxiIsNotNull() {
            addCriterion("KeHuLianXi is not null");
            return (Criteria) this;
        }

        public Criteria andKehulianxiEqualTo(String value) {
            addCriterion("KeHuLianXi =", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiNotEqualTo(String value) {
            addCriterion("KeHuLianXi <>", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiGreaterThan(String value) {
            addCriterion("KeHuLianXi >", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuLianXi >=", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiLessThan(String value) {
            addCriterion("KeHuLianXi <", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiLessThanOrEqualTo(String value) {
            addCriterion("KeHuLianXi <=", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiLike(String value) {
            addCriterion("KeHuLianXi like", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiNotLike(String value) {
            addCriterion("KeHuLianXi not like", value, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiIn(List<String> values) {
            addCriterion("KeHuLianXi in", values, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiNotIn(List<String> values) {
            addCriterion("KeHuLianXi not in", values, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiBetween(String value1, String value2) {
            addCriterion("KeHuLianXi between", value1, value2, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehulianxiNotBetween(String value1, String value2) {
            addCriterion("KeHuLianXi not between", value1, value2, "kehulianxi");
            return (Criteria) this;
        }

        public Criteria andKehuphoneIsNull() {
            addCriterion("KeHuPhone is null");
            return (Criteria) this;
        }

        public Criteria andKehuphoneIsNotNull() {
            addCriterion("KeHuPhone is not null");
            return (Criteria) this;
        }

        public Criteria andKehuphoneEqualTo(String value) {
            addCriterion("KeHuPhone =", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneNotEqualTo(String value) {
            addCriterion("KeHuPhone <>", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneGreaterThan(String value) {
            addCriterion("KeHuPhone >", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuPhone >=", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneLessThan(String value) {
            addCriterion("KeHuPhone <", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneLessThanOrEqualTo(String value) {
            addCriterion("KeHuPhone <=", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneLike(String value) {
            addCriterion("KeHuPhone like", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneNotLike(String value) {
            addCriterion("KeHuPhone not like", value, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneIn(List<String> values) {
            addCriterion("KeHuPhone in", values, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneNotIn(List<String> values) {
            addCriterion("KeHuPhone not in", values, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneBetween(String value1, String value2) {
            addCriterion("KeHuPhone between", value1, value2, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andKehuphoneNotBetween(String value1, String value2) {
            addCriterion("KeHuPhone not between", value1, value2, "kehuphone");
            return (Criteria) this;
        }

        public Criteria andZhangqiIsNull() {
            addCriterion("ZhangQi is null");
            return (Criteria) this;
        }

        public Criteria andZhangqiIsNotNull() {
            addCriterion("ZhangQi is not null");
            return (Criteria) this;
        }

        public Criteria andZhangqiEqualTo(Date value) {
            addCriterion("ZhangQi =", value, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiNotEqualTo(Date value) {
            addCriterion("ZhangQi <>", value, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiGreaterThan(Date value) {
            addCriterion("ZhangQi >", value, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhangQi >=", value, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiLessThan(Date value) {
            addCriterion("ZhangQi <", value, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiLessThanOrEqualTo(Date value) {
            addCriterion("ZhangQi <=", value, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiIn(List<Date> values) {
            addCriterion("ZhangQi in", values, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiNotIn(List<Date> values) {
            addCriterion("ZhangQi not in", values, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiBetween(Date value1, Date value2) {
            addCriterion("ZhangQi between", value1, value2, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andZhangqiNotBetween(Date value1, Date value2) {
            addCriterion("ZhangQi not between", value1, value2, "zhangqi");
            return (Criteria) this;
        }

        public Criteria andGuazhangIsNull() {
            addCriterion("GuaZhang is null");
            return (Criteria) this;
        }

        public Criteria andGuazhangIsNotNull() {
            addCriterion("GuaZhang is not null");
            return (Criteria) this;
        }

        public Criteria andGuazhangEqualTo(Double value) {
            addCriterion("GuaZhang =", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangNotEqualTo(Double value) {
            addCriterion("GuaZhang <>", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangGreaterThan(Double value) {
            addCriterion("GuaZhang >", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangGreaterThanOrEqualTo(Double value) {
            addCriterion("GuaZhang >=", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangLessThan(Double value) {
            addCriterion("GuaZhang <", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangLessThanOrEqualTo(Double value) {
            addCriterion("GuaZhang <=", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangIn(List<Double> values) {
            addCriterion("GuaZhang in", values, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangNotIn(List<Double> values) {
            addCriterion("GuaZhang not in", values, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangBetween(Double value1, Double value2) {
            addCriterion("GuaZhang between", value1, value2, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangNotBetween(Double value1, Double value2) {
            addCriterion("GuaZhang not between", value1, value2, "guazhang");
            return (Criteria) this;
        }

        public Criteria andEduIsNull() {
            addCriterion("eDu is null");
            return (Criteria) this;
        }

        public Criteria andEduIsNotNull() {
            addCriterion("eDu is not null");
            return (Criteria) this;
        }

        public Criteria andEduEqualTo(Double value) {
            addCriterion("eDu =", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotEqualTo(Double value) {
            addCriterion("eDu <>", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThan(Double value) {
            addCriterion("eDu >", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThanOrEqualTo(Double value) {
            addCriterion("eDu >=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThan(Double value) {
            addCriterion("eDu <", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThanOrEqualTo(Double value) {
            addCriterion("eDu <=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduIn(List<Double> values) {
            addCriterion("eDu in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotIn(List<Double> values) {
            addCriterion("eDu not in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduBetween(Double value1, Double value2) {
            addCriterion("eDu between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotBetween(Double value1, Double value2) {
            addCriterion("eDu not between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andDinjinIsNull() {
            addCriterion("DinJin is null");
            return (Criteria) this;
        }

        public Criteria andDinjinIsNotNull() {
            addCriterion("DinJin is not null");
            return (Criteria) this;
        }

        public Criteria andDinjinEqualTo(Double value) {
            addCriterion("DinJin =", value, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinNotEqualTo(Double value) {
            addCriterion("DinJin <>", value, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinGreaterThan(Double value) {
            addCriterion("DinJin >", value, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinGreaterThanOrEqualTo(Double value) {
            addCriterion("DinJin >=", value, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinLessThan(Double value) {
            addCriterion("DinJin <", value, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinLessThanOrEqualTo(Double value) {
            addCriterion("DinJin <=", value, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinIn(List<Double> values) {
            addCriterion("DinJin in", values, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinNotIn(List<Double> values) {
            addCriterion("DinJin not in", values, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinBetween(Double value1, Double value2) {
            addCriterion("DinJin between", value1, value2, "dinjin");
            return (Criteria) this;
        }

        public Criteria andDinjinNotBetween(Double value1, Double value2) {
            addCriterion("DinJin not between", value1, value2, "dinjin");
            return (Criteria) this;
        }

        public Criteria andGuwenIsNull() {
            addCriterion("GuWen is null");
            return (Criteria) this;
        }

        public Criteria andGuwenIsNotNull() {
            addCriterion("GuWen is not null");
            return (Criteria) this;
        }

        public Criteria andGuwenEqualTo(String value) {
            addCriterion("GuWen =", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenNotEqualTo(String value) {
            addCriterion("GuWen <>", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenGreaterThan(String value) {
            addCriterion("GuWen >", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenGreaterThanOrEqualTo(String value) {
            addCriterion("GuWen >=", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenLessThan(String value) {
            addCriterion("GuWen <", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenLessThanOrEqualTo(String value) {
            addCriterion("GuWen <=", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenLike(String value) {
            addCriterion("GuWen like", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenNotLike(String value) {
            addCriterion("GuWen not like", value, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenIn(List<String> values) {
            addCriterion("GuWen in", values, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenNotIn(List<String> values) {
            addCriterion("GuWen not in", values, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenBetween(String value1, String value2) {
            addCriterion("GuWen between", value1, value2, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenNotBetween(String value1, String value2) {
            addCriterion("GuWen not between", value1, value2, "guwen");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneIsNull() {
            addCriterion("GuWenPhone is null");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneIsNotNull() {
            addCriterion("GuWenPhone is not null");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneEqualTo(String value) {
            addCriterion("GuWenPhone =", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneNotEqualTo(String value) {
            addCriterion("GuWenPhone <>", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneGreaterThan(String value) {
            addCriterion("GuWenPhone >", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneGreaterThanOrEqualTo(String value) {
            addCriterion("GuWenPhone >=", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneLessThan(String value) {
            addCriterion("GuWenPhone <", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneLessThanOrEqualTo(String value) {
            addCriterion("GuWenPhone <=", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneLike(String value) {
            addCriterion("GuWenPhone like", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneNotLike(String value) {
            addCriterion("GuWenPhone not like", value, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneIn(List<String> values) {
            addCriterion("GuWenPhone in", values, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneNotIn(List<String> values) {
            addCriterion("GuWenPhone not in", values, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneBetween(String value1, String value2) {
            addCriterion("GuWenPhone between", value1, value2, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andGuwenphoneNotBetween(String value1, String value2) {
            addCriterion("GuWenPhone not between", value1, value2, "guwenphone");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNull() {
            addCriterion("ChePai is null");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNotNull() {
            addCriterion("ChePai is not null");
            return (Criteria) this;
        }

        public Criteria andChepaiEqualTo(String value) {
            addCriterion("ChePai =", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotEqualTo(String value) {
            addCriterion("ChePai <>", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThan(String value) {
            addCriterion("ChePai >", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThanOrEqualTo(String value) {
            addCriterion("ChePai >=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThan(String value) {
            addCriterion("ChePai <", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThanOrEqualTo(String value) {
            addCriterion("ChePai <=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLike(String value) {
            addCriterion("ChePai like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotLike(String value) {
            addCriterion("ChePai not like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiIn(List<String> values) {
            addCriterion("ChePai in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotIn(List<String> values) {
            addCriterion("ChePai not in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiBetween(String value1, String value2) {
            addCriterion("ChePai between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotBetween(String value1, String value2) {
            addCriterion("ChePai not between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andJifenIsNull() {
            addCriterion("JiFen is null");
            return (Criteria) this;
        }

        public Criteria andJifenIsNotNull() {
            addCriterion("JiFen is not null");
            return (Criteria) this;
        }

        public Criteria andJifenEqualTo(Integer value) {
            addCriterion("JiFen =", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotEqualTo(Integer value) {
            addCriterion("JiFen <>", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenGreaterThan(Integer value) {
            addCriterion("JiFen >", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiFen >=", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLessThan(Integer value) {
            addCriterion("JiFen <", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLessThanOrEqualTo(Integer value) {
            addCriterion("JiFen <=", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenIn(List<Integer> values) {
            addCriterion("JiFen in", values, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotIn(List<Integer> values) {
            addCriterion("JiFen not in", values, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenBetween(Integer value1, Integer value2) {
            addCriterion("JiFen between", value1, value2, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotBetween(Integer value1, Integer value2) {
            addCriterion("JiFen not between", value1, value2, "jifen");
            return (Criteria) this;
        }

        public Criteria andZhuphoneIsNull() {
            addCriterion("ZhuPhone is null");
            return (Criteria) this;
        }

        public Criteria andZhuphoneIsNotNull() {
            addCriterion("ZhuPhone is not null");
            return (Criteria) this;
        }

        public Criteria andZhuphoneEqualTo(String value) {
            addCriterion("ZhuPhone =", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneNotEqualTo(String value) {
            addCriterion("ZhuPhone <>", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneGreaterThan(String value) {
            addCriterion("ZhuPhone >", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuPhone >=", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneLessThan(String value) {
            addCriterion("ZhuPhone <", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneLessThanOrEqualTo(String value) {
            addCriterion("ZhuPhone <=", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneLike(String value) {
            addCriterion("ZhuPhone like", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneNotLike(String value) {
            addCriterion("ZhuPhone not like", value, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneIn(List<String> values) {
            addCriterion("ZhuPhone in", values, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneNotIn(List<String> values) {
            addCriterion("ZhuPhone not in", values, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneBetween(String value1, String value2) {
            addCriterion("ZhuPhone between", value1, value2, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andZhuphoneNotBetween(String value1, String value2) {
            addCriterion("ZhuPhone not between", value1, value2, "zhuphone");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("bankcard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("bankcard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("bankcard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("bankcard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("bankcard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("bankcard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("bankcard like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("bankcard not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("bankcard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("bankcard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("bankcard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("bankcard not between", value1, value2, "bankcard");
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