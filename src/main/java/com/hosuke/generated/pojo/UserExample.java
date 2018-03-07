package com.hosuke.generated.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAbouttextIsNull() {
            addCriterion("aboutText is null");
            return (Criteria) this;
        }

        public Criteria andAbouttextIsNotNull() {
            addCriterion("aboutText is not null");
            return (Criteria) this;
        }

        public Criteria andAbouttextEqualTo(String value) {
            addCriterion("aboutText =", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextNotEqualTo(String value) {
            addCriterion("aboutText <>", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextGreaterThan(String value) {
            addCriterion("aboutText >", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextGreaterThanOrEqualTo(String value) {
            addCriterion("aboutText >=", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextLessThan(String value) {
            addCriterion("aboutText <", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextLessThanOrEqualTo(String value) {
            addCriterion("aboutText <=", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextLike(String value) {
            addCriterion("aboutText like", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextNotLike(String value) {
            addCriterion("aboutText not like", value, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextIn(List<String> values) {
            addCriterion("aboutText in", values, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextNotIn(List<String> values) {
            addCriterion("aboutText not in", values, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextBetween(String value1, String value2) {
            addCriterion("aboutText between", value1, value2, "abouttext");
            return (Criteria) this;
        }

        public Criteria andAbouttextNotBetween(String value1, String value2) {
            addCriterion("aboutText not between", value1, value2, "abouttext");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkIsNull() {
            addCriterion("bigAvatarLink is null");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkIsNotNull() {
            addCriterion("bigAvatarLink is not null");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkEqualTo(String value) {
            addCriterion("bigAvatarLink =", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkNotEqualTo(String value) {
            addCriterion("bigAvatarLink <>", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkGreaterThan(String value) {
            addCriterion("bigAvatarLink >", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkGreaterThanOrEqualTo(String value) {
            addCriterion("bigAvatarLink >=", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkLessThan(String value) {
            addCriterion("bigAvatarLink <", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkLessThanOrEqualTo(String value) {
            addCriterion("bigAvatarLink <=", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkLike(String value) {
            addCriterion("bigAvatarLink like", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkNotLike(String value) {
            addCriterion("bigAvatarLink not like", value, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkIn(List<String> values) {
            addCriterion("bigAvatarLink in", values, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkNotIn(List<String> values) {
            addCriterion("bigAvatarLink not in", values, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkBetween(String value1, String value2) {
            addCriterion("bigAvatarLink between", value1, value2, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andBigavatarlinkNotBetween(String value1, String value2) {
            addCriterion("bigAvatarLink not between", value1, value2, "bigavatarlink");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateEqualTo(Date value) {
            addCriterion("registrationDate =", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotEqualTo(Date value) {
            addCriterion("registrationDate <>", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThan(Date value) {
            addCriterion("registrationDate >", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registrationDate >=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThan(Date value) {
            addCriterion("registrationDate <", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThanOrEqualTo(Date value) {
            addCriterion("registrationDate <=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIn(List<Date> values) {
            addCriterion("registrationDate in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotIn(List<Date> values) {
            addCriterion("registrationDate not in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateBetween(Date value1, Date value2) {
            addCriterion("registrationDate between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotBetween(Date value1, Date value2) {
            addCriterion("registrationDate not between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkIsNull() {
            addCriterion("smallAvatarLink is null");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkIsNotNull() {
            addCriterion("smallAvatarLink is not null");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkEqualTo(String value) {
            addCriterion("smallAvatarLink =", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkNotEqualTo(String value) {
            addCriterion("smallAvatarLink <>", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkGreaterThan(String value) {
            addCriterion("smallAvatarLink >", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkGreaterThanOrEqualTo(String value) {
            addCriterion("smallAvatarLink >=", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkLessThan(String value) {
            addCriterion("smallAvatarLink <", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkLessThanOrEqualTo(String value) {
            addCriterion("smallAvatarLink <=", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkLike(String value) {
            addCriterion("smallAvatarLink like", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkNotLike(String value) {
            addCriterion("smallAvatarLink not like", value, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkIn(List<String> values) {
            addCriterion("smallAvatarLink in", values, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkNotIn(List<String> values) {
            addCriterion("smallAvatarLink not in", values, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkBetween(String value1, String value2) {
            addCriterion("smallAvatarLink between", value1, value2, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andSmallavatarlinkNotBetween(String value1, String value2) {
            addCriterion("smallAvatarLink not between", value1, value2, "smallavatarlink");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkIsNull() {
            addCriterion("websiteLink is null");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkIsNotNull() {
            addCriterion("websiteLink is not null");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkEqualTo(String value) {
            addCriterion("websiteLink =", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkNotEqualTo(String value) {
            addCriterion("websiteLink <>", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkGreaterThan(String value) {
            addCriterion("websiteLink >", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkGreaterThanOrEqualTo(String value) {
            addCriterion("websiteLink >=", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkLessThan(String value) {
            addCriterion("websiteLink <", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkLessThanOrEqualTo(String value) {
            addCriterion("websiteLink <=", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkLike(String value) {
            addCriterion("websiteLink like", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkNotLike(String value) {
            addCriterion("websiteLink not like", value, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkIn(List<String> values) {
            addCriterion("websiteLink in", values, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkNotIn(List<String> values) {
            addCriterion("websiteLink not in", values, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkBetween(String value1, String value2) {
            addCriterion("websiteLink between", value1, value2, "websitelink");
            return (Criteria) this;
        }

        public Criteria andWebsitelinkNotBetween(String value1, String value2) {
            addCriterion("websiteLink not between", value1, value2, "websitelink");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 07 09:16:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated Wed Mar 07 09:16:28 CST 2018
     */
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