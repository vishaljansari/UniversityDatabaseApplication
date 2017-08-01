package project;

import java.util.Date;

public class Projects {
	
	String project_number;
	String sponsor_name;
	Date start_date;
	Date end_date;
	String budget;
	
	
	public String getProject_number() {
		return project_number;
	}
	public void setProject_number(String project_number) {
		this.project_number = project_number;
	}
	public String getSponsor_name() {
		return sponsor_name;
	}
	public void setSponsor_name(String sponsor_name) {
		this.sponsor_name = sponsor_name;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	

}
