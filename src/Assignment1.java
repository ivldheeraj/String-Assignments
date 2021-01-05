/**
Assignment 1 --reverse words in string
author : dheeraj 
Date: 5/1/2021
*/
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		
		String[] word = input.split(" ");

		String reversedString ="";
		
		for(int i=0;i<word.length;i++)
		{
			if(i == word.length-1)
				reversedString = word[i]+ reversedString;
			else
				reversedString = " " + word[i]+reversedString;
			   	
			
		}
		
		return reversedString;
	}

}