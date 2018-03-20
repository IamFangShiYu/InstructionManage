package com.guigu.InstructionalManage.po;

import java.util.ArrayList;
import java.util.List;

public class SaleTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleTableExample() {
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

        public Criteria andSaleidIsNull() {
            addCriterion("SaleId is null");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNotNull() {
            addCriterion("SaleId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleidEqualTo(Integer value) {
            addCriterion("SaleId =", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotEqualTo(Integer value) {
            addCriterion("SaleId <>", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThan(Integer value) {
            addCriterion("SaleId >", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleId >=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThan(Integer value) {
            addCriterion("SaleId <", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThanOrEqualTo(Integer value) {
            addCriterion("SaleId <=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidIn(List<Integer> values) {
            addCriterion("SaleId in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotIn(List<Integer> values) {
            addCriterion("SaleId not in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidBetween(Integer value1, Integer value2) {
            addCriterion("SaleId between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleId not between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSalenameIsNull() {
            addCriterion("SaleName is null");
            return (Criteria) this;
        }

        public Criteria andSalenameIsNotNull() {
            addCriterion("SaleName is not null");
            return (Criteria) this;
        }

        public Criteria andSalenameEqualTo(String value) {
            addCriterion("SaleName =", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotEqualTo(String value) {
            addCriterion("SaleName <>", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameGreaterThan(String value) {
            addCriterion("SaleName >", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameGreaterThanOrEqualTo(String value) {
            addCriterion("SaleName >=", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameLessThan(String value) {
            addCriterion("SaleName <", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameLessThanOrEqualTo(String value) {
            addCriterion("SaleName <=", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameLike(String value) {
            addCriterion("SaleName like", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotLike(String value) {
            addCriterion("SaleName not like", value, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameIn(List<String> values) {
            addCriterion("SaleName in", values, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotIn(List<String> values) {
            addCriterion("SaleName not in", values, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameBetween(String value1, String value2) {
            addCriterion("SaleName between", value1, value2, "salename");
            return (Criteria) this;
        }

        public Criteria andSalenameNotBetween(String value1, String value2) {
            addCriterion("SaleName not between", value1, value2, "salename");
            return (Criteria) this;
        }

        public Criteria andSaleaddrIsNull() {
            addCriterion("SaleAddr is null");
            return (Criteria) this;
        }

        public Criteria andSaleaddrIsNotNull() {
            addCriterion("SaleAddr is not null");
            return (Criteria) this;
        }

        public Criteria andSaleaddrEqualTo(String value) {
            addCriterion("SaleAddr =", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrNotEqualTo(String value) {
            addCriterion("SaleAddr <>", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrGreaterThan(String value) {
            addCriterion("SaleAddr >", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrGreaterThanOrEqualTo(String value) {
            addCriterion("SaleAddr >=", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrLessThan(String value) {
            addCriterion("SaleAddr <", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrLessThanOrEqualTo(String value) {
            addCriterion("SaleAddr <=", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrLike(String value) {
            addCriterion("SaleAddr like", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrNotLike(String value) {
            addCriterion("SaleAddr not like", value, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrIn(List<String> values) {
            addCriterion("SaleAddr in", values, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrNotIn(List<String> values) {
            addCriterion("SaleAddr not in", values, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrBetween(String value1, String value2) {
            addCriterion("SaleAddr between", value1, value2, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaleaddrNotBetween(String value1, String value2) {
            addCriterion("SaleAddr not between", value1, value2, "saleaddr");
            return (Criteria) this;
        }

        public Criteria andSaletelIsNull() {
            addCriterion("SaleTel is null");
            return (Criteria) this;
        }

        public Criteria andSaletelIsNotNull() {
            addCriterion("SaleTel is not null");
            return (Criteria) this;
        }

        public Criteria andSaletelEqualTo(Integer value) {
            addCriterion("SaleTel =", value, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelNotEqualTo(Integer value) {
            addCriterion("SaleTel <>", value, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelGreaterThan(Integer value) {
            addCriterion("SaleTel >", value, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleTel >=", value, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelLessThan(Integer value) {
            addCriterion("SaleTel <", value, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelLessThanOrEqualTo(Integer value) {
            addCriterion("SaleTel <=", value, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelIn(List<Integer> values) {
            addCriterion("SaleTel in", values, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelNotIn(List<Integer> values) {
            addCriterion("SaleTel not in", values, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelBetween(Integer value1, Integer value2) {
            addCriterion("SaleTel between", value1, value2, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaletelNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleTel not between", value1, value2, "saletel");
            return (Criteria) this;
        }

        public Criteria andSaleotherIsNull() {
            addCriterion("SaleOther is null");
            return (Criteria) this;
        }

        public Criteria andSaleotherIsNotNull() {
            addCriterion("SaleOther is not null");
            return (Criteria) this;
        }

        public Criteria andSaleotherEqualTo(String value) {
            addCriterion("SaleOther =", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherNotEqualTo(String value) {
            addCriterion("SaleOther <>", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherGreaterThan(String value) {
            addCriterion("SaleOther >", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherGreaterThanOrEqualTo(String value) {
            addCriterion("SaleOther >=", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherLessThan(String value) {
            addCriterion("SaleOther <", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherLessThanOrEqualTo(String value) {
            addCriterion("SaleOther <=", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherLike(String value) {
            addCriterion("SaleOther like", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherNotLike(String value) {
            addCriterion("SaleOther not like", value, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherIn(List<String> values) {
            addCriterion("SaleOther in", values, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherNotIn(List<String> values) {
            addCriterion("SaleOther not in", values, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherBetween(String value1, String value2) {
            addCriterion("SaleOther between", value1, value2, "saleother");
            return (Criteria) this;
        }

        public Criteria andSaleotherNotBetween(String value1, String value2) {
            addCriterion("SaleOther not between", value1, value2, "saleother");
            return (Criteria) this;
        }

        public Criteria andSalepwdIsNull() {
            addCriterion("SalePwd is null");
            return (Criteria) this;
        }

        public Criteria andSalepwdIsNotNull() {
            addCriterion("SalePwd is not null");
            return (Criteria) this;
        }

        public Criteria andSalepwdEqualTo(String value) {
            addCriterion("SalePwd =", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdNotEqualTo(String value) {
            addCriterion("SalePwd <>", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdGreaterThan(String value) {
            addCriterion("SalePwd >", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdGreaterThanOrEqualTo(String value) {
            addCriterion("SalePwd >=", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdLessThan(String value) {
            addCriterion("SalePwd <", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdLessThanOrEqualTo(String value) {
            addCriterion("SalePwd <=", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdLike(String value) {
            addCriterion("SalePwd like", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdNotLike(String value) {
            addCriterion("SalePwd not like", value, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdIn(List<String> values) {
            addCriterion("SalePwd in", values, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdNotIn(List<String> values) {
            addCriterion("SalePwd not in", values, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdBetween(String value1, String value2) {
            addCriterion("SalePwd between", value1, value2, "salepwd");
            return (Criteria) this;
        }

        public Criteria andSalepwdNotBetween(String value1, String value2) {
            addCriterion("SalePwd not between", value1, value2, "salepwd");
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