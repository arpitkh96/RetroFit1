package com.example.arpitkh996.retrofit.model;

/**
 * Created by arpitkh996 on 05-08-2016.
 */

public class ApiError {

    private int statusCode;
    private String message;

    public ApiError() {
    }

    public int status() {
        return statusCode;
    }

    public String message() {
        return message;
    }
}
