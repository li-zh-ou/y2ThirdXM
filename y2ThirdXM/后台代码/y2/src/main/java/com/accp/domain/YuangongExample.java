package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YuangongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YuangongExample() {
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

        public Criteria andYuannoIsNull() {
            addCriterion("yuanNo is null");
            return (Criteria) this;
        }

        public Criteria andYuannoIsNotNull() {
            addCriterion("yuanNo is not null");
            return (Criteria) this;
        }

        public Criteria andYuannoEqualTo(String value) {
            addCriterion("yuanNo =", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotEqualTo(String value) {
            addCriterion("yuanNo <>", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoGreaterThan(String value) {
            addCriterion("yuanNo >", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoGreaterThanOrEqualTo(String value) {
            addCriterion("yuanNo >=", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoLessThan(String value) {
            addCriterion("yuanNo <", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoLessThanOrEqualTo(String value) {
            addCriterion("yuanNo <=", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoLike(String value) {
            addCriterion("yuanNo like", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotLike(String value) {
            addCriterion("yuanNo not like", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoIn(List<String> values) {
            addCriterion("yuanNo in", values, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotIn(List<String> values) {
            addCriterion("yuanNo not in", values, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoBetween(String value1, String value2) {
            addCriterion("yuanNo between", value1, value2, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotBetween(String value1, String value2) {
            addCriterion("yuanNo not between", value1, value2, "yuanno");
            return (Criteria) this;
        }

        public Criteria andShuxingidIsNull() {
            addCriterion("shuXingId is null");
            return (Criteria) this;
        }

        public Criteria andShuxingidIsNotNull() {
            addCriterion("shuXingId is not null");
            return (Criteria) this;
        }

        public Criteria andShuxingidEqualTo(Integer value) {
            addCriterion("shuXingId =", value, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidNotEqualTo(Integer value) {
            addCriterion("shuXingId <>", value, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidGreaterThan(Integer value) {
            addCriterion("shuXingId >", value, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuXingId >=", value, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidLessThan(Integer value) {
            addCriterion("shuXingId <", value, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidLessThanOrEqualTo(Integer value) {
            addCriterion("shuXingId <=", value, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidIn(List<Integer> values) {
            addCriterion("shuXingId in", values, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidNotIn(List<Integer> values) {
            addCriterion("shuXingId not in", values, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidBetween(Integer value1, Integer value2) {
            addCriterion("shuXingId between", value1, value2, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andShuxingidNotBetween(Integer value1, Integer value2) {
            addCriterion("shuXingId not between", value1, value2, "shuxingid");
            return (Criteria) this;
        }

        public Criteria andBumenidIsNull() {
            addCriterion("BuMenId is null");
            return (Criteria) this;
        }

        public Criteria andBumenidIsNotNull() {
            addCriterion("BuMenId is not null");
            return (Criteria) this;
        }

        public Criteria andBumenidEqualTo(Integer value) {
            addCriterion("BuMenId =", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotEqualTo(Integer value) {
            addCriterion("BuMenId <>", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidGreaterThan(Integer value) {
            addCriterion("BuMenId >", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuMenId >=", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidLessThan(Integer value) {
            addCriterion("BuMenId <", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidLessThanOrEqualTo(Integer value) {
            addCriterion("BuMenId <=", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidIn(List<Integer> values) {
            addCriterion("BuMenId in", values, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotIn(List<Integer> values) {
            addCriterion("BuMenId not in", values, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidBetween(Integer value1, Integer value2) {
            addCriterion("BuMenId between", value1, value2, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotBetween(Integer value1, Integer value2) {
            addCriterion("BuMenId not between", value1, value2, "bumenid");
            return (Criteria) this;
        }

        public Criteria andYuannameIsNull() {
            addCriterion("yuanName is null");
            return (Criteria) this;
        }

        public Criteria andYuannameIsNotNull() {
            addCriterion("yuanName is not null");
            return (Criteria) this;
        }

        public Criteria andYuannameEqualTo(String value) {
            addCriterion("yuanName =", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotEqualTo(String value) {
            addCriterion("yuanName <>", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameGreaterThan(String value) {
            addCriterion("yuanName >", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameGreaterThanOrEqualTo(String value) {
            addCriterion("yuanName >=", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameLessThan(String value) {
            addCriterion("yuanName <", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameLessThanOrEqualTo(String value) {
            addCriterion("yuanName <=", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameLike(String value) {
            addCriterion("yuanName like", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotLike(String value) {
            addCriterion("yuanName not like", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameIn(List<String> values) {
            addCriterion("yuanName in", values, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotIn(List<String> values) {
            addCriterion("yuanName not in", values, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameBetween(String value1, String value2) {
            addCriterion("yuanName between", value1, value2, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotBetween(String value1, String value2) {
            addCriterion("yuanName not between", value1, value2, "yuanname");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmpeopleIsNull() {
            addCriterion("emPeople is null");
            return (Criteria) this;
        }

        public Criteria andEmpeopleIsNotNull() {
            addCriterion("emPeople is not null");
            return (Criteria) this;
        }

        public Criteria andEmpeopleEqualTo(String value) {
            addCriterion("emPeople =", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleNotEqualTo(String value) {
            addCriterion("emPeople <>", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleGreaterThan(String value) {
            addCriterion("emPeople >", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("emPeople >=", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleLessThan(String value) {
            addCriterion("emPeople <", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleLessThanOrEqualTo(String value) {
            addCriterion("emPeople <=", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleLike(String value) {
            addCriterion("emPeople like", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleNotLike(String value) {
            addCriterion("emPeople not like", value, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleIn(List<String> values) {
            addCriterion("emPeople in", values, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleNotIn(List<String> values) {
            addCriterion("emPeople not in", values, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleBetween(String value1, String value2) {
            addCriterion("emPeople between", value1, value2, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmpeopleNotBetween(String value1, String value2) {
            addCriterion("emPeople not between", value1, value2, "empeople");
            return (Criteria) this;
        }

        public Criteria andEmphoneIsNull() {
            addCriterion("emPhone is null");
            return (Criteria) this;
        }

        public Criteria andEmphoneIsNotNull() {
            addCriterion("emPhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmphoneEqualTo(String value) {
            addCriterion("emPhone =", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneNotEqualTo(String value) {
            addCriterion("emPhone <>", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneGreaterThan(String value) {
            addCriterion("emPhone >", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneGreaterThanOrEqualTo(String value) {
            addCriterion("emPhone >=", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneLessThan(String value) {
            addCriterion("emPhone <", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneLessThanOrEqualTo(String value) {
            addCriterion("emPhone <=", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneLike(String value) {
            addCriterion("emPhone like", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneNotLike(String value) {
            addCriterion("emPhone not like", value, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneIn(List<String> values) {
            addCriterion("emPhone in", values, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneNotIn(List<String> values) {
            addCriterion("emPhone not in", values, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneBetween(String value1, String value2) {
            addCriterion("emPhone between", value1, value2, "emphone");
            return (Criteria) this;
        }

        public Criteria andEmphoneNotBetween(String value1, String value2) {
            addCriterion("emPhone not between", value1, value2, "emphone");
            return (Criteria) this;
        }

        public Criteria andZhiwuidIsNull() {
            addCriterion("ZhiWuId is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuidIsNotNull() {
            addCriterion("ZhiWuId is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuidEqualTo(String value) {
            addCriterion("ZhiWuId =", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotEqualTo(String value) {
            addCriterion("ZhiWuId <>", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidGreaterThan(String value) {
            addCriterion("ZhiWuId >", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiWuId >=", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidLessThan(String value) {
            addCriterion("ZhiWuId <", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidLessThanOrEqualTo(String value) {
            addCriterion("ZhiWuId <=", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidLike(String value) {
            addCriterion("ZhiWuId like", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotLike(String value) {
            addCriterion("ZhiWuId not like", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidIn(List<String> values) {
            addCriterion("ZhiWuId in", values, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotIn(List<String> values) {
            addCriterion("ZhiWuId not in", values, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidBetween(String value1, String value2) {
            addCriterion("ZhiWuId between", value1, value2, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotBetween(String value1, String value2) {
            addCriterion("ZhiWuId not between", value1, value2, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andNowaddressIsNull() {
            addCriterion("nowAddress is null");
            return (Criteria) this;
        }

        public Criteria andNowaddressIsNotNull() {
            addCriterion("nowAddress is not null");
            return (Criteria) this;
        }

        public Criteria andNowaddressEqualTo(String value) {
            addCriterion("nowAddress =", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotEqualTo(String value) {
            addCriterion("nowAddress <>", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressGreaterThan(String value) {
            addCriterion("nowAddress >", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressGreaterThanOrEqualTo(String value) {
            addCriterion("nowAddress >=", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressLessThan(String value) {
            addCriterion("nowAddress <", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressLessThanOrEqualTo(String value) {
            addCriterion("nowAddress <=", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressLike(String value) {
            addCriterion("nowAddress like", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotLike(String value) {
            addCriterion("nowAddress not like", value, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressIn(List<String> values) {
            addCriterion("nowAddress in", values, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotIn(List<String> values) {
            addCriterion("nowAddress not in", values, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressBetween(String value1, String value2) {
            addCriterion("nowAddress between", value1, value2, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andNowaddressNotBetween(String value1, String value2) {
            addCriterion("nowAddress not between", value1, value2, "nowaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressIsNull() {
            addCriterion("HuAddress is null");
            return (Criteria) this;
        }

        public Criteria andHuaddressIsNotNull() {
            addCriterion("HuAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHuaddressEqualTo(String value) {
            addCriterion("HuAddress =", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotEqualTo(String value) {
            addCriterion("HuAddress <>", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressGreaterThan(String value) {
            addCriterion("HuAddress >", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("HuAddress >=", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressLessThan(String value) {
            addCriterion("HuAddress <", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressLessThanOrEqualTo(String value) {
            addCriterion("HuAddress <=", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressLike(String value) {
            addCriterion("HuAddress like", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotLike(String value) {
            addCriterion("HuAddress not like", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressIn(List<String> values) {
            addCriterion("HuAddress in", values, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotIn(List<String> values) {
            addCriterion("HuAddress not in", values, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressBetween(String value1, String value2) {
            addCriterion("HuAddress between", value1, value2, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotBetween(String value1, String value2) {
            addCriterion("HuAddress not between", value1, value2, "huaddress");
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

        public Criteria andCardnumberIsNull() {
            addCriterion("cardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("cardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("cardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("cardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("cardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("cardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("cardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("cardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("cardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("cardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("cardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("cardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("cardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBodystateIsNull() {
            addCriterion("bodystate is null");
            return (Criteria) this;
        }

        public Criteria andBodystateIsNotNull() {
            addCriterion("bodystate is not null");
            return (Criteria) this;
        }

        public Criteria andBodystateEqualTo(String value) {
            addCriterion("bodystate =", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateNotEqualTo(String value) {
            addCriterion("bodystate <>", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateGreaterThan(String value) {
            addCriterion("bodystate >", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateGreaterThanOrEqualTo(String value) {
            addCriterion("bodystate >=", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateLessThan(String value) {
            addCriterion("bodystate <", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateLessThanOrEqualTo(String value) {
            addCriterion("bodystate <=", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateLike(String value) {
            addCriterion("bodystate like", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateNotLike(String value) {
            addCriterion("bodystate not like", value, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateIn(List<String> values) {
            addCriterion("bodystate in", values, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateNotIn(List<String> values) {
            addCriterion("bodystate not in", values, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateBetween(String value1, String value2) {
            addCriterion("bodystate between", value1, value2, "bodystate");
            return (Criteria) this;
        }

        public Criteria andBodystateNotBetween(String value1, String value2) {
            addCriterion("bodystate not between", value1, value2, "bodystate");
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

        public Criteria andJiguanIsNull() {
            addCriterion("JiGuan is null");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNotNull() {
            addCriterion("JiGuan is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanEqualTo(String value) {
            addCriterion("JiGuan =", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotEqualTo(String value) {
            addCriterion("JiGuan <>", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThan(String value) {
            addCriterion("JiGuan >", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("JiGuan >=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThan(String value) {
            addCriterion("JiGuan <", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThanOrEqualTo(String value) {
            addCriterion("JiGuan <=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLike(String value) {
            addCriterion("JiGuan like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotLike(String value) {
            addCriterion("JiGuan not like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanIn(List<String> values) {
            addCriterion("JiGuan in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotIn(List<String> values) {
            addCriterion("JiGuan not in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanBetween(String value1, String value2) {
            addCriterion("JiGuan between", value1, value2, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotBetween(String value1, String value2) {
            addCriterion("JiGuan not between", value1, value2, "jiguan");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("MinZu is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("MinZu is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("MinZu =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("MinZu <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("MinZu >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("MinZu >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("MinZu <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("MinZu <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("MinZu like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("MinZu not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("MinZu in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("MinZu not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("MinZu between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("MinZu not between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andHunyinIsNull() {
            addCriterion("HunYin is null");
            return (Criteria) this;
        }

        public Criteria andHunyinIsNotNull() {
            addCriterion("HunYin is not null");
            return (Criteria) this;
        }

        public Criteria andHunyinEqualTo(String value) {
            addCriterion("HunYin =", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinNotEqualTo(String value) {
            addCriterion("HunYin <>", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinGreaterThan(String value) {
            addCriterion("HunYin >", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinGreaterThanOrEqualTo(String value) {
            addCriterion("HunYin >=", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinLessThan(String value) {
            addCriterion("HunYin <", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinLessThanOrEqualTo(String value) {
            addCriterion("HunYin <=", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinLike(String value) {
            addCriterion("HunYin like", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinNotLike(String value) {
            addCriterion("HunYin not like", value, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinIn(List<String> values) {
            addCriterion("HunYin in", values, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinNotIn(List<String> values) {
            addCriterion("HunYin not in", values, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinBetween(String value1, String value2) {
            addCriterion("HunYin between", value1, value2, "hunyin");
            return (Criteria) this;
        }

        public Criteria andHunyinNotBetween(String value1, String value2) {
            addCriterion("HunYin not between", value1, value2, "hunyin");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("XueLi is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XueLi is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("XueLi =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("XueLi <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("XueLi >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("XueLi >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("XueLi <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("XueLi <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("XueLi like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("XueLi not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("XueLi in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("XueLi not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("XueLi between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("XueLi not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andBiyeIsNull() {
            addCriterion("BiYe is null");
            return (Criteria) this;
        }

        public Criteria andBiyeIsNotNull() {
            addCriterion("BiYe is not null");
            return (Criteria) this;
        }

        public Criteria andBiyeEqualTo(String value) {
            addCriterion("BiYe =", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotEqualTo(String value) {
            addCriterion("BiYe <>", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeGreaterThan(String value) {
            addCriterion("BiYe >", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeGreaterThanOrEqualTo(String value) {
            addCriterion("BiYe >=", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeLessThan(String value) {
            addCriterion("BiYe <", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeLessThanOrEqualTo(String value) {
            addCriterion("BiYe <=", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeLike(String value) {
            addCriterion("BiYe like", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotLike(String value) {
            addCriterion("BiYe not like", value, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeIn(List<String> values) {
            addCriterion("BiYe in", values, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotIn(List<String> values) {
            addCriterion("BiYe not in", values, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeBetween(String value1, String value2) {
            addCriterion("BiYe between", value1, value2, "biye");
            return (Criteria) this;
        }

        public Criteria andBiyeNotBetween(String value1, String value2) {
            addCriterion("BiYe not between", value1, value2, "biye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("ZhuanYe is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("ZhuanYe is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("ZhuanYe =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("ZhuanYe <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("ZhuanYe >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuanYe >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("ZhuanYe <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("ZhuanYe <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("ZhuanYe like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("ZhuanYe not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("ZhuanYe in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("ZhuanYe not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("ZhuanYe between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("ZhuanYe not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgIsNull() {
            addCriterion("ZhuanYezg is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgIsNotNull() {
            addCriterion("ZhuanYezg is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgEqualTo(String value) {
            addCriterion("ZhuanYezg =", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgNotEqualTo(String value) {
            addCriterion("ZhuanYezg <>", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgGreaterThan(String value) {
            addCriterion("ZhuanYezg >", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuanYezg >=", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgLessThan(String value) {
            addCriterion("ZhuanYezg <", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgLessThanOrEqualTo(String value) {
            addCriterion("ZhuanYezg <=", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgLike(String value) {
            addCriterion("ZhuanYezg like", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgNotLike(String value) {
            addCriterion("ZhuanYezg not like", value, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgIn(List<String> values) {
            addCriterion("ZhuanYezg in", values, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgNotIn(List<String> values) {
            addCriterion("ZhuanYezg not in", values, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgBetween(String value1, String value2) {
            addCriterion("ZhuanYezg between", value1, value2, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andZhuanyezgNotBetween(String value1, String value2) {
            addCriterion("ZhuanYezg not between", value1, value2, "zhuanyezg");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNull() {
            addCriterion("xueWei is null");
            return (Criteria) this;
        }

        public Criteria andXueweiIsNotNull() {
            addCriterion("xueWei is not null");
            return (Criteria) this;
        }

        public Criteria andXueweiEqualTo(String value) {
            addCriterion("xueWei =", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotEqualTo(String value) {
            addCriterion("xueWei <>", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThan(String value) {
            addCriterion("xueWei >", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiGreaterThanOrEqualTo(String value) {
            addCriterion("xueWei >=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThan(String value) {
            addCriterion("xueWei <", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLessThanOrEqualTo(String value) {
            addCriterion("xueWei <=", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiLike(String value) {
            addCriterion("xueWei like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotLike(String value) {
            addCriterion("xueWei not like", value, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiIn(List<String> values) {
            addCriterion("xueWei in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotIn(List<String> values) {
            addCriterion("xueWei not in", values, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiBetween(String value1, String value2) {
            addCriterion("xueWei between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andXueweiNotBetween(String value1, String value2) {
            addCriterion("xueWei not between", value1, value2, "xuewei");
            return (Criteria) this;
        }

        public Criteria andBianzhiIsNull() {
            addCriterion("bianZhi is null");
            return (Criteria) this;
        }

        public Criteria andBianzhiIsNotNull() {
            addCriterion("bianZhi is not null");
            return (Criteria) this;
        }

        public Criteria andBianzhiEqualTo(String value) {
            addCriterion("bianZhi =", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiNotEqualTo(String value) {
            addCriterion("bianZhi <>", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiGreaterThan(String value) {
            addCriterion("bianZhi >", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiGreaterThanOrEqualTo(String value) {
            addCriterion("bianZhi >=", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiLessThan(String value) {
            addCriterion("bianZhi <", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiLessThanOrEqualTo(String value) {
            addCriterion("bianZhi <=", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiLike(String value) {
            addCriterion("bianZhi like", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiNotLike(String value) {
            addCriterion("bianZhi not like", value, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiIn(List<String> values) {
            addCriterion("bianZhi in", values, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiNotIn(List<String> values) {
            addCriterion("bianZhi not in", values, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiBetween(String value1, String value2) {
            addCriterion("bianZhi between", value1, value2, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andBianzhiNotBetween(String value1, String value2) {
            addCriterion("bianZhi not between", value1, value2, "bianzhi");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNull() {
            addCriterion("shouJi is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("shouJi is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("shouJi =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("shouJi <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("shouJi >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("shouJi >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("shouJi <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("shouJi <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("shouJi like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("shouJi not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("shouJi in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("shouJi not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("shouJi between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("shouJi not between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShiyongIsNull() {
            addCriterion("ShiYong is null");
            return (Criteria) this;
        }

        public Criteria andShiyongIsNotNull() {
            addCriterion("ShiYong is not null");
            return (Criteria) this;
        }

        public Criteria andShiyongEqualTo(Date value) {
            addCriterionForJDBCDate("ShiYong =", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShiYong <>", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongGreaterThan(Date value) {
            addCriterionForJDBCDate("ShiYong >", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShiYong >=", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongLessThan(Date value) {
            addCriterionForJDBCDate("ShiYong <", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShiYong <=", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongIn(List<Date> values) {
            addCriterionForJDBCDate("ShiYong in", values, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShiYong not in", values, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShiYong between", value1, value2, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShiYong not between", value1, value2, "shiyong");
            return (Criteria) this;
        }

        public Criteria andHetongstartIsNull() {
            addCriterion("HeTongstart is null");
            return (Criteria) this;
        }

        public Criteria andHetongstartIsNotNull() {
            addCriterion("HeTongstart is not null");
            return (Criteria) this;
        }

        public Criteria andHetongstartEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongstart =", value, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongstart <>", value, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartGreaterThan(Date value) {
            addCriterionForJDBCDate("HeTongstart >", value, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongstart >=", value, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartLessThan(Date value) {
            addCriterionForJDBCDate("HeTongstart <", value, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongstart <=", value, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartIn(List<Date> values) {
            addCriterionForJDBCDate("HeTongstart in", values, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("HeTongstart not in", values, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HeTongstart between", value1, value2, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HeTongstart not between", value1, value2, "hetongstart");
            return (Criteria) this;
        }

        public Criteria andHetongendIsNull() {
            addCriterion("HeTongEnd is null");
            return (Criteria) this;
        }

        public Criteria andHetongendIsNotNull() {
            addCriterion("HeTongEnd is not null");
            return (Criteria) this;
        }

        public Criteria andHetongendEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongEnd =", value, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendNotEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongEnd <>", value, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendGreaterThan(Date value) {
            addCriterionForJDBCDate("HeTongEnd >", value, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongEnd >=", value, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendLessThan(Date value) {
            addCriterionForJDBCDate("HeTongEnd <", value, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HeTongEnd <=", value, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendIn(List<Date> values) {
            addCriterionForJDBCDate("HeTongEnd in", values, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendNotIn(List<Date> values) {
            addCriterionForJDBCDate("HeTongEnd not in", values, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HeTongEnd between", value1, value2, "hetongend");
            return (Criteria) this;
        }

        public Criteria andHetongendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HeTongEnd not between", value1, value2, "hetongend");
            return (Criteria) this;
        }

        public Criteria andKaziIsNull() {
            addCriterion("KaZi is null");
            return (Criteria) this;
        }

        public Criteria andKaziIsNotNull() {
            addCriterion("KaZi is not null");
            return (Criteria) this;
        }

        public Criteria andKaziEqualTo(String value) {
            addCriterion("KaZi =", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziNotEqualTo(String value) {
            addCriterion("KaZi <>", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziGreaterThan(String value) {
            addCriterion("KaZi >", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziGreaterThanOrEqualTo(String value) {
            addCriterion("KaZi >=", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziLessThan(String value) {
            addCriterion("KaZi <", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziLessThanOrEqualTo(String value) {
            addCriterion("KaZi <=", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziLike(String value) {
            addCriterion("KaZi like", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziNotLike(String value) {
            addCriterion("KaZi not like", value, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziIn(List<String> values) {
            addCriterion("KaZi in", values, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziNotIn(List<String> values) {
            addCriterion("KaZi not in", values, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziBetween(String value1, String value2) {
            addCriterion("KaZi between", value1, value2, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaziNotBetween(String value1, String value2) {
            addCriterion("KaZi not between", value1, value2, "kazi");
            return (Criteria) this;
        }

        public Criteria andKaneiIsNull() {
            addCriterion("KaNei is null");
            return (Criteria) this;
        }

        public Criteria andKaneiIsNotNull() {
            addCriterion("KaNei is not null");
            return (Criteria) this;
        }

        public Criteria andKaneiEqualTo(String value) {
            addCriterion("KaNei =", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiNotEqualTo(String value) {
            addCriterion("KaNei <>", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiGreaterThan(String value) {
            addCriterion("KaNei >", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiGreaterThanOrEqualTo(String value) {
            addCriterion("KaNei >=", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiLessThan(String value) {
            addCriterion("KaNei <", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiLessThanOrEqualTo(String value) {
            addCriterion("KaNei <=", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiLike(String value) {
            addCriterion("KaNei like", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiNotLike(String value) {
            addCriterion("KaNei not like", value, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiIn(List<String> values) {
            addCriterion("KaNei in", values, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiNotIn(List<String> values) {
            addCriterion("KaNei not in", values, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiBetween(String value1, String value2) {
            addCriterion("KaNei between", value1, value2, "kanei");
            return (Criteria) this;
        }

        public Criteria andKaneiNotBetween(String value1, String value2) {
            addCriterion("KaNei not between", value1, value2, "kanei");
            return (Criteria) this;
        }

        public Criteria andTuijianIsNull() {
            addCriterion("TuiJian is null");
            return (Criteria) this;
        }

        public Criteria andTuijianIsNotNull() {
            addCriterion("TuiJian is not null");
            return (Criteria) this;
        }

        public Criteria andTuijianEqualTo(String value) {
            addCriterion("TuiJian =", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotEqualTo(String value) {
            addCriterion("TuiJian <>", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianGreaterThan(String value) {
            addCriterion("TuiJian >", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianGreaterThanOrEqualTo(String value) {
            addCriterion("TuiJian >=", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianLessThan(String value) {
            addCriterion("TuiJian <", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianLessThanOrEqualTo(String value) {
            addCriterion("TuiJian <=", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianLike(String value) {
            addCriterion("TuiJian like", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotLike(String value) {
            addCriterion("TuiJian not like", value, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianIn(List<String> values) {
            addCriterion("TuiJian in", values, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotIn(List<String> values) {
            addCriterion("TuiJian not in", values, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianBetween(String value1, String value2) {
            addCriterion("TuiJian between", value1, value2, "tuijian");
            return (Criteria) this;
        }

        public Criteria andTuijianNotBetween(String value1, String value2) {
            addCriterion("TuiJian not between", value1, value2, "tuijian");
            return (Criteria) this;
        }

        public Criteria andZdzhekouIsNull() {
            addCriterion("zdZheKou is null");
            return (Criteria) this;
        }

        public Criteria andZdzhekouIsNotNull() {
            addCriterion("zdZheKou is not null");
            return (Criteria) this;
        }

        public Criteria andZdzhekouEqualTo(Double value) {
            addCriterion("zdZheKou =", value, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouNotEqualTo(Double value) {
            addCriterion("zdZheKou <>", value, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouGreaterThan(Double value) {
            addCriterion("zdZheKou >", value, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouGreaterThanOrEqualTo(Double value) {
            addCriterion("zdZheKou >=", value, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouLessThan(Double value) {
            addCriterion("zdZheKou <", value, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouLessThanOrEqualTo(Double value) {
            addCriterion("zdZheKou <=", value, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouIn(List<Double> values) {
            addCriterion("zdZheKou in", values, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouNotIn(List<Double> values) {
            addCriterion("zdZheKou not in", values, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouBetween(Double value1, Double value2) {
            addCriterion("zdZheKou between", value1, value2, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andZdzhekouNotBetween(Double value1, Double value2) {
            addCriterion("zdZheKou not between", value1, value2, "zdzhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouIsNull() {
            addCriterion("gsZheKou is null");
            return (Criteria) this;
        }

        public Criteria andGszhekouIsNotNull() {
            addCriterion("gsZheKou is not null");
            return (Criteria) this;
        }

        public Criteria andGszhekouEqualTo(Double value) {
            addCriterion("gsZheKou =", value, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouNotEqualTo(Double value) {
            addCriterion("gsZheKou <>", value, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouGreaterThan(Double value) {
            addCriterion("gsZheKou >", value, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouGreaterThanOrEqualTo(Double value) {
            addCriterion("gsZheKou >=", value, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouLessThan(Double value) {
            addCriterion("gsZheKou <", value, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouLessThanOrEqualTo(Double value) {
            addCriterion("gsZheKou <=", value, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouIn(List<Double> values) {
            addCriterion("gsZheKou in", values, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouNotIn(List<Double> values) {
            addCriterion("gsZheKou not in", values, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouBetween(Double value1, Double value2) {
            addCriterion("gsZheKou between", value1, value2, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andGszhekouNotBetween(Double value1, Double value2) {
            addCriterion("gsZheKou not between", value1, value2, "gszhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouIsNull() {
            addCriterion("spZheKou is null");
            return (Criteria) this;
        }

        public Criteria andSpzhekouIsNotNull() {
            addCriterion("spZheKou is not null");
            return (Criteria) this;
        }

        public Criteria andSpzhekouEqualTo(Double value) {
            addCriterion("spZheKou =", value, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouNotEqualTo(Double value) {
            addCriterion("spZheKou <>", value, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouGreaterThan(Double value) {
            addCriterion("spZheKou >", value, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouGreaterThanOrEqualTo(Double value) {
            addCriterion("spZheKou >=", value, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouLessThan(Double value) {
            addCriterion("spZheKou <", value, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouLessThanOrEqualTo(Double value) {
            addCriterion("spZheKou <=", value, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouIn(List<Double> values) {
            addCriterion("spZheKou in", values, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouNotIn(List<Double> values) {
            addCriterion("spZheKou not in", values, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouBetween(Double value1, Double value2) {
            addCriterion("spZheKou between", value1, value2, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andSpzhekouNotBetween(Double value1, Double value2) {
            addCriterion("spZheKou not between", value1, value2, "spzhekou");
            return (Criteria) this;
        }

        public Criteria andJianmianIsNull() {
            addCriterion("jianMian is null");
            return (Criteria) this;
        }

        public Criteria andJianmianIsNotNull() {
            addCriterion("jianMian is not null");
            return (Criteria) this;
        }

        public Criteria andJianmianEqualTo(Double value) {
            addCriterion("jianMian =", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotEqualTo(Double value) {
            addCriterion("jianMian <>", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianGreaterThan(Double value) {
            addCriterion("jianMian >", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianGreaterThanOrEqualTo(Double value) {
            addCriterion("jianMian >=", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianLessThan(Double value) {
            addCriterion("jianMian <", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianLessThanOrEqualTo(Double value) {
            addCriterion("jianMian <=", value, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianIn(List<Double> values) {
            addCriterion("jianMian in", values, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotIn(List<Double> values) {
            addCriterion("jianMian not in", values, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianBetween(Double value1, Double value2) {
            addCriterion("jianMian between", value1, value2, "jianmian");
            return (Criteria) this;
        }

        public Criteria andJianmianNotBetween(Double value1, Double value2) {
            addCriterion("jianMian not between", value1, value2, "jianmian");
            return (Criteria) this;
        }

        public Criteria andFenqiIsNull() {
            addCriterion("fenqi is null");
            return (Criteria) this;
        }

        public Criteria andFenqiIsNotNull() {
            addCriterion("fenqi is not null");
            return (Criteria) this;
        }

        public Criteria andFenqiEqualTo(String value) {
            addCriterion("fenqi =", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiNotEqualTo(String value) {
            addCriterion("fenqi <>", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiGreaterThan(String value) {
            addCriterion("fenqi >", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiGreaterThanOrEqualTo(String value) {
            addCriterion("fenqi >=", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiLessThan(String value) {
            addCriterion("fenqi <", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiLessThanOrEqualTo(String value) {
            addCriterion("fenqi <=", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiLike(String value) {
            addCriterion("fenqi like", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiNotLike(String value) {
            addCriterion("fenqi not like", value, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiIn(List<String> values) {
            addCriterion("fenqi in", values, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiNotIn(List<String> values) {
            addCriterion("fenqi not in", values, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiBetween(String value1, String value2) {
            addCriterion("fenqi between", value1, value2, "fenqi");
            return (Criteria) this;
        }

        public Criteria andFenqiNotBetween(String value1, String value2) {
            addCriterion("fenqi not between", value1, value2, "fenqi");
            return (Criteria) this;
        }

        public Criteria andSflzIsNull() {
            addCriterion("sflz is null");
            return (Criteria) this;
        }

        public Criteria andSflzIsNotNull() {
            addCriterion("sflz is not null");
            return (Criteria) this;
        }

        public Criteria andSflzEqualTo(Integer value) {
            addCriterion("sflz =", value, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzNotEqualTo(Integer value) {
            addCriterion("sflz <>", value, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzGreaterThan(Integer value) {
            addCriterion("sflz >", value, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzGreaterThanOrEqualTo(Integer value) {
            addCriterion("sflz >=", value, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzLessThan(Integer value) {
            addCriterion("sflz <", value, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzLessThanOrEqualTo(Integer value) {
            addCriterion("sflz <=", value, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzIn(List<Integer> values) {
            addCriterion("sflz in", values, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzNotIn(List<Integer> values) {
            addCriterion("sflz not in", values, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzBetween(Integer value1, Integer value2) {
            addCriterion("sflz between", value1, value2, "sflz");
            return (Criteria) this;
        }

        public Criteria andSflzNotBetween(Integer value1, Integer value2) {
            addCriterion("sflz not between", value1, value2, "sflz");
            return (Criteria) this;
        }

        public Criteria andGangweidIsNull() {
            addCriterion("gangweId is null");
            return (Criteria) this;
        }

        public Criteria andGangweidIsNotNull() {
            addCriterion("gangweId is not null");
            return (Criteria) this;
        }

        public Criteria andGangweidEqualTo(Integer value) {
            addCriterion("gangweId =", value, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidNotEqualTo(Integer value) {
            addCriterion("gangweId <>", value, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidGreaterThan(Integer value) {
            addCriterion("gangweId >", value, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gangweId >=", value, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidLessThan(Integer value) {
            addCriterion("gangweId <", value, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidLessThanOrEqualTo(Integer value) {
            addCriterion("gangweId <=", value, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidIn(List<Integer> values) {
            addCriterion("gangweId in", values, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidNotIn(List<Integer> values) {
            addCriterion("gangweId not in", values, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidBetween(Integer value1, Integer value2) {
            addCriterion("gangweId between", value1, value2, "gangweid");
            return (Criteria) this;
        }

        public Criteria andGangweidNotBetween(Integer value1, Integer value2) {
            addCriterion("gangweId not between", value1, value2, "gangweid");
            return (Criteria) this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEqualTo(String value) {
            addCriterion("login =", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotEqualTo(String value) {
            addCriterion("login <>", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThan(String value) {
            addCriterion("login >", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(String value) {
            addCriterion("login >=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThan(String value) {
            addCriterion("login <", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThanOrEqualTo(String value) {
            addCriterion("login <=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLike(String value) {
            addCriterion("login like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotLike(String value) {
            addCriterion("login not like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginIn(List<String> values) {
            addCriterion("login in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotIn(List<String> values) {
            addCriterion("login not in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginBetween(String value1, String value2) {
            addCriterion("login between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotBetween(String value1, String value2) {
            addCriterion("login not between", value1, value2, "login");
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