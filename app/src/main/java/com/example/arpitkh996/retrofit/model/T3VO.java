package com.example.arpitkh996.retrofit.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public  class T3VO extends SimpleResponse implements Serializable {

    private Map<String, T3_DayVO> days;

    public Map<String, T3_DayVO> getDays() {
        return days;
    }

    public void setDays(Map<String, T3_DayVO> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return printHashMapValues(getDays());
    }

    private String printHashMapValues(Map<String, T3_DayVO> hm) {
        Set setOfKeys = hm.keySet();
        Iterator iterator = setOfKeys.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            String value = ((T3_DayVO) hm.get(key)).toString();
//            FLog.d("sagar", "Key: " + key + ", Value: " + value);
            sb.append("key: : " + key + ", timingvo: : " + value);
        }
        return sb.toString();
    }
}
