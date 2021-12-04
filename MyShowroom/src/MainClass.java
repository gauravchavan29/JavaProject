import java.util.*;
import vehicle.*;
import vehicle.fourwheeler.FourWheeler;
import vehicle.fourwheeler.micro.maruti.wagonr.*;
import vehicle.onewheeler.OneWheeler;
import vehicle.onewheeler.rinomotors.RinoBike;
import vehicle.twowheeler.TwoWheeler;
import vehicle.twowheeler.bajaj.Bajaj;
import vehicle.twowheeler.bajaj.dominar.Dominar;
import vehicle.twowheeler.bajaj.rs200.PulsarRs200;
import vehicle.twowheeler.honda.Honda;
import vehicle.twowheeler.royalenfield.RoyalEnfield;
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
			
			//Switch for 1W/2W/3W/4W
			switch(a)
			{
			
			    case 1 : System.out.println("\nYour interest is in One wheeler");
			    		 System.out.println("\nFollowing Brands are present in One Wheeler");
			    
			    		 System.out.println("================================"); 
			    		 Vehicle v1 = new RinoBike(); //upcasting
			    		 RinoBike b1 = (RinoBike)v1; //downcasting for access members of sub-class(RinoBike)
			    		 b1.brandname(); 
			    		 System.out.println("================================");
			    		 System.out.println("\nDetails of Vehicles are as follows :");
			    		 System.out.println("Name : " +b1.vname); 
			    		 System.out.println("Price : " +b1.price); 
			    		 b1.avg(); 	
			    		 System.out.println("\nWant test Drive y/n");
			    		 char ch = sc.next(".").charAt(0);
			    		 
			    		 if(ch!='y')
			    			 continue;
			    		 else
			    		 {
			    			 v1.driving(); //Method Overriding
			    			 System.out.println("\nPlease Acclerate by pressing 'a' ");
			    			 ch = sc.next(".").charAt(0);
			    			
			    			 if(ch != 'a')
			    				 continue;
			    			 else
			    			 {
			    				 v1.acclerirate(); //Method Overriding
			    				 System.out.println("\nPlease Apply Break by pressing 'b' ");
			    				 ch = sc.next(".").charAt(0);
				    			 
			    				 if(ch != 'b')
			    					 continue;
			    				 else
				    			 {
				    				 v1.breaking(); //Method Overriding
				    			 }
			    			 }
			    		 }	
			    		 System.out.println("\nBack to main menu y/n");
			    		 ch = sc.next(".").charAt(0);
			    		 if(ch!='y' || ch=='n')
			    		 {
			    			 System.out.println("Bye--Bye");
			    			 System.exit(0);
			    		 }
			    			 	 
			    		 else
			    		 {
			    			 
			    			 continue;
			    		 }
			    		 
			    		 
				case 2 : System.out.println("\nYour interest is in Two wheeler");
	    		 		 System.out.println("\nFollowing Brands are present in Two Wheeler");
				    
	    		 		 System.out.println("================================"); 
	    		 		
	    		 		 //Bajaj
	    		 		 TwoWheeler v2 = new Bajaj(); //upcasting
	    		 		 Bajaj b2 = (Bajaj)v2; //downcasting
	    		 		 System.out.print("1."); b2.brandname();
	    		 		 
	    		 		 //Honda
	    		 		 TwoWheeler v3 = new Honda();
	    		 		 Honda b3 = (Honda)v3; //downcasting
	    		 		 System.out.print("2."); b3.brandname();
	    		 		 
	    		 		 //RoyalEnfield
	    		 		 TwoWheeler v4 = new RoyalEnfield();
	    		 		 RoyalEnfield b4 = (RoyalEnfield)v4; //downcasting
	    		 		 System.out.print("3."); b4.brandname();
	    		 		 
	    		 		 System.out.println("================================");
	    		 		 
	    		 		 System.out.println("\nEnter Your Choice for selection");
	    				 Scanner sc2 = new Scanner(System.in); 
	    				 int a1 = sc2.nextInt();
	    		 		 
	    				 //Switch for Bajaj/Honda/RE 
	    				 switch(a1)
	    				 {
	    				 	case 1 : System.out.println("\nYour interest is in  BAJAJ");
	    				 			 System.out.println("\nFollowing Bikes are present in BAJAJ");
	    				 			 //Dominar
	    				 			 Bajaj bj1 = new Dominar();
	    				 			 Dominar d1 = (Dominar)bj1;
	    				 			 //Rs200
	    				 			 Bajaj bj2 = new PulsarRs200();
	    				 			 PulsarRs200 d2 = (PulsarRs200)bj2;
	    				 			 
	    				 			 System.out.println("================================");
	    				 			 System.out.println("1. "+d1.name);
	    				 			 System.out.println("2. "+d2.name);
	    				 			 System.out.println("================================");
	    				 			 System.out.println("\nEnter Your Choice for selection");
	    				 			 
	    				 			 Scanner sc3 = new Scanner(System.in); 
	    		    				 int a2 = sc3.nextInt();
	    				 			 
	    		    				 //Switch for Dominar/RS-200
	    				 			 switch(a2)
	    				 			 {
	    				 			 	case 1 : System.out.println("\nYour interest is in  Dominar");
	    				 			 			 System.out.println("\nDetails of Vehicles are as follows :");
	    				 			 			 System.out.println("Name : " +d1.name); 
	    				 			 			 System.out.println("Price : " +d1.price); 
	    				 			 			 d1.avg(); 	
	    				 			 			 break;
	    				 			 			 
	    				 			 	case 2 : System.out.println("\nYour interest is in  RS-200");
				 			 			 		 System.out.println("\nDetails of Vehicles are as follows :");
				 			 			 		 System.out.println("Name : " +d2.name); 
				 			 			 		 System.out.println("Price : " +d2.price); 
				 			 			 		 d2.avg(); 	
				 			 			 		 break;
				 			 			 		 
	    				 			 	default : System.out.println("\nBack to main menu y/n");
	    				 			 			  ch = sc.next(".").charAt(0);
	    				 			 			  if(ch!='y' || ch=='n')
	    				 			 			  {
	    				 			 				  System.out.println("Bye--Bye");
	    				 			 				  System.exit(0);
	    				 			 			  }
	    					    			 	  else
	    					    			 	  {
	    					    			 		  continue;
	    					    			 	  }
	    				 			 }
	    				 }
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
