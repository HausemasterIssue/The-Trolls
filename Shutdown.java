package dev.hause.shutdown;

/*
* @author: HausemasterIssue
* @since: 16/11/2021
*/

public class ForcedShutdown {
	
	public static void main (String []args) {
		// call the shutdown method
		shutdown();
	}
	
	public static void shutdown() {
		Runtime runtime = Runtime.getRuntime();
		
		try {
			System.out.println("trolled");
			// execute the shutdown system command
			runtime.exec("shutdown -s");
		} catch (Exception e){
			// if we cannot execute the command say we cannot
			System.out.println("you lucky kid");
		}
	}

}
