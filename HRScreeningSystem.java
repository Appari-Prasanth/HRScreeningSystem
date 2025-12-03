package com.resume;

import java.util.Scanner;

public class HRScreeningSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== HR Interview Screening System ===");
		System.out.print("Did you pass the previous technical round? (true/false): ");
		boolean passed = sc.nextBoolean();

		if (passed) {

			System.out.print("Enter your educational background (BTech/BSc/BCom/etc): ");
			String background = sc.next();
			System.out.println("So Your educational background is: " + background);


			System.out.print("Did you complete your education? (true/false): ");
			boolean completed = sc.nextBoolean();

			if (completed) {

				System.out.print("Enter your CGPA: ");
				double cgpa = sc.nextDouble();

				if (cgpa >= 6.0 && cgpa <= 10.0) {

					System.out.println("Your CGPA meets our minimum criteria.");

					System.out.print("Did you complete any projects? (true/false): ");
					boolean hasProject = sc.nextBoolean();

					if (hasProject) {

						System.out.print("Enter your expected salary: ");
						double salary = sc.nextDouble();

						if (salary < 200000) {
							System.out.println("Salary expectation is acceptable. You may proceed.");
						} else {
							System.out.println("Salary expectation is above our limit. HR will review manually.");
						}

					} else {
						System.out.println("At least one project is required for this position.");
					}

				} else {
					System.out.println("Your CGPA does not meet our criteria.");
				}

			} else {
				System.out.println("Only candidates who completed their education are eligible.");
			}

		} else {
			System.out.println("You must pass the previous round to enter the HR Interview.");
		}

		sc.close();
	}
}
