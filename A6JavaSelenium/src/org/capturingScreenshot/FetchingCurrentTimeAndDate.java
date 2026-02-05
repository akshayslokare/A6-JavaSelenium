package org.capturingScreenshot;

import java.time.LocalDateTime;

public class FetchingCurrentTimeAndDate 
{
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		System.out.println(timestamp);
		
	}

}
