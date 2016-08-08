package com.example.arpitkh996.retrofit.model;

import java.util.List;

public class T3_DayVO {
	private String day;
	private List<T3_SlotVO> slots;

	public T3_DayVO(String day, List<T3_SlotVO> slots) {
		super();
		this.day = day;
		this.slots = slots;
	}

	public T3_DayVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<T3_SlotVO> getSlots() {
		return slots;
	}

	public void setSlots(List<T3_SlotVO> slots) {
		this.slots = slots;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}


	@Override
	public String toString() {
		return " day: "+ day +
				" slots: " + slots.toString();
	}
}
