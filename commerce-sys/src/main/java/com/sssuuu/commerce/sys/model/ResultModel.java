package com.sssuuu.commerce.sys.model;

import java.io.Serializable;

public class ResultModel <T>  implements Serializable {
    private static final long serialVersionUID = -4214236501903574966L;
    protected String message;
    protected T value;
    protected boolean success;
    protected int msgCode;

    private ResultModel(){

    }

    public static <T> ResultModel<T> valueOfSuccess(T value){
        ResultModel<T> vo = new ResultModel<T>();
        vo.value = value;
        vo.success = true;
        vo.msgCode = 0;
        return vo;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }
}
