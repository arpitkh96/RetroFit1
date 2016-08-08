package com.example.arpitkh996.retrofit.model;


public class T3_TimingVO {

	private int min_guests;
	private int max_guests;
	private int quotetime;
	
	public T3_TimingVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T3_TimingVO(int min_guests, int max_guests, int quotetime) {
		super();
		this.min_guests = min_guests;
		this.max_guests = max_guests;
		this.quotetime = quotetime;
	}
	public int getMin_guests() {
		return min_guests;
	}
	public void setMin_guests(int min_guests) {
		this.min_guests = min_guests;
	}
	public int getMax_guests() {
		return max_guests;
	}
	public void setMax_guests(int max_guests) {
		this.max_guests = max_guests;
	}
	public int getQuotetime() {

		return quotetime;
	}
	public void setQuotetime(int quotetime) {
		this.quotetime = quotetime;
	}


	@Override
	public String toString() {
		return " min_g" + min_guests +
				" max_g" + max_guests +
				" time " + quotetime;
	}
}
