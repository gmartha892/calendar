import java.util.*;


public class MyCalendarTest {
  public static void main(String[] args) {
   String optionalComments;

    /* Create an object of my calendar with a title */
    int meetTimeChoice;
    MyCalendar calendar = new MyCalendar("Mr. Shorter");
    
    /* Prompt User to enter information */
    
    Scanner input = new Scanner(System.in);
   System.out.println("Please enter your name.");
   String StudentName = input.nextLine();  
   System.out.println("Which professor would you like to meet with? \nPress 1 for Mr. Shorter \nPress 2 for Mrs. Hepburn \nPress 3 for Mrs. Williams \nPress 4 for Mr.Eze");
   int profChoice;
   profChoice = input.nextInt();
   
    /* make this a method in the future */
   if(profChoice == 1){
      System.out.println("You have selected to meet with Mr. Shorter. Here are his available meeting times. Please type the number in parenthesis for the appointment you'd like to book." +  
                        "\n(1)Monday, August 7th, 2021 1:00PM - 1:30PM \n(2)Monday, August 7th, 2021 1:45PM-2:15PM \n(3)Monday, August 7th, 2021 2:30PM - 3:00PM" +
                        "\n(4)Wednesday, August 9th, 2021 1:00PM - 1:30PM \n(5)Wednesday, August 9th, 2021 1:45PM-2:15PM \n(6)Monday, August 9th, 2021 2:30PM - 3:00PM" +
                        "\n(7)Friday, August 11th, 2021 1:00PM - 1:30PM \n(8)Friday, August 11th, 2021 1:45PM-2:15PM \n(9)Friday, August 11th, 2021 2:30PM - 3:00PM");
      meetTimeChoice = input.nextInt();
      if(meetTimeChoice == 1){
         Appointment slot1 = new Appointment("07/08/21 01:00:00", 30);
         System.out.println(StudentName + ", your 30 minute appointment on August 7, 2021 @1 PM, has succesfullly been booked.\nBefore you go, please complete the additional information. \n\n");
         }
      
   }
   else if(profChoice == 2){
   
   }
   else if(profChoice == 3){
   
   }
   else if(profChoice == 4){
   
   }
   else{
      System.out.println("You must select options 1-4. Please re-enter your number.");
      profChoice = input.nextInt();
   }
   
   /* make this a method in the future */
      System.out.println("What is the topic for your appointment? \nPress 1 to discuss grades\nPress 2 if you need tutoring/help with an assignment\nPress 3 for personal issues/other");
   int topicNum; 
   topicNum = input.nextInt(); 
   switch (topicNum){
      case 1:
      System.out.println("You chose: Discuss grades\n\n");      
      System.out.println();
      break;               
      case 2:
      System.out.println("You chose: Tutoring/Help with an assignment");
      System.out.println();
      break;      
      case 3: 
      System.out.println("You chose: Personal Issues/other ");
      System.out.println();
      //give an option to add comments
      optionalComments = input.nextLine();
      break;
      }
/////////////////////////             We need Get and Set Methods for each variable like student name, professor name, meeting reason, etc, to show appointment details after everything is booked       //////////////////////////////////////////////////////////////////////////
      System.out.println("Appointment Details\n\nName: " + StudentName + "\nProfessor Name: " + "\nTopic: " + "\nDate and Time: " );



    /* Slot creation test cases */
    //Appointment slot1 = new Appointment("28/08/15 09:00:00", 30);
    //boolean flag = calendar.createAppointmentSlot(slot1);

    /* Expected output: 28/08/15 09:00:00 - 30 mins successfully created */
   /* if(flag)
      System.out.println(slot1 + " successfully created");
    else
      System.out.println(slot1 + " already exists");*/

/*    Appointment slot2 = new Appointment("28/08/15 09:15:00", 45);
    flag = calendar.createAppointmentSlot(slot2);

    /* Expected output: 28/08/15 09:15:00 - 45 mins cannot be created 
    if(flag)
      System.out.println(slot2 + "successfully created");
    else
      System.out.println(slot2 + " cannot be created");

    Appointment slot3 = new Appointment("28/08/15 11:00:00", 45);
    flag = calendar.createAppointmentSlot(slot3);

    /* Expected output: 28/08/15 11:00:00 - 45 mins successfully created 
    if(flag)
      System.out.println(slot3 + " successfully created");
    else
      System.out.println(slot3 + " cannot be created");

    /* Appointment booking test cases 

    /* Ram wants to book an appointment 
    flag = calendar.bookAppointment("Ram", "28/08/15 09:00:00", 30, "IIIT-H");
    /* Expected output: Appointment successfully booked for Ram 
    if(flag)
      System.out.println("Appointment successfully booked for Ram");
    else
      System.out.println("Appointment cannot be booked for Ram");

    /* Shyam wants to book an appointment 
    flag = calendar.bookAppointment("Shyam", "28/08/15 09:20:00", 30, "IIIT-H");

    /* Expected output: Appointment cannot be booked for Shyam 
    if(flag)
      System.out.println("Appointment successfully booked for Shyam");
    else
      System.out.println("Appointment cannot be booked for Shyam");

    /* Ram wants to cancel an appointment 
    flag = calendar.cancelAppointment("28/08/15 09:00:00");

    /* Expected output: Appointment successfully canceled 
    if(flag)
      System.out.println("Appointment successfully canceled");
    else
      System.out.println("Appointment cannot be canceled");

    /* Ram wants to rebook an appointment 
    flag = calendar.bookAppointment("Ram", "28/08/15 11:00:00", 30, "IIIT-H");

    /* Expected output: Appointment successfully booked for Ram 
    if(flag)
      System.out.println("Appointment successfully booked for Ram");
    else
      System.out.println("Appointment cannot be booked for Ram");

    /* Shyam wants to book an appointment 
    flag = calendar.bookAppointment("Shyam", "28/08/15 09:00:00", 20, "IIIT-H");

    /* Expected output: Appointment successfully booked for Shyam 
    if(flag)
      System.out.println("Appointment successfully booked for Shyam");
    else
      System.out.println("Appointment cannot be booked for Shyam");
      
      */
  }
}