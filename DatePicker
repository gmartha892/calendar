import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


class DatePicker 
{
	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
	JLabel l = new JLabel("", JLabel.CENTER);
	String day = "";
	JDialog d;
	JButton[] button = new JButton[49];
   
   String professor;

	public DatePicker(JFrame parent) 
	{
		d = new JDialog();
		d.setModal(true);
		String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
		JPanel p1 = new JPanel(new GridLayout(7, 7));
		p1.setPreferredSize(new Dimension(430, 120));

		for (int x = 0; x < button.length; x++) 
		{
			final int selection = x;
			button[x] = new JButton();
			button[x].setFocusPainted(false);
			button[x].setBackground(Color.white);
			if (x > 6)
				button[x].addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent ae) 
					{
						day = button[selection].getActionCommand();
						d.dispose();
					}
				});
			if (x < 7) 
			{
				button[x].setText(header[x]);
				button[x].setForeground(Color.red);
			}
			p1.add(button[x]);
		}
		JPanel p2 = new JPanel(new GridLayout(1, 3));
		JButton previous = new JButton("<< Previous");
		previous.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				month--;
				displayDate();
			}
		});
		p2.add(previous);
		p2.add(l);
		JButton next = new JButton("Next >>");
		next.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				month++;
				displayDate();
			}
		});
		p2.add(next);
		d.add(p1, BorderLayout.CENTER);
		d.add(p2, BorderLayout.SOUTH);
		d.pack();
		d.setLocationRelativeTo(parent);
		displayDate();
		d.setVisible(true);
	}

	public void displayDate() 
	{
		for (int x = 7; x < button.length; x++)
			button[x].setText("");
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"MMMM yyyy");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, 1);
		int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
			button[x].setText("" + day);
		l.setText(sdf.format(cal.getTime()));
		d.setTitle("Date Picker");
	}
	
	public String setPickedDate() 
	{
		if (day.equals(""))
			return day;
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"MM-dd-yyyy");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, Integer.parseInt(day));
		
		return sdf.format(cal.getTime());
	}
	
//   public void setProf(String prof)
//   {
//     professor = prof;
//   }
//   
//   public String getProf()
//   {
//   return professor;
//   }
}

class Picker 
{
	static String profChosen;
	static String topicChosen;
	
	public static String setProf(int caseNumber)
	{
		
	   switch(caseNumber) 
	   {
	   case 1:
	   profChosen = "Mr. Shorter";
	   break;
	  
	   case 2:
	   profChosen = "Mrs. Hepburn";
	   break;
		  
	   case 3:
	   profChosen = "Mrs. Williams";
	   break;
		  
	   case 4:
	   profChosen = "Mr.Eze";
	   break;
	   }
		
	   return profChosen;
	}
	
	public static String getProf()
	{
		return profChosen;
	}
	
	public static String setTopic(int caseNumber)
	{	
	   switch(caseNumber) 
	   {
		  
	   case 1:
	   topicChosen = "discuss grades";
	   break;
		  
	   case 2:
	   topicChosen = "get tutoring";
	   break;
		  
	   case 3:
	   topicChosen = "dicuss something personal";
	   break;
	  }
	   return topicChosen;
	}
	
	public static String getTopic()
	{
		return topicChosen;
	}
	
	public static void main(String[] args) 
	{
   
		   Scanner input = new Scanner(System.in);
		   System.out.println("Please enter your name.");
		   String studentName = input.nextLine();
		
		   while (true)
		   {   
			   System.out.println("Which professor would you like to meet with? \nPress 1 for Mr. Shorter "
		   		+ "\nPress 2 for Mrs. Hepburn \nPress 3 for Mrs. Williams \nPress 4 for Mr.Eze");
		   int profChoice;
		   profChoice = input.nextInt();
		  
		   switch(profChoice) 
		   {  
				case 1:
				System.out.println("You chose to meet with Mr. Shorter.");
				setProf(1);
				System.out.println();
				break;
				  
				case 2:
				System.out.println("You chose to meet with Mrs. Hepburn.");
				setProf(2);
				System.out.println();
				break;
				  
				case 3:
				System.out.println("You chose to meet with Mrs. Williams.");
				   
				setProf(3);System.out.println();
				break;
				  
				case 4:
				System.out.println("You chose to meet with Mr.Eze.");
				setProf(4);
				System.out.println();
				break;
		   }
		   
		   System.out.println("What is the topic for your appointment? \nPress 1 to discuss grades\nPress "
		   		+ "2 to get tutoring \nPress 3 to dicuss something personal");
		   
		   int topicNum;
		   topicNum = input.nextInt();
		   
		   switch (topicNum)
		   {
				case 1:
				System.out.println("You chose: discuss grades");
				setTopic(1);
				System.out.println();
				break;
				           
				case 2:
				System.out.println("You chose: get tutoring");
				setTopic(2);
				System.out.println();
				break;
				
				case 3:
				System.out.println("You chose: dicuss something personal");
				setTopic(3);
				System.out.println();
				break;  
		   }
		   
			JLabel label = new JLabel("Selected Date:");
			final JTextField text = new JTextField(20);
			JButton b = new JButton("popup");
			JPanel p = new JPanel();
			p.add(label);
			p.add(text);
			p.add(b);
			final JFrame f = new JFrame();
			f.getContentPane().add(p);
			f.pack();
			f.setVisible(true);
			b.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent ae) 
				{          
		            String Bookedapt = new DatePicker(f).setPickedDate();
		            f.setVisible(false);
		            System.out.println(studentName + " will meet with " + getProf() + " on " + Bookedapt + " to " + getTopic() + ".");
				}
			}
			);
			
			System.out.println("Please choose an appointment time from the pop up calendar.\n");
			
		   System.out.println("Would you like to book another appointment? Type 1 to continue or type 2 to stop.");
		   int keepGoing = input.nextInt();
		   
		   if (keepGoing != 1)
		   {	   
			   System.out.println("Thank you!");
			   System.exit(0);
		   }
			
			
		}
	}
}

