package com.sixclasses;

public class NoteBook {

	private String company;
	private int  noOfPages;
	private int cost;
	NoteBook(String company,int noOfPages,int cost){
		
		this.company=company;
		this.noOfPages=noOfPages;
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Company : "+company+", No of pages : "+noOfPages+" ,cost : "+cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook m=new NoteBook("ClassMate",200,75);
		System.out.println(m);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
