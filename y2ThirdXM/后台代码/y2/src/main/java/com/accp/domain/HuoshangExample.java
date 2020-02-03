package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HuoshangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuoshangExample() {
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

        public Criteria andHuoshangnoIsNull() {
            addCriterion("HuoShangNo is null");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoIsNotNull() {
            addCriterion("HuoShangNo is not null");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoEqualTo(String value) {
            addCriterion("HuoShangNo =", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoNotEqualTo(String value) {
            addCriterion("HuoShangNo <>", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoGreaterThan(String value) {
            addCriterion("HuoShangNo >", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoGreaterThanOrEqualTo(String value) {
            addCriterion("HuoShangNo >=", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoLessThan(String value) {
            addCriterion("HuoShangNo <", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoLessThanOrEqualTo(String value) {
            addCriterion("HuoShangNo <=", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoLike(String value) {
            addCriterion("HuoShangNo like", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoNotLike(String value) {
            addCriterion("HuoShangNo not like", value, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoIn(List<String> values) {
            addCriterion("HuoShangNo in", values, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoNotIn(List<String> values) {
            addCriterion("HuoShangNo not in", values, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoBetween(String value1, String value2) {
            addCriterion("HuoShangNo between", value1, value2, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andHuoshangnoNotBetween(String value1, String value2) {
            addCriterion("HuoShangNo not between", value1, value2, "huoshangno");
            return (Criteria) this;
        }

        public Criteria andShangnameIsNull() {
            addCriterion("ShangName is null");
            return (Criteria) this;
        }

        public Criteria andShangnameIsNotNull() {
            addCriterion("ShangName is not null");
            return (Criteria) this;
        }

        public Criteria andShangnameEqualTo(String value) {
            addCriterion("ShangName =", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameNotEqualTo(String value) {
            addCriterion("ShangName <>", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameGreaterThan(String value) {
            addCriterion("ShangName >", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShangName >=", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameLessThan(String value) {
            addCriterion("ShangName <", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameLessThanOrEqualTo(String value) {
            addCriterion("ShangName <=", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameLike(String value) {
            addCriterion("ShangName like", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameNotLike(String value) {
            addCriterion("ShangName not like", value, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameIn(List<String> values) {
            addCriterion("ShangName in", values, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameNotIn(List<String> values) {
            addCriterion("ShangName not in", values, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameBetween(String value1, String value2) {
            addCriterion("ShangName between", value1, value2, "shangname");
            return (Criteria) this;
        }

        public Criteria andShangnameNotBetween(String value1, String value2) {
            addCriterion("ShangName not between", value1, value2, "shangname");
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

        public Criteria andJingyinIsNull() {
            addCriterion("JingYin is null");
            return (Criteria) this;
        }

        public Criteria andJingyinIsNotNull() {
            addCriterion("JingYin is not null");
            return (Criteria) this;
        }

        public Criteria andJingyinEqualTo(String value) {
            addCriterion("JingYin =", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinNotEqualTo(String value) {
            addCriterion("JingYin <>", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinGreaterThan(String value) {
            addCriterion("JingYin >", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinGreaterThanOrEqualTo(String value) {
            addCriterion("JingYin >=", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinLessThan(String value) {
            addCriterion("JingYin <", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinLessThanOrEqualTo(String value) {
            addCriterion("JingYin <=", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinLike(String value) {
            addCriterion("JingYin like", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinNotLike(String value) {
            addCriterion("JingYin not like", value, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinIn(List<String> values) {
            addCriterion("JingYin in", values, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinNotIn(List<String> values) {
            addCriterion("JingYin not in", values, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinBetween(String value1, String value2) {
            addCriterion("JingYin between", value1, value2, "jingyin");
            return (Criteria) this;
        }

        public Criteria andJingyinNotBetween(String value1, String value2) {
            addCriterion("JingYin not between", value1, value2, "jingyin");
            return (Criteria) this;
        }

        public Criteria andWangzhiIsNull() {
            addCriterion("WangZhi is null");
            return (Criteria) this;
        }

        public Criteria andWangzhiIsNotNull() {
            addCriterion("WangZhi is not null");
            return (Criteria) this;
        }

        public Criteria andWangzhiEqualTo(String value) {
            addCriterion("WangZhi =", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotEqualTo(String value) {
            addCriterion("WangZhi <>", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiGreaterThan(String value) {
            addCriterion("WangZhi >", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("WangZhi >=", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLessThan(String value) {
            addCriterion("WangZhi <", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLessThanOrEqualTo(String value) {
            addCriterion("WangZhi <=", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLike(String value) {
            addCriterion("WangZhi like", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotLike(String value) {
            addCriterion("WangZhi not like", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiIn(List<String> values) {
            addCriterion("WangZhi in", values, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotIn(List<String> values) {
            addCriterion("WangZhi not in", values, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiBetween(String value1, String value2) {
            addCriterion("WangZhi between", value1, value2, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotBetween(String value1, String value2) {
            addCriterion("WangZhi not between", value1, value2, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andKaihuIsNull() {
            addCriterion("KaiHu is null");
            return (Criteria) this;
        }

        public Criteria andKaihuIsNotNull() {
            addCriterion("KaiHu is not null");
            return (Criteria) this;
        }

        public Criteria andKaihuEqualTo(String value) {
            addCriterion("KaiHu =", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuNotEqualTo(String value) {
            addCriterion("KaiHu <>", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuGreaterThan(String value) {
            addCriterion("KaiHu >", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuGreaterThanOrEqualTo(String value) {
            addCriterion("KaiHu >=", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuLessThan(String value) {
            addCriterion("KaiHu <", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuLessThanOrEqualTo(String value) {
            addCriterion("KaiHu <=", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuLike(String value) {
            addCriterion("KaiHu like", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuNotLike(String value) {
            addCriterion("KaiHu not like", value, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuIn(List<String> values) {
            addCriterion("KaiHu in", values, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuNotIn(List<String> values) {
            addCriterion("KaiHu not in", values, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuBetween(String value1, String value2) {
            addCriterion("KaiHu between", value1, value2, "kaihu");
            return (Criteria) this;
        }

        public Criteria andKaihuNotBetween(String value1, String value2) {
            addCriterion("KaiHu not between", value1, value2, "kaihu");
            return (Criteria) this;
        }

        public Criteria andYinhangcardIsNull() {
            addCriterion("YinHangCard is null");
            return (Criteria) this;
        }

        public Criteria andYinhangcardIsNotNull() {
            addCriterion("YinHangCard is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangcardEqualTo(String value) {
            addCriterion("YinHangCard =", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardNotEqualTo(String value) {
            addCriterion("YinHangCard <>", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardGreaterThan(String value) {
            addCriterion("YinHangCard >", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardGreaterThanOrEqualTo(String value) {
            addCriterion("YinHangCard >=", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardLessThan(String value) {
            addCriterion("YinHangCard <", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardLessThanOrEqualTo(String value) {
            addCriterion("YinHangCard <=", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardLike(String value) {
            addCriterion("YinHangCard like", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardNotLike(String value) {
            addCriterion("YinHangCard not like", value, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardIn(List<String> values) {
            addCriterion("YinHangCard in", values, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardNotIn(List<String> values) {
            addCriterion("YinHangCard not in", values, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardBetween(String value1, String value2) {
            addCriterion("YinHangCard between", value1, value2, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andYinhangcardNotBetween(String value1, String value2) {
            addCriterion("YinHangCard not between", value1, value2, "yinhangcard");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNull() {
            addCriterion("GoodsNo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNotNull() {
            addCriterion("GoodsNo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoEqualTo(String value) {
            addCriterion("GoodsNo =", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotEqualTo(String value) {
            addCriterion("GoodsNo <>", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThan(String value) {
            addCriterion("GoodsNo >", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsNo >=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThan(String value) {
            addCriterion("GoodsNo <", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThanOrEqualTo(String value) {
            addCriterion("GoodsNo <=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLike(String value) {
            addCriterion("GoodsNo like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotLike(String value) {
            addCriterion("GoodsNo not like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIn(List<String> values) {
            addCriterion("GoodsNo in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotIn(List<String> values) {
            addCriterion("GoodsNo not in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoBetween(String value1, String value2) {
            addCriterion("GoodsNo between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotBetween(String value1, String value2) {
            addCriterion("GoodsNo not between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andFukuanIsNull() {
            addCriterion("FuKuan is null");
            return (Criteria) this;
        }

        public Criteria andFukuanIsNotNull() {
            addCriterion("FuKuan is not null");
            return (Criteria) this;
        }

        public Criteria andFukuanEqualTo(String value) {
            addCriterion("FuKuan =", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotEqualTo(String value) {
            addCriterion("FuKuan <>", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanGreaterThan(String value) {
            addCriterion("FuKuan >", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanGreaterThanOrEqualTo(String value) {
            addCriterion("FuKuan >=", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanLessThan(String value) {
            addCriterion("FuKuan <", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanLessThanOrEqualTo(String value) {
            addCriterion("FuKuan <=", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanLike(String value) {
            addCriterion("FuKuan like", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotLike(String value) {
            addCriterion("FuKuan not like", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanIn(List<String> values) {
            addCriterion("FuKuan in", values, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotIn(List<String> values) {
            addCriterion("FuKuan not in", values, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanBetween(String value1, String value2) {
            addCriterion("FuKuan between", value1, value2, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotBetween(String value1, String value2) {
            addCriterion("FuKuan not between", value1, value2, "fukuan");
            return (Criteria) this;
        }

        public Criteria andShanggradenIsNull() {
            addCriterion("ShangGraden is null");
            return (Criteria) this;
        }

        public Criteria andShanggradenIsNotNull() {
            addCriterion("ShangGraden is not null");
            return (Criteria) this;
        }

        public Criteria andShanggradenEqualTo(String value) {
            addCriterion("ShangGraden =", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenNotEqualTo(String value) {
            addCriterion("ShangGraden <>", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenGreaterThan(String value) {
            addCriterion("ShangGraden >", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenGreaterThanOrEqualTo(String value) {
            addCriterion("ShangGraden >=", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenLessThan(String value) {
            addCriterion("ShangGraden <", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenLessThanOrEqualTo(String value) {
            addCriterion("ShangGraden <=", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenLike(String value) {
            addCriterion("ShangGraden like", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenNotLike(String value) {
            addCriterion("ShangGraden not like", value, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenIn(List<String> values) {
            addCriterion("ShangGraden in", values, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenNotIn(List<String> values) {
            addCriterion("ShangGraden not in", values, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenBetween(String value1, String value2) {
            addCriterion("ShangGraden between", value1, value2, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andShanggradenNotBetween(String value1, String value2) {
            addCriterion("ShangGraden not between", value1, value2, "shanggraden");
            return (Criteria) this;
        }

        public Criteria andJingyintypeIsNull() {
            addCriterion("JingYinType is null");
            return (Criteria) this;
        }

        public Criteria andJingyintypeIsNotNull() {
            addCriterion("JingYinType is not null");
            return (Criteria) this;
        }

        public Criteria andJingyintypeEqualTo(String value) {
            addCriterion("JingYinType =", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeNotEqualTo(String value) {
            addCriterion("JingYinType <>", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeGreaterThan(String value) {
            addCriterion("JingYinType >", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeGreaterThanOrEqualTo(String value) {
            addCriterion("JingYinType >=", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeLessThan(String value) {
            addCriterion("JingYinType <", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeLessThanOrEqualTo(String value) {
            addCriterion("JingYinType <=", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeLike(String value) {
            addCriterion("JingYinType like", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeNotLike(String value) {
            addCriterion("JingYinType not like", value, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeIn(List<String> values) {
            addCriterion("JingYinType in", values, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeNotIn(List<String> values) {
            addCriterion("JingYinType not in", values, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeBetween(String value1, String value2) {
            addCriterion("JingYinType between", value1, value2, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andJingyintypeNotBetween(String value1, String value2) {
            addCriterion("JingYinType not between", value1, value2, "jingyintype");
            return (Criteria) this;
        }

        public Criteria andShangtypeIsNull() {
            addCriterion("ShangType is null");
            return (Criteria) this;
        }

        public Criteria andShangtypeIsNotNull() {
            addCriterion("ShangType is not null");
            return (Criteria) this;
        }

        public Criteria andShangtypeEqualTo(String value) {
            addCriterion("ShangType =", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeNotEqualTo(String value) {
            addCriterion("ShangType <>", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeGreaterThan(String value) {
            addCriterion("ShangType >", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ShangType >=", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeLessThan(String value) {
            addCriterion("ShangType <", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeLessThanOrEqualTo(String value) {
            addCriterion("ShangType <=", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeLike(String value) {
            addCriterion("ShangType like", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeNotLike(String value) {
            addCriterion("ShangType not like", value, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeIn(List<String> values) {
            addCriterion("ShangType in", values, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeNotIn(List<String> values) {
            addCriterion("ShangType not in", values, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeBetween(String value1, String value2) {
            addCriterion("ShangType between", value1, value2, "shangtype");
            return (Criteria) this;
        }

        public Criteria andShangtypeNotBetween(String value1, String value2) {
            addCriterion("ShangType not between", value1, value2, "shangtype");
            return (Criteria) this;
        }

        public Criteria andLianxiIsNull() {
            addCriterion("LianXi is null");
            return (Criteria) this;
        }

        public Criteria andLianxiIsNotNull() {
            addCriterion("LianXi is not null");
            return (Criteria) this;
        }

        public Criteria andLianxiEqualTo(String value) {
            addCriterion("LianXi =", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiNotEqualTo(String value) {
            addCriterion("LianXi <>", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiGreaterThan(String value) {
            addCriterion("LianXi >", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiGreaterThanOrEqualTo(String value) {
            addCriterion("LianXi >=", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiLessThan(String value) {
            addCriterion("LianXi <", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiLessThanOrEqualTo(String value) {
            addCriterion("LianXi <=", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiLike(String value) {
            addCriterion("LianXi like", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiNotLike(String value) {
            addCriterion("LianXi not like", value, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiIn(List<String> values) {
            addCriterion("LianXi in", values, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiNotIn(List<String> values) {
            addCriterion("LianXi not in", values, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiBetween(String value1, String value2) {
            addCriterion("LianXi between", value1, value2, "lianxi");
            return (Criteria) this;
        }

        public Criteria andLianxiNotBetween(String value1, String value2) {
            addCriterion("LianXi not between", value1, value2, "lianxi");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNull() {
            addCriterion("DianHua is null");
            return (Criteria) this;
        }

        public Criteria andDianhuaIsNotNull() {
            addCriterion("DianHua is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuaEqualTo(String value) {
            addCriterion("DianHua =", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotEqualTo(String value) {
            addCriterion("DianHua <>", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThan(String value) {
            addCriterion("DianHua >", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("DianHua >=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThan(String value) {
            addCriterion("DianHua <", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLessThanOrEqualTo(String value) {
            addCriterion("DianHua <=", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaLike(String value) {
            addCriterion("DianHua like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotLike(String value) {
            addCriterion("DianHua not like", value, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaIn(List<String> values) {
            addCriterion("DianHua in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotIn(List<String> values) {
            addCriterion("DianHua not in", values, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaBetween(String value1, String value2) {
            addCriterion("DianHua between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andDianhuaNotBetween(String value1, String value2) {
            addCriterion("DianHua not between", value1, value2, "dianhua");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNull() {
            addCriterion("ShouJi is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("ShouJi is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("ShouJi =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("ShouJi <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("ShouJi >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJi >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("ShouJi <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("ShouJi <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("ShouJi like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("ShouJi not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("ShouJi in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("ShouJi not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("ShouJi between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("ShouJi not between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
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