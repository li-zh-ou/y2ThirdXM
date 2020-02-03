package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JiuyuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiuyuanExample() {
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

        public Criteria andJydannoIsNull() {
            addCriterion("jyDanNo is null");
            return (Criteria) this;
        }

        public Criteria andJydannoIsNotNull() {
            addCriterion("jyDanNo is not null");
            return (Criteria) this;
        }

        public Criteria andJydannoEqualTo(String value) {
            addCriterion("jyDanNo =", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoNotEqualTo(String value) {
            addCriterion("jyDanNo <>", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoGreaterThan(String value) {
            addCriterion("jyDanNo >", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoGreaterThanOrEqualTo(String value) {
            addCriterion("jyDanNo >=", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoLessThan(String value) {
            addCriterion("jyDanNo <", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoLessThanOrEqualTo(String value) {
            addCriterion("jyDanNo <=", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoLike(String value) {
            addCriterion("jyDanNo like", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoNotLike(String value) {
            addCriterion("jyDanNo not like", value, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoIn(List<String> values) {
            addCriterion("jyDanNo in", values, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoNotIn(List<String> values) {
            addCriterion("jyDanNo not in", values, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoBetween(String value1, String value2) {
            addCriterion("jyDanNo between", value1, value2, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJydannoNotBetween(String value1, String value2) {
            addCriterion("jyDanNo not between", value1, value2, "jydanno");
            return (Criteria) this;
        }

        public Criteria andJychepaiIsNull() {
            addCriterion("jyChepai is null");
            return (Criteria) this;
        }

        public Criteria andJychepaiIsNotNull() {
            addCriterion("jyChepai is not null");
            return (Criteria) this;
        }

        public Criteria andJychepaiEqualTo(String value) {
            addCriterion("jyChepai =", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiNotEqualTo(String value) {
            addCriterion("jyChepai <>", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiGreaterThan(String value) {
            addCriterion("jyChepai >", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiGreaterThanOrEqualTo(String value) {
            addCriterion("jyChepai >=", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiLessThan(String value) {
            addCriterion("jyChepai <", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiLessThanOrEqualTo(String value) {
            addCriterion("jyChepai <=", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiLike(String value) {
            addCriterion("jyChepai like", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiNotLike(String value) {
            addCriterion("jyChepai not like", value, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiIn(List<String> values) {
            addCriterion("jyChepai in", values, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiNotIn(List<String> values) {
            addCriterion("jyChepai not in", values, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiBetween(String value1, String value2) {
            addCriterion("jyChepai between", value1, value2, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJychepaiNotBetween(String value1, String value2) {
            addCriterion("jyChepai not between", value1, value2, "jychepai");
            return (Criteria) this;
        }

        public Criteria andJyguwenIsNull() {
            addCriterion("jyGuwen is null");
            return (Criteria) this;
        }

        public Criteria andJyguwenIsNotNull() {
            addCriterion("jyGuwen is not null");
            return (Criteria) this;
        }

        public Criteria andJyguwenEqualTo(String value) {
            addCriterion("jyGuwen =", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenNotEqualTo(String value) {
            addCriterion("jyGuwen <>", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenGreaterThan(String value) {
            addCriterion("jyGuwen >", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenGreaterThanOrEqualTo(String value) {
            addCriterion("jyGuwen >=", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenLessThan(String value) {
            addCriterion("jyGuwen <", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenLessThanOrEqualTo(String value) {
            addCriterion("jyGuwen <=", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenLike(String value) {
            addCriterion("jyGuwen like", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenNotLike(String value) {
            addCriterion("jyGuwen not like", value, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenIn(List<String> values) {
            addCriterion("jyGuwen in", values, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenNotIn(List<String> values) {
            addCriterion("jyGuwen not in", values, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenBetween(String value1, String value2) {
            addCriterion("jyGuwen between", value1, value2, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyguwenNotBetween(String value1, String value2) {
            addCriterion("jyGuwen not between", value1, value2, "jyguwen");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeIsNull() {
            addCriterion("jyYeWuType is null");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeIsNotNull() {
            addCriterion("jyYeWuType is not null");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeEqualTo(String value) {
            addCriterion("jyYeWuType =", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeNotEqualTo(String value) {
            addCriterion("jyYeWuType <>", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeGreaterThan(String value) {
            addCriterion("jyYeWuType >", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeGreaterThanOrEqualTo(String value) {
            addCriterion("jyYeWuType >=", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeLessThan(String value) {
            addCriterion("jyYeWuType <", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeLessThanOrEqualTo(String value) {
            addCriterion("jyYeWuType <=", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeLike(String value) {
            addCriterion("jyYeWuType like", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeNotLike(String value) {
            addCriterion("jyYeWuType not like", value, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeIn(List<String> values) {
            addCriterion("jyYeWuType in", values, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeNotIn(List<String> values) {
            addCriterion("jyYeWuType not in", values, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeBetween(String value1, String value2) {
            addCriterion("jyYeWuType between", value1, value2, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyyewutypeNotBetween(String value1, String value2) {
            addCriterion("jyYeWuType not between", value1, value2, "jyyewutype");
            return (Criteria) this;
        }

        public Criteria andJyshigongIsNull() {
            addCriterion("jyShiGong is null");
            return (Criteria) this;
        }

        public Criteria andJyshigongIsNotNull() {
            addCriterion("jyShiGong is not null");
            return (Criteria) this;
        }

        public Criteria andJyshigongEqualTo(String value) {
            addCriterion("jyShiGong =", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongNotEqualTo(String value) {
            addCriterion("jyShiGong <>", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongGreaterThan(String value) {
            addCriterion("jyShiGong >", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongGreaterThanOrEqualTo(String value) {
            addCriterion("jyShiGong >=", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongLessThan(String value) {
            addCriterion("jyShiGong <", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongLessThanOrEqualTo(String value) {
            addCriterion("jyShiGong <=", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongLike(String value) {
            addCriterion("jyShiGong like", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongNotLike(String value) {
            addCriterion("jyShiGong not like", value, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongIn(List<String> values) {
            addCriterion("jyShiGong in", values, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongNotIn(List<String> values) {
            addCriterion("jyShiGong not in", values, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongBetween(String value1, String value2) {
            addCriterion("jyShiGong between", value1, value2, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andJyshigongNotBetween(String value1, String value2) {
            addCriterion("jyShiGong not between", value1, value2, "jyshigong");
            return (Criteria) this;
        }

        public Criteria andNowlichengIsNull() {
            addCriterion("nowLicheng is null");
            return (Criteria) this;
        }

        public Criteria andNowlichengIsNotNull() {
            addCriterion("nowLicheng is not null");
            return (Criteria) this;
        }

        public Criteria andNowlichengEqualTo(Double value) {
            addCriterion("nowLicheng =", value, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengNotEqualTo(Double value) {
            addCriterion("nowLicheng <>", value, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengGreaterThan(Double value) {
            addCriterion("nowLicheng >", value, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengGreaterThanOrEqualTo(Double value) {
            addCriterion("nowLicheng >=", value, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengLessThan(Double value) {
            addCriterion("nowLicheng <", value, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengLessThanOrEqualTo(Double value) {
            addCriterion("nowLicheng <=", value, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengIn(List<Double> values) {
            addCriterion("nowLicheng in", values, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengNotIn(List<Double> values) {
            addCriterion("nowLicheng not in", values, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengBetween(Double value1, Double value2) {
            addCriterion("nowLicheng between", value1, value2, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andNowlichengNotBetween(Double value1, Double value2) {
            addCriterion("nowLicheng not between", value1, value2, "nowlicheng");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeIsNull() {
            addCriterion("Paigongtime is null");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeIsNotNull() {
            addCriterion("Paigongtime is not null");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeEqualTo(Date value) {
            addCriterion("Paigongtime =", value, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeNotEqualTo(Date value) {
            addCriterion("Paigongtime <>", value, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeGreaterThan(Date value) {
            addCriterion("Paigongtime >", value, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Paigongtime >=", value, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeLessThan(Date value) {
            addCriterion("Paigongtime <", value, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeLessThanOrEqualTo(Date value) {
            addCriterion("Paigongtime <=", value, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeIn(List<Date> values) {
            addCriterion("Paigongtime in", values, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeNotIn(List<Date> values) {
            addCriterion("Paigongtime not in", values, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeBetween(Date value1, Date value2) {
            addCriterion("Paigongtime between", value1, value2, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongtimeNotBetween(Date value1, Date value2) {
            addCriterion("Paigongtime not between", value1, value2, "paigongtime");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuIsNull() {
            addCriterion("PaigongBanzu is null");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuIsNotNull() {
            addCriterion("PaigongBanzu is not null");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuEqualTo(Integer value) {
            addCriterion("PaigongBanzu =", value, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuNotEqualTo(Integer value) {
            addCriterion("PaigongBanzu <>", value, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuGreaterThan(Integer value) {
            addCriterion("PaigongBanzu >", value, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaigongBanzu >=", value, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuLessThan(Integer value) {
            addCriterion("PaigongBanzu <", value, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuLessThanOrEqualTo(Integer value) {
            addCriterion("PaigongBanzu <=", value, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuIn(List<Integer> values) {
            addCriterion("PaigongBanzu in", values, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuNotIn(List<Integer> values) {
            addCriterion("PaigongBanzu not in", values, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuBetween(Integer value1, Integer value2) {
            addCriterion("PaigongBanzu between", value1, value2, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andPaigongbanzuNotBetween(Integer value1, Integer value2) {
            addCriterion("PaigongBanzu not between", value1, value2, "paigongbanzu");
            return (Criteria) this;
        }

        public Criteria andChufatimeIsNull() {
            addCriterion("ChuFaTime is null");
            return (Criteria) this;
        }

        public Criteria andChufatimeIsNotNull() {
            addCriterion("ChuFaTime is not null");
            return (Criteria) this;
        }

        public Criteria andChufatimeEqualTo(Date value) {
            addCriterion("ChuFaTime =", value, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeNotEqualTo(Date value) {
            addCriterion("ChuFaTime <>", value, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeGreaterThan(Date value) {
            addCriterion("ChuFaTime >", value, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ChuFaTime >=", value, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeLessThan(Date value) {
            addCriterion("ChuFaTime <", value, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeLessThanOrEqualTo(Date value) {
            addCriterion("ChuFaTime <=", value, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeIn(List<Date> values) {
            addCriterion("ChuFaTime in", values, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeNotIn(List<Date> values) {
            addCriterion("ChuFaTime not in", values, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeBetween(Date value1, Date value2) {
            addCriterion("ChuFaTime between", value1, value2, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufatimeNotBetween(Date value1, Date value2) {
            addCriterion("ChuFaTime not between", value1, value2, "chufatime");
            return (Criteria) this;
        }

        public Criteria andChufaaddressIsNull() {
            addCriterion("ChuFaAddress is null");
            return (Criteria) this;
        }

        public Criteria andChufaaddressIsNotNull() {
            addCriterion("ChuFaAddress is not null");
            return (Criteria) this;
        }

        public Criteria andChufaaddressEqualTo(String value) {
            addCriterion("ChuFaAddress =", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressNotEqualTo(String value) {
            addCriterion("ChuFaAddress <>", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressGreaterThan(String value) {
            addCriterion("ChuFaAddress >", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ChuFaAddress >=", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressLessThan(String value) {
            addCriterion("ChuFaAddress <", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressLessThanOrEqualTo(String value) {
            addCriterion("ChuFaAddress <=", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressLike(String value) {
            addCriterion("ChuFaAddress like", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressNotLike(String value) {
            addCriterion("ChuFaAddress not like", value, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressIn(List<String> values) {
            addCriterion("ChuFaAddress in", values, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressNotIn(List<String> values) {
            addCriterion("ChuFaAddress not in", values, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressBetween(String value1, String value2) {
            addCriterion("ChuFaAddress between", value1, value2, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andChufaaddressNotBetween(String value1, String value2) {
            addCriterion("ChuFaAddress not between", value1, value2, "chufaaddress");
            return (Criteria) this;
        }

        public Criteria andJiashicarIsNull() {
            addCriterion("JiaShiCar is null");
            return (Criteria) this;
        }

        public Criteria andJiashicarIsNotNull() {
            addCriterion("JiaShiCar is not null");
            return (Criteria) this;
        }

        public Criteria andJiashicarEqualTo(String value) {
            addCriterion("JiaShiCar =", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarNotEqualTo(String value) {
            addCriterion("JiaShiCar <>", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarGreaterThan(String value) {
            addCriterion("JiaShiCar >", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarGreaterThanOrEqualTo(String value) {
            addCriterion("JiaShiCar >=", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarLessThan(String value) {
            addCriterion("JiaShiCar <", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarLessThanOrEqualTo(String value) {
            addCriterion("JiaShiCar <=", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarLike(String value) {
            addCriterion("JiaShiCar like", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarNotLike(String value) {
            addCriterion("JiaShiCar not like", value, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarIn(List<String> values) {
            addCriterion("JiaShiCar in", values, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarNotIn(List<String> values) {
            addCriterion("JiaShiCar not in", values, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarBetween(String value1, String value2) {
            addCriterion("JiaShiCar between", value1, value2, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJiashicarNotBetween(String value1, String value2) {
            addCriterion("JiaShiCar not between", value1, value2, "jiashicar");
            return (Criteria) this;
        }

        public Criteria andJylichenIsNull() {
            addCriterion("jyLiChen is null");
            return (Criteria) this;
        }

        public Criteria andJylichenIsNotNull() {
            addCriterion("jyLiChen is not null");
            return (Criteria) this;
        }

        public Criteria andJylichenEqualTo(Double value) {
            addCriterion("jyLiChen =", value, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenNotEqualTo(Double value) {
            addCriterion("jyLiChen <>", value, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenGreaterThan(Double value) {
            addCriterion("jyLiChen >", value, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenGreaterThanOrEqualTo(Double value) {
            addCriterion("jyLiChen >=", value, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenLessThan(Double value) {
            addCriterion("jyLiChen <", value, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenLessThanOrEqualTo(Double value) {
            addCriterion("jyLiChen <=", value, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenIn(List<Double> values) {
            addCriterion("jyLiChen in", values, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenNotIn(List<Double> values) {
            addCriterion("jyLiChen not in", values, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenBetween(Double value1, Double value2) {
            addCriterion("jyLiChen between", value1, value2, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJylichenNotBetween(Double value1, Double value2) {
            addCriterion("jyLiChen not between", value1, value2, "jylichen");
            return (Criteria) this;
        }

        public Criteria andJyendaddressIsNull() {
            addCriterion("jyEndAddress is null");
            return (Criteria) this;
        }

        public Criteria andJyendaddressIsNotNull() {
            addCriterion("jyEndAddress is not null");
            return (Criteria) this;
        }

        public Criteria andJyendaddressEqualTo(String value) {
            addCriterion("jyEndAddress =", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressNotEqualTo(String value) {
            addCriterion("jyEndAddress <>", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressGreaterThan(String value) {
            addCriterion("jyEndAddress >", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("jyEndAddress >=", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressLessThan(String value) {
            addCriterion("jyEndAddress <", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressLessThanOrEqualTo(String value) {
            addCriterion("jyEndAddress <=", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressLike(String value) {
            addCriterion("jyEndAddress like", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressNotLike(String value) {
            addCriterion("jyEndAddress not like", value, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressIn(List<String> values) {
            addCriterion("jyEndAddress in", values, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressNotIn(List<String> values) {
            addCriterion("jyEndAddress not in", values, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressBetween(String value1, String value2) {
            addCriterion("jyEndAddress between", value1, value2, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendaddressNotBetween(String value1, String value2) {
            addCriterion("jyEndAddress not between", value1, value2, "jyendaddress");
            return (Criteria) this;
        }

        public Criteria andJyendtimeIsNull() {
            addCriterion("jyEndTime is null");
            return (Criteria) this;
        }

        public Criteria andJyendtimeIsNotNull() {
            addCriterion("jyEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andJyendtimeEqualTo(Date value) {
            addCriterion("jyEndTime =", value, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeNotEqualTo(Date value) {
            addCriterion("jyEndTime <>", value, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeGreaterThan(Date value) {
            addCriterion("jyEndTime >", value, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jyEndTime >=", value, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeLessThan(Date value) {
            addCriterion("jyEndTime <", value, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeLessThanOrEqualTo(Date value) {
            addCriterion("jyEndTime <=", value, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeIn(List<Date> values) {
            addCriterion("jyEndTime in", values, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeNotIn(List<Date> values) {
            addCriterion("jyEndTime not in", values, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeBetween(Date value1, Date value2) {
            addCriterion("jyEndTime between", value1, value2, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andJyendtimeNotBetween(Date value1, Date value2) {
            addCriterion("jyEndTime not between", value1, value2, "jyendtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeIsNull() {
            addCriterion("WanGongTime is null");
            return (Criteria) this;
        }

        public Criteria andWangongtimeIsNotNull() {
            addCriterion("WanGongTime is not null");
            return (Criteria) this;
        }

        public Criteria andWangongtimeEqualTo(Date value) {
            addCriterion("WanGongTime =", value, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeNotEqualTo(Date value) {
            addCriterion("WanGongTime <>", value, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeGreaterThan(Date value) {
            addCriterion("WanGongTime >", value, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WanGongTime >=", value, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeLessThan(Date value) {
            addCriterion("WanGongTime <", value, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeLessThanOrEqualTo(Date value) {
            addCriterion("WanGongTime <=", value, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeIn(List<Date> values) {
            addCriterion("WanGongTime in", values, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeNotIn(List<Date> values) {
            addCriterion("WanGongTime not in", values, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeBetween(Date value1, Date value2) {
            addCriterion("WanGongTime between", value1, value2, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andWangongtimeNotBetween(Date value1, Date value2) {
            addCriterion("WanGongTime not between", value1, value2, "wangongtime");
            return (Criteria) this;
        }

        public Criteria andYugumoneyIsNull() {
            addCriterion("Yugumoney is null");
            return (Criteria) this;
        }

        public Criteria andYugumoneyIsNotNull() {
            addCriterion("Yugumoney is not null");
            return (Criteria) this;
        }

        public Criteria andYugumoneyEqualTo(Double value) {
            addCriterion("Yugumoney =", value, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyNotEqualTo(Double value) {
            addCriterion("Yugumoney <>", value, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyGreaterThan(Double value) {
            addCriterion("Yugumoney >", value, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Yugumoney >=", value, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyLessThan(Double value) {
            addCriterion("Yugumoney <", value, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyLessThanOrEqualTo(Double value) {
            addCriterion("Yugumoney <=", value, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyIn(List<Double> values) {
            addCriterion("Yugumoney in", values, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyNotIn(List<Double> values) {
            addCriterion("Yugumoney not in", values, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyBetween(Double value1, Double value2) {
            addCriterion("Yugumoney between", value1, value2, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andYugumoneyNotBetween(Double value1, Double value2) {
            addCriterion("Yugumoney not between", value1, value2, "yugumoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyIsNull() {
            addCriterion("tureMoney is null");
            return (Criteria) this;
        }

        public Criteria andTuremoneyIsNotNull() {
            addCriterion("tureMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTuremoneyEqualTo(Double value) {
            addCriterion("tureMoney =", value, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyNotEqualTo(Double value) {
            addCriterion("tureMoney <>", value, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyGreaterThan(Double value) {
            addCriterion("tureMoney >", value, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tureMoney >=", value, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyLessThan(Double value) {
            addCriterion("tureMoney <", value, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyLessThanOrEqualTo(Double value) {
            addCriterion("tureMoney <=", value, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyIn(List<Double> values) {
            addCriterion("tureMoney in", values, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyNotIn(List<Double> values) {
            addCriterion("tureMoney not in", values, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyBetween(Double value1, Double value2) {
            addCriterion("tureMoney between", value1, value2, "turemoney");
            return (Criteria) this;
        }

        public Criteria andTuremoneyNotBetween(Double value1, Double value2) {
            addCriterion("tureMoney not between", value1, value2, "turemoney");
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

        public Criteria andJychengshuIsNull() {
            addCriterion("jyChengShu is null");
            return (Criteria) this;
        }

        public Criteria andJychengshuIsNotNull() {
            addCriterion("jyChengShu is not null");
            return (Criteria) this;
        }

        public Criteria andJychengshuEqualTo(String value) {
            addCriterion("jyChengShu =", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuNotEqualTo(String value) {
            addCriterion("jyChengShu <>", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuGreaterThan(String value) {
            addCriterion("jyChengShu >", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuGreaterThanOrEqualTo(String value) {
            addCriterion("jyChengShu >=", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuLessThan(String value) {
            addCriterion("jyChengShu <", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuLessThanOrEqualTo(String value) {
            addCriterion("jyChengShu <=", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuLike(String value) {
            addCriterion("jyChengShu like", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuNotLike(String value) {
            addCriterion("jyChengShu not like", value, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuIn(List<String> values) {
            addCriterion("jyChengShu in", values, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuNotIn(List<String> values) {
            addCriterion("jyChengShu not in", values, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuBetween(String value1, String value2) {
            addCriterion("jyChengShu between", value1, value2, "jychengshu");
            return (Criteria) this;
        }

        public Criteria andJychengshuNotBetween(String value1, String value2) {
            addCriterion("jyChengShu not between", value1, value2, "jychengshu");
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