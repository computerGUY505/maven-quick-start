package dev.computerGUY505.commerceApplication;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

	public int countwords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}

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
		int count = app.countwords("I have the sentence 'a quick brown fox jumps over the lazy dog'");
	}

}