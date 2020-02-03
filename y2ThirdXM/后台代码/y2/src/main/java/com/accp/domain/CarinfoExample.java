package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarinfoExample() {
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

        public Criteria andXinghaoIsNull() {
            addCriterion("XingHao is null");
            return (Criteria) this;
        }

        public Criteria andXinghaoIsNotNull() {
            addCriterion("XingHao is not null");
            return (Criteria) this;
        }

        public Criteria andXinghaoEqualTo(String value) {
            addCriterion("XingHao =", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoNotEqualTo(String value) {
            addCriterion("XingHao <>", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoGreaterThan(String value) {
            addCriterion("XingHao >", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoGreaterThanOrEqualTo(String value) {
            addCriterion("XingHao >=", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoLessThan(String value) {
            addCriterion("XingHao <", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoLessThanOrEqualTo(String value) {
            addCriterion("XingHao <=", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoLike(String value) {
            addCriterion("XingHao like", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoNotLike(String value) {
            addCriterion("XingHao not like", value, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoIn(List<String> values) {
            addCriterion("XingHao in", values, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoNotIn(List<String> values) {
            addCriterion("XingHao not in", values, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoBetween(String value1, String value2) {
            addCriterion("XingHao between", value1, value2, "xinghao");
            return (Criteria) this;
        }

        public Criteria andXinghaoNotBetween(String value1, String value2) {
            addCriterion("XingHao not between", value1, value2, "xinghao");
            return (Criteria) this;
        }

        public Criteria andCarbankidIsNull() {
            addCriterion("CarBankId is null");
            return (Criteria) this;
        }

        public Criteria andCarbankidIsNotNull() {
            addCriterion("CarBankId is not null");
            return (Criteria) this;
        }

        public Criteria andCarbankidEqualTo(Integer value) {
            addCriterion("CarBankId =", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidNotEqualTo(Integer value) {
            addCriterion("CarBankId <>", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidGreaterThan(Integer value) {
            addCriterion("CarBankId >", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarBankId >=", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidLessThan(Integer value) {
            addCriterion("CarBankId <", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidLessThanOrEqualTo(Integer value) {
            addCriterion("CarBankId <=", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidIn(List<Integer> values) {
            addCriterion("CarBankId in", values, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidNotIn(List<Integer> values) {
            addCriterion("CarBankId not in", values, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidBetween(Integer value1, Integer value2) {
            addCriterion("CarBankId between", value1, value2, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidNotBetween(Integer value1, Integer value2) {
            addCriterion("CarBankId not between", value1, value2, "carbankid");
            return (Criteria) this;
        }

        public Criteria andFabankidIsNull() {
            addCriterion("FaBankId is null");
            return (Criteria) this;
        }

        public Criteria andFabankidIsNotNull() {
            addCriterion("FaBankId is not null");
            return (Criteria) this;
        }

        public Criteria andFabankidEqualTo(Integer value) {
            addCriterion("FaBankId =", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidNotEqualTo(Integer value) {
            addCriterion("FaBankId <>", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidGreaterThan(Integer value) {
            addCriterion("FaBankId >", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FaBankId >=", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidLessThan(Integer value) {
            addCriterion("FaBankId <", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidLessThanOrEqualTo(Integer value) {
            addCriterion("FaBankId <=", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidIn(List<Integer> values) {
            addCriterion("FaBankId in", values, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidNotIn(List<Integer> values) {
            addCriterion("FaBankId not in", values, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidBetween(Integer value1, Integer value2) {
            addCriterion("FaBankId between", value1, value2, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidNotBetween(Integer value1, Integer value2) {
            addCriterion("FaBankId not between", value1, value2, "fabankid");
            return (Criteria) this;
        }

        public Criteria andJinkouIsNull() {
            addCriterion("JinKou is null");
            return (Criteria) this;
        }

        public Criteria andJinkouIsNotNull() {
            addCriterion("JinKou is not null");
            return (Criteria) this;
        }

        public Criteria andJinkouEqualTo(String value) {
            addCriterion("JinKou =", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotEqualTo(String value) {
            addCriterion("JinKou <>", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouGreaterThan(String value) {
            addCriterion("JinKou >", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouGreaterThanOrEqualTo(String value) {
            addCriterion("JinKou >=", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouLessThan(String value) {
            addCriterion("JinKou <", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouLessThanOrEqualTo(String value) {
            addCriterion("JinKou <=", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouLike(String value) {
            addCriterion("JinKou like", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotLike(String value) {
            addCriterion("JinKou not like", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouIn(List<String> values) {
            addCriterion("JinKou in", values, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotIn(List<String> values) {
            addCriterion("JinKou not in", values, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouBetween(String value1, String value2) {
            addCriterion("JinKou between", value1, value2, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotBetween(String value1, String value2) {
            addCriterion("JinKou not between", value1, value2, "jinkou");
            return (Criteria) this;
        }

        public Criteria andCankaopriceIsNull() {
            addCriterion("CanKaoPrice is null");
            return (Criteria) this;
        }

        public Criteria andCankaopriceIsNotNull() {
            addCriterion("CanKaoPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCankaopriceEqualTo(Double value) {
            addCriterion("CanKaoPrice =", value, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceNotEqualTo(Double value) {
            addCriterion("CanKaoPrice <>", value, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceGreaterThan(Double value) {
            addCriterion("CanKaoPrice >", value, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceGreaterThanOrEqualTo(Double value) {
            addCriterion("CanKaoPrice >=", value, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceLessThan(Double value) {
            addCriterion("CanKaoPrice <", value, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceLessThanOrEqualTo(Double value) {
            addCriterion("CanKaoPrice <=", value, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceIn(List<Double> values) {
            addCriterion("CanKaoPrice in", values, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceNotIn(List<Double> values) {
            addCriterion("CanKaoPrice not in", values, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceBetween(Double value1, Double value2) {
            addCriterion("CanKaoPrice between", value1, value2, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andCankaopriceNotBetween(Double value1, Double value2) {
            addCriterion("CanKaoPrice not between", value1, value2, "cankaoprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceIsNull() {
            addCriterion("YearPrice is null");
            return (Criteria) this;
        }

        public Criteria andYearpriceIsNotNull() {
            addCriterion("YearPrice is not null");
            return (Criteria) this;
        }

        public Criteria andYearpriceEqualTo(Double value) {
            addCriterion("YearPrice =", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceNotEqualTo(Double value) {
            addCriterion("YearPrice <>", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceGreaterThan(Double value) {
            addCriterion("YearPrice >", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("YearPrice >=", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceLessThan(Double value) {
            addCriterion("YearPrice <", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceLessThanOrEqualTo(Double value) {
            addCriterion("YearPrice <=", value, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceIn(List<Double> values) {
            addCriterion("YearPrice in", values, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceNotIn(List<Double> values) {
            addCriterion("YearPrice not in", values, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceBetween(Double value1, Double value2) {
            addCriterion("YearPrice between", value1, value2, "yearprice");
            return (Criteria) this;
        }

        public Criteria andYearpriceNotBetween(Double value1, Double value2) {
            addCriterion("YearPrice not between", value1, value2, "yearprice");
            return (Criteria) this;
        }

        public Criteria andGongluIsNull() {
            addCriterion("GongLu is null");
            return (Criteria) this;
        }

        public Criteria andGongluIsNotNull() {
            addCriterion("GongLu is not null");
            return (Criteria) this;
        }

        public Criteria andGongluEqualTo(String value) {
            addCriterion("GongLu =", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluNotEqualTo(String value) {
            addCriterion("GongLu <>", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluGreaterThan(String value) {
            addCriterion("GongLu >", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluGreaterThanOrEqualTo(String value) {
            addCriterion("GongLu >=", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluLessThan(String value) {
            addCriterion("GongLu <", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluLessThanOrEqualTo(String value) {
            addCriterion("GongLu <=", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluLike(String value) {
            addCriterion("GongLu like", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluNotLike(String value) {
            addCriterion("GongLu not like", value, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluIn(List<String> values) {
            addCriterion("GongLu in", values, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluNotIn(List<String> values) {
            addCriterion("GongLu not in", values, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluBetween(String value1, String value2) {
            addCriterion("GongLu between", value1, value2, "gonglu");
            return (Criteria) this;
        }

        public Criteria andGongluNotBetween(String value1, String value2) {
            addCriterion("GongLu not between", value1, value2, "gonglu");
            return (Criteria) this;
        }

        public Criteria andZaizhongIsNull() {
            addCriterion("ZaiZhong is null");
            return (Criteria) this;
        }

        public Criteria andZaizhongIsNotNull() {
            addCriterion("ZaiZhong is not null");
            return (Criteria) this;
        }

        public Criteria andZaizhongEqualTo(String value) {
            addCriterion("ZaiZhong =", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotEqualTo(String value) {
            addCriterion("ZaiZhong <>", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongGreaterThan(String value) {
            addCriterion("ZaiZhong >", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongGreaterThanOrEqualTo(String value) {
            addCriterion("ZaiZhong >=", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLessThan(String value) {
            addCriterion("ZaiZhong <", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLessThanOrEqualTo(String value) {
            addCriterion("ZaiZhong <=", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLike(String value) {
            addCriterion("ZaiZhong like", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotLike(String value) {
            addCriterion("ZaiZhong not like", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongIn(List<String> values) {
            addCriterion("ZaiZhong in", values, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotIn(List<String> values) {
            addCriterion("ZaiZhong not in", values, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongBetween(String value1, String value2) {
            addCriterion("ZaiZhong between", value1, value2, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotBetween(String value1, String value2) {
            addCriterion("ZaiZhong not between", value1, value2, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andRanyouIsNull() {
            addCriterion("RanYou is null");
            return (Criteria) this;
        }

        public Criteria andRanyouIsNotNull() {
            addCriterion("RanYou is not null");
            return (Criteria) this;
        }

        public Criteria andRanyouEqualTo(String value) {
            addCriterion("RanYou =", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotEqualTo(String value) {
            addCriterion("RanYou <>", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouGreaterThan(String value) {
            addCriterion("RanYou >", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouGreaterThanOrEqualTo(String value) {
            addCriterion("RanYou >=", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLessThan(String value) {
            addCriterion("RanYou <", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLessThanOrEqualTo(String value) {
            addCriterion("RanYou <=", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLike(String value) {
            addCriterion("RanYou like", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotLike(String value) {
            addCriterion("RanYou not like", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouIn(List<String> values) {
            addCriterion("RanYou in", values, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotIn(List<String> values) {
            addCriterion("RanYou not in", values, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouBetween(String value1, String value2) {
            addCriterion("RanYou between", value1, value2, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotBetween(String value1, String value2) {
            addCriterion("RanYou not between", value1, value2, "ranyou");
            return (Criteria) this;
        }

        public Criteria andChejiaIsNull() {
            addCriterion("CheJia is null");
            return (Criteria) this;
        }

        public Criteria andChejiaIsNotNull() {
            addCriterion("CheJia is not null");
            return (Criteria) this;
        }

        public Criteria andChejiaEqualTo(String value) {
            addCriterion("CheJia =", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaNotEqualTo(String value) {
            addCriterion("CheJia <>", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaGreaterThan(String value) {
            addCriterion("CheJia >", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaGreaterThanOrEqualTo(String value) {
            addCriterion("CheJia >=", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaLessThan(String value) {
            addCriterion("CheJia <", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaLessThanOrEqualTo(String value) {
            addCriterion("CheJia <=", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaLike(String value) {
            addCriterion("CheJia like", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaNotLike(String value) {
            addCriterion("CheJia not like", value, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaIn(List<String> values) {
            addCriterion("CheJia in", values, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaNotIn(List<String> values) {
            addCriterion("CheJia not in", values, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaBetween(String value1, String value2) {
            addCriterion("CheJia between", value1, value2, "chejia");
            return (Criteria) this;
        }

        public Criteria andChejiaNotBetween(String value1, String value2) {
            addCriterion("CheJia not between", value1, value2, "chejia");
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