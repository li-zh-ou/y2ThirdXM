package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KehucarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehucarExample() {
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

        public Criteria andSijiphoneIsNull() {
            addCriterion("SiJiPhone is null");
            return (Criteria) this;
        }

        public Criteria andSijiphoneIsNotNull() {
            addCriterion("SiJiPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSijiphoneEqualTo(String value) {
            addCriterion("SiJiPhone =", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneNotEqualTo(String value) {
            addCriterion("SiJiPhone <>", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneGreaterThan(String value) {
            addCriterion("SiJiPhone >", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SiJiPhone >=", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneLessThan(String value) {
            addCriterion("SiJiPhone <", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneLessThanOrEqualTo(String value) {
            addCriterion("SiJiPhone <=", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneLike(String value) {
            addCriterion("SiJiPhone like", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneNotLike(String value) {
            addCriterion("SiJiPhone not like", value, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneIn(List<String> values) {
            addCriterion("SiJiPhone in", values, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneNotIn(List<String> values) {
            addCriterion("SiJiPhone not in", values, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneBetween(String value1, String value2) {
            addCriterion("SiJiPhone between", value1, value2, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijiphoneNotBetween(String value1, String value2) {
            addCriterion("SiJiPhone not between", value1, value2, "sijiphone");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayIsNull() {
            addCriterion("SiJiBirthday is null");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayIsNotNull() {
            addCriterion("SiJiBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("SiJiBirthday =", value, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("SiJiBirthday <>", value, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("SiJiBirthday >", value, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SiJiBirthday >=", value, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayLessThan(Date value) {
            addCriterionForJDBCDate("SiJiBirthday <", value, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SiJiBirthday <=", value, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("SiJiBirthday in", values, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("SiJiBirthday not in", values, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SiJiBirthday between", value1, value2, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andSijibirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SiJiBirthday not between", value1, value2, "sijibirthday");
            return (Criteria) this;
        }

        public Criteria andGuishuIsNull() {
            addCriterion("GuiShu is null");
            return (Criteria) this;
        }

        public Criteria andGuishuIsNotNull() {
            addCriterion("GuiShu is not null");
            return (Criteria) this;
        }

        public Criteria andGuishuEqualTo(String value) {
            addCriterion("GuiShu =", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuNotEqualTo(String value) {
            addCriterion("GuiShu <>", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuGreaterThan(String value) {
            addCriterion("GuiShu >", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuGreaterThanOrEqualTo(String value) {
            addCriterion("GuiShu >=", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuLessThan(String value) {
            addCriterion("GuiShu <", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuLessThanOrEqualTo(String value) {
            addCriterion("GuiShu <=", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuLike(String value) {
            addCriterion("GuiShu like", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuNotLike(String value) {
            addCriterion("GuiShu not like", value, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuIn(List<String> values) {
            addCriterion("GuiShu in", values, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuNotIn(List<String> values) {
            addCriterion("GuiShu not in", values, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuBetween(String value1, String value2) {
            addCriterion("GuiShu between", value1, value2, "guishu");
            return (Criteria) this;
        }

        public Criteria andGuishuNotBetween(String value1, String value2) {
            addCriterion("GuiShu not between", value1, value2, "guishu");
            return (Criteria) this;
        }

        public Criteria andJiazhaoIsNull() {
            addCriterion("JiaZhao is null");
            return (Criteria) this;
        }

        public Criteria andJiazhaoIsNotNull() {
            addCriterion("JiaZhao is not null");
            return (Criteria) this;
        }

        public Criteria andJiazhaoEqualTo(Date value) {
            addCriterion("JiaZhao =", value, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoNotEqualTo(Date value) {
            addCriterion("JiaZhao <>", value, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoGreaterThan(Date value) {
            addCriterion("JiaZhao >", value, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoGreaterThanOrEqualTo(Date value) {
            addCriterion("JiaZhao >=", value, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoLessThan(Date value) {
            addCriterion("JiaZhao <", value, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoLessThanOrEqualTo(Date value) {
            addCriterion("JiaZhao <=", value, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoIn(List<Date> values) {
            addCriterion("JiaZhao in", values, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoNotIn(List<Date> values) {
            addCriterion("JiaZhao not in", values, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoBetween(Date value1, Date value2) {
            addCriterion("JiaZhao between", value1, value2, "jiazhao");
            return (Criteria) this;
        }

        public Criteria andJiazhaoNotBetween(Date value1, Date value2) {
            addCriterion("JiaZhao not between", value1, value2, "jiazhao");
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

        public Criteria andNiankuanIsNull() {
            addCriterion("NianKuan is null");
            return (Criteria) this;
        }

        public Criteria andNiankuanIsNotNull() {
            addCriterion("NianKuan is not null");
            return (Criteria) this;
        }

        public Criteria andNiankuanEqualTo(Double value) {
            addCriterion("NianKuan =", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotEqualTo(Double value) {
            addCriterion("NianKuan <>", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanGreaterThan(Double value) {
            addCriterion("NianKuan >", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanGreaterThanOrEqualTo(Double value) {
            addCriterion("NianKuan >=", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanLessThan(Double value) {
            addCriterion("NianKuan <", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanLessThanOrEqualTo(Double value) {
            addCriterion("NianKuan <=", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanIn(List<Double> values) {
            addCriterion("NianKuan in", values, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotIn(List<Double> values) {
            addCriterion("NianKuan not in", values, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanBetween(Double value1, Double value2) {
            addCriterion("NianKuan between", value1, value2, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotBetween(Double value1, Double value2) {
            addCriterion("NianKuan not between", value1, value2, "niankuan");
            return (Criteria) this;
        }

        public Criteria andLichengIsNull() {
            addCriterion("LiCheng is null");
            return (Criteria) this;
        }

        public Criteria andLichengIsNotNull() {
            addCriterion("LiCheng is not null");
            return (Criteria) this;
        }

        public Criteria andLichengEqualTo(Integer value) {
            addCriterion("LiCheng =", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotEqualTo(Integer value) {
            addCriterion("LiCheng <>", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengGreaterThan(Integer value) {
            addCriterion("LiCheng >", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengGreaterThanOrEqualTo(Integer value) {
            addCriterion("LiCheng >=", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengLessThan(Integer value) {
            addCriterion("LiCheng <", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengLessThanOrEqualTo(Integer value) {
            addCriterion("LiCheng <=", value, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengIn(List<Integer> values) {
            addCriterion("LiCheng in", values, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotIn(List<Integer> values) {
            addCriterion("LiCheng not in", values, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengBetween(Integer value1, Integer value2) {
            addCriterion("LiCheng between", value1, value2, "licheng");
            return (Criteria) this;
        }

        public Criteria andLichengNotBetween(Integer value1, Integer value2) {
            addCriterion("LiCheng not between", value1, value2, "licheng");
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

        public Criteria andZaizhongEqualTo(Integer value) {
            addCriterion("ZaiZhong =", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotEqualTo(Integer value) {
            addCriterion("ZaiZhong <>", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongGreaterThan(Integer value) {
            addCriterion("ZaiZhong >", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZaiZhong >=", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLessThan(Integer value) {
            addCriterion("ZaiZhong <", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongLessThanOrEqualTo(Integer value) {
            addCriterion("ZaiZhong <=", value, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongIn(List<Integer> values) {
            addCriterion("ZaiZhong in", values, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotIn(List<Integer> values) {
            addCriterion("ZaiZhong not in", values, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongBetween(Integer value1, Integer value2) {
            addCriterion("ZaiZhong between", value1, value2, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andZaizhongNotBetween(Integer value1, Integer value2) {
            addCriterion("ZaiZhong not between", value1, value2, "zaizhong");
            return (Criteria) this;
        }

        public Criteria andGoumaidateIsNull() {
            addCriterion("GouMaiDate is null");
            return (Criteria) this;
        }

        public Criteria andGoumaidateIsNotNull() {
            addCriterion("GouMaiDate is not null");
            return (Criteria) this;
        }

        public Criteria andGoumaidateEqualTo(Date value) {
            addCriterionForJDBCDate("GouMaiDate =", value, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("GouMaiDate <>", value, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateGreaterThan(Date value) {
            addCriterionForJDBCDate("GouMaiDate >", value, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GouMaiDate >=", value, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateLessThan(Date value) {
            addCriterionForJDBCDate("GouMaiDate <", value, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GouMaiDate <=", value, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateIn(List<Date> values) {
            addCriterionForJDBCDate("GouMaiDate in", values, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("GouMaiDate not in", values, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GouMaiDate between", value1, value2, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andGoumaidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GouMaiDate not between", value1, value2, "goumaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateIsNull() {
            addCriterion("ShanPaiDate is null");
            return (Criteria) this;
        }

        public Criteria andShanpaidateIsNotNull() {
            addCriterion("ShanPaiDate is not null");
            return (Criteria) this;
        }

        public Criteria andShanpaidateEqualTo(Date value) {
            addCriterionForJDBCDate("ShanPaiDate =", value, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShanPaiDate <>", value, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateGreaterThan(Date value) {
            addCriterionForJDBCDate("ShanPaiDate >", value, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShanPaiDate >=", value, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateLessThan(Date value) {
            addCriterionForJDBCDate("ShanPaiDate <", value, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShanPaiDate <=", value, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateIn(List<Date> values) {
            addCriterionForJDBCDate("ShanPaiDate in", values, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShanPaiDate not in", values, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShanPaiDate between", value1, value2, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andShanpaidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShanPaiDate not between", value1, value2, "shanpaidate");
            return (Criteria) this;
        }

        public Criteria andChejianIsNull() {
            addCriterion("CheJian is null");
            return (Criteria) this;
        }

        public Criteria andChejianIsNotNull() {
            addCriterion("CheJian is not null");
            return (Criteria) this;
        }

        public Criteria andChejianEqualTo(Date value) {
            addCriterionForJDBCDate("CheJian =", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianNotEqualTo(Date value) {
            addCriterionForJDBCDate("CheJian <>", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianGreaterThan(Date value) {
            addCriterionForJDBCDate("CheJian >", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CheJian >=", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianLessThan(Date value) {
            addCriterionForJDBCDate("CheJian <", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CheJian <=", value, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianIn(List<Date> values) {
            addCriterionForJDBCDate("CheJian in", values, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianNotIn(List<Date> values) {
            addCriterionForJDBCDate("CheJian not in", values, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CheJian between", value1, value2, "chejian");
            return (Criteria) this;
        }

        public Criteria andChejianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CheJian not between", value1, value2, "chejian");
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

        public Criteria andChexiIsNull() {
            addCriterion("CheXi is null");
            return (Criteria) this;
        }

        public Criteria andChexiIsNotNull() {
            addCriterion("CheXi is not null");
            return (Criteria) this;
        }

        public Criteria andChexiEqualTo(String value) {
            addCriterion("CheXi =", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotEqualTo(String value) {
            addCriterion("CheXi <>", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiGreaterThan(String value) {
            addCriterion("CheXi >", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiGreaterThanOrEqualTo(String value) {
            addCriterion("CheXi >=", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLessThan(String value) {
            addCriterion("CheXi <", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLessThanOrEqualTo(String value) {
            addCriterion("CheXi <=", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLike(String value) {
            addCriterion("CheXi like", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotLike(String value) {
            addCriterion("CheXi not like", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiIn(List<String> values) {
            addCriterion("CheXi in", values, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotIn(List<String> values) {
            addCriterion("CheXi not in", values, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiBetween(String value1, String value2) {
            addCriterion("CheXi between", value1, value2, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotBetween(String value1, String value2) {
            addCriterion("CheXi not between", value1, value2, "chexi");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianIsNull() {
            addCriterion("nextBaoXian is null");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianIsNotNull() {
            addCriterion("nextBaoXian is not null");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianEqualTo(Integer value) {
            addCriterion("nextBaoXian =", value, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianNotEqualTo(Integer value) {
            addCriterion("nextBaoXian <>", value, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianGreaterThan(Integer value) {
            addCriterion("nextBaoXian >", value, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("nextBaoXian >=", value, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianLessThan(Integer value) {
            addCriterion("nextBaoXian <", value, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianLessThanOrEqualTo(Integer value) {
            addCriterion("nextBaoXian <=", value, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianIn(List<Integer> values) {
            addCriterion("nextBaoXian in", values, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianNotIn(List<Integer> values) {
            addCriterion("nextBaoXian not in", values, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianBetween(Integer value1, Integer value2) {
            addCriterion("nextBaoXian between", value1, value2, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxianNotBetween(Integer value1, Integer value2) {
            addCriterion("nextBaoXian not between", value1, value2, "nextbaoxian");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateIsNull() {
            addCriterion("nextBaoXianDate is null");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateIsNotNull() {
            addCriterion("nextBaoXianDate is not null");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateEqualTo(Date value) {
            addCriterionForJDBCDate("nextBaoXianDate =", value, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("nextBaoXianDate <>", value, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateGreaterThan(Date value) {
            addCriterionForJDBCDate("nextBaoXianDate >", value, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nextBaoXianDate >=", value, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateLessThan(Date value) {
            addCriterionForJDBCDate("nextBaoXianDate <", value, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nextBaoXianDate <=", value, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateIn(List<Date> values) {
            addCriterionForJDBCDate("nextBaoXianDate in", values, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("nextBaoXianDate not in", values, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nextBaoXianDate between", value1, value2, "nextbaoxiandate");
            return (Criteria) this;
        }

        public Criteria andNextbaoxiandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nextBaoXianDate not between", value1, value2, "nextbaoxiandate");
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