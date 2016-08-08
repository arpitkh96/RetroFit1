package com.example.arpitkh996.retrofit.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class T3_SlotVO {

	private Map<String,T3_TimingVO> timings;
	private int min_timing;
	private int max_timing;

	public T3_SlotVO(int min_timing, int max_timing, Map<String,T3_TimingVO> timings) {
		super();
		this.min_timing = min_timing;
		this.max_timing = max_timing;
		this.setTimings(timings);
	}

	public T3_SlotVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getMin_timing() {
		return min_timing;
	}

	public void setMin_timing(int min_timing) {
		this.min_timing = min_timing;
	}

	public int getMax_timing() {
		return max_timing;
	}

	public void setMax_timing(int max_timing) {
		this.max_timing = max_timing;
	}

	public Map<String,T3_TimingVO> getTimings() {
		return timings;
	}

	public void setTimings(Map<String,T3_TimingVO> timings) {
		this.timings = timings;
	}


	@Override
	public String toString() {
		return  "min: " + min_timing +
				"max: "+ max_timing +
				"" + printHashMapValues(timings);
	}

	private String printHashMapValues(Map<String, T3_TimingVO> hm) {
		Set setOfKeys = hm.keySet();
		Iterator iterator = setOfKeys.iterator();

        StringBuilder sb = new StringBuilder("");

		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String value = ((T3_TimingVO) hm.get(key)).toString();
            sb.append(" key: : " + key + ", timingvo: : " + value);
		}
        return sb.toString();
	}
}