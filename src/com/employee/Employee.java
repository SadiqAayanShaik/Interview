package com.employee;

public class Employee {
	private int eid;
	private String ename;
	private String departement;
	private String company;
	public Employee(int eid, String ename, String departement, String company) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.departement = departement;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", departement=" + departement + ", company=" + company
				+ "]";
	}
	public Employee() {
		 
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
