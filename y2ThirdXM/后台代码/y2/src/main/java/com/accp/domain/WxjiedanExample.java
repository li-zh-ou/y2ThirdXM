package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxjiedanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxjiedanExample() {
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

        public Criteria andWxdantypeIsNull() {
            addCriterion("wxDanType is null");
            return (Criteria) this;
        }

        public Criteria andWxdantypeIsNotNull() {
            addCriterion("wxDanType is not null");
            return (Criteria) this;
        }

        public Criteria andWxdantypeEqualTo(String value) {
            addCriterion("wxDanType =", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeNotEqualTo(String value) {
            addCriterion("wxDanType <>", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeGreaterThan(String value) {
            addCriterion("wxDanType >", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeGreaterThanOrEqualTo(String value) {
            addCriterion("wxDanType >=", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeLessThan(String value) {
            addCriterion("wxDanType <", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeLessThanOrEqualTo(String value) {
            addCriterion("wxDanType <=", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeLike(String value) {
            addCriterion("wxDanType like", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeNotLike(String value) {
            addCriterion("wxDanType not like", value, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeIn(List<String> values) {
            addCriterion("wxDanType in", values, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeNotIn(List<String> values) {
            addCriterion("wxDanType not in", values, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeBetween(String value1, String value2) {
            addCriterion("wxDanType between", value1, value2, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxdantypeNotBetween(String value1, String value2) {
            addCriterion("wxDanType not between", value1, value2, "wxdantype");
            return (Criteria) this;
        }

        public Criteria andWxtypeIsNull() {
            addCriterion("wxType is null");
            return (Criteria) this;
        }

        public Criteria andWxtypeIsNotNull() {
            addCriterion("wxType is not null");
            return (Criteria) this;
        }

        public Criteria andWxtypeEqualTo(String value) {
            addCriterion("wxType =", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotEqualTo(String value) {
            addCriterion("wxType <>", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeGreaterThan(String value) {
            addCriterion("wxType >", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeGreaterThanOrEqualTo(String value) {
            addCriterion("wxType >=", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeLessThan(String value) {
            addCriterion("wxType <", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeLessThanOrEqualTo(String value) {
            addCriterion("wxType <=", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeLike(String value) {
            addCriterion("wxType like", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotLike(String value) {
            addCriterion("wxType not like", value, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeIn(List<String> values) {
            addCriterion("wxType in", values, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotIn(List<String> values) {
            addCriterion("wxType not in", values, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeBetween(String value1, String value2) {
            addCriterion("wxType between", value1, value2, "wxtype");
            return (Criteria) this;
        }

        public Criteria andWxtypeNotBetween(String value1, String value2) {
            addCriterion("wxType not between", value1, value2, "wxtype");
            return (Criteria) this;
        }

        public Criteria andDanjustatuIsNull() {
            addCriterion("DanJuStatu is null");
            return (Criteria) this;
        }

        public Criteria andDanjustatuIsNotNull() {
            addCriterion("DanJuStatu is not null");
            return (Criteria) this;
        }

        public Criteria andDanjustatuEqualTo(String value) {
            addCriterion("DanJuStatu =", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuNotEqualTo(String value) {
            addCriterion("DanJuStatu <>", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuGreaterThan(String value) {
            addCriterion("DanJuStatu >", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuGreaterThanOrEqualTo(String value) {
            addCriterion("DanJuStatu >=", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuLessThan(String value) {
            addCriterion("DanJuStatu <", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuLessThanOrEqualTo(String value) {
            addCriterion("DanJuStatu <=", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuLike(String value) {
            addCriterion("DanJuStatu like", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuNotLike(String value) {
            addCriterion("DanJuStatu not like", value, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuIn(List<String> values) {
            addCriterion("DanJuStatu in", values, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuNotIn(List<String> values) {
            addCriterion("DanJuStatu not in", values, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuBetween(String value1, String value2) {
            addCriterion("DanJuStatu between", value1, value2, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andDanjustatuNotBetween(String value1, String value2) {
            addCriterion("DanJuStatu not between", value1, value2, "danjustatu");
            return (Criteria) this;
        }

        public Criteria andKaidantimeIsNull() {
            addCriterion("Kaidantime is null");
            return (Criteria) this;
        }

        public Criteria andKaidantimeIsNotNull() {
            addCriterion("Kaidantime is not null");
            return (Criteria) this;
        }

        public Criteria andKaidantimeEqualTo(Date value) {
            addCriterion("Kaidantime =", value, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeNotEqualTo(Date value) {
            addCriterion("Kaidantime <>", value, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeGreaterThan(Date value) {
            addCriterion("Kaidantime >", value, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Kaidantime >=", value, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeLessThan(Date value) {
            addCriterion("Kaidantime <", value, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeLessThanOrEqualTo(Date value) {
            addCriterion("Kaidantime <=", value, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeIn(List<Date> values) {
            addCriterion("Kaidantime in", values, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeNotIn(List<Date> values) {
            addCriterion("Kaidantime not in", values, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeBetween(Date value1, Date value2) {
            addCriterion("Kaidantime between", value1, value2, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKaidantimeNotBetween(Date value1, Date value2) {
            addCriterion("Kaidantime not between", value1, value2, "kaidantime");
            return (Criteria) this;
        }

        public Criteria andKehunnoIsNull() {
            addCriterion("KeHunNo is null");
            return (Criteria) this;
        }

        public Criteria andKehunnoIsNotNull() {
            addCriterion("KeHunNo is not null");
            return (Criteria) this;
        }

        public Criteria andKehunnoEqualTo(String value) {
            addCriterion("KeHunNo =", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoNotEqualTo(String value) {
            addCriterion("KeHunNo <>", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoGreaterThan(String value) {
            addCriterion("KeHunNo >", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoGreaterThanOrEqualTo(String value) {
            addCriterion("KeHunNo >=", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoLessThan(String value) {
            addCriterion("KeHunNo <", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoLessThanOrEqualTo(String value) {
            addCriterion("KeHunNo <=", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoLike(String value) {
            addCriterion("KeHunNo like", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoNotLike(String value) {
            addCriterion("KeHunNo not like", value, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoIn(List<String> values) {
            addCriterion("KeHunNo in", values, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoNotIn(List<String> values) {
            addCriterion("KeHunNo not in", values, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoBetween(String value1, String value2) {
            addCriterion("KeHunNo between", value1, value2, "kehunno");
            return (Criteria) this;
        }

        public Criteria andKehunnoNotBetween(String value1, String value2) {
            addCriterion("KeHunNo not between", value1, value2, "kehunno");
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

        public Criteria andCarxinghaoIsNull() {
            addCriterion("CarXingHao is null");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoIsNotNull() {
            addCriterion("CarXingHao is not null");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoEqualTo(String value) {
            addCriterion("CarXingHao =", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoNotEqualTo(String value) {
            addCriterion("CarXingHao <>", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoGreaterThan(String value) {
            addCriterion("CarXingHao >", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoGreaterThanOrEqualTo(String value) {
            addCriterion("CarXingHao >=", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoLessThan(String value) {
            addCriterion("CarXingHao <", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoLessThanOrEqualTo(String value) {
            addCriterion("CarXingHao <=", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoLike(String value) {
            addCriterion("CarXingHao like", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoNotLike(String value) {
            addCriterion("CarXingHao not like", value, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoIn(List<String> values) {
            addCriterion("CarXingHao in", values, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoNotIn(List<String> values) {
            addCriterion("CarXingHao not in", values, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoBetween(String value1, String value2) {
            addCriterion("CarXingHao between", value1, value2, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andCarxinghaoNotBetween(String value1, String value2) {
            addCriterion("CarXingHao not between", value1, value2, "carxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoIsNull() {
            addCriterion("CheJiaXingHao is null");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoIsNotNull() {
            addCriterion("CheJiaXingHao is not null");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoEqualTo(String value) {
            addCriterion("CheJiaXingHao =", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoNotEqualTo(String value) {
            addCriterion("CheJiaXingHao <>", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoGreaterThan(String value) {
            addCriterion("CheJiaXingHao >", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoGreaterThanOrEqualTo(String value) {
            addCriterion("CheJiaXingHao >=", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoLessThan(String value) {
            addCriterion("CheJiaXingHao <", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoLessThanOrEqualTo(String value) {
            addCriterion("CheJiaXingHao <=", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoLike(String value) {
            addCriterion("CheJiaXingHao like", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoNotLike(String value) {
            addCriterion("CheJiaXingHao not like", value, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoIn(List<String> values) {
            addCriterion("CheJiaXingHao in", values, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoNotIn(List<String> values) {
            addCriterion("CheJiaXingHao not in", values, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoBetween(String value1, String value2) {
            addCriterion("CheJiaXingHao between", value1, value2, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andChejiaxinghaoNotBetween(String value1, String value2) {
            addCriterion("CheJiaXingHao not between", value1, value2, "chejiaxinghao");
            return (Criteria) this;
        }

        public Criteria andFanumberIsNull() {
            addCriterion("FaNumber is null");
            return (Criteria) this;
        }

        public Criteria andFanumberIsNotNull() {
            addCriterion("FaNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFanumberEqualTo(String value) {
            addCriterion("FaNumber =", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotEqualTo(String value) {
            addCriterion("FaNumber <>", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberGreaterThan(String value) {
            addCriterion("FaNumber >", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberGreaterThanOrEqualTo(String value) {
            addCriterion("FaNumber >=", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberLessThan(String value) {
            addCriterion("FaNumber <", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberLessThanOrEqualTo(String value) {
            addCriterion("FaNumber <=", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberLike(String value) {
            addCriterion("FaNumber like", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotLike(String value) {
            addCriterion("FaNumber not like", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberIn(List<String> values) {
            addCriterion("FaNumber in", values, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotIn(List<String> values) {
            addCriterion("FaNumber not in", values, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberBetween(String value1, String value2) {
            addCriterion("FaNumber between", value1, value2, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotBetween(String value1, String value2) {
            addCriterion("FaNumber not between", value1, value2, "fanumber");
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

        public Criteria andChezhuIsNull() {
            addCriterion("CheZhu is null");
            return (Criteria) this;
        }

        public Criteria andChezhuIsNotNull() {
            addCriterion("CheZhu is not null");
            return (Criteria) this;
        }

        public Criteria andChezhuEqualTo(String value) {
            addCriterion("CheZhu =", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuNotEqualTo(String value) {
            addCriterion("CheZhu <>", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuGreaterThan(String value) {
            addCriterion("CheZhu >", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuGreaterThanOrEqualTo(String value) {
            addCriterion("CheZhu >=", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuLessThan(String value) {
            addCriterion("CheZhu <", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuLessThanOrEqualTo(String value) {
            addCriterion("CheZhu <=", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuLike(String value) {
            addCriterion("CheZhu like", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuNotLike(String value) {
            addCriterion("CheZhu not like", value, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuIn(List<String> values) {
            addCriterion("CheZhu in", values, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuNotIn(List<String> values) {
            addCriterion("CheZhu not in", values, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuBetween(String value1, String value2) {
            addCriterion("CheZhu between", value1, value2, "chezhu");
            return (Criteria) this;
        }

        public Criteria andChezhuNotBetween(String value1, String value2) {
            addCriterion("CheZhu not between", value1, value2, "chezhu");
            return (Criteria) this;
        }

        public Criteria andSijinameIsNull() {
            addCriterion("SiJiName is null");
            return (Criteria) this;
        }

        public Criteria andSijinameIsNotNull() {
            addCriterion("SiJiName is not null");
            return (Criteria) this;
        }

        public Criteria andSijinameEqualTo(String value) {
            addCriterion("SiJiName =", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameNotEqualTo(String value) {
            addCriterion("SiJiName <>", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameGreaterThan(String value) {
            addCriterion("SiJiName >", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameGreaterThanOrEqualTo(String value) {
            addCriterion("SiJiName >=", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameLessThan(String value) {
            addCriterion("SiJiName <", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameLessThanOrEqualTo(String value) {
            addCriterion("SiJiName <=", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameLike(String value) {
            addCriterion("SiJiName like", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameNotLike(String value) {
            addCriterion("SiJiName not like", value, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameIn(List<String> values) {
            addCriterion("SiJiName in", values, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameNotIn(List<String> values) {
            addCriterion("SiJiName not in", values, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameBetween(String value1, String value2) {
            addCriterion("SiJiName between", value1, value2, "sijiname");
            return (Criteria) this;
        }

        public Criteria andSijinameNotBetween(String value1, String value2) {
            addCriterion("SiJiName not between", value1, value2, "sijiname");
            return (Criteria) this;
        }

        public Criteria andLianphoneIsNull() {
            addCriterion("LianPhone is null");
            return (Criteria) this;
        }

        public Criteria andLianphoneIsNotNull() {
            addCriterion("LianPhone is not null");
            return (Criteria) this;
        }

        public Criteria andLianphoneEqualTo(String value) {
            addCriterion("LianPhone =", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneNotEqualTo(String value) {
            addCriterion("LianPhone <>", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneGreaterThan(String value) {
            addCriterion("LianPhone >", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LianPhone >=", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneLessThan(String value) {
            addCriterion("LianPhone <", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneLessThanOrEqualTo(String value) {
            addCriterion("LianPhone <=", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneLike(String value) {
            addCriterion("LianPhone like", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneNotLike(String value) {
            addCriterion("LianPhone not like", value, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneIn(List<String> values) {
            addCriterion("LianPhone in", values, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneNotIn(List<String> values) {
            addCriterion("LianPhone not in", values, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneBetween(String value1, String value2) {
            addCriterion("LianPhone between", value1, value2, "lianphone");
            return (Criteria) this;
        }

        public Criteria andLianphoneNotBetween(String value1, String value2) {
            addCriterion("LianPhone not between", value1, value2, "lianphone");
            return (Criteria) this;
        }

        public Criteria andJinchanliIsNull() {
            addCriterion("JinChanLi is null");
            return (Criteria) this;
        }

        public Criteria andJinchanliIsNotNull() {
            addCriterion("JinChanLi is not null");
            return (Criteria) this;
        }

        public Criteria andJinchanliEqualTo(Integer value) {
            addCriterion("JinChanLi =", value, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliNotEqualTo(Integer value) {
            addCriterion("JinChanLi <>", value, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliGreaterThan(Integer value) {
            addCriterion("JinChanLi >", value, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliGreaterThanOrEqualTo(Integer value) {
            addCriterion("JinChanLi >=", value, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliLessThan(Integer value) {
            addCriterion("JinChanLi <", value, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliLessThanOrEqualTo(Integer value) {
            addCriterion("JinChanLi <=", value, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliIn(List<Integer> values) {
            addCriterion("JinChanLi in", values, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliNotIn(List<Integer> values) {
            addCriterion("JinChanLi not in", values, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliBetween(Integer value1, Integer value2) {
            addCriterion("JinChanLi between", value1, value2, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanliNotBetween(Integer value1, Integer value2) {
            addCriterion("JinChanLi not between", value1, value2, "jinchanli");
            return (Criteria) this;
        }

        public Criteria andJinchanyouIsNull() {
            addCriterion("JinChanYou is null");
            return (Criteria) this;
        }

        public Criteria andJinchanyouIsNotNull() {
            addCriterion("JinChanYou is not null");
            return (Criteria) this;
        }

        public Criteria andJinchanyouEqualTo(Integer value) {
            addCriterion("JinChanYou =", value, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouNotEqualTo(Integer value) {
            addCriterion("JinChanYou <>", value, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouGreaterThan(Integer value) {
            addCriterion("JinChanYou >", value, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouGreaterThanOrEqualTo(Integer value) {
            addCriterion("JinChanYou >=", value, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouLessThan(Integer value) {
            addCriterion("JinChanYou <", value, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouLessThanOrEqualTo(Integer value) {
            addCriterion("JinChanYou <=", value, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouIn(List<Integer> values) {
            addCriterion("JinChanYou in", values, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouNotIn(List<Integer> values) {
            addCriterion("JinChanYou not in", values, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouBetween(Integer value1, Integer value2) {
            addCriterion("JinChanYou between", value1, value2, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andJinchanyouNotBetween(Integer value1, Integer value2) {
            addCriterion("JinChanYou not between", value1, value2, "jinchanyou");
            return (Criteria) this;
        }

        public Criteria andPrevliIsNull() {
            addCriterion("prevLi is null");
            return (Criteria) this;
        }

        public Criteria andPrevliIsNotNull() {
            addCriterion("prevLi is not null");
            return (Criteria) this;
        }

        public Criteria andPrevliEqualTo(Integer value) {
            addCriterion("prevLi =", value, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliNotEqualTo(Integer value) {
            addCriterion("prevLi <>", value, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliGreaterThan(Integer value) {
            addCriterion("prevLi >", value, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliGreaterThanOrEqualTo(Integer value) {
            addCriterion("prevLi >=", value, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliLessThan(Integer value) {
            addCriterion("prevLi <", value, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliLessThanOrEqualTo(Integer value) {
            addCriterion("prevLi <=", value, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliIn(List<Integer> values) {
            addCriterion("prevLi in", values, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliNotIn(List<Integer> values) {
            addCriterion("prevLi not in", values, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliBetween(Integer value1, Integer value2) {
            addCriterion("prevLi between", value1, value2, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevliNotBetween(Integer value1, Integer value2) {
            addCriterion("prevLi not between", value1, value2, "prevli");
            return (Criteria) this;
        }

        public Criteria andPrevtimeIsNull() {
            addCriterion("prevTime is null");
            return (Criteria) this;
        }

        public Criteria andPrevtimeIsNotNull() {
            addCriterion("prevTime is not null");
            return (Criteria) this;
        }

        public Criteria andPrevtimeEqualTo(Date value) {
            addCriterion("prevTime =", value, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeNotEqualTo(Date value) {
            addCriterion("prevTime <>", value, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeGreaterThan(Date value) {
            addCriterion("prevTime >", value, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prevTime >=", value, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeLessThan(Date value) {
            addCriterion("prevTime <", value, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeLessThanOrEqualTo(Date value) {
            addCriterion("prevTime <=", value, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeIn(List<Date> values) {
            addCriterion("prevTime in", values, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeNotIn(List<Date> values) {
            addCriterion("prevTime not in", values, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeBetween(Date value1, Date value2) {
            addCriterion("prevTime between", value1, value2, "prevtime");
            return (Criteria) this;
        }

        public Criteria andPrevtimeNotBetween(Date value1, Date value2) {
            addCriterion("prevTime not between", value1, value2, "prevtime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeIsNull() {
            addCriterion("JinChanTime is null");
            return (Criteria) this;
        }

        public Criteria andJinchantimeIsNotNull() {
            addCriterion("JinChanTime is not null");
            return (Criteria) this;
        }

        public Criteria andJinchantimeEqualTo(Date value) {
            addCriterion("JinChanTime =", value, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeNotEqualTo(Date value) {
            addCriterion("JinChanTime <>", value, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeGreaterThan(Date value) {
            addCriterion("JinChanTime >", value, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JinChanTime >=", value, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeLessThan(Date value) {
            addCriterion("JinChanTime <", value, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeLessThanOrEqualTo(Date value) {
            addCriterion("JinChanTime <=", value, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeIn(List<Date> values) {
            addCriterion("JinChanTime in", values, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeNotIn(List<Date> values) {
            addCriterion("JinChanTime not in", values, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeBetween(Date value1, Date value2) {
            addCriterion("JinChanTime between", value1, value2, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andJinchantimeNotBetween(Date value1, Date value2) {
            addCriterion("JinChanTime not between", value1, value2, "jinchantime");
            return (Criteria) this;
        }

        public Criteria andYewutypeIsNull() {
            addCriterion("YeWuType is null");
            return (Criteria) this;
        }

        public Criteria andYewutypeIsNotNull() {
            addCriterion("YeWuType is not null");
            return (Criteria) this;
        }

        public Criteria andYewutypeEqualTo(String value) {
            addCriterion("YeWuType =", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotEqualTo(String value) {
            addCriterion("YeWuType <>", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeGreaterThan(String value) {
            addCriterion("YeWuType >", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeGreaterThanOrEqualTo(String value) {
            addCriterion("YeWuType >=", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeLessThan(String value) {
            addCriterion("YeWuType <", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeLessThanOrEqualTo(String value) {
            addCriterion("YeWuType <=", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeLike(String value) {
            addCriterion("YeWuType like", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotLike(String value) {
            addCriterion("YeWuType not like", value, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeIn(List<String> values) {
            addCriterion("YeWuType in", values, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotIn(List<String> values) {
            addCriterion("YeWuType not in", values, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeBetween(String value1, String value2) {
            addCriterion("YeWuType between", value1, value2, "yewutype");
            return (Criteria) this;
        }

        public Criteria andYewutypeNotBetween(String value1, String value2) {
            addCriterion("YeWuType not between", value1, value2, "yewutype");
            return (Criteria) this;
        }

        public Criteria andShigongIsNull() {
            addCriterion("ShiGong is null");
            return (Criteria) this;
        }

        public Criteria andShigongIsNotNull() {
            addCriterion("ShiGong is not null");
            return (Criteria) this;
        }

        public Criteria andShigongEqualTo(String value) {
            addCriterion("ShiGong =", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongNotEqualTo(String value) {
            addCriterion("ShiGong <>", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongGreaterThan(String value) {
            addCriterion("ShiGong >", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongGreaterThanOrEqualTo(String value) {
            addCriterion("ShiGong >=", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongLessThan(String value) {
            addCriterion("ShiGong <", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongLessThanOrEqualTo(String value) {
            addCriterion("ShiGong <=", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongLike(String value) {
            addCriterion("ShiGong like", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongNotLike(String value) {
            addCriterion("ShiGong not like", value, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongIn(List<String> values) {
            addCriterion("ShiGong in", values, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongNotIn(List<String> values) {
            addCriterion("ShiGong not in", values, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongBetween(String value1, String value2) {
            addCriterion("ShiGong between", value1, value2, "shigong");
            return (Criteria) this;
        }

        public Criteria andShigongNotBetween(String value1, String value2) {
            addCriterion("ShiGong not between", value1, value2, "shigong");
            return (Criteria) this;
        }

        public Criteria andJiecheIsNull() {
            addCriterion("JieChe is null");
            return (Criteria) this;
        }

        public Criteria andJiecheIsNotNull() {
            addCriterion("JieChe is not null");
            return (Criteria) this;
        }

        public Criteria andJiecheEqualTo(String value) {
            addCriterion("JieChe =", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheNotEqualTo(String value) {
            addCriterion("JieChe <>", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheGreaterThan(String value) {
            addCriterion("JieChe >", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheGreaterThanOrEqualTo(String value) {
            addCriterion("JieChe >=", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheLessThan(String value) {
            addCriterion("JieChe <", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheLessThanOrEqualTo(String value) {
            addCriterion("JieChe <=", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheLike(String value) {
            addCriterion("JieChe like", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheNotLike(String value) {
            addCriterion("JieChe not like", value, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheIn(List<String> values) {
            addCriterion("JieChe in", values, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheNotIn(List<String> values) {
            addCriterion("JieChe not in", values, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheBetween(String value1, String value2) {
            addCriterion("JieChe between", value1, value2, "jieche");
            return (Criteria) this;
        }

        public Criteria andJiecheNotBetween(String value1, String value2) {
            addCriterion("JieChe not between", value1, value2, "jieche");
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
            addCriterion("jieSuantime is null");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeIsNotNull() {
            addCriterion("jieSuantime is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeEqualTo(Date value) {
            addCriterion("jieSuantime =", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeNotEqualTo(Date value) {
            addCriterion("jieSuantime <>", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeGreaterThan(Date value) {
            addCriterion("jieSuantime >", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jieSuantime >=", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeLessThan(Date value) {
            addCriterion("jieSuantime <", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeLessThanOrEqualTo(Date value) {
            addCriterion("jieSuantime <=", value, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeIn(List<Date> values) {
            addCriterion("jieSuantime in", values, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeNotIn(List<Date> values) {
            addCriterion("jieSuantime not in", values, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeBetween(Date value1, Date value2) {
            addCriterion("jieSuantime between", value1, value2, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuantimeNotBetween(Date value1, Date value2) {
            addCriterion("jieSuantime not between", value1, value2, "jiesuantime");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyIsNull() {
            addCriterion("jieSuanmoney is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyIsNotNull() {
            addCriterion("jieSuanmoney is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyEqualTo(Double value) {
            addCriterion("jieSuanmoney =", value, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyNotEqualTo(Double value) {
            addCriterion("jieSuanmoney <>", value, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyGreaterThan(Double value) {
            addCriterion("jieSuanmoney >", value, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("jieSuanmoney >=", value, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyLessThan(Double value) {
            addCriterion("jieSuanmoney <", value, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyLessThanOrEqualTo(Double value) {
            addCriterion("jieSuanmoney <=", value, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyIn(List<Double> values) {
            addCriterion("jieSuanmoney in", values, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyNotIn(List<Double> values) {
            addCriterion("jieSuanmoney not in", values, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyBetween(Double value1, Double value2) {
            addCriterion("jieSuanmoney between", value1, value2, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andJiesuanmoneyNotBetween(Double value1, Double value2) {
            addCriterion("jieSuanmoney not between", value1, value2, "jiesuanmoney");
            return (Criteria) this;
        }

        public Criteria andPeikuanIsNull() {
            addCriterion("PeiKuan is null");
            return (Criteria) this;
        }

        public Criteria andPeikuanIsNotNull() {
            addCriterion("PeiKuan is not null");
            return (Criteria) this;
        }

        public Criteria andPeikuanEqualTo(String value) {
            addCriterion("PeiKuan =", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanNotEqualTo(String value) {
            addCriterion("PeiKuan <>", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanGreaterThan(String value) {
            addCriterion("PeiKuan >", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanGreaterThanOrEqualTo(String value) {
            addCriterion("PeiKuan >=", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanLessThan(String value) {
            addCriterion("PeiKuan <", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanLessThanOrEqualTo(String value) {
            addCriterion("PeiKuan <=", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanLike(String value) {
            addCriterion("PeiKuan like", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanNotLike(String value) {
            addCriterion("PeiKuan not like", value, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanIn(List<String> values) {
            addCriterion("PeiKuan in", values, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanNotIn(List<String> values) {
            addCriterion("PeiKuan not in", values, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanBetween(String value1, String value2) {
            addCriterion("PeiKuan between", value1, value2, "peikuan");
            return (Criteria) this;
        }

        public Criteria andPeikuanNotBetween(String value1, String value2) {
            addCriterion("PeiKuan not between", value1, value2, "peikuan");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNull() {
            addCriterion("saleNo is null");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNotNull() {
            addCriterion("saleNo is not null");
            return (Criteria) this;
        }

        public Criteria andSalenoEqualTo(String value) {
            addCriterion("saleNo =", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotEqualTo(String value) {
            addCriterion("saleNo <>", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThan(String value) {
            addCriterion("saleNo >", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThanOrEqualTo(String value) {
            addCriterion("saleNo >=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThan(String value) {
            addCriterion("saleNo <", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThanOrEqualTo(String value) {
            addCriterion("saleNo <=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLike(String value) {
            addCriterion("saleNo like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotLike(String value) {
            addCriterion("saleNo not like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoIn(List<String> values) {
            addCriterion("saleNo in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotIn(List<String> values) {
            addCriterion("saleNo not in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoBetween(String value1, String value2) {
            addCriterion("saleNo between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotBetween(String value1, String value2) {
            addCriterion("saleNo not between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andBaoxiuIsNull() {
            addCriterion("BaoXiu is null");
            return (Criteria) this;
        }

        public Criteria andBaoxiuIsNotNull() {
            addCriterion("BaoXiu is not null");
            return (Criteria) this;
        }

        public Criteria andBaoxiuEqualTo(String value) {
            addCriterion("BaoXiu =", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotEqualTo(String value) {
            addCriterion("BaoXiu <>", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuGreaterThan(String value) {
            addCriterion("BaoXiu >", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuGreaterThanOrEqualTo(String value) {
            addCriterion("BaoXiu >=", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuLessThan(String value) {
            addCriterion("BaoXiu <", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuLessThanOrEqualTo(String value) {
            addCriterion("BaoXiu <=", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuLike(String value) {
            addCriterion("BaoXiu like", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotLike(String value) {
            addCriterion("BaoXiu not like", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuIn(List<String> values) {
            addCriterion("BaoXiu in", values, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotIn(List<String> values) {
            addCriterion("BaoXiu not in", values, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuBetween(String value1, String value2) {
            addCriterion("BaoXiu between", value1, value2, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotBetween(String value1, String value2) {
            addCriterion("BaoXiu not between", value1, value2, "baoxiu");
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