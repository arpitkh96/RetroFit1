package com.example.arpitkh996.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public  class T3VO extends SimpleResponse implements Serializable {

    @SerializedName("ot")
    Ot ot;

    public Ot getOt() {
        return ot;
    }

    class Ot{
    public Ot() {
    }

    private Map<String, T3_DayVO> days;

    public Map<String, T3_DayVO> getDays() {
        return days;
    }

    public void setDays(Map<String, T3_DayVO> days) {
        this.days = days;
    }
}
}

