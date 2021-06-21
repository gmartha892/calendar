import java.util.*;
public class AppointmentScheduler
{
public static void main(String[]args)
{
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter your name.");
   String StudentName = input.nextLine();
  
   System.out.println("Which professor would you like to meet with? \nPress 1 for Mr. Shorter \nPress 2 for Mrs. Hepburn \nPress 3 for Mrs. Williams \nPress 4 for Mr.Eze");
   int profChoice;
   profChoice = input.nextInt();
  
   switch(profChoice) {
  
   case 1:
   System.out.println("You chose to meet with Mr. Shorter.");
   System.out.println();
   break;
  
   case 2:
   System.out.println("You chose to meet with Mrs. Hepburn.");
   System.out.println();
   break;
  
   case 3:
   System.out.println("You chose to meet with Mrs. Williams.");
   System.out.println();
   break;
  
   case 4:
   System.out.println("You chose to meet with Mr.Eze.");
   System.out.println();
   break;
  }
   System.out.println("What is the topic for your appointment? \nPress 1 to discuss grades\nPress 2 if you need tutoring/help with an assignment\nPress 3 for personal issues/other");
   int topicNum;
   topicNum = input.nextInt();
   switch (topicNum){
      case 1:
      System.out.println("You chose: Discuss grades");
      System.out.println();
      break;
               
      case 2:
      System.out.println("You chose: Tutoring/Help with an assignment");
      System.out.println();
      break;
     
      case 3:
      System.out.println("You chose: Personal Issues/other ");
      System.out.println();
      break;
     
      }
  
}}