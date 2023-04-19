package salaryCalculation;

import java.util.*;

/**
 * 
 * @author DELL
 *
 */

public class employeewage {

	/**
	 * 
	 * @param args
	 */
	/*
	 * To calculate the attendance of employee
	 */
	public static double isPresent() {
		int isFulltime = 1;
		double isPresent = Math.floor(Math.random() * 10 % 2);
		if (isPresent == isFulltime) {
			System.out.println("Employee is present");

		} else {
			System.out.println("Employee is not present");
		}
		return isPresent;

	}
	/*
	 * To Calculate total salary
	 */

	public static int salaryCalculation() {
		int hours = 0;
		int wage = 0;
		int isFulltime = 1;
		int totalSalary = 0;
		double isPresent = Math.floor(Math.random() * 10 % 2);
		if (isPresent == isFulltime) {
			hours = 8;
		} else {
			hours = 0;
		}

		totalSalary = hours * wage;

		System.out.println("The total salary is " + totalSalary);

		return totalSalary;

	}

	/*
	 * To check the attendance of employee for part time
	 */
	public static int parttimeemp() {
		/*
		 * Initializing Variables
		 */
		int parttime = 1;
		int fulltime = 2;
		int RatePerHour = 20;
		int hours = 0;
		int wage = 0;
		/*
		 * Computation according to the given formula
		 */
		double isPresent = Math.floor(Math.random() * 10 % 3);
		/*
		 * Checking if conditions
		 */
		if (isPresent == parttime) {
			hours = 4;
		} else if (isPresent == fulltime) {
			hours = 8;

		} else {
			hours = 0;
		}
		return (int) isPresent;
	}
	/*
	 * Switch case statements for
	 */

	public static int employeeAttendanceWwitch() {
		/*
		 * Initializing Variables
		 */
		int hours = 0;
		int wage = 0;
		final int parttime = 1;
		final int fulltime = 2;
		/*
		 * Computation
		 */
		int isPresent = (int) Math.floor(Math.random() * 10 % 3);
		switch (isPresent) {
		case parttime:
			hours = 4;
			break;
		case fulltime:
			hours = 8;
			break;
		default:
			hours = 0;
		}
		/*
		 * Calculating the Total Salary
		 */

		int totalSalary = hours * wage;

		return totalSalary;
	}

	/*
	 * Method for calculating monthly wage
	 */
	public static int monthlywages() {
		/*
		 * Initializing variables
		 */
		int hours = 0;
		int wage = 0;
		int totalwage = 0;
		int NoOfWorkingdays = 20;
		final int parttime = 1;
		final int fulltime = 2;
		/*
		 * Computation
		 */
		for (int day = 0; day <= NoOfWorkingdays; day++) {
			int isPresent = (int) Math.floor(Math.random() * 10 % 3);
			/*
			 * Switch Case conditions
			 */
			switch (isPresent) {
			case parttime:
				hours = 4;
				break;
			case fulltime:
				hours = 8;
				break;
			default:
				hours = 0;
			}
			/*
			 * Total Salary Calculation
			 */
			int totalSalary = hours * wage;
			totalwage = +totalSalary;
			System.out.println("Total Wage is " + totalwage);
		}
		return totalwage;

	}

	/*
	 * Main method
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * Calling the methods into the main function
		 */
		isPresent();
		salaryCalculation();
		parttimeemp();
		employeeAttendanceWwitch();
		monthlywages();
	}

}
