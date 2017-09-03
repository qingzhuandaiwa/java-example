/**
 * This class is generated by jOOQ
 */
package com.example.jooq.tables.records;


import com.example.jooq.tables.Example;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 示例
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExampleRecord extends UpdatableRecordImpl<ExampleRecord> implements Record13<Long, String, String, String, Byte, Integer, BigDecimal, Date, Time, Timestamp, Long, Timestamp, Long> {

    private static final long serialVersionUID = 217753160;

    /**
     * Setter for <code>schema.example.id</code>. Id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>schema.example.id</code>. Id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>schema.example.name</code>. 名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>schema.example.name</code>. 名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>schema.example.code</code>. 编码
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>schema.example.code</code>. 编码
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>schema.example.state</code>. 状态
     */
    public void setState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>schema.example.state</code>. 状态
     */
    public String getState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>schema.example.grade</code>. 等级
     */
    public void setGrade(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>schema.example.grade</code>. 等级
     */
    public Byte getGrade() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>schema.example.score</code>. 得分
     */
    public void setScore(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>schema.example.score</code>. 得分
     */
    public Integer getScore() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>schema.example.price</code>. 价格
     */
    public void setPrice(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>schema.example.price</code>. 价格
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>schema.example.birth</code>. 生日
     */
    public void setBirth(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>schema.example.birth</code>. 生日
     */
    public Date getBirth() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>schema.example.sleep</code>. 睡眠
     */
    public void setSleep(Time value) {
        set(8, value);
    }

    /**
     * Getter for <code>schema.example.sleep</code>. 睡眠
     */
    public Time getSleep() {
        return (Time) get(8);
    }

    /**
     * Setter for <code>schema.example.createdDate</code>. 创建时间
     */
    public void setCreateddate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>schema.example.createdDate</code>. 创建时间
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>schema.example.createdBy</code>. 创建人
     */
    public void setCreatedby(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>schema.example.createdBy</code>. 创建人
     */
    public Long getCreatedby() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>schema.example.modifiedDate</code>. 最后修改时间
     */
    public void setModifieddate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>schema.example.modifiedDate</code>. 最后修改时间
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>schema.example.modifiedBy</code>. 操作人
     */
    public void setModifiedby(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>schema.example.modifiedBy</code>. 操作人
     */
    public Long getModifiedby() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, Byte, Integer, BigDecimal, Date, Time, Timestamp, Long, Timestamp, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, Byte, Integer, BigDecimal, Date, Time, Timestamp, Long, Timestamp, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Example.EXAMPLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Example.EXAMPLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Example.EXAMPLE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Example.EXAMPLE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Example.EXAMPLE.GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Example.EXAMPLE.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Example.EXAMPLE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return Example.EXAMPLE.BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field9() {
        return Example.EXAMPLE.SLEEP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Example.EXAMPLE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return Example.EXAMPLE.CREATEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Example.EXAMPLE.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return Example.EXAMPLE.MODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value9() {
        return getSleep();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getCreatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getModifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value4(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value5(Byte value) {
        setGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value6(Integer value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value7(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value8(Date value) {
        setBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value9(Time value) {
        setSleep(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value10(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value11(Long value) {
        setCreatedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value12(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord value13(Long value) {
        setModifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExampleRecord values(Long value1, String value2, String value3, String value4, Byte value5, Integer value6, BigDecimal value7, Date value8, Time value9, Timestamp value10, Long value11, Timestamp value12, Long value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExampleRecord
     */
    public ExampleRecord() {
        super(Example.EXAMPLE);
    }

    /**
     * Create a detached, initialised ExampleRecord
     */
    public ExampleRecord(Long id, String name, String code, String state, Byte grade, Integer score, BigDecimal price, Date birth, Time sleep, Timestamp createddate, Long createdby, Timestamp modifieddate, Long modifiedby) {
        super(Example.EXAMPLE);

        set(0, id);
        set(1, name);
        set(2, code);
        set(3, state);
        set(4, grade);
        set(5, score);
        set(6, price);
        set(7, birth);
        set(8, sleep);
        set(9, createddate);
        set(10, createdby);
        set(11, modifieddate);
        set(12, modifiedby);
    }
}
