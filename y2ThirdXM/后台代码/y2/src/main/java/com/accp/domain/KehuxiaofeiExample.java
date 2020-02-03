package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KehuxiaofeiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuxiaofeiExample() {
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

        public Criteria andXiaoidIsNull() {
            addCriterion("xiaoid is null");
            return (Criteria) this;
        }

        public Criteria andXiaoidIsNotNull() {
            addCriterion("xiaoid is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoidEqualTo(Integer value) {
            addCriterion("xiaoid =", value, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidNotEqualTo(Integer value) {
            addCriterion("xiaoid <>", value, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidGreaterThan(Integer value) {
            addCriterion("xiaoid >", value, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiaoid >=", value, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidLessThan(Integer value) {
            addCriterion("xiaoid <", value, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidLessThanOrEqualTo(Integer value) {
            addCriterion("xiaoid <=", value, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidIn(List<Integer> values) {
            addCriterion("xiaoid in", values, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidNotIn(List<Integer> values) {
            addCriterion("xiaoid not in", values, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidBetween(Integer value1, Integer value2) {
            addCriterion("xiaoid between", value1, value2, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andXiaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("xiaoid not between", value1, value2, "xiaoid");
            return (Criteria) this;
        }

        public Criteria andDantypeIsNull() {
            addCriterion("dantype is null");
            return (Criteria) this;
        }

        public Criteria andDantypeIsNotNull() {
            addCriterion("dantype is not null");
            return (Criteria) this;
        }

        public Criteria andDantypeEqualTo(String value) {
            addCriterion("dantype =", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeNotEqualTo(String value) {
            addCriterion("dantype <>", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeGreaterThan(String value) {
            addCriterion("dantype >", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeGreaterThanOrEqualTo(String value) {
            addCriterion("dantype >=", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeLessThan(String value) {
            addCriterion("dantype <", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeLessThanOrEqualTo(String value) {
            addCriterion("dantype <=", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeLike(String value) {
            addCriterion("dantype like", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeNotLike(String value) {
            addCriterion("dantype not like", value, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeIn(List<String> values) {
            addCriterion("dantype in", values, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeNotIn(List<String> values) {
            addCriterion("dantype not in", values, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeBetween(String value1, String value2) {
            addCriterion("dantype between", value1, value2, "dantype");
            return (Criteria) this;
        }

        public Criteria andDantypeNotBetween(String value1, String value2) {
            addCriterion("dantype not between", value1, value2, "dantype");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoIsNull() {
            addCriterion("xsdanhao is null");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoIsNotNull() {
            addCriterion("xsdanhao is not null");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoEqualTo(String value) {
            addCriterion("xsdanhao =", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoNotEqualTo(String value) {
            addCriterion("xsdanhao <>", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoGreaterThan(String value) {
            addCriterion("xsdanhao >", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoGreaterThanOrEqualTo(String value) {
            addCriterion("xsdanhao >=", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoLessThan(String value) {
            addCriterion("xsdanhao <", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoLessThanOrEqualTo(String value) {
            addCriterion("xsdanhao <=", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoLike(String value) {
            addCriterion("xsdanhao like", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoNotLike(String value) {
            addCriterion("xsdanhao not like", value, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoIn(List<String> values) {
            addCriterion("xsdanhao in", values, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoNotIn(List<String> values) {
            addCriterion("xsdanhao not in", values, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoBetween(String value1, String value2) {
            addCriterion("xsdanhao between", value1, value2, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andXsdanhaoNotBetween(String value1, String value2) {
            addCriterion("xsdanhao not between", value1, value2, "xsdanhao");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNull() {
            addCriterion("chepai is null");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNotNull() {
            addCriterion("chepai is not null");
            return (Criteria) this;
        }

        public Criteria andChepaiEqualTo(String value) {
            addCriterion("chepai =", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotEqualTo(String value) {
            addCriterion("chepai <>", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThan(String value) {
            addCriterion("chepai >", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThanOrEqualTo(String value) {
            addCriterion("chepai >=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThan(String value) {
            addCriterion("chepai <", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThanOrEqualTo(String value) {
            addCriterion("chepai <=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLike(String value) {
            addCriterion("chepai like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotLike(String value) {
            addCriterion("chepai not like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiIn(List<String> values) {
            addCriterion("chepai in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotIn(List<String> values) {
            addCriterion("chepai not in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiBetween(String value1, String value2) {
            addCriterion("chepai between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotBetween(String value1, String value2) {
            addCriterion("chepai not between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andWxyewuIsNull() {
            addCriterion("wxyewu is null");
            return (Criteria) this;
        }

        public Criteria andWxyewuIsNotNull() {
            addCriterion("wxyewu is not null");
            return (Criteria) this;
        }

        public Criteria andWxyewuEqualTo(String value) {
            addCriterion("wxyewu =", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuNotEqualTo(String value) {
            addCriterion("wxyewu <>", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuGreaterThan(String value) {
            addCriterion("wxyewu >", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuGreaterThanOrEqualTo(String value) {
            addCriterion("wxyewu >=", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuLessThan(String value) {
            addCriterion("wxyewu <", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuLessThanOrEqualTo(String value) {
            addCriterion("wxyewu <=", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuLike(String value) {
            addCriterion("wxyewu like", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuNotLike(String value) {
            addCriterion("wxyewu not like", value, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuIn(List<String> values) {
            addCriterion("wxyewu in", values, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuNotIn(List<String> values) {
            addCriterion("wxyewu not in", values, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuBetween(String value1, String value2) {
            addCriterion("wxyewu between", value1, value2, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andWxyewuNotBetween(String value1, String value2) {
            addCriterion("wxyewu not between", value1, value2, "wxyewu");
            return (Criteria) this;
        }

        public Criteria andJincdateIsNull() {
            addCriterion("jincdate is null");
            return (Criteria) this;
        }

        public Criteria andJincdateIsNotNull() {
            addCriterion("jincdate is not null");
            return (Criteria) this;
        }

        public Criteria andJincdateEqualTo(Date value) {
            addCriterionForJDBCDate("jincdate =", value, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jincdate <>", value, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateGreaterThan(Date value) {
            addCriterionForJDBCDate("jincdate >", value, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jincdate >=", value, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateLessThan(Date value) {
            addCriterionForJDBCDate("jincdate <", value, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jincdate <=", value, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateIn(List<Date> values) {
            addCriterionForJDBCDate("jincdate in", values, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jincdate not in", values, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jincdate between", value1, value2, "jincdate");
            return (Criteria) this;
        }

        public Criteria andJincdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jincdate not between", value1, value2, "jincdate");
            return (Criteria) this;
        }

        public Criteria andOverdateIsNull() {
            addCriterion("overdate is null");
            return (Criteria) this;
        }

        public Criteria andOverdateIsNotNull() {
            addCriterion("overdate is not null");
            return (Criteria) this;
        }

        public Criteria andOverdateEqualTo(Date value) {
            addCriterionForJDBCDate("overdate =", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("overdate <>", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateGreaterThan(Date value) {
            addCriterionForJDBCDate("overdate >", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overdate >=", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLessThan(Date value) {
            addCriterionForJDBCDate("overdate <", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overdate <=", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateIn(List<Date> values) {
            addCriterionForJDBCDate("overdate in", values, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("overdate not in", values, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overdate between", value1, value2, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overdate not between", value1, value2, "overdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateIsNull() {
            addCriterion("jiesdate is null");
            return (Criteria) this;
        }

        public Criteria andJiesdateIsNotNull() {
            addCriterion("jiesdate is not null");
            return (Criteria) this;
        }

        public Criteria andJiesdateEqualTo(Date value) {
            addCriterionForJDBCDate("jiesdate =", value, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jiesdate <>", value, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateGreaterThan(Date value) {
            addCriterionForJDBCDate("jiesdate >", value, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiesdate >=", value, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateLessThan(Date value) {
            addCriterionForJDBCDate("jiesdate <", value, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jiesdate <=", value, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateIn(List<Date> values) {
            addCriterionForJDBCDate("jiesdate in", values, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jiesdate not in", values, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiesdate between", value1, value2, "jiesdate");
            return (Criteria) this;
        }

        public Criteria andJiesdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jiesdate not between", value1, value2, "jiesdate");
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