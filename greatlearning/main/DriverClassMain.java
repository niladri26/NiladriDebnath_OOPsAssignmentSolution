package com.greatlearning.main;

import com.greatlearning.model.AdminDepertment;
import com.greatlearning.model.HrDepertment;
import com.greatlearning.model.TechDepertment;

public class DriverClassMain {
	public static void main(String[] args) {

		AdminDepertment objAdmin = new AdminDepertment();
		HrDepertment objHR = new HrDepertment();
		TechDepertment objTech = new TechDepertment();

		objAdmin.departmentName();
		objAdmin.getTodaysWork();
		objAdmin.getWorkDeadline();
		objAdmin.isTodayAHoliday();

		System.out.println();
		objHR.departmentName();
		objHR.doActivity();
		objHR.getTodaysWork();
		objHR.getWorkDeadline();
		objHR.isTodayAHoliday();

		System.out.println();
		objTech.departmentName();
		objTech.getTodaysWork();
		objTech.getWorkDeadline();
		objTech.getTechStackInformation();
		objTech.isTodayAHoliday();

	}

}
