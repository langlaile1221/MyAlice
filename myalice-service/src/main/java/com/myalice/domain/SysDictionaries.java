package com.myalice.domain;

import java.util.Date;

public class SysDictionaries  extends BaseDomain {
   
	private static final long serialVersionUID = -2586169623865673980L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionaries.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionaries.tname
     *
     * @mbg.generated
     */
    private String tname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionaries.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionaries.dtype
     *
     * @mbg.generated
     */
    private String dtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionaries.tindex
     *
     * @mbg.generated
     */
    private Integer tindex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionaries.id
     *
     * @return the value of sys_dictionaries.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionaries.id
     *
     * @param id the value for sys_dictionaries.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionaries.tname
     *
     * @return the value of sys_dictionaries.tname
     *
     * @mbg.generated
     */
    public String getTname() {
        return tname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionaries.tname
     *
     * @param tname the value for sys_dictionaries.tname
     *
     * @mbg.generated
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionaries.createTime
     *
     * @return the value of sys_dictionaries.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionaries.createTime
     *
     * @param createtime the value for sys_dictionaries.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionaries.dtype
     *
     * @return the value of sys_dictionaries.dtype
     *
     * @mbg.generated
     */
    public String getDtype() {
        return dtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionaries.dtype
     *
     * @param dtype the value for sys_dictionaries.dtype
     *
     * @mbg.generated
     */
    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionaries.tindex
     *
     * @return the value of sys_dictionaries.tindex
     *
     * @mbg.generated
     */
    public Integer getTindex() {
        return tindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionaries.tindex
     *
     * @param tindex the value for sys_dictionaries.tindex
     *
     * @mbg.generated
     */
    public void setTindex(Integer tindex) {
        this.tindex = tindex;
    }
}