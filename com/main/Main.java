package main;

import departments.*;

/**
 * @author Anubhav Chaturvedi
 * @category OOPsAssignmentSolution
 * @date 2021-08-26
 */

public class Main {

	public static void main(String[] args) {
		Main lMain = new Main();
		AdminDepartment lAdminDepartment = new AdminDepartment();
		HrDepartment lHrDepartment = new HrDepartment();
		TechDepartment lTechDepartment = new TechDepartment();
		lMain.displayDepartmentsInformation(new SuperDepartment[] { lAdminDepartment, lHrDepartment, lTechDepartment });
	}

	private void displayDepartmentsInformation(SuperDepartment[] pDepartment) {
		for (int i = 0; i < pDepartment.length; i++) {
			System.out.println(" Welcome to" + pDepartment[i].departmentName());

			if ("HrDepartment".equals(pDepartment[i].getClass().getSimpleName()))
				System.out.println(((HrDepartment) pDepartment[i]).doActivity());

			System.out.println(pDepartment[i].getTodaysWork());
			System.out.println(pDepartment[i].getWorkDeadline());

			if ("TechDepartment".equals(pDepartment[i].getClass().getSimpleName()))
				System.out.println(((TechDepartment) pDepartment[i]).getTechStackInformation());

			System.out.println(pDepartment[i].isTodayAHoliday());
			System.out.println();
		}
	}

}
