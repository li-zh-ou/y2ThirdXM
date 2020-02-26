package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JinritixinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JinritixinExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciIsNull() {
            addCriterion("jiechetaici is null");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciIsNotNull() {
            addCriterion("jiechetaici is not null");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciEqualTo(Integer value) {
            addCriterion("jiechetaici =", value, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciNotEqualTo(Integer value) {
            addCriterion("jiechetaici <>", value, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciGreaterThan(Integer value) {
            addCriterion("jiechetaici >", value, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiechetaici >=", value, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciLessThan(Integer value) {
            addCriterion("jiechetaici <", value, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciLessThanOrEqualTo(Integer value) {
            addCriterion("jiechetaici <=", value, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciIn(List<Integer> values) {
            addCriterion("jiechetaici in", values, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciNotIn(List<Integer> values) {
            addCriterion("jiechetaici not in", values, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciBetween(Integer value1, Integer value2) {
            addCriterion("jiechetaici between", value1, value2, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiechetaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("jiechetaici not between", value1, value2, "jiechetaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciIsNull() {
            addCriterion("jiesuantaici is null");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciIsNotNull() {
            addCriterion("jiesuantaici is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciEqualTo(Integer value) {
            addCriterion("jiesuantaici =", value, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciNotEqualTo(Integer value) {
            addCriterion("jiesuantaici <>", value, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciGreaterThan(Integer value) {
            addCriterion("jiesuantaici >", value, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiesuantaici >=", value, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciLessThan(Integer value) {
            addCriterion("jiesuantaici <", value, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciLessThanOrEqualTo(Integer value) {
            addCriterion("jiesuantaici <=", value, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciIn(List<Integer> values) {
            addCriterion("jiesuantaici in", values, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciNotIn(List<Integer> values) {
            addCriterion("jiesuantaici not in", values, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciBetween(Integer value1, Integer value2) {
            addCriterion("jiesuantaici between", value1, value2, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andJiesuantaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("jiesuantaici not between", value1, value2, "jiesuantaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciIsNull() {
            addCriterion("zaixiutaici is null");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciIsNotNull() {
            addCriterion("zaixiutaici is not null");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciEqualTo(Integer value) {
            addCriterion("zaixiutaici =", value, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciNotEqualTo(Integer value) {
            addCriterion("zaixiutaici <>", value, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciGreaterThan(Integer value) {
            addCriterion("zaixiutaici >", value, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("zaixiutaici >=", value, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciLessThan(Integer value) {
            addCriterion("zaixiutaici <", value, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciLessThanOrEqualTo(Integer value) {
            addCriterion("zaixiutaici <=", value, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciIn(List<Integer> values) {
            addCriterion("zaixiutaici in", values, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciNotIn(List<Integer> values) {
            addCriterion("zaixiutaici not in", values, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciBetween(Integer value1, Integer value2) {
            addCriterion("zaixiutaici between", value1, value2, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andZaixiutaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("zaixiutaici not between", value1, value2, "zaixiutaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciIsNull() {
            addCriterion("shobaotaici is null");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciIsNotNull() {
            addCriterion("shobaotaici is not null");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciEqualTo(Integer value) {
            addCriterion("shobaotaici =", value, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciNotEqualTo(Integer value) {
            addCriterion("shobaotaici <>", value, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciGreaterThan(Integer value) {
            addCriterion("shobaotaici >", value, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("shobaotaici >=", value, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciLessThan(Integer value) {
            addCriterion("shobaotaici <", value, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciLessThanOrEqualTo(Integer value) {
            addCriterion("shobaotaici <=", value, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciIn(List<Integer> values) {
            addCriterion("shobaotaici in", values, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciNotIn(List<Integer> values) {
            addCriterion("shobaotaici not in", values, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciBetween(Integer value1, Integer value2) {
            addCriterion("shobaotaici between", value1, value2, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andShobaotaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("shobaotaici not between", value1, value2, "shobaotaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciIsNull() {
            addCriterion("fanxiutaici is null");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciIsNotNull() {
            addCriterion("fanxiutaici is not null");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciEqualTo(Integer value) {
            addCriterion("fanxiutaici =", value, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciNotEqualTo(Integer value) {
            addCriterion("fanxiutaici <>", value, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciGreaterThan(Integer value) {
            addCriterion("fanxiutaici >", value, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("fanxiutaici >=", value, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciLessThan(Integer value) {
            addCriterion("fanxiutaici <", value, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciLessThanOrEqualTo(Integer value) {
            addCriterion("fanxiutaici <=", value, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciIn(List<Integer> values) {
            addCriterion("fanxiutaici in", values, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciNotIn(List<Integer> values) {
            addCriterion("fanxiutaici not in", values, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciBetween(Integer value1, Integer value2) {
            addCriterion("fanxiutaici between", value1, value2, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andFanxiutaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("fanxiutaici not between", value1, value2, "fanxiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciIsNull() {
            addCriterion("znweixiutaici is null");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciIsNotNull() {
            addCriterion("znweixiutaici is not null");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciEqualTo(Integer value) {
            addCriterion("znweixiutaici =", value, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciNotEqualTo(Integer value) {
            addCriterion("znweixiutaici <>", value, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciGreaterThan(Integer value) {
            addCriterion("znweixiutaici >", value, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("znweixiutaici >=", value, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciLessThan(Integer value) {
            addCriterion("znweixiutaici <", value, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciLessThanOrEqualTo(Integer value) {
            addCriterion("znweixiutaici <=", value, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciIn(List<Integer> values) {
            addCriterion("znweixiutaici in", values, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciNotIn(List<Integer> values) {
            addCriterion("znweixiutaici not in", values, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciBetween(Integer value1, Integer value2) {
            addCriterion("znweixiutaici between", value1, value2, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZnweixiutaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("znweixiutaici not between", value1, value2, "znweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciIsNull() {
            addCriterion("zwweixiutaici is null");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciIsNotNull() {
            addCriterion("zwweixiutaici is not null");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciEqualTo(Integer value) {
            addCriterion("zwweixiutaici =", value, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciNotEqualTo(Integer value) {
            addCriterion("zwweixiutaici <>", value, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciGreaterThan(Integer value) {
            addCriterion("zwweixiutaici >", value, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("zwweixiutaici >=", value, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciLessThan(Integer value) {
            addCriterion("zwweixiutaici <", value, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciLessThanOrEqualTo(Integer value) {
            addCriterion("zwweixiutaici <=", value, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciIn(List<Integer> values) {
            addCriterion("zwweixiutaici in", values, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciNotIn(List<Integer> values) {
            addCriterion("zwweixiutaici not in", values, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciBetween(Integer value1, Integer value2) {
            addCriterion("zwweixiutaici between", value1, value2, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZwweixiutaiciNotBetween(Integer value1, Integer value2) {
            addCriterion("zwweixiutaici not between", value1, value2, "zwweixiutaici");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiIsNull() {
            addCriterion("zfeiweixiuzhi is null");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiIsNotNull() {
            addCriterion("zfeiweixiuzhi is not null");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiEqualTo(Double value) {
            addCriterion("zfeiweixiuzhi =", value, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiNotEqualTo(Double value) {
            addCriterion("zfeiweixiuzhi <>", value, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiGreaterThan(Double value) {
            addCriterion("zfeiweixiuzhi >", value, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiGreaterThanOrEqualTo(Double value) {
            addCriterion("zfeiweixiuzhi >=", value, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiLessThan(Double value) {
            addCriterion("zfeiweixiuzhi <", value, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiLessThanOrEqualTo(Double value) {
            addCriterion("zfeiweixiuzhi <=", value, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiIn(List<Double> values) {
            addCriterion("zfeiweixiuzhi in", values, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiNotIn(List<Double> values) {
            addCriterion("zfeiweixiuzhi not in", values, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiBetween(Double value1, Double value2) {
            addCriterion("zfeiweixiuzhi between", value1, value2, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andZfeiweixiuzhiNotBetween(Double value1, Double value2) {
            addCriterion("zfeiweixiuzhi not between", value1, value2, "zfeiweixiuzhi");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiIsNull() {
            addCriterion("baoxianlipei is null");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiIsNotNull() {
            addCriterion("baoxianlipei is not null");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiEqualTo(Double value) {
            addCriterion("baoxianlipei =", value, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiNotEqualTo(Double value) {
            addCriterion("baoxianlipei <>", value, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiGreaterThan(Double value) {
            addCriterion("baoxianlipei >", value, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiGreaterThanOrEqualTo(Double value) {
            addCriterion("baoxianlipei >=", value, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiLessThan(Double value) {
            addCriterion("baoxianlipei <", value, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiLessThanOrEqualTo(Double value) {
            addCriterion("baoxianlipei <=", value, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiIn(List<Double> values) {
            addCriterion("baoxianlipei in", values, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiNotIn(List<Double> values) {
            addCriterion("baoxianlipei not in", values, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiBetween(Double value1, Double value2) {
            addCriterion("baoxianlipei between", value1, value2, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andBaoxianlipeiNotBetween(Double value1, Double value2) {
            addCriterion("baoxianlipei not between", value1, value2, "baoxianlipei");
            return (Criteria) this;
        }

        public Criteria andXianjinIsNull() {
            addCriterion("xianjin is null");
            return (Criteria) this;
        }

        public Criteria andXianjinIsNotNull() {
            addCriterion("xianjin is not null");
            return (Criteria) this;
        }

        public Criteria andXianjinEqualTo(Double value) {
            addCriterion("xianjin =", value, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinNotEqualTo(Double value) {
            addCriterion("xianjin <>", value, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinGreaterThan(Double value) {
            addCriterion("xianjin >", value, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinGreaterThanOrEqualTo(Double value) {
            addCriterion("xianjin >=", value, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinLessThan(Double value) {
            addCriterion("xianjin <", value, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinLessThanOrEqualTo(Double value) {
            addCriterion("xianjin <=", value, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinIn(List<Double> values) {
            addCriterion("xianjin in", values, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinNotIn(List<Double> values) {
            addCriterion("xianjin not in", values, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinBetween(Double value1, Double value2) {
            addCriterion("xianjin between", value1, value2, "xianjin");
            return (Criteria) this;
        }

        public Criteria andXianjinNotBetween(Double value1, Double value2) {
            addCriterion("xianjin not between", value1, value2, "xianjin");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(Double value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(Double value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(Double value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(Double value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(Double value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(Double value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<Double> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<Double> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(Double value1, Double value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(Double value1, Double value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuIsNull() {
            addCriterion("xianjinrkucishu is null");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuIsNotNull() {
            addCriterion("xianjinrkucishu is not null");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuEqualTo(Integer value) {
            addCriterion("xianjinrkucishu =", value, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuNotEqualTo(Integer value) {
            addCriterion("xianjinrkucishu <>", value, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuGreaterThan(Integer value) {
            addCriterion("xianjinrkucishu >", value, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("xianjinrkucishu >=", value, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuLessThan(Integer value) {
            addCriterion("xianjinrkucishu <", value, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuLessThanOrEqualTo(Integer value) {
            addCriterion("xianjinrkucishu <=", value, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuIn(List<Integer> values) {
            addCriterion("xianjinrkucishu in", values, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuNotIn(List<Integer> values) {
            addCriterion("xianjinrkucishu not in", values, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuBetween(Integer value1, Integer value2) {
            addCriterion("xianjinrkucishu between", value1, value2, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkucishuNotBetween(Integer value1, Integer value2) {
            addCriterion("xianjinrkucishu not between", value1, value2, "xianjinrkucishu");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineIsNull() {
            addCriterion("xianjinrkujine is null");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineIsNotNull() {
            addCriterion("xianjinrkujine is not null");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineEqualTo(Double value) {
            addCriterion("xianjinrkujine =", value, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineNotEqualTo(Double value) {
            addCriterion("xianjinrkujine <>", value, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineGreaterThan(Double value) {
            addCriterion("xianjinrkujine >", value, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineGreaterThanOrEqualTo(Double value) {
            addCriterion("xianjinrkujine >=", value, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineLessThan(Double value) {
            addCriterion("xianjinrkujine <", value, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineLessThanOrEqualTo(Double value) {
            addCriterion("xianjinrkujine <=", value, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineIn(List<Double> values) {
            addCriterion("xianjinrkujine in", values, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineNotIn(List<Double> values) {
            addCriterion("xianjinrkujine not in", values, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineBetween(Double value1, Double value2) {
            addCriterion("xianjinrkujine between", value1, value2, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andXianjinrkujineNotBetween(Double value1, Double value2) {
            addCriterion("xianjinrkujine not between", value1, value2, "xianjinrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuIsNull() {
            addCriterion("guazhanrkushu is null");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuIsNotNull() {
            addCriterion("guazhanrkushu is not null");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuEqualTo(Integer value) {
            addCriterion("guazhanrkushu =", value, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuNotEqualTo(Integer value) {
            addCriterion("guazhanrkushu <>", value, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuGreaterThan(Integer value) {
            addCriterion("guazhanrkushu >", value, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("guazhanrkushu >=", value, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuLessThan(Integer value) {
            addCriterion("guazhanrkushu <", value, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuLessThanOrEqualTo(Integer value) {
            addCriterion("guazhanrkushu <=", value, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuIn(List<Integer> values) {
            addCriterion("guazhanrkushu in", values, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuNotIn(List<Integer> values) {
            addCriterion("guazhanrkushu not in", values, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuBetween(Integer value1, Integer value2) {
            addCriterion("guazhanrkushu between", value1, value2, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkushuNotBetween(Integer value1, Integer value2) {
            addCriterion("guazhanrkushu not between", value1, value2, "guazhanrkushu");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineIsNull() {
            addCriterion("guazhanrkujine is null");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineIsNotNull() {
            addCriterion("guazhanrkujine is not null");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineEqualTo(Double value) {
            addCriterion("guazhanrkujine =", value, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineNotEqualTo(Double value) {
            addCriterion("guazhanrkujine <>", value, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineGreaterThan(Double value) {
            addCriterion("guazhanrkujine >", value, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineGreaterThanOrEqualTo(Double value) {
            addCriterion("guazhanrkujine >=", value, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineLessThan(Double value) {
            addCriterion("guazhanrkujine <", value, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineLessThanOrEqualTo(Double value) {
            addCriterion("guazhanrkujine <=", value, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineIn(List<Double> values) {
            addCriterion("guazhanrkujine in", values, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineNotIn(List<Double> values) {
            addCriterion("guazhanrkujine not in", values, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineBetween(Double value1, Double value2) {
            addCriterion("guazhanrkujine between", value1, value2, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andGuazhanrkujineNotBetween(Double value1, Double value2) {
            addCriterion("guazhanrkujine not between", value1, value2, "guazhanrkujine");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulIsNull() {
            addCriterion("xiaoshoushul is null");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulIsNotNull() {
            addCriterion("xiaoshoushul is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulEqualTo(Integer value) {
            addCriterion("xiaoshoushul =", value, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulNotEqualTo(Integer value) {
            addCriterion("xiaoshoushul <>", value, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulGreaterThan(Integer value) {
            addCriterion("xiaoshoushul >", value, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiaoshoushul >=", value, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulLessThan(Integer value) {
            addCriterion("xiaoshoushul <", value, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulLessThanOrEqualTo(Integer value) {
            addCriterion("xiaoshoushul <=", value, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulIn(List<Integer> values) {
            addCriterion("xiaoshoushul in", values, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulNotIn(List<Integer> values) {
            addCriterion("xiaoshoushul not in", values, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulBetween(Integer value1, Integer value2) {
            addCriterion("xiaoshoushul between", value1, value2, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andXiaoshoushulNotBetween(Integer value1, Integer value2) {
            addCriterion("xiaoshoushul not between", value1, value2, "xiaoshoushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulIsNull() {
            addCriterion("zfeichukushul is null");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulIsNotNull() {
            addCriterion("zfeichukushul is not null");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulEqualTo(Integer value) {
            addCriterion("zfeichukushul =", value, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulNotEqualTo(Integer value) {
            addCriterion("zfeichukushul <>", value, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulGreaterThan(Integer value) {
            addCriterion("zfeichukushul >", value, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulGreaterThanOrEqualTo(Integer value) {
            addCriterion("zfeichukushul >=", value, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulLessThan(Integer value) {
            addCriterion("zfeichukushul <", value, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulLessThanOrEqualTo(Integer value) {
            addCriterion("zfeichukushul <=", value, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulIn(List<Integer> values) {
            addCriterion("zfeichukushul in", values, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulNotIn(List<Integer> values) {
            addCriterion("zfeichukushul not in", values, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulBetween(Integer value1, Integer value2) {
            addCriterion("zfeichukushul between", value1, value2, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukushulNotBetween(Integer value1, Integer value2) {
            addCriterion("zfeichukushul not between", value1, value2, "zfeichukushul");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineIsNull() {
            addCriterion("zfeichukujine is null");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineIsNotNull() {
            addCriterion("zfeichukujine is not null");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineEqualTo(Double value) {
            addCriterion("zfeichukujine =", value, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineNotEqualTo(Double value) {
            addCriterion("zfeichukujine <>", value, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineGreaterThan(Double value) {
            addCriterion("zfeichukujine >", value, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineGreaterThanOrEqualTo(Double value) {
            addCriterion("zfeichukujine >=", value, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineLessThan(Double value) {
            addCriterion("zfeichukujine <", value, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineLessThanOrEqualTo(Double value) {
            addCriterion("zfeichukujine <=", value, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineIn(List<Double> values) {
            addCriterion("zfeichukujine in", values, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineNotIn(List<Double> values) {
            addCriterion("zfeichukujine not in", values, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineBetween(Double value1, Double value2) {
            addCriterion("zfeichukujine between", value1, value2, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andZfeichukujineNotBetween(Double value1, Double value2) {
            addCriterion("zfeichukujine not between", value1, value2, "zfeichukujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulIsNull() {
            addCriterion("sanbaorkushul is null");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulIsNotNull() {
            addCriterion("sanbaorkushul is not null");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulEqualTo(Integer value) {
            addCriterion("sanbaorkushul =", value, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulNotEqualTo(Integer value) {
            addCriterion("sanbaorkushul <>", value, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulGreaterThan(Integer value) {
            addCriterion("sanbaorkushul >", value, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulGreaterThanOrEqualTo(Integer value) {
            addCriterion("sanbaorkushul >=", value, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulLessThan(Integer value) {
            addCriterion("sanbaorkushul <", value, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulLessThanOrEqualTo(Integer value) {
            addCriterion("sanbaorkushul <=", value, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulIn(List<Integer> values) {
            addCriterion("sanbaorkushul in", values, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulNotIn(List<Integer> values) {
            addCriterion("sanbaorkushul not in", values, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulBetween(Integer value1, Integer value2) {
            addCriterion("sanbaorkushul between", value1, value2, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkushulNotBetween(Integer value1, Integer value2) {
            addCriterion("sanbaorkushul not between", value1, value2, "sanbaorkushul");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineIsNull() {
            addCriterion("sanbaorkujine is null");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineIsNotNull() {
            addCriterion("sanbaorkujine is not null");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineEqualTo(Double value) {
            addCriterion("sanbaorkujine =", value, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineNotEqualTo(Double value) {
            addCriterion("sanbaorkujine <>", value, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineGreaterThan(Double value) {
            addCriterion("sanbaorkujine >", value, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineGreaterThanOrEqualTo(Double value) {
            addCriterion("sanbaorkujine >=", value, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineLessThan(Double value) {
            addCriterion("sanbaorkujine <", value, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineLessThanOrEqualTo(Double value) {
            addCriterion("sanbaorkujine <=", value, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineIn(List<Double> values) {
            addCriterion("sanbaorkujine in", values, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineNotIn(List<Double> values) {
            addCriterion("sanbaorkujine not in", values, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineBetween(Double value1, Double value2) {
            addCriterion("sanbaorkujine between", value1, value2, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andSanbaorkujineNotBetween(Double value1, Double value2) {
            addCriterion("sanbaorkujine not between", value1, value2, "sanbaorkujine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulIsNull() {
            addCriterion("danqiankucshul is null");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulIsNotNull() {
            addCriterion("danqiankucshul is not null");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulEqualTo(Integer value) {
            addCriterion("danqiankucshul =", value, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulNotEqualTo(Integer value) {
            addCriterion("danqiankucshul <>", value, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulGreaterThan(Integer value) {
            addCriterion("danqiankucshul >", value, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulGreaterThanOrEqualTo(Integer value) {
            addCriterion("danqiankucshul >=", value, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulLessThan(Integer value) {
            addCriterion("danqiankucshul <", value, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulLessThanOrEqualTo(Integer value) {
            addCriterion("danqiankucshul <=", value, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulIn(List<Integer> values) {
            addCriterion("danqiankucshul in", values, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulNotIn(List<Integer> values) {
            addCriterion("danqiankucshul not in", values, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulBetween(Integer value1, Integer value2) {
            addCriterion("danqiankucshul between", value1, value2, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucshulNotBetween(Integer value1, Integer value2) {
            addCriterion("danqiankucshul not between", value1, value2, "danqiankucshul");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineIsNull() {
            addCriterion("danqiankucjine is null");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineIsNotNull() {
            addCriterion("danqiankucjine is not null");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineEqualTo(Double value) {
            addCriterion("danqiankucjine =", value, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineNotEqualTo(Double value) {
            addCriterion("danqiankucjine <>", value, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineGreaterThan(Double value) {
            addCriterion("danqiankucjine >", value, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineGreaterThanOrEqualTo(Double value) {
            addCriterion("danqiankucjine >=", value, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineLessThan(Double value) {
            addCriterion("danqiankucjine <", value, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineLessThanOrEqualTo(Double value) {
            addCriterion("danqiankucjine <=", value, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineIn(List<Double> values) {
            addCriterion("danqiankucjine in", values, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineNotIn(List<Double> values) {
            addCriterion("danqiankucjine not in", values, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineBetween(Double value1, Double value2) {
            addCriterion("danqiankucjine between", value1, value2, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andDanqiankucjineNotBetween(Double value1, Double value2) {
            addCriterion("danqiankucjine not between", value1, value2, "danqiankucjine");
            return (Criteria) this;
        }

        public Criteria andGuazhangIsNull() {
            addCriterion("guazhang is null");
            return (Criteria) this;
        }

        public Criteria andGuazhangIsNotNull() {
            addCriterion("guazhang is not null");
            return (Criteria) this;
        }

        public Criteria andGuazhangEqualTo(Double value) {
            addCriterion("guazhang =", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangNotEqualTo(Double value) {
            addCriterion("guazhang <>", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangGreaterThan(Double value) {
            addCriterion("guazhang >", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangGreaterThanOrEqualTo(Double value) {
            addCriterion("guazhang >=", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangLessThan(Double value) {
            addCriterion("guazhang <", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangLessThanOrEqualTo(Double value) {
            addCriterion("guazhang <=", value, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangIn(List<Double> values) {
            addCriterion("guazhang in", values, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangNotIn(List<Double> values) {
            addCriterion("guazhang not in", values, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangBetween(Double value1, Double value2) {
            addCriterion("guazhang between", value1, value2, "guazhang");
            return (Criteria) this;
        }

        public Criteria andGuazhangNotBetween(Double value1, Double value2) {
            addCriterion("guazhang not between", value1, value2, "guazhang");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuIsNull() {
            addCriterion("yinhangzhanghu is null");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuIsNotNull() {
            addCriterion("yinhangzhanghu is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuEqualTo(Double value) {
            addCriterion("yinhangzhanghu =", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotEqualTo(Double value) {
            addCriterion("yinhangzhanghu <>", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuGreaterThan(Double value) {
            addCriterion("yinhangzhanghu >", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuGreaterThanOrEqualTo(Double value) {
            addCriterion("yinhangzhanghu >=", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuLessThan(Double value) {
            addCriterion("yinhangzhanghu <", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuLessThanOrEqualTo(Double value) {
            addCriterion("yinhangzhanghu <=", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuIn(List<Double> values) {
            addCriterion("yinhangzhanghu in", values, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotIn(List<Double> values) {
            addCriterion("yinhangzhanghu not in", values, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuBetween(Double value1, Double value2) {
            addCriterion("yinhangzhanghu between", value1, value2, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotBetween(Double value1, Double value2) {
            addCriterion("yinhangzhanghu not between", value1, value2, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andDantianshijianIsNull() {
            addCriterion("dantianshijian is null");
            return (Criteria) this;
        }

        public Criteria andDantianshijianIsNotNull() {
            addCriterion("dantianshijian is not null");
            return (Criteria) this;
        }

        public Criteria andDantianshijianEqualTo(Date value) {
            addCriterion("dantianshijian =", value, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianNotEqualTo(Date value) {
            addCriterion("dantianshijian <>", value, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianGreaterThan(Date value) {
            addCriterion("dantianshijian >", value, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("dantianshijian >=", value, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianLessThan(Date value) {
            addCriterion("dantianshijian <", value, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianLessThanOrEqualTo(Date value) {
            addCriterion("dantianshijian <=", value, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianIn(List<Date> values) {
            addCriterion("dantianshijian in", values, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianNotIn(List<Date> values) {
            addCriterion("dantianshijian not in", values, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianBetween(Date value1, Date value2) {
            addCriterion("dantianshijian between", value1, value2, "dantianshijian");
            return (Criteria) this;
        }

        public Criteria andDantianshijianNotBetween(Date value1, Date value2) {
            addCriterion("dantianshijian not between", value1, value2, "dantianshijian");
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