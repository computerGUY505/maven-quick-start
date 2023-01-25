package dev.computerGUY505.commerceApplication;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		for (String greeting : greetings) {
			System.out.println("\n\nGreeting: " + greeting);
		}
	}
	
	public Application() {
		System.out.println ("\n\nInside Application");
	}

	public static void main (String[] args) {
		System.out.println ("\n\nStarting Application");
		Application app = new Application();
		app.greet();
	}

}