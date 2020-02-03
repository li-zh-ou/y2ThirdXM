package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("Goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("Goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("Goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("Goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("Goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("Goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("Goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("Goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("Goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("Goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("Goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("GoodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("GoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("GoodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("GoodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("GoodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("GoodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("GoodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("GoodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("GoodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("GoodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("GoodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("GoodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("GoodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsbankIsNull() {
            addCriterion("GoodsBank is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbankIsNotNull() {
            addCriterion("GoodsBank is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbankEqualTo(String value) {
            addCriterion("GoodsBank =", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankNotEqualTo(String value) {
            addCriterion("GoodsBank <>", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankGreaterThan(String value) {
            addCriterion("GoodsBank >", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsBank >=", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankLessThan(String value) {
            addCriterion("GoodsBank <", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankLessThanOrEqualTo(String value) {
            addCriterion("GoodsBank <=", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankLike(String value) {
            addCriterion("GoodsBank like", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankNotLike(String value) {
            addCriterion("GoodsBank not like", value, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankIn(List<String> values) {
            addCriterion("GoodsBank in", values, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankNotIn(List<String> values) {
            addCriterion("GoodsBank not in", values, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankBetween(String value1, String value2) {
            addCriterion("GoodsBank between", value1, value2, "goodsbank");
            return (Criteria) this;
        }

        public Criteria andGoodsbankNotBetween(String value1, String value2) {
            addCriterion("GoodsBank not between", value1, value2, "goodsbank");
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

        public Criteria andShiyongEqualTo(String value) {
            addCriterion("ShiYong =", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotEqualTo(String value) {
            addCriterion("ShiYong <>", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongGreaterThan(String value) {
            addCriterion("ShiYong >", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongGreaterThanOrEqualTo(String value) {
            addCriterion("ShiYong >=", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongLessThan(String value) {
            addCriterion("ShiYong <", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongLessThanOrEqualTo(String value) {
            addCriterion("ShiYong <=", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongLike(String value) {
            addCriterion("ShiYong like", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotLike(String value) {
            addCriterion("ShiYong not like", value, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongIn(List<String> values) {
            addCriterion("ShiYong in", values, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotIn(List<String> values) {
            addCriterion("ShiYong not in", values, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongBetween(String value1, String value2) {
            addCriterion("ShiYong between", value1, value2, "shiyong");
            return (Criteria) this;
        }

        public Criteria andShiyongNotBetween(String value1, String value2) {
            addCriterion("ShiYong not between", value1, value2, "shiyong");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNull() {
            addCriterion("DanWei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("DanWei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("DanWei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("DanWei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("DanWei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("DanWei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("DanWei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("DanWei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("DanWei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("DanWei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("DanWei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("DanWei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("DanWei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("DanWei not between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNull() {
            addCriterion("GoodsTypeId is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNotNull() {
            addCriterion("GoodsTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidEqualTo(Integer value) {
            addCriterion("GoodsTypeId =", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotEqualTo(Integer value) {
            addCriterion("GoodsTypeId <>", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThan(Integer value) {
            addCriterion("GoodsTypeId >", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsTypeId >=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThan(Integer value) {
            addCriterion("GoodsTypeId <", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsTypeId <=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIn(List<Integer> values) {
            addCriterion("GoodsTypeId in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotIn(List<Integer> values) {
            addCriterion("GoodsTypeId not in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsTypeId between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsTypeId not between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andShouruidIsNull() {
            addCriterion("ShouRuId is null");
            return (Criteria) this;
        }

        public Criteria andShouruidIsNotNull() {
            addCriterion("ShouRuId is not null");
            return (Criteria) this;
        }

        public Criteria andShouruidEqualTo(Integer value) {
            addCriterion("ShouRuId =", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotEqualTo(Integer value) {
            addCriterion("ShouRuId <>", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidGreaterThan(Integer value) {
            addCriterion("ShouRuId >", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouRuId >=", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidLessThan(Integer value) {
            addCriterion("ShouRuId <", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidLessThanOrEqualTo(Integer value) {
            addCriterion("ShouRuId <=", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidIn(List<Integer> values) {
            addCriterion("ShouRuId in", values, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotIn(List<Integer> values) {
            addCriterion("ShouRuId not in", values, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidBetween(Integer value1, Integer value2) {
            addCriterion("ShouRuId between", value1, value2, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouRuId not between", value1, value2, "shouruid");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangIsNull() {
            addCriterion("YuanFuChang is null");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangIsNotNull() {
            addCriterion("YuanFuChang is not null");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangEqualTo(String value) {
            addCriterion("YuanFuChang =", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangNotEqualTo(String value) {
            addCriterion("YuanFuChang <>", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangGreaterThan(String value) {
            addCriterion("YuanFuChang >", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangGreaterThanOrEqualTo(String value) {
            addCriterion("YuanFuChang >=", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangLessThan(String value) {
            addCriterion("YuanFuChang <", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangLessThanOrEqualTo(String value) {
            addCriterion("YuanFuChang <=", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangLike(String value) {
            addCriterion("YuanFuChang like", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangNotLike(String value) {
            addCriterion("YuanFuChang not like", value, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangIn(List<String> values) {
            addCriterion("YuanFuChang in", values, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangNotIn(List<String> values) {
            addCriterion("YuanFuChang not in", values, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangBetween(String value1, String value2) {
            addCriterion("YuanFuChang between", value1, value2, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andYuanfuchangNotBetween(String value1, String value2) {
            addCriterion("YuanFuChang not between", value1, value2, "yuanfuchang");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenIsNull() {
            addCriterion("GoodsGraden is null");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenIsNotNull() {
            addCriterion("GoodsGraden is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenEqualTo(String value) {
            addCriterion("GoodsGraden =", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenNotEqualTo(String value) {
            addCriterion("GoodsGraden <>", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenGreaterThan(String value) {
            addCriterion("GoodsGraden >", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsGraden >=", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenLessThan(String value) {
            addCriterion("GoodsGraden <", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenLessThanOrEqualTo(String value) {
            addCriterion("GoodsGraden <=", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenLike(String value) {
            addCriterion("GoodsGraden like", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenNotLike(String value) {
            addCriterion("GoodsGraden not like", value, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenIn(List<String> values) {
            addCriterion("GoodsGraden in", values, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenNotIn(List<String> values) {
            addCriterion("GoodsGraden not in", values, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenBetween(String value1, String value2) {
            addCriterion("GoodsGraden between", value1, value2, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsgradenNotBetween(String value1, String value2) {
            addCriterion("GoodsGraden not between", value1, value2, "goodsgraden");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressIsNull() {
            addCriterion("GoodsAddress is null");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressIsNotNull() {
            addCriterion("GoodsAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressEqualTo(String value) {
            addCriterion("GoodsAddress =", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressNotEqualTo(String value) {
            addCriterion("GoodsAddress <>", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressGreaterThan(String value) {
            addCriterion("GoodsAddress >", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsAddress >=", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressLessThan(String value) {
            addCriterion("GoodsAddress <", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressLessThanOrEqualTo(String value) {
            addCriterion("GoodsAddress <=", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressLike(String value) {
            addCriterion("GoodsAddress like", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressNotLike(String value) {
            addCriterion("GoodsAddress not like", value, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressIn(List<String> values) {
            addCriterion("GoodsAddress in", values, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressNotIn(List<String> values) {
            addCriterion("GoodsAddress not in", values, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressBetween(String value1, String value2) {
            addCriterion("GoodsAddress between", value1, value2, "goodsaddress");
            return (Criteria) this;
        }

        public Criteria andGoodsaddressNotBetween(String value1, String value2) {
            addCriterion("GoodsAddress not between", value1, value2, "goodsaddress");
            return (Criteria) this;
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

        public Criteria andBaozhuanIsNull() {
            addCriterion("BaoZhuan is null");
            return (Criteria) this;
        }

        public Criteria andBaozhuanIsNotNull() {
            addCriterion("BaoZhuan is not null");
            return (Criteria) this;
        }

        public Criteria andBaozhuanEqualTo(String value) {
            addCriterion("BaoZhuan =", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanNotEqualTo(String value) {
            addCriterion("BaoZhuan <>", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanGreaterThan(String value) {
            addCriterion("BaoZhuan >", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanGreaterThanOrEqualTo(String value) {
            addCriterion("BaoZhuan >=", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanLessThan(String value) {
            addCriterion("BaoZhuan <", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanLessThanOrEqualTo(String value) {
            addCriterion("BaoZhuan <=", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanLike(String value) {
            addCriterion("BaoZhuan like", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanNotLike(String value) {
            addCriterion("BaoZhuan not like", value, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanIn(List<String> values) {
            addCriterion("BaoZhuan in", values, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanNotIn(List<String> values) {
            addCriterion("BaoZhuan not in", values, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanBetween(String value1, String value2) {
            addCriterion("BaoZhuan between", value1, value2, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andBaozhuanNotBetween(String value1, String value2) {
            addCriterion("BaoZhuan not between", value1, value2, "baozhuan");
            return (Criteria) this;
        }

        public Criteria andTijiIsNull() {
            addCriterion("TiJi is null");
            return (Criteria) this;
        }

        public Criteria andTijiIsNotNull() {
            addCriterion("TiJi is not null");
            return (Criteria) this;
        }

        public Criteria andTijiEqualTo(Double value) {
            addCriterion("TiJi =", value, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiNotEqualTo(Double value) {
            addCriterion("TiJi <>", value, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiGreaterThan(Double value) {
            addCriterion("TiJi >", value, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiGreaterThanOrEqualTo(Double value) {
            addCriterion("TiJi >=", value, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiLessThan(Double value) {
            addCriterion("TiJi <", value, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiLessThanOrEqualTo(Double value) {
            addCriterion("TiJi <=", value, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiIn(List<Double> values) {
            addCriterion("TiJi in", values, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiNotIn(List<Double> values) {
            addCriterion("TiJi not in", values, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiBetween(Double value1, Double value2) {
            addCriterion("TiJi between", value1, value2, "tiji");
            return (Criteria) this;
        }

        public Criteria andTijiNotBetween(Double value1, Double value2) {
            addCriterion("TiJi not between", value1, value2, "tiji");
            return (Criteria) this;
        }

        public Criteria andMaozhongIsNull() {
            addCriterion("MaoZhong is null");
            return (Criteria) this;
        }

        public Criteria andMaozhongIsNotNull() {
            addCriterion("MaoZhong is not null");
            return (Criteria) this;
        }

        public Criteria andMaozhongEqualTo(Double value) {
            addCriterion("MaoZhong =", value, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongNotEqualTo(Double value) {
            addCriterion("MaoZhong <>", value, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongGreaterThan(Double value) {
            addCriterion("MaoZhong >", value, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongGreaterThanOrEqualTo(Double value) {
            addCriterion("MaoZhong >=", value, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongLessThan(Double value) {
            addCriterion("MaoZhong <", value, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongLessThanOrEqualTo(Double value) {
            addCriterion("MaoZhong <=", value, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongIn(List<Double> values) {
            addCriterion("MaoZhong in", values, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongNotIn(List<Double> values) {
            addCriterion("MaoZhong not in", values, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongBetween(Double value1, Double value2) {
            addCriterion("MaoZhong between", value1, value2, "maozhong");
            return (Criteria) this;
        }

        public Criteria andMaozhongNotBetween(Double value1, Double value2) {
            addCriterion("MaoZhong not between", value1, value2, "maozhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongIsNull() {
            addCriterion("JingZhong is null");
            return (Criteria) this;
        }

        public Criteria andJingzhongIsNotNull() {
            addCriterion("JingZhong is not null");
            return (Criteria) this;
        }

        public Criteria andJingzhongEqualTo(Double value) {
            addCriterion("JingZhong =", value, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongNotEqualTo(Double value) {
            addCriterion("JingZhong <>", value, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongGreaterThan(Double value) {
            addCriterion("JingZhong >", value, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongGreaterThanOrEqualTo(Double value) {
            addCriterion("JingZhong >=", value, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongLessThan(Double value) {
            addCriterion("JingZhong <", value, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongLessThanOrEqualTo(Double value) {
            addCriterion("JingZhong <=", value, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongIn(List<Double> values) {
            addCriterion("JingZhong in", values, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongNotIn(List<Double> values) {
            addCriterion("JingZhong not in", values, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongBetween(Double value1, Double value2) {
            addCriterion("JingZhong between", value1, value2, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJingzhongNotBetween(Double value1, Double value2) {
            addCriterion("JingZhong not between", value1, value2, "jingzhong");
            return (Criteria) this;
        }

        public Criteria andJinhuoIsNull() {
            addCriterion("JinHuo is null");
            return (Criteria) this;
        }

        public Criteria andJinhuoIsNotNull() {
            addCriterion("JinHuo is not null");
            return (Criteria) this;
        }

        public Criteria andJinhuoEqualTo(String value) {
            addCriterion("JinHuo =", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoNotEqualTo(String value) {
            addCriterion("JinHuo <>", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoGreaterThan(String value) {
            addCriterion("JinHuo >", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoGreaterThanOrEqualTo(String value) {
            addCriterion("JinHuo >=", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoLessThan(String value) {
            addCriterion("JinHuo <", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoLessThanOrEqualTo(String value) {
            addCriterion("JinHuo <=", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoLike(String value) {
            addCriterion("JinHuo like", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoNotLike(String value) {
            addCriterion("JinHuo not like", value, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoIn(List<String> values) {
            addCriterion("JinHuo in", values, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoNotIn(List<String> values) {
            addCriterion("JinHuo not in", values, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoBetween(String value1, String value2) {
            addCriterion("JinHuo between", value1, value2, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andJinhuoNotBetween(String value1, String value2) {
            addCriterion("JinHuo not between", value1, value2, "jinhuo");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNull() {
            addCriterion("ShouJia is null");
            return (Criteria) this;
        }

        public Criteria andShoujiaIsNotNull() {
            addCriterion("ShouJia is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiaEqualTo(Double value) {
            addCriterion("ShouJia =", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotEqualTo(Double value) {
            addCriterion("ShouJia <>", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThan(Double value) {
            addCriterion("ShouJia >", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaGreaterThanOrEqualTo(Double value) {
            addCriterion("ShouJia >=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThan(Double value) {
            addCriterion("ShouJia <", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaLessThanOrEqualTo(Double value) {
            addCriterion("ShouJia <=", value, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaIn(List<Double> values) {
            addCriterion("ShouJia in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotIn(List<Double> values) {
            addCriterion("ShouJia not in", values, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaBetween(Double value1, Double value2) {
            addCriterion("ShouJia between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andShoujiaNotBetween(Double value1, Double value2) {
            addCriterion("ShouJia not between", value1, value2, "shoujia");
            return (Criteria) this;
        }

        public Criteria andJiajiaIsNull() {
            addCriterion("JiaJia is null");
            return (Criteria) this;
        }

        public Criteria andJiajiaIsNotNull() {
            addCriterion("JiaJia is not null");
            return (Criteria) this;
        }

        public Criteria andJiajiaEqualTo(String value) {
            addCriterion("JiaJia =", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaNotEqualTo(String value) {
            addCriterion("JiaJia <>", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaGreaterThan(String value) {
            addCriterion("JiaJia >", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaGreaterThanOrEqualTo(String value) {
            addCriterion("JiaJia >=", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaLessThan(String value) {
            addCriterion("JiaJia <", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaLessThanOrEqualTo(String value) {
            addCriterion("JiaJia <=", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaLike(String value) {
            addCriterion("JiaJia like", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaNotLike(String value) {
            addCriterion("JiaJia not like", value, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaIn(List<String> values) {
            addCriterion("JiaJia in", values, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaNotIn(List<String> values) {
            addCriterion("JiaJia not in", values, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaBetween(String value1, String value2) {
            addCriterion("JiaJia between", value1, value2, "jiajia");
            return (Criteria) this;
        }

        public Criteria andJiajiaNotBetween(String value1, String value2) {
            addCriterion("JiaJia not between", value1, value2, "jiajia");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("VIPprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("VIPprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Double value) {
            addCriterion("VIPprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Double value) {
            addCriterion("VIPprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Double value) {
            addCriterion("VIPprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("VIPprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Double value) {
            addCriterion("VIPprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Double value) {
            addCriterion("VIPprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Double> values) {
            addCriterion("VIPprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Double> values) {
            addCriterion("VIPprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Double value1, Double value2) {
            addCriterion("VIPprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Double value1, Double value2) {
            addCriterion("VIPprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceIsNull() {
            addCriterion("Huiprice is null");
            return (Criteria) this;
        }

        public Criteria andHuipriceIsNotNull() {
            addCriterion("Huiprice is not null");
            return (Criteria) this;
        }

        public Criteria andHuipriceEqualTo(Double value) {
            addCriterion("Huiprice =", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceNotEqualTo(Double value) {
            addCriterion("Huiprice <>", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceGreaterThan(Double value) {
            addCriterion("Huiprice >", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Huiprice >=", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceLessThan(Double value) {
            addCriterion("Huiprice <", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceLessThanOrEqualTo(Double value) {
            addCriterion("Huiprice <=", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceIn(List<Double> values) {
            addCriterion("Huiprice in", values, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceNotIn(List<Double> values) {
            addCriterion("Huiprice not in", values, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceBetween(Double value1, Double value2) {
            addCriterion("Huiprice between", value1, value2, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceNotBetween(Double value1, Double value2) {
            addCriterion("Huiprice not between", value1, value2, "huiprice");
            return (Criteria) this;
        }

        public Criteria andIstiyongIsNull() {
            addCriterion("isTiYong is null");
            return (Criteria) this;
        }

        public Criteria andIstiyongIsNotNull() {
            addCriterion("isTiYong is not null");
            return (Criteria) this;
        }

        public Criteria andIstiyongEqualTo(String value) {
            addCriterion("isTiYong =", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongNotEqualTo(String value) {
            addCriterion("isTiYong <>", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongGreaterThan(String value) {
            addCriterion("isTiYong >", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongGreaterThanOrEqualTo(String value) {
            addCriterion("isTiYong >=", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongLessThan(String value) {
            addCriterion("isTiYong <", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongLessThanOrEqualTo(String value) {
            addCriterion("isTiYong <=", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongLike(String value) {
            addCriterion("isTiYong like", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongNotLike(String value) {
            addCriterion("isTiYong not like", value, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongIn(List<String> values) {
            addCriterion("isTiYong in", values, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongNotIn(List<String> values) {
            addCriterion("isTiYong not in", values, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongBetween(String value1, String value2) {
            addCriterion("isTiYong between", value1, value2, "istiyong");
            return (Criteria) this;
        }

        public Criteria andIstiyongNotBetween(String value1, String value2) {
            addCriterion("isTiYong not between", value1, value2, "istiyong");
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