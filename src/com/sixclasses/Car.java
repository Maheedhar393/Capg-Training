package com.sixclasses;

public class Car {
    
	private String company;
	private String model;
	private String color;
	private int cost;
	Car(String company,String model,String color,int cost){
		this.color=color;
		this.company=company;
		this.model=model;
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Company : "+company+", model : "+model+", color : "+color+" ,cost : "+cost;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("TATA","SUV","Red",300000);
		System.out.println(c);
	}

}
