package edu.gyansetu.javalearning;

import org.mathpix.ai.cal.Manager;

public class TestInheritance {

	public static void main(String[] args) {

		Manager manager = new Manager();

		manager.teamSize = 12;

		manager.id = 2;
		manager.name = "Mohit";

		CSRReprestative csrReprestative = new CSRReprestative();

		csrReprestative.activityType = "NGO donation";

		csrReprestative.id = 3;
		csrReprestative.name = "Himani";
		csrReprestative.teamSize = 4;

		C c = new C();
		c.id = 23; // B

		c.getIDFromA(); // A

		Boy obj = new Boy();

		Human.eat();
		
	

	}
}
