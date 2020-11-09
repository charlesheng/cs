package com.zheng.upms.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public TestExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andTest1IsNull() {
            addCriterion("test1 is null");
            return (Criteria) this;
        }

        public Criteria andTest1IsNotNull() {
            addCriterion("test1 is not null");
            return (Criteria) this;
        }

        public Criteria andTest1EqualTo(String value) {
            addCriterion("test1 =", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotEqualTo(String value) {
            addCriterion("test1 <>", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThan(String value) {
            addCriterion("test1 >", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThanOrEqualTo(String value) {
            addCriterion("test1 >=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThan(String value) {
            addCriterion("test1 <", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThanOrEqualTo(String value) {
            addCriterion("test1 <=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Like(String value) {
            addCriterion("test1 like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotLike(String value) {
            addCriterion("test1 not like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1In(List<String> values) {
            addCriterion("test1 in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotIn(List<String> values) {
            addCriterion("test1 not in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Between(String value1, String value2) {
            addCriterion("test1 between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotBetween(String value1, String value2) {
            addCriterion("test1 not between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest2IsNull() {
            addCriterion("test2 is null");
            return (Criteria) this;
        }

        public Criteria andTest2IsNotNull() {
            addCriterion("test2 is not null");
            return (Criteria) this;
        }

        public Criteria andTest2EqualTo(Integer value) {
            addCriterion("test2 =", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotEqualTo(Integer value) {
            addCriterion("test2 <>", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2GreaterThan(Integer value) {
            addCriterion("test2 >", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2GreaterThanOrEqualTo(Integer value) {
            addCriterion("test2 >=", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2LessThan(Integer value) {
            addCriterion("test2 <", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2LessThanOrEqualTo(Integer value) {
            addCriterion("test2 <=", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2In(List<Integer> values) {
            addCriterion("test2 in", values, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotIn(List<Integer> values) {
            addCriterion("test2 not in", values, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2Between(Integer value1, Integer value2) {
            addCriterion("test2 between", value1, value2, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotBetween(Integer value1, Integer value2) {
            addCriterion("test2 not between", value1, value2, "test2");
            return (Criteria) this;
        }

        public Criteria andTestIsNull() {
            addCriterion("test is null");
            return (Criteria) this;
        }

        public Criteria andTestIsNotNull() {
            addCriterion("test is not null");
            return (Criteria) this;
        }

        public Criteria andTestEqualTo(BigDecimal value) {
            addCriterion("test =", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotEqualTo(BigDecimal value) {
            addCriterion("test <>", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThan(BigDecimal value) {
            addCriterion("test >", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("test >=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThan(BigDecimal value) {
            addCriterion("test <", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("test <=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestIn(List<BigDecimal> values) {
            addCriterion("test in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotIn(List<BigDecimal> values) {
            addCriterion("test not in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("test between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("test not between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andTest3IsNull() {
            addCriterion("test3 is null");
            return (Criteria) this;
        }

        public Criteria andTest3IsNotNull() {
            addCriterion("test3 is not null");
            return (Criteria) this;
        }

        public Criteria andTest3EqualTo(Date value) {
            addCriterion("test3 =", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotEqualTo(Date value) {
            addCriterion("test3 <>", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3GreaterThan(Date value) {
            addCriterion("test3 >", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3GreaterThanOrEqualTo(Date value) {
            addCriterion("test3 >=", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3LessThan(Date value) {
            addCriterion("test3 <", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3LessThanOrEqualTo(Date value) {
            addCriterion("test3 <=", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3In(List<Date> values) {
            addCriterion("test3 in", values, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotIn(List<Date> values) {
            addCriterion("test3 not in", values, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3Between(Date value1, Date value2) {
            addCriterion("test3 between", value1, value2, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotBetween(Date value1, Date value2) {
            addCriterion("test3 not between", value1, value2, "test3");
            return (Criteria) this;
        }

        public Criteria andTest4IsNull() {
            addCriterion("test4 is null");
            return (Criteria) this;
        }

        public Criteria andTest4IsNotNull() {
            addCriterion("test4 is not null");
            return (Criteria) this;
        }

        public Criteria andTest4EqualTo(Date value) {
            addCriterionForJDBCDate("test4 =", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotEqualTo(Date value) {
            addCriterionForJDBCDate("test4 <>", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4GreaterThan(Date value) {
            addCriterionForJDBCDate("test4 >", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test4 >=", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4LessThan(Date value) {
            addCriterionForJDBCDate("test4 <", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test4 <=", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4In(List<Date> values) {
            addCriterionForJDBCDate("test4 in", values, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotIn(List<Date> values) {
            addCriterionForJDBCDate("test4 not in", values, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4Between(Date value1, Date value2) {
            addCriterionForJDBCDate("test4 between", value1, value2, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test4 not between", value1, value2, "test4");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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