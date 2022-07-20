package org.sample_maven.practice;

import org.testng.annotations.Test;

public class ScriptFourTest {

	
	@Test
	public void fourthMethod() {
		System.out.println("namasakaram");
		String UserName = System.getProperty("UserName");
		System.out.println(UserName);
	}
	
}
