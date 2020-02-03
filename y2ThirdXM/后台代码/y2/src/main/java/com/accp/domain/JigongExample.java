package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JigongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JigongExample() {
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

        public Criteria andJigongnoIsNull() {
            addCriterion("JiGongNo is null");
            return (Criteria) this;
        }

        public Criteria andJigongnoIsNotNull() {
            addCriterion("JiGongNo is not null");
            return (Criteria) this;
        }

        public Criteria andJigongnoEqualTo(String value) {
            addCriterion("JiGongNo =", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoNotEqualTo(String value) {
            addCriterion("JiGongNo <>", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoGreaterThan(String value) {
            addCriterion("JiGongNo >", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoGreaterThanOrEqualTo(String value) {
            addCriterion("JiGongNo >=", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoLessThan(String value) {
            addCriterion("JiGongNo <", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoLessThanOrEqualTo(String value) {
            addCriterion("JiGongNo <=", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoLike(String value) {
            addCriterion("JiGongNo like", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoNotLike(String value) {
            addCriterion("JiGongNo not like", value, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoIn(List<String> values) {
            addCriterion("JiGongNo in", values, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoNotIn(List<String> values) {
            addCriterion("JiGongNo not in", values, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoBetween(String value1, String value2) {
            addCriterion("JiGongNo between", value1, value2, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongnoNotBetween(String value1, String value2) {
            addCriterion("JiGongNo not between", value1, value2, "jigongno");
            return (Criteria) this;
        }

        public Criteria andJigongxingIsNull() {
            addCriterion("jiGongXing is null");
            return (Criteria) this;
        }

        public Criteria andJigongxingIsNotNull() {
            addCriterion("jiGongXing is not null");
            return (Criteria) this;
        }

        public Criteria andJigongxingEqualTo(Integer value) {
            addCriterion("jiGongXing =", value, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingNotEqualTo(Integer value) {
            addCriterion("jiGongXing <>", value, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingGreaterThan(Integer value) {
            addCriterion("jiGongXing >", value, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiGongXing >=", value, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingLessThan(Integer value) {
            addCriterion("jiGongXing <", value, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingLessThanOrEqualTo(Integer value) {
            addCriterion("jiGongXing <=", value, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingIn(List<Integer> values) {
            addCriterion("jiGongXing in", values, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingNotIn(List<Integer> values) {
            addCriterion("jiGongXing not in", values, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingBetween(Integer value1, Integer value2) {
            addCriterion("jiGongXing between", value1, value2, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andJigongxingNotBetween(Integer value1, Integer value2) {
            addCriterion("jiGongXing not between", value1, value2, "jigongxing");
            return (Criteria) this;
        }

        public Criteria andBanidIsNull() {
            addCriterion("BanId is null");
            return (Criteria) this;
        }

        public Criteria andBanidIsNotNull() {
            addCriterion("BanId is not null");
            return (Criteria) this;
        }

        public Criteria andBanidEqualTo(Integer value) {
            addCriterion("BanId =", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotEqualTo(Integer value) {
            addCriterion("BanId <>", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidGreaterThan(Integer value) {
            addCriterion("BanId >", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BanId >=", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidLessThan(Integer value) {
            addCriterion("BanId <", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidLessThanOrEqualTo(Integer value) {
            addCriterion("BanId <=", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidIn(List<Integer> values) {
            addCriterion("BanId in", values, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotIn(List<Integer> values) {
            addCriterion("BanId not in", values, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidBetween(Integer value1, Integer value2) {
            addCriterion("BanId between", value1, value2, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotBetween(Integer value1, Integer value2) {
            addCriterion("BanId not between", value1, value2, "banid");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeIsNull() {
            addCriterion("WeiXiuType is null");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeIsNotNull() {
            addCriterion("WeiXiuType is not null");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeEqualTo(String value) {
            addCriterion("WeiXiuType =", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeNotEqualTo(String value) {
            addCriterion("WeiXiuType <>", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeGreaterThan(String value) {
            addCriterion("WeiXiuType >", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeGreaterThanOrEqualTo(String value) {
            addCriterion("WeiXiuType >=", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeLessThan(String value) {
            addCriterion("WeiXiuType <", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeLessThanOrEqualTo(String value) {
            addCriterion("WeiXiuType <=", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeLike(String value) {
            addCriterion("WeiXiuType like", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeNotLike(String value) {
            addCriterion("WeiXiuType not like", value, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeIn(List<String> values) {
            addCriterion("WeiXiuType in", values, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeNotIn(List<String> values) {
            addCriterion("WeiXiuType not in", values, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeBetween(String value1, String value2) {
            addCriterion("WeiXiuType between", value1, value2, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiutypeNotBetween(String value1, String value2) {
            addCriterion("WeiXiuType not between", value1, value2, "weixiutype");
            return (Criteria) this;
        }

        public Criteria andWeixiubankIsNull() {
            addCriterion("WeiXiuBank is null");
            return (Criteria) this;
        }

        public Criteria andWeixiubankIsNotNull() {
            addCriterion("WeiXiuBank is not null");
            return (Criteria) this;
        }

        public Criteria andWeixiubankEqualTo(String value) {
            addCriterion("WeiXiuBank =", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankNotEqualTo(String value) {
            addCriterion("WeiXiuBank <>", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankGreaterThan(String value) {
            addCriterion("WeiXiuBank >", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankGreaterThanOrEqualTo(String value) {
            addCriterion("WeiXiuBank >=", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankLessThan(String value) {
            addCriterion("WeiXiuBank <", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankLessThanOrEqualTo(String value) {
            addCriterion("WeiXiuBank <=", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankLike(String value) {
            addCriterion("WeiXiuBank like", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankNotLike(String value) {
            addCriterion("WeiXiuBank not like", value, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankIn(List<String> values) {
            addCriterion("WeiXiuBank in", values, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankNotIn(List<String> values) {
            addCriterion("WeiXiuBank not in", values, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankBetween(String value1, String value2) {
            addCriterion("WeiXiuBank between", value1, value2, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andWeixiubankNotBetween(String value1, String value2) {
            addCriterion("WeiXiuBank not between", value1, value2, "weixiubank");
            return (Criteria) this;
        }

        public Criteria andJigongnameIsNull() {
            addCriterion("JiGongName is null");
            return (Criteria) this;
        }

        public Criteria andJigongnameIsNotNull() {
            addCriterion("JiGongName is not null");
            return (Criteria) this;
        }

        public Criteria andJigongnameEqualTo(String value) {
            addCriterion("JiGongName =", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameNotEqualTo(String value) {
            addCriterion("JiGongName <>", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameGreaterThan(String value) {
            addCriterion("JiGongName >", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameGreaterThanOrEqualTo(String value) {
            addCriterion("JiGongName >=", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameLessThan(String value) {
            addCriterion("JiGongName <", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameLessThanOrEqualTo(String value) {
            addCriterion("JiGongName <=", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameLike(String value) {
            addCriterion("JiGongName like", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameNotLike(String value) {
            addCriterion("JiGongName not like", value, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameIn(List<String> values) {
            addCriterion("JiGongName in", values, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameNotIn(List<String> values) {
            addCriterion("JiGongName not in", values, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameBetween(String value1, String value2) {
            addCriterion("JiGongName between", value1, value2, "jigongname");
            return (Criteria) this;
        }

        public Criteria andJigongnameNotBetween(String value1, String value2) {
            addCriterion("JiGongName not between", value1, value2, "jigongname");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andWxIsNull() {
            addCriterion("wx is null");
            return (Criteria) this;
        }

        public Criteria andWxIsNotNull() {
            addCriterion("wx is not null");
            return (Criteria) this;
        }

        public Criteria andWxEqualTo(String value) {
            addCriterion("wx =", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotEqualTo(String value) {
            addCriterion("wx <>", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThan(String value) {
            addCriterion("wx >", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThanOrEqualTo(String value) {
            addCriterion("wx >=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThan(String value) {
            addCriterion("wx <", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThanOrEqualTo(String value) {
            addCriterion("wx <=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLike(String value) {
            addCriterion("wx like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotLike(String value) {
            addCriterion("wx not like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxIn(List<String> values) {
            addCriterion("wx in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotIn(List<String> values) {
            addCriterion("wx not in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxBetween(String value1, String value2) {
            addCriterion("wx between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotBetween(String value1, String value2) {
            addCriterion("wx not between", value1, value2, "wx");
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

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andHukouaddressIsNull() {
            addCriterion("HuKouAddress is null");
            return (Criteria) this;
        }

        public Criteria andHukouaddressIsNotNull() {
            addCriterion("HuKouAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHukouaddressEqualTo(String value) {
            addCriterion("HuKouAddress =", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressNotEqualTo(String value) {
            addCriterion("HuKouAddress <>", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressGreaterThan(String value) {
            addCriterion("HuKouAddress >", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressGreaterThanOrEqualTo(String value) {
            addCriterion("HuKouAddress >=", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressLessThan(String value) {
            addCriterion("HuKouAddress <", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressLessThanOrEqualTo(String value) {
            addCriterion("HuKouAddress <=", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressLike(String value) {
            addCriterion("HuKouAddress like", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressNotLike(String value) {
            addCriterion("HuKouAddress not like", value, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressIn(List<String> values) {
            addCriterion("HuKouAddress in", values, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressNotIn(List<String> values) {
            addCriterion("HuKouAddress not in", values, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressBetween(String value1, String value2) {
            addCriterion("HuKouAddress between", value1, value2, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andHukouaddressNotBetween(String value1, String value2) {
            addCriterion("HuKouAddress not between", value1, value2, "hukouaddress");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("Bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("Bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("Bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("Bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("Bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("Bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("Bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("Bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("Bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("Bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("Bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("Bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("Bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("Bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("BankCard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("BankCard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("BankCard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("BankCard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("BankCard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("BankCard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("BankCard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("BankCard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("BankCard like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("BankCard not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("BankCard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("BankCard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("BankCard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("BankCard not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andIszuzhangIsNull() {
            addCriterion("isZuZhang is null");
            return (Criteria) this;
        }

        public Criteria andIszuzhangIsNotNull() {
            addCriterion("isZuZhang is not null");
            return (Criteria) this;
        }

        public Criteria andIszuzhangEqualTo(Integer value) {
            addCriterion("isZuZhang =", value, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangNotEqualTo(Integer value) {
            addCriterion("isZuZhang <>", value, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangGreaterThan(Integer value) {
            addCriterion("isZuZhang >", value, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangGreaterThanOrEqualTo(Integer value) {
            addCriterion("isZuZhang >=", value, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangLessThan(Integer value) {
            addCriterion("isZuZhang <", value, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangLessThanOrEqualTo(Integer value) {
            addCriterion("isZuZhang <=", value, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangIn(List<Integer> values) {
            addCriterion("isZuZhang in", values, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangNotIn(List<Integer> values) {
            addCriterion("isZuZhang not in", values, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangBetween(Integer value1, Integer value2) {
            addCriterion("isZuZhang between", value1, value2, "iszuzhang");
            return (Criteria) this;
        }

        public Criteria andIszuzhangNotBetween(Integer value1, Integer value2) {
            addCriterion("isZuZhang not between", value1, value2, "iszuzhang");
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