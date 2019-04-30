package Dorm_and_meal_plan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;

public class DandMP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DandMP window = new DandMP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DandMP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 33));
		frame.setBounds(100, 100, 919, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("Dorm and Meal Plan Calculator");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Title.setBounds(0, 18, 708, 61);
		frame.getContentPane().add(Title);
		
		JLabel HallLabel = new JLabel("Which dormatory would you like to stay in?");
		HallLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		HallLabel.setBounds(21, 135, 734, 43);
		frame.getContentPane().add(HallLabel);
		
		String[] Halls = {"Choose One...", "Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
		JComboBox<String> HallBox = new JComboBox<String>(Halls);
		HallBox.setForeground(Color.BLACK);
		HallBox.setBackground(Color.LIGHT_GRAY);
		HallBox.setToolTipText("");
		HallBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		HallBox.setBounds(71, 178, 333, 43);
		frame.getContentPane().add(HallBox);

		String[] Meals = {"Choose One...", "7 Meals per week", "14 Meals per week", "Unlimited Meals"};
		JComboBox<String> MealBox = new JComboBox<String>(Meals);
		MealBox.setForeground(Color.BLACK);
		MealBox.setBackground(Color.LIGHT_GRAY);
		MealBox.setToolTipText("");
		MealBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		MealBox.setBounds(71, 305, 333, 43);
		frame.getContentPane().add(MealBox);
				
		JLabel MealLabel = new JLabel("Which meal plan would you like to have?");
		MealLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		MealLabel.setBounds(21, 262, 734, 43);
		frame.getContentPane().add(MealLabel);
		
		JLabel Pricelabel = new JLabel("");
		Pricelabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		Pricelabel.setBounds(21, 369, 851, 43);
		frame.getContentPane().add(Pricelabel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(new Color(169, 169, 169));
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCalculate.setBounds(0, 433, 893, 55);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object Hallo = HallBox.getSelectedItem();
				Object Mealo = MealBox.getSelectedItem();
				String Hall = Hallo.toString();
				String Meal = Mealo.toString();
				int price = 0;
				if(Hall.equals(Halls[1])) {
					price += 1800;
				}
				else if(Hall.equals(Halls[2])) {
					price += 2200;
				}
				else if(Hall.equals(Halls[3])) {
					price +=2800;
				}
				else if(Hall.equals(Halls[4])) {
					price += 3000;
				}
				else {
					Pricelabel.setText("Please Choose a hall");
				}
				
				if(Meal.equals(Meals[1])) {
					price += 600;
				}
				else if(Meal.equals(Meals[2])) {
					price += 1100;
				}
				else if(Meals.equals(Meals[3])) {
					price += 1800;
				}
				else {
					Pricelabel.setText("Please Choose a meal plan");
				}
				
				Pricelabel.setText("Your dorm and meal plan cost will be $" + price);
			}
			});
		frame.getContentPane().add(btnCalculate);
	}}
