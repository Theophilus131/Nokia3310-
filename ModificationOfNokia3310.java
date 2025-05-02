					import java.util.Scanner;
					public class ModificationOfNokia3310 {
  					public static void main(String[] args) {
     					Scanner input = new Scanner(System.in);
				
			
			
			while(true){
	
				String message = """
	                	
			My Nokia Menu Map:
		        Enter any option bellow:
1 - Phone Book
2 - Messages
3 - Chat
4 - Call register
5 - Tones
6 - Settings
7 - Call divert
8 - Games
9 - Calculator
10 - Reminders
11 - Clock
12 - Profiles
13 - Sim Service
0  - Exit
                      		
		""";

		System.out.println(message);
		System.out.print("enter a number to select: ");
	        int number = input.nextInt();
           
         
	switch(number) { // openig loop switch 1
case 0:
                   System.out.println("Exiting... ");
                    return;

	               
case 1:
		while(true){	
		String phoneBook = """
   		
           <<<<PhoneBook Menu>>>>>
 
    1  - Search
    2  - Service Nos.
    3  - Add name
    4  - Erase
    5  - Edit
    6  - Assign tone
    7  - Send b'card
    8  - Option
    9  - Speed dials
    10 - Voice tags
     0 - Back to main manu
   	       
    """;
	         
			System.out.println(phoneBook);
			System.out.print("enter a number to select: ");
			int number2 = input.nextInt();
			
			if(number2 == 0) break;					

			switch(number2) {
			case 1: System.out.println("""
				<<<search>>>
				0 - back

					"""); 
				int search = input.nextInt();
				if(search == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
						
				 break;


			     
			case 2: System.out.println("""
					<<<Service Nos.>>>
					0 - Back
					"""); 
				int serviceNo = input.nextInt();
				if(serviceNo == 0) break;
				else{System.out.println("invalid number enter 0 to go back");}
				break; 
			   
			case 3: System.out.println("""
					<<<Add Name>>>
					0 - Back
						"""); 
				int nameAdd = input.nextInt();
				if(nameAdd == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}

					break;
			    
			case 4:  System.out.println("""
					<<<Erase>>>
					0 - Back
					""");
				int erase = input.nextInt();
				if(erase == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}


				break;
			       
			case 5: System.out.println("""
						<<<Edit>>>
						0 - Back
						""");  
				int edit = input.nextInt();
				if(edit == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
					break;

			       
			case 6:  System.out.println("""

				<<<Assign tone>>>
					0 - Back
				"""); 
				int assign = input.nextInt();
				if(assign == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
					break;
			case 7: System.out.println("""
						<<<Send b'card>>>
						0- Back
						""");
					int sndCard = input.nextInt();
					if(sndCard == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
					break;

			       
			case 8:
				while(true){// options sub menu loop start
				String message3 = """
   
              		<<<<Options Menu>>>>
 
1 - Type of view
2 - Memory status
0 - Back to phone book menu

    				""";

			System.out.println(message3);
			int number3 = input.nextInt();
			
                      if(number3 == 0)break;

			switch(number3) { 
			case 1:	System.out.println("""
					<<<Type of view>>>
						0 - Back
					""");  
				int typeView = input.nextInt();
				if(typeView == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
					
						break;

				
			
			case 2: System.out.println("""

			<<<Memory status>>>
				0 - Back
				""");
				int status = input.nextInt(); 
			if(status == 0)break;
			else{System.out.println("invalid number enter 0 to go back");}
					break;
			   
			default: System.out.println("invalid option"); break;
			    
			 }
				} // options sub menu loop ends
			    break;

			case 9:  System.out.println("""
					<<<Speed dials>>>
					0 - Back
					"""); 
				int speed = input.nextInt();
				if(speed == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
					break;
			   
			case 10: System.out.println("""
					<<<Voice tags>>>
					0 - Back			
					""");

				int tags = input.nextInt(); 
				if(tags == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
				
					break;
			        
			default: System.out.println("Enter a valid number: "); break;
			     
			}
			   } //closing of while loop
					 break;
						
case 2:
			  while(true){
			String messageMenu = """

           		 <<<<<<Messaging Menu>>>>>
1  - Write messages
2  - Inbox
3  - Outbox
4  - Picture messages
5  - Templates
6  - Smileys
7  - Message settings
8  - Info service
9  - Voice mailbox number
10 - Service command editor
 0 - Back to main menu
 	
   				 """;
				
			System.out.println(messageMenu);
			System.out.print("enter a number to select: ");
			int number3 = input.nextInt();
			if(number3 == 0) break;

			switch(number3) {
	
			case 1:  System.out.println("""
				<<<Write messages>>> 
				0 - Back
					""");  
				int write = input.nextInt();
				if(write == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}
	
				 break;
			  
			case 2: System.out.println("""
				<<<Inbox>>> 
				0 - Back
				"""); 		
				int inbox = input.nextInt();
				if(inbox == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}

				break;
		
			case 3: System.out.println("""
				<<<Outbox>>> 
				0 - Back
				""");		
			
			int outbox = input.nextInt();
			if(outbox == 0)break;
			else{System.out.println("invalid number enter 0  to go back ");}

				 break;
			    
			case 4: System.out.println(""" 
				<<<Picture Message>>> 
				0  - Back
				 """); 
				
				int pic = input.nextInt();
				if(pic == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}
	
				 break;
			   
			case 5: System.out.println(""" 
				<<<Templates>>>
				0 - Back
					 """);   
				int template = input.nextInt();
				if(template == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}

				 break;
			 
			case 6: System.out.println("""
					<<<Smileys>>>
					0 - Back

					 """); 
				int smiley = input.nextInt();
				if( smiley == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}

				break;
			    
			case 7:
			  
			 String setting = """

                      <<<<Message Settings Menu>>>>>
 1 - Set 1
 2 - Common
 0 - Back

   				  """;
			System.out.println(setting);
			System.out.print("enter a number to select: ");
			int number4 = input.nextInt();
			if(number4 == 0)break;
			else{System.out.println("invalid number enter 0  to go back ");}

					

			switch(number4) {
			case 1:
			String messageSetting = """
 
          		<<<Set one>>>
   
1. Message center number
2. Message sent as
3. Message validity
0 - Back
 
    			""";

			System.out.println(messageSetting);
			System.out.print("enter a number to select: ");
			int number5 = input.nextInt();
			if(number5 == 0)break;
			else{System.out.println("invalid number enter 0  to go back ");}
				
			
			switch(number5) {
			
			case 1: System.out.println("""
			<<<Message Center Number>>>
				0 - Back
				""");   
			  int center = input.nextInt();
			  if(center == 0)break;
			 else{System.out.println("invalid number enter 0 to go back ");}
				break;
			  
			case 2: System.out.println("""
				<<<Messages sent As>>>
				0 - Back	
				 """); 
			int sent = input.nextInt();
			  if(sent == 0)break;
			 else{System.out.println("invalid number enter 0 to go back ");}

				break;
			
			case 3: System.out.println("""
				<<<Message validity>>>
				0 - Back
					"""); 
			int validity = input.nextInt();
			  if(validity == 0)break;
			 else{System.out.println("invalid number enter 0 to go back ");}
				}
				
				break;
			

			case 2:
			   String commonSetting = """

        		<<<<Common Message Settings>>> 
 1. Delivery reports
 2. Reply via same centre
 3. Character support
 0 - Back to menu
  
   			 """;

			System.out.println(commonSetting);
			System.out.print("enter a number to select: ");
			int number6 = input.nextInt();
	                if(number == 0)break;

			switch(number6) {
			 case 1: System.out.println("Delivery reports");break;
			     
			case 2: System.out.println("Reply via same centre");break;
			      
			case 3: System.out.println("Character Support");
		            
			 break;
		        default:
			     break;
			}
			      break;
			default:
			      break;
			}
			      break;

			case 8: System.out.println("info service");   break;
			    
			case 9: System.out.println("Voice mailbox number");break;
			      
			case 10: System.out.println("Service command editor"); break;
			
				default:
			       break;
                        }
			      
					}// while loop for message closing
				 break;



case 3:	                while(true){
			System.out.println("""
   					<<< CHART<<<
   					0 - Back 
					""");

		int chatInput = input.nextInt();  
                 if(chatInput==0)break;
		else{System.out.println("Invalid number enter 0 to go back");}

			}// while loop closing
				break;

case 4:
			 
			String callMenu = """
   
           		 <<<<Call Register Menu>>>>
1 - Missed call
2 - Received call
3 - Dialled numbers
4 - Erase recent call lists
5 - Show call duration
6 - Show call cost
7 - Call cost settings
8 - Prepaid credit
  
    			"""; 
			System.out.println(callMenu);
			System.out.print("enter a number to select: ");
			int number7 = input.nextInt();
	               

			 switch(number7) {
			  case 1:
                             System.out.println("Missed call");
			      break;
			  case 2:
			     System.out.println("Received call");
			      break;
			   case 3:
			     System.out.println("Dialled numbers");
			      break;
			   case 4:
			     System.out.println("Erase recent call list");
			      break;
		           
			   case 5:
			
			 String callDuration = """
   
          		 <<<<Call Duration Menu>>>>
1 - Last call duration
2 - All calls duration
3 - Received calls duration
4 - Dialled calls duration
5 - Clear timers
 
    			""";
				System.out.println(callDuration);
			System.out.print("enter a number to select: ");
			int number8 = input.nextInt();
	                
                        switch(number8) {
			case 1: 
                       System.out.println("Last call duration");
			  break;
			case 2:
			System.out.println("All calls duration");
			  break;
			case 3:
			System.out.println("Received calls duration");
		          break;
			case 4:
			System.out.println("Dialled calls duratio");
			  break;
			case 5:
			System.out.println("clear timers");
			  break;
			default:
			  break;
			}
			  break;
			case 6:
  			String costMenu = """
  
         		 <<<<Show All Cost Menu>>>
1 - Last call cost
2 - All calls cost
3 - Clear counters
 
  			 		 """;
			System.out.println(costMenu);
			System.out.print("enter a number to select: ");
			int number9 = input.nextInt();
			
			switch(number9) {
			case 1:
                            System.out.println("Last call cost");
			    break;
			case 2:
			  System.out.println("All calls cost");
			    break;
			case 3:
			  System.out.println("Clear counters");
			    break;
			default:
			    break;
			}
			break;
			case 7:
			
			String CallcostSet = """
   
        		 <<<Call Cost Settings>>>
1 - Call cost limit
2 - Show cost in

   				 """;

			System.out.println(CallcostSet);
			System.out.print("enter a number to select: ");
			int number10 = input.nextInt();
			switch(number10) {
			case 1: 
			System.out.println("Call cost limit");
			   break;
			case 2:
			System.out.println("Show cost in");
			  break;
			default:
			  break;
			}
			  break;
			case 8:
  			System.out.println("prepaid credit");
			  break;
			default:
			break;
			}
			break;
			
case 5:  

			String tonesMenu = """

          		 <<<<Tones Settings Menu>>>>>
  
1 - Ringing tone
2 - Ringing volume
3 - Incoming call alert
4 - Composer
5 - Message alert tone
6 - Keypad tones
7 - Warning and game tones
8 - Vibrating alert
9 - Screen saver
0 - Back
   
   			 """;
			System.out.println(tonesMenu);
			System.out.print("enter a number to select: ");
			int number11 = input.nextInt();
			switch(number11) {
			
	case 1: 
			System.out.println("Ringing tone"); break;
			
			case 2:
			System.out.println("Ringing volume"); break;
			
			case 3:
			System.out.println("Incoming call alert");break;
			
			case 4:
			System.out.println("Momposer"); break;
			
			case 5:
			System.out.println("Message alert tone"); break;
		
			case 6: System.out.println("""
				<<<Keypad tones>>>
				0 - Back
				"""); 
				int key = input.nextInt();
				if(key == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}
	
				break;
			
			case 7: System.out.println("Warning and game tones"); break;
			
			case 8:System.out.println("Vibrating alert"); break;
			
			case 9:
			System.out.println("Screen saver");
			break;
			default:
			break;
			}
			break;


case 6: 
				
				String setingMenu = """
   
              			<<<Settings Menu>>>: 
  1 - Call settings
  2 - Phone settings
  3 - Security settings
  4 - Restore factory settings
  
   				 """;

				System.out.println(setingMenu);
			System.out.print("enter a number to select: ");
			int number12 = input.nextInt();
			switch(number12) {
			case 1:
                          
			  String cllSetting = """
 
            		<<<Call Settings>>>
  
1 - Automatic redial
2 - Speed dialing
3 - Call waiting options
4 - Own number sending
5 - Phone line in use
6 - Automatic answer
  
    			""";

			System.out.println(cllSetting);
			System.out.print("enter a number to select: ");
			int number13 = input.nextInt();
			switch(number13) {
			  case 1: 
				System.out.println("Automatic redial");
				break;
			  case 2:
				System.out.println("Speed dialing");
				break;
			  case 3:
				System.out.println("Call waiting options");
				break;
			  case 4:
				System.out.println("Own number sending");
				break;
			  case 5:
				System.out.println("phone line in use");
				break;
			  case 6:
				System.out.println("Automatic answer");
				break;
			  default:
				 break;
			  }
			  break;
		        
			case 2:
			String phnSetting = """
  
           		<<<Phone Settings>>>
    
1 - Language
2 - Cell info display
3 - Welcome note
4 - Network selection
5 - Lights
6 - Confirm SIM service action
  
   			 """;

			System.out.println(phnSetting);
			System.out.print("enter a number to select: ");
			int number14 = input.nextInt();
			switch(number14) {
			case 1: 
			  System.out.println("Language"); break;
			  
			case 2:
			System.out.println("Cell info display"); break;
			   
			case 3:
			System.out.println("Welcome note");   break;
			 
			case 4:
			System.out.println("Network selection"); break;
			  
			case 5:
			System.out.println("Lights");  break;
			  
			case 6:
			System.out.println("Confirm SIM service action"); break;  
			default:
			break;
			}
			break;
			
		case 3:
		        
			String security = """
            		 <<<Security Settings>>>

1 - Pin code request
2 - Call barring service
3 - Fixed dialing
4 - Closed user group
5 - Phone security
6 - Change access codes
  
   				 """;

			System.out.println(security);
			System.out.print("enter a number to select: ");
			int number15 = input.nextInt();
			
			switch(number15) {
			case 1: 
   			System.out.println("PIN code request"); break;
			  
			case 2: 
   			System.out.println("Call Baring Service");  break;
			 
			case 3: 
   			System.out.println("Fixed dialing");  break;
			 
		        case 4: 
   			System.out.println("Closed user group");   break;
			
		        case 5: 
   			System.out.println("Phone security");  break;
			 
		        case 6: 
   			System.out.println("Change access codes");   break;
			
			default:
			  break;
			}
			  break;

			case 4:
			System.out.println("Restore Factory Settings");
			default:
			break;
			}
			  break;

case 7: 		while(true){
			System.out.println("""
			<<<Call Divert>>>
			0 - Back

				""");
			int callDivert = input.nextInt();
			if(callDivert == 0) break;
			else{ System.out.println("invalid . enter 0 to go back ");
                              } 
					}// call diver loop close
				break;
			
case 8:			
			while(true){
 			System.out.println("""
			<<<Games>>>
			 0 - Back
						""");  
				int games = input.nextInt();
				if(games == 0) break;
                             else { System.out.println("invalid number. enter 0 to go back ");
					} 
						}// loop games close
						break;
		          
case 9: 		while(true){
		System.out.println("""
			<<<Calculator>>>
			0 - back
			""");  
			int calculator = input.nextInt();
			if(calculator == 0)break;
			else{System.out.println("invalid number. enter 0 to go back");
				}
					}// loop close for calculator
						break;
		         
case 10:  		while(true){
			System.out.println("""
				<<<Reminders>>>
				0 - back
				"""); 
				int reminder = input.nextInt();
				if(reminder == 0)break;
				else{System.out.println("invalid number enter 0 to go back");}
						}// loop closing for reminder
					  break;
		       
			

case 11:
		       while(true){ 
			String clock = """
  
             			<<<CLOCK MENU>>>

1 - Alarm clock
2 - Clock settings
3 - Date setting
4 - Stopwatch
5 - Countdown timer
6 - Auto update of date and time
0 - Back

   				 """;

			System.out.println(clock);
			System.out.print("enter a number to select: ");
			int number16 = input.nextInt();
			
			if(number16 == 0)break;


			switch(number16) {
			case 1: System.out.println("""
				<<<Alarm clock>>>
				0 - Back
				"""); 
			int alarm = input.nextInt();
			if(alarm == 0)break;
			else{System.out.println("invalid number enter 0  to go back ");}
	
				 break;
                    
			case 2: System.out.println("""
				<<<Clock settings>>>
				0 - Back
					""");
				int watch = input.nextInt();
				if(watch == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}

				 break;
                         
			case 3: System.out.println("""
				<<<Date setting>>>
				0 - Back
				""");  
				int date = input.nextInt();
				if(date == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}
	
				break;
                        
			case 4: System.out.println("""
				<<<Stopwatch>>>
					0 - Back
					""");   
				int stopwatch = input.nextInt();
				if(stopwatch == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}
	

				break;
                         
			case 5: System.out.println("""
				<<<Countdown timer>>>
					0 - Back
					""");  
				int timer = input.nextInt();
				if(timer == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}
	

					break;
			  
			case 6: System.out.println("""
				<<<Auto update of date and time>>>
					0 - Back
					""");   
				int dateTime = input.nextInt();
				if(dateTime == 0)break;
				else{System.out.println("invalid number enter 0  to go back ");}

				break;
			 
			default: System.out.println("invalid number ");
			break;
					
					}// switch closing  
				} // loop closing
			  break;



case 12:
			while(true){ // profiles open loop
			System.out.println("""
			<<<Profiles>>>
			      0 - Back
					"""); 
				int profile = input.nextInt();
				if(profile == 0) break;
				else{System.out.println("invalid number enter 0 to go back");
						}
				   break;
						}// loop close

				
			
case 13:     

		while(true){ // loop open for sim service menu

		System.out.println("""
		<<<Sim services >>>
			0 - Back

		""");
			int simInput = input.nextInt();
			if(simInput == 0) break;// go back to main menu
				
                           else { System.out.println("invalid number. enter 0 to go back");
					}
				break;
			                       
                    
			    }// while loop closing
		
			} // closing case 13




	}// parent while loop closing 
			
}
}











