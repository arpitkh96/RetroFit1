package com.example.arpitkh996.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by arpitkh96 on 8/8/16.
 */public class SimpleResponse {

    @SerializedName("rs")
    @Expose
    private Integer rs;
    @SerializedName("msg")
    @Expose
    private String msg;

    /**
     *
     * @return
     * The rs
     */
    public Integer getRs() {
        return rs;
    }

    /**
     *
     * @param rs
     * The rs
     */
    public void setRs(Integer rs) {
        this.rs = rs;
    }

    /**
     *
     * @return
     * The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     *
     * @param msg
     * The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


}

