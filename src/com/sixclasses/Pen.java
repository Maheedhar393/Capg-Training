package com.sixclasses;

public class Pen {

	private String company;
	private String color;
	private int cost;
	Pen(String company,String color,int cost){
		this.color=color;
		this.company=company;
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Company : "+company+", color : "+color+" ,cost : "+cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen m=new Pen("Reynolds","black",5);
		System.out.println(m);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}