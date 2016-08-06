package com.example.arpitkh996.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by arpitkh996 on 04-08-2016.
 */
public class Example {

    @SerializedName("result")
    @Expose
    private Integer result;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param message
     * @param result
     * @param data
     */
    public Example(Integer result, String message, Data data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    /**
     *
     * @return
     * The result
     */
    public Integer getResult() {
        return result;
    }

    /**
     *
     * @param result
     * The result
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The data
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(Data data) {
        this.data = data;
    }

}
