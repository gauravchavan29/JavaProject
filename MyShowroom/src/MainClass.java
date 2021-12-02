import java.util.*;
//import vehicle.*;
public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("Welecome to My Showroom of Vehicles...!!!");
		System.out.println("\nI have Following Categorised set of vehicles");
		
		Boolean flag = false;
		
		while(flag==false) //It will run until flag is set to true this is used to force user to enter valid input
		{	
			System.out.println("================================"); 
			System.out.println("1.One Wheeler");
			System.out.println("2.Two Wheeler");
			System.out.println("3.Three Wheeler");
			System.out.println("4.Four Wheeler");
			System.out.println("================================");
		
			System.out.println("\nEnter Your Choice for selection");
		
			Scanner sc = new Scanner(System.in); 
			int a = sc.nextInt(); //Taking User input of their choice & storing it in variable a
		
			switch(a)
			{
			
			    case 1 : System.out.println("\nYour interest is in One wheeler");
			    		 flag = true;
			    		 break;
			    		 
				case 2 : System.out.println("\nYour interest is in Two wheeler");
						 flag = true;
					 	 break;
				
				case 3 : System.out.println("\nYour interest is in Three wheeler");
					 	 flag = true;
					 	 break;
				
				case 4 : System.out.println("\nYour interest is in Four wheeler");
					 	 flag = true;
					 	 break;
				
				default : System.out.println("\nPlease Enter Valid Input");
	 				  	  break;	
			}
		}
	}
}
