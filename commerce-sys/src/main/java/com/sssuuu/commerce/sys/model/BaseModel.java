package com.sssuuu.commerce.sys.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {

    @JsonIgnore
    protected Date createTime;
    @JsonIgnore // 忽略
    protected String createUser;
    @JsonIgnore // 忽略
    protected Date updateTime;
    @JsonIgnore // 忽略
    protected String updateUser;
    @JsonIgnore // 忽略
    protected Short state;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}
