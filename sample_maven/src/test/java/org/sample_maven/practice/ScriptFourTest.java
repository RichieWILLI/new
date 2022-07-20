package org.sample_maven.practice;

import org.testng.annotations.Test;

public class ScriptFourTest {

	
	@Test
	public void fourthMethod() {
		System.out.println("namasakaram");
		String username = System.getProperty("username");
		System.out.println(username);
	}
	
}
