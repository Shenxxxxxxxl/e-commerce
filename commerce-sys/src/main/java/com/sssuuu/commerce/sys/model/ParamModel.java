package com.sssuuu.commerce.sys.model;

import java.io.Serializable;

public class ParamModel<T>   implements Serializable {

    private Long orgId;

    private int pages;

    private int size;

    private T paramValues;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public T getParamValues() {
        return paramValues;
    }

    public void setParamValues(T paramValues) {
        this.paramValues = paramValues;
    }
}
