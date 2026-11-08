import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentRegistration extends JFrame implements ActionListener
{
	JTextField prn, name, school, program;
	
	JTextField cls, division, mobile, email;
	
	JButton submit, clear;
	
	ArrayList<String> student = new ArrayList<>();
	
	public StudentRegistration()
	{
		setTitle("Student Registation");
		setSize(400, 450);
		setLayout(new GridLayout(9, 2, 5, 5));
		
		add(new JLabel("Student PRN : "));
		prn = new JTextField();
		add(prn);
		
		add(new JLabel("Student Name : "));
		name = new JTextField();
		add(name);
		
		add(new JLabel("School : "));
		school = new JTextField();
		add(school);
		
		add(new JLabel("Program : "));
		program = new JTextField();
		add(program);
		
		add(new JLabel("Class : "));
		cls = new JTextField();
		add(cls);
		
		add(new JLabel("Division : "));
		division = new JTextField();
		add(division);
		
		add(new JLabel("Mobile Number : "));
		mobile = new JTextField();
		add(mobile);
		
		add(new JLabel("Email ID : "));
		email = new JTextField();
		add(email);
		
		
		submit = new JButton("Submit");
		clear= new JButton("Clear");
		
		add(submit);
		add(clear);
		
		submit.addActionListener(this);
		clear.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource() == submit)
				
			{
							
				if(prn.getText().isEmpty() 
						|| name.getText().isEmpty()
						|| school.getText().isEmpty()
						|| program.getText().isEmpty()
						|| cls.getText().isEmpty()
						|| division.getText().isEmpty()
						|| mobile.getText().isEmpty()
						|| email.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(this, " Please fill all Fields!");
				}
				
				else
				{
					String data = prn.getText() + ", " 
							+ name.getText() + ", "
							+ school.getText() + ", "
							+ program.getText() + ", "
							+ cls.getText() + ", "
							+ division.getText() + ", "
							+ mobile.getText() + ", "
							+ email.getText() + ", ";
					
					student.add(data);
					
					JOptionPane.showMessageDialog(this, "Regestration SuccessFull!");
					
				}	
				
			}	
				
				else if(e.getSource() == clear)
					{
						prn.setText("");
						name.setText("");
						school.setText("");
						cls.setText("");
						division.setText("");
						mobile.setText("");
						email.setText("");
					}
			
			
		}
		
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, "Error Occured");
		}
		
	}

	public static void main(String[] args)
	{
		new StudentRegistration();
		
	}

}
