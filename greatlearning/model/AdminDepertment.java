package com.greatlearning.model;

import com.greatlearning.model.SuperDepartment;

public class AdminDepertment extends SuperDepartment {
	public String departmentName() {
		String s = "Welcome to Admin Depertment";
		System.out.println(s);
		return s;
	}

	public String getTodaysWork() {
		String s = "Complete your documents Submission";
		System.out.println(s);
		return s;
	}

	public String getWorkDeadline() {
		String s = "Complete by EOD";
		System.out.println(s);
		return s;
	}
}
