package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andSalenoIsNull() {
            addCriterion("SaleNo is null");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNotNull() {
            addCriterion("SaleNo is not null");
            return (Criteria) this;
        }

        public Criteria andSalenoEqualTo(String value) {
            addCriterion("SaleNo =", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotEqualTo(String value) {
            addCriterion("SaleNo <>", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThan(String value) {
            addCriterion("SaleNo >", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThanOrEqualTo(String value) {
            addCriterion("SaleNo >=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThan(String value) {
            addCriterion("SaleNo <", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThanOrEqualTo(String value) {
            addCriterion("SaleNo <=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLike(String value) {
            addCriterion("SaleNo like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotLike(String value) {
            addCriterion("SaleNo not like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoIn(List<String> values) {
            addCriterion("SaleNo in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotIn(List<String> values) {
            addCriterion("SaleNo not in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoBetween(String value1, String value2) {
            addCriterion("SaleNo between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotBetween(String value1, String value2) {
            addCriterion("SaleNo not between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNull() {
            addCriterion("SaleType is null");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNotNull() {
            addCriterion("SaleType is not null");
            return (Criteria) this;
        }

        public Criteria andSaletypeEqualTo(String value) {
            addCriterion("SaleType =", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotEqualTo(String value) {
            addCriterion("SaleType <>", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThan(String value) {
            addCriterion("SaleType >", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThanOrEqualTo(String value) {
            addCriterion("SaleType >=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThan(String value) {
            addCriterion("SaleType <", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThanOrEqualTo(String value) {
            addCriterion("SaleType <=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLike(String value) {
            addCriterion("SaleType like", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotLike(String value) {
            addCriterion("SaleType not like", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeIn(List<String> values) {
            addCriterion("SaleType in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotIn(List<String> values) {
            addCriterion("SaleType not in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeBetween(String value1, String value2) {
            addCriterion("SaleType between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotBetween(String value1, String value2) {
            addCriterion("SaleType not between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("GoodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GoodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("GoodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("GoodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("GoodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("GoodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("GoodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("GoodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("GoodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("GoodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(Integer value) {
            addCriterion("GoodsNumber =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(Integer value) {
            addCriterion("GoodsNumber <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(Integer value) {
            addCriterion("GoodsNumber >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsNumber >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(Integer value) {
            addCriterion("GoodsNumber <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsNumber <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<Integer> values) {
            addCriterion("GoodsNumber in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<Integer> values) {
            addCriterion("GoodsNumber not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(Integer value1, Integer value2) {
            addCriterion("GoodsNumber between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsNumber not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andSaletimeIsNull() {
            addCriterion("SaleTime is null");
            return (Criteria) this;
        }

        public Criteria andSaletimeIsNotNull() {
            addCriterion("SaleTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaletimeEqualTo(Date value) {
            addCriterion("SaleTime =", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotEqualTo(Date value) {
            addCriterion("SaleTime <>", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeGreaterThan(Date value) {
            addCriterion("SaleTime >", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SaleTime >=", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeLessThan(Date value) {
            addCriterion("SaleTime <", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeLessThanOrEqualTo(Date value) {
            addCriterion("SaleTime <=", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeIn(List<Date> values) {
            addCriterion("SaleTime in", values, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotIn(List<Date> values) {
            addCriterion("SaleTime not in", values, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeBetween(Date value1, Date value2) {
            addCriterion("SaleTime between", value1, value2, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotBetween(Date value1, Date value2) {
            addCriterion("SaleTime not between", value1, value2, "saletime");
            return (Criteria) this;
        }

        public Criteria andKaidanIsNull() {
            addCriterion("KaiDan is null");
            return (Criteria) this;
        }

        public Criteria andKaidanIsNotNull() {
            addCriterion("KaiDan is not null");
            return (Criteria) this;
        }

        public Criteria andKaidanEqualTo(String value) {
            addCriterion("KaiDan =", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanNotEqualTo(String value) {
            addCriterion("KaiDan <>", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanGreaterThan(String value) {
            addCriterion("KaiDan >", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanGreaterThanOrEqualTo(String value) {
            addCriterion("KaiDan >=", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanLessThan(String value) {
            addCriterion("KaiDan <", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanLessThanOrEqualTo(String value) {
            addCriterion("KaiDan <=", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanLike(String value) {
            addCriterion("KaiDan like", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanNotLike(String value) {
            addCriterion("KaiDan not like", value, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanIn(List<String> values) {
            addCriterion("KaiDan in", values, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanNotIn(List<String> values) {
            addCriterion("KaiDan not in", values, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanBetween(String value1, String value2) {
            addCriterion("KaiDan between", value1, value2, "kaidan");
            return (Criteria) this;
        }

        public Criteria andKaidanNotBetween(String value1, String value2) {
            addCriterion("KaiDan not between", value1, value2, "kaidan");
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

        public Criteria andJiesuanIsNull() {
            addCriterion("JieSuan is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanIsNotNull() {
            addCriterion("JieSuan is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanEqualTo(String value) {
            addCriterion("JieSuan =", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotEqualTo(String value) {
            addCriterion("JieSuan <>", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanGreaterThan(String value) {
            addCriterion("JieSuan >", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanGreaterThanOrEqualTo(String value) {
            addCriterion("JieSuan >=", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanLessThan(String value) {
            addCriterion("JieSuan <", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanLessThanOrEqualTo(String value) {
            addCriterion("JieSuan <=", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanLike(String value) {
            addCriterion("JieSuan like", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotLike(String value) {
            addCriterion("JieSuan not like", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanIn(List<String> values) {
            addCriterion("JieSuan in", values, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotIn(List<String> values) {
            addCriterion("JieSuan not in", values, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanBetween(String value1, String value2) {
            addCriterion("JieSuan between", value1, value2, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotBetween(String value1, String value2) {
            addCriterion("JieSuan not between", value1, value2, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoIsNull() {
            addCriterion("HuiYuanNo is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoIsNotNull() {
            addCriterion("HuiYuanNo is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoEqualTo(String value) {
            addCriterion("HuiYuanNo =", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotEqualTo(String value) {
            addCriterion("HuiYuanNo <>", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoGreaterThan(String value) {
            addCriterion("HuiYuanNo >", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoGreaterThanOrEqualTo(String value) {
            addCriterion("HuiYuanNo >=", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoLessThan(String value) {
            addCriterion("HuiYuanNo <", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoLessThanOrEqualTo(String value) {
            addCriterion("HuiYuanNo <=", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoLike(String value) {
            addCriterion("HuiYuanNo like", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotLike(String value) {
            addCriterion("HuiYuanNo not like", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoIn(List<String> values) {
            addCriterion("HuiYuanNo in", values, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotIn(List<String> values) {
            addCriterion("HuiYuanNo not in", values, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoBetween(String value1, String value2) {
            addCriterion("HuiYuanNo between", value1, value2, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotBetween(String value1, String value2) {
            addCriterion("HuiYuanNo not between", value1, value2, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeIsNull() {
            addCriterion("JieSuanType is null");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeIsNotNull() {
            addCriterion("JieSuanType is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeEqualTo(String value) {
            addCriterion("JieSuanType =", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotEqualTo(String value) {
            addCriterion("JieSuanType <>", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeGreaterThan(String value) {
            addCriterion("JieSuanType >", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeGreaterThanOrEqualTo(String value) {
            addCriterion("JieSuanType >=", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeLessThan(String value) {
            addCriterion("JieSuanType <", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeLessThanOrEqualTo(String value) {
            addCriterion("JieSuanType <=", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeLike(String value) {
            addCriterion("JieSuanType like", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotLike(String value) {
            addCriterion("JieSuanType not like", value, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeIn(List<String> values) {
            addCriterion("JieSuanType in", values, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotIn(List<String> values) {
            addCriterion("JieSuanType not in", values, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeBetween(String value1, String value2) {
            addCriterion("JieSuanType between", value1, value2, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantypeNotBetween(String value1, String value2) {
            addCriterion("JieSuanType not between", value1, value2, "jiesuantype");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeIsNull() {
            addCriterion("JieSuanTime is null");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeIsNotNull() {
            addCriterion("JieSuanTime is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeEqualTo(Date value) {
            addCriterion("JieSuanTime =", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeNotEqualTo(Date value) {
            addCriterion("JieSuanTime <>", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeGreaterThan(Date value) {
            addCriterion("JieSuanTime >", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JieSuanTime >=", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeLessThan(Date value) {
            addCriterion("JieSuanTime <", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeLessThanOrEqualTo(Date value) {
            addCriterion("JieSuanTime <=", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeIn(List<Date> values) {
            addCriterion("JieSuanTime in", values, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeNotIn(List<Date> values) {
            addCriterion("JieSuanTime not in", values, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeBetween(Date value1, Date value2) {
            addCriterion("JieSuanTime between", value1, value2, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeNotBetween(Date value1, Date value2) {
            addCriterion("JieSuanTime not between", value1, value2, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andYouhuiIsNull() {
            addCriterion("YouHui is null");
            return (Criteria) this;
        }

        public Criteria andYouhuiIsNotNull() {
            addCriterion("YouHui is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuiEqualTo(String value) {
            addCriterion("YouHui =", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotEqualTo(String value) {
            addCriterion("YouHui <>", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiGreaterThan(String value) {
            addCriterion("YouHui >", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiGreaterThanOrEqualTo(String value) {
            addCriterion("YouHui >=", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLessThan(String value) {
            addCriterion("YouHui <", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLessThanOrEqualTo(String value) {
            addCriterion("YouHui <=", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLike(String value) {
            addCriterion("YouHui like", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotLike(String value) {
            addCriterion("YouHui not like", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiIn(List<String> values) {
            addCriterion("YouHui in", values, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotIn(List<String> values) {
            addCriterion("YouHui not in", values, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiBetween(String value1, String value2) {
            addCriterion("YouHui between", value1, value2, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotBetween(String value1, String value2) {
            addCriterion("YouHui not between", value1, value2, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeIsNull() {
            addCriterion("YouHuiType is null");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeIsNotNull() {
            addCriterion("YouHuiType is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeEqualTo(String value) {
            addCriterion("YouHuiType =", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeNotEqualTo(String value) {
            addCriterion("YouHuiType <>", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeGreaterThan(String value) {
            addCriterion("YouHuiType >", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeGreaterThanOrEqualTo(String value) {
            addCriterion("YouHuiType >=", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeLessThan(String value) {
            addCriterion("YouHuiType <", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeLessThanOrEqualTo(String value) {
            addCriterion("YouHuiType <=", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeLike(String value) {
            addCriterion("YouHuiType like", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeNotLike(String value) {
            addCriterion("YouHuiType not like", value, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeIn(List<String> values) {
            addCriterion("YouHuiType in", values, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeNotIn(List<String> values) {
            addCriterion("YouHuiType not in", values, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeBetween(String value1, String value2) {
            addCriterion("YouHuiType between", value1, value2, "youhuitype");
            return (Criteria) this;
        }

        public Criteria andYouhuitypeNotBetween(String value1, String value2) {
            addCriterion("YouHuiType not between", value1, value2, "youhuitype");
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