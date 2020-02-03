package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WaiqingcarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaiqingcarExample() {
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

        public Criteria andCarbankIsNull() {
            addCriterion("CarBank is null");
            return (Criteria) this;
        }

        public Criteria andCarbankIsNotNull() {
            addCriterion("CarBank is not null");
            return (Criteria) this;
        }

        public Criteria andCarbankEqualTo(String value) {
            addCriterion("CarBank =", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankNotEqualTo(String value) {
            addCriterion("CarBank <>", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankGreaterThan(String value) {
            addCriterion("CarBank >", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankGreaterThanOrEqualTo(String value) {
            addCriterion("CarBank >=", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankLessThan(String value) {
            addCriterion("CarBank <", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankLessThanOrEqualTo(String value) {
            addCriterion("CarBank <=", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankLike(String value) {
            addCriterion("CarBank like", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankNotLike(String value) {
            addCriterion("CarBank not like", value, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankIn(List<String> values) {
            addCriterion("CarBank in", values, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankNotIn(List<String> values) {
            addCriterion("CarBank not in", values, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankBetween(String value1, String value2) {
            addCriterion("CarBank between", value1, value2, "carbank");
            return (Criteria) this;
        }

        public Criteria andCarbankNotBetween(String value1, String value2) {
            addCriterion("CarBank not between", value1, value2, "carbank");
            return (Criteria) this;
        }

        public Criteria andChexingIsNull() {
            addCriterion("CheXing is null");
            return (Criteria) this;
        }

        public Criteria andChexingIsNotNull() {
            addCriterion("CheXing is not null");
            return (Criteria) this;
        }

        public Criteria andChexingEqualTo(String value) {
            addCriterion("CheXing =", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotEqualTo(String value) {
            addCriterion("CheXing <>", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingGreaterThan(String value) {
            addCriterion("CheXing >", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingGreaterThanOrEqualTo(String value) {
            addCriterion("CheXing >=", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLessThan(String value) {
            addCriterion("CheXing <", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLessThanOrEqualTo(String value) {
            addCriterion("CheXing <=", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLike(String value) {
            addCriterion("CheXing like", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotLike(String value) {
            addCriterion("CheXing not like", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingIn(List<String> values) {
            addCriterion("CheXing in", values, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotIn(List<String> values) {
            addCriterion("CheXing not in", values, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingBetween(String value1, String value2) {
            addCriterion("CheXing between", value1, value2, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotBetween(String value1, String value2) {
            addCriterion("CheXing not between", value1, value2, "chexing");
            return (Criteria) this;
        }

        public Criteria andNowliIsNull() {
            addCriterion("NowLi is null");
            return (Criteria) this;
        }

        public Criteria andNowliIsNotNull() {
            addCriterion("NowLi is not null");
            return (Criteria) this;
        }

        public Criteria andNowliEqualTo(String value) {
            addCriterion("NowLi =", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliNotEqualTo(String value) {
            addCriterion("NowLi <>", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliGreaterThan(String value) {
            addCriterion("NowLi >", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliGreaterThanOrEqualTo(String value) {
            addCriterion("NowLi >=", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliLessThan(String value) {
            addCriterion("NowLi <", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliLessThanOrEqualTo(String value) {
            addCriterion("NowLi <=", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliLike(String value) {
            addCriterion("NowLi like", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliNotLike(String value) {
            addCriterion("NowLi not like", value, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliIn(List<String> values) {
            addCriterion("NowLi in", values, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliNotIn(List<String> values) {
            addCriterion("NowLi not in", values, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliBetween(String value1, String value2) {
            addCriterion("NowLi between", value1, value2, "nowli");
            return (Criteria) this;
        }

        public Criteria andNowliNotBetween(String value1, String value2) {
            addCriterion("NowLi not between", value1, value2, "nowli");
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