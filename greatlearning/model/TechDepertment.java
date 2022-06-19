package com.greatlearning.model;

import com.greatlearning.model.SuperDepartment;

public class TechDepertment extends SuperDepartment {
	public String departmentName() {
		String s = "Welcome to Tech Department";
		System.out.println(s);
		return s;
	}

	public String getTodaysWork() {
		String s = "Complete coding of module 1";
		System.out.println(s);
		return s;
	}

	public String getWorkDeadline() {
		String s = "Complete by EOD";
		System.out.println(s);
		return s;
	}

	public String getTechStackInformation() {
		String s = "Core Java";
		System.out.println(s);
		return s;
	}

}
