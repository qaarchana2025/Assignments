package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment10_ConditionalStatementsAndLoop {

	public static void main(String[] args) {

		String[] employees = { "Alice Jonson", "Bob Smith", "Carol Davis", "David Brown", "David Brown" };

		Double[] emp1data = { 75000.0, 5.0, 4.2 };
		Double[] emp2data = { 68000.0, 3.0, 3.8 };
		Double[] emp3data = { 82000.0, 7.0, 4.5 };
		Double[] emp4data = { 90000.0, 10.0, 2.0 };
		Double[] emp5data = { 60000.0, 2.0, 3.5 };

		Map<String, Double[]> empMap = new HashMap<>();

		empMap.put(employees[0], emp1data);
		empMap.put(employees[1], emp2data);
		empMap.put(employees[2], emp3data);
		empMap.put(employees[3], emp4data);
		empMap.put(employees[4], emp5data);

		Map<String, Double> hikeMap = new HashMap<>();

		for (String emp : employees) {

			Double[] data = empMap.get(emp);
			double hikePercentage = calculateHike(data[0], data[1], data[2]);
			hikeMap.put(emp, hikePercentage);
		}
		System.out.println("Hike Percentage for each employee:");

		for (String emp : employees) {
			System.out.println(emp + ":	" + hikeMap.get(emp) + "%");
		}

	}

	public static double calculateHike(double baseSalary, double experience, double rating) {
		double variablePayPercentage;
		double bonus;
		double reward = 0;

		// Determine variable pay and bonus based on rating
		if (rating >= 4) {
			variablePayPercentage = 15;
			bonus = 1500;
		} else if (rating >= 3) {

			variablePayPercentage = 10;
			bonus = 1200;
		} else {
			variablePayPercentage = 3;
			bonus = 300;
		}

		// Additional reward for employees with 5+ years of experience
		if (experience >= 5) {
			reward = 5000;
		}

		// Calculate total hike amount
		double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
		// Return hike percentage
		return (hike / baseSalary) * 100;

	}
}
