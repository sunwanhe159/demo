package com.donkey.dto;

import com.donkey.enums.StateEnum;

import java.io.Serializable;

/**
 * 页面结果。
 * Created by sunwh on 2020/5/27.
 */
public class PageResult implements Serializable{
    /**
     * 状态码。
     */
    private Integer status;

    /**
     * 返回的数据。
     */
    private Object data;

    /**
     * 错误信息
     */
    private String error;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     * 请求成功
     * @param status
     */
    public PageResult(Integer status) {
        this.status = status;
    }

    /**
     * 请求成功并携带数据
     * @param status
     * @param data
     */
    public PageResult(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    /**
     * 请求失败
     * @param status
     * @param error
     */
    public PageResult(Integer status, String error) {
        this.status = status;
        this.error = error;
    }

    public static PageResult ok(){
        return new PageResult(StateEnum.SUCCESS.getState());
    }

    public static PageResult ok(Object data){
        return new PageResult(StateEnum.SUCCESS.getState(),data);
    }

    public static PageResult warn(String warn){return new PageResult(StateEnum.WARN.getState(),warn);}

    public static PageResult error(String error){
        return new PageResult(StateEnum.ERROR.getState(),error);
    }

}
