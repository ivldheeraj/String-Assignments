
/**
Assignment 2 
author : dheeraj 
Date: 5/1/2021
*/public class Assignment2 {

	public static void main(String[] args) {
		String url1 = "www.codegram.in/admin/reports/daywiseuser.php";
		String url2 = "www.codegram.in/guest/registration.php";
		String url3 = "www.codegram.in/about.php";
		String command=null;
		
		command = showCommand(url1);
		System.out.println("Command is : "+command);
		
		command = showCommand(url2);
		System.out.println("Command is : "+command);
		
		command = showCommand(url3);
		System.out.println("Command is : "+command);

	}

	private static String showCommand(String url1) {
		// TODO Write your code here
		String command="";
		String[] link = url1.split("/");
		for(int i=0;i<link.length;i++)
		{
			if(link[i].endsWith(".php"))
			{
				command = link[i];
			}
			
		}
		return command.replace(".php","");
		
		
		
	}

}