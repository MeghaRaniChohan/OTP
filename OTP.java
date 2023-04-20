	/*----------OTP Generating-------------*/
// Java code to explain how to generate random

import java.util.*;

public class otp
{					// This our OTP generating method
	static char[] OTP(int len)	// We have use static here, so that we not to	  
	{		 		// make any object for it
		
		System.out.println("Generating OTP using random() : ");
		System.out.print("You OTP is : ");

		String numbers = "0123456789";
		

		Random rndm_method = new Random();		// Using random method
		char[] otp = new char[len];
		
		for (int i = 0; i < len; i++)
		{
			// Use of charAt() method : to get character value
            		// Use of nextInt() as it is scanning the value as int
			
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return otp;
	}	
	
	public static void main(String[] args)
	{
		
		int length = 6;			// Length of your Otp as I have choose
		System.out.println(OTP(length));
	}

}