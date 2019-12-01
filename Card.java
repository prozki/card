package card;
import javax.swing.*;

	public class Card {
				public static void main(String[] args) {
			int spaceName, spaceCity;
			int spaceName1, spaceName2;
			int even;
				
			String firstName = JOptionPane.showInputDialog (null,"Podaj imię");
			String secondName = JOptionPane.showInputDialog (null,"Podaj nazwisko");
			String cityName = JOptionPane.showInputDialog (null,"Podaj miasto");
				
			if ( firstName.length() >= secondName.length() && firstName.length() >= cityName.length() )
			{
			even = firstName.length() % 2;
			switch (even)
			{
									case 0:
							    {
							      spaceName = (firstName.length() - secondName.length())/2;
							      spaceCity = (firstName.length() - cityName.length())/2;
							      
							      for (int i = 0; i <= firstName.length() + 3; i++)	//drukowanie gwiazdek
							      {													//
							        System.out.print("*");							//
							      } 												//
							      
							      System.out.println("\n* " + firstName + " *");	// drukowanie imienia
			
							      System.out.print("*");							// drukowanie nazwiska
							      for (int i=0; i <= spaceName; i++)				//
							      {													//
							      	System.out.print(" ");							//
							      } System.out.print(secondName);					//
							      for (int i=0; i <= spaceName; i++)				//
									 	{											//
									 		System.out.print(" ");					//
									 	} System.out.println("*");					// 
			
									 	System.out.print("*"); 						// drukowanie miasta
									 	for (int i=0; i <= spaceCity; i++)			//
									 	{											//
									 		System.out.print(" ");					//
									 	} System.out.print(cityName);				//
									 	for (int i=0; i <= spaceCity; i++)			//
									 	{											//
									 		System.out.print(" ");					//
									 	} System.out.println("*");					//
									 	
							    for (int i = 0; i <= firstName.length() + 3; i++)	// drukowanie gwiazdek
							      {													//
							        System.out.print("*");							//
							      }													//
							    }
							    break;
									
									case 1:
							    {
							      spaceName = (firstName.length() - secondName.length() + 1)/2;
							      spaceCity = (firstName.length() - cityName.length() + 1)/2;
							      
							      for (int i = 0; i <= firstName.length() + 3; i++)	//drukowanie gwiazdek
							      {													//
							        System.out.print( "*");							//
							      } 												//
							      
							      System.out.println( "\n* " + firstName + " *");	// drukowanie imienia
			
							      System.out.print("*");							// drukowanie nazwiska
							      for (int i=0; i <= spaceName; i++)				//
							      {													//
							      	System.out.print(" ");							//
							      } System.out.print(secondName);					//
							      for (int i=0; i <= spaceName; i++)				//
									 	{											//
									 		System.out.print(" ");					//
									 	} System.out.println("*");					// 
			
									 	System.out.print("*"); 						// drukowanie miasta
									 	for (int i=0; i <= spaceCity; i++)			//
									 	{											//
									 		System.out.print(" ");					//
									 	} System.out.print(cityName);				//
									 	for (int i=0; i <= spaceCity; i++)			//
									 	{											//
									 		System.out.print(" ");					//
									 	} System.out.println("*");					//
									 	
							    for (int i = 0; i <= firstName.length() + 3; i++)	// drukowanie gwiazdek
							      {													//
							        System.out.print("*");							//
							      }													//
							    }
							    break;
						    } 
								
						} else if (secondName.length() >= firstName.length() && secondName.length() >= cityName.length())
						  {
								even = secondName.length()%2;
						    switch (even)
						    {
						    	case 0: 
						    	{
										spaceName = (secondName.length() - firstName.length())/2;
										spaceCity = (secondName.length() - cityName.length())/2;
										
										for (int i = 0; i <= secondName.length() + 3; i++)	// drukowanie gwiazdek
										{													//
											System.out.print("*");							//
										} 													//
									
										System.out.print("\n*"); 							// drukowanie imienia
										for (int i=0; i <= spaceName; i++)					//
									 	{													//
									 		System.out.print(" ");							//
									 	} System.out.print(firstName);						//
									 	for (int i=0; i <= spaceName; i++)					//
									 	{													//
									 		System.out.print(" ");							//
									 	} System.out.print("*");							//
			
						        System.out.println( "\n* " + secondName + " *");			// drukowanie nazwiska
			
						        System.out.print("*"); 									// drukowanie miasta
									 	for (int i=0; i <= spaceCity; i++)				//
									 	{												//
									 		System.out.print(" ");						//
									 	} System.out.print(cityName);					//
									 	for (int i=0; i <= spaceCity; i++)				//
									 	{												//
									 		System.out.print(" ");						//
									 	} System.out.println("*");						//
									 	
								    for (int i = 0; i <= secondName.length() + 3; i++)	// drukowanie gwiazdek
								    {													//
								      System.out.print("*");							//
								    } 													//
						    	}
						    	break;
						    	case 1: 
							    {
							      spaceName = (secondName.length() - firstName.length() + 2)/2;
							      spaceCity = (secondName.length() - cityName.length() + 2)/2;
							      
							      for (int i = 0; i <= secondName.length() + 3; i++)	// drukowanie gwiazdek
							      {														//
							        System.out.print( "*");								//
							      }														// 
							      
							      System.out.print("\n*"); 								// drukowanie imienia
									 	for (int i=0; i <= spaceName; i++)				//
									 	{												//
									 		System.out.print(" ");						//
									 	} System.out.print(firstName);					//
									 	for (int i=0; i <= spaceName; i++)				//
									 	{												//
									 		System.out.print(" ");						//
									 	} System.out.print("*");						//
				
								    System.out.println( "\n* " + secondName + " *");	// drukowanie nazwiska
				
								    System.out.print("*");								// drukowanie miasta
									 	for (int i=0; i <= spaceCity; i++)				//
									 	{												//
									 		System.out.print(" ");						//
									 	} System.out.print(cityName);					//
									 	for (int i=0; i <= spaceCity; i++)				//
									 	{												//
									 		System.out.print(" ");						//
									 	} System.out.println("*");						//
									 	
								    for (int i = 0; i <= secondName.length() + 3; i++)	// drukowanie gwiazdek
							      {														//
							       System.out.print("*");								//
							      } 													//
							    } 
							    break;
						  } 
						    } else if (cityName.length() >= firstName.length() && cityName.length() >= secondName.length())
						    {
						    	even = cityName.length()%2;
						    	switch (even)
							    	{
							    	case 0:
								      {
								        spaceName1 = (cityName.length() - firstName.length())/2;
								        spaceName2 = (cityName.length() - secondName.length())/2;
								        
								        for (int i = 0; i <= cityName.length() + 3; i++)
								      {
								        System.out.print( "*");
								      } 
								      System.out.print("\n*"); //wydruk imienia
								 	  for (int i=0; i <= spaceName1; i++)
								 	  {
								 		System.out.print(" ");
								 	  } System.out.print(firstName);
								 	  for (int i=0; i <= spaceName1; i++)
								 	  {
								 		System.out.print(" ");
								 	  } System.out.print("*");
				
								       System.out.print("\n*"); //wydruk nazwiska
								 	  for (int i=0; i <= spaceName2; i++)
								 	  {
								 		System.out.print(" ");
								 	  } System.out.print(secondName);
								 	  for (int i=0; i <= spaceName2; i++)
								 	  {
								 		System.out.print(" ");
								 	  } System.out.println("*");
				
								 	  System.out.println( "\n* " + cityName + " *");
								 	  
									    for (int i = 0; i <= cityName.length() + 3; i++)
									      {
									        System.out.print( "*");
									      }
								      }
								      break;
							    	case 1: 
									      {
									        spaceName1 = (cityName.length() - firstName.length())/2;
									        spaceName2 = (cityName.length() - secondName.length())/2;
									        
									        for (int i = 0; i <= cityName.length() + 3; i++)
										      {
										        System.out.print("*");
										      } 
									        
										      System.out.print("\n*"); //wydruk imienia
										 	  for (int i=0; i <= spaceName1; i++)
										 	  {
										 		System.out.print(" ");
										 	  } System.out.print(firstName);
										 	  for (int i=0; i <= spaceName1; i++)
										 	  {
										 		System.out.print(" ");
										 	  } System.out.print("*");
						
										       System.out.print("\n*"); //wydruk nazwiska
										 	  for (int i=0; i <= spaceName2; i++)
										 	  {
										 		System.out.print(" ");
										 	  } System.out.print(secondName);
										 	  for (int i=0; i <= spaceName2; i++)
										 	  {
										 		System.out.print(" ");
										 	  } System.out.println("*");
					
										    System.out.println( "\n* " + cityName + " *");
										    
										    for (int i = 0; i <= cityName.length() + 3; i++)
											      {
											        System.out.print("*");
						}
					} break;
				}
			}
}
}