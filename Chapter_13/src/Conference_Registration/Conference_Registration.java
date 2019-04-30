package Conference_Registration;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Conference_Registration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conference_Registration window = new Conference_Registration();
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
	public Conference_Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 66));
		frame.getContentPane().setLayout(null);
		
		JLabel lblConferenceRegistration = new JLabel("Conference Registration");
		lblConferenceRegistration.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblConferenceRegistration.setBounds(21, 21, 381, 67);
		frame.getContentPane().add(lblConferenceRegistration);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard $895");
		rdbtnStandard.setActionCommand("895");
		rdbtnStandard.setFont(new Font("Tahoma", Font.PLAIN, 30));
		rdbtnStandard.setBounds(61, 125, 238, 35);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student $495");
		rdbtnStudent.setActionCommand("495");
		rdbtnStudent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		rdbtnStudent.setBounds(331, 125, 238, 35);
		frame.getContentPane().add(rdbtnStudent);
		frame.setBounds(100, 100, 939, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnStudent);
		group.add(rdbtnStandard);
		
		JCheckBox chckbxDinner = new JCheckBox("Dinner $30");
		chckbxDinner.setActionCommand("30");
		chckbxDinner.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxDinner.setBounds(592, 125, 195, 35);
		frame.getContentPane().add(chckbxDinner);
		
		JLabel lblAdditional = new JLabel("Opptional preconference workshop");
		lblAdditional.setFont(new Font("Tahoma", Font.PLAIN, 27));
		String myString = "Optional Preconference Workshops";
		lblAdditional.setText("<html>"+ myString +"</html>");
		lblAdditional.setBounds(61, 180, 320, 66);
		frame.getContentPane().add(lblAdditional);
		
		String[] workshopsarr = {"Intro to E-commerce $295", "The Future of the Web $295", "Advanced Java Programming $395", "Network Security $395"};
		List listworkshops = new List();
		listworkshops.setFont(new Font("Tahoma", Font.PLAIN, 25));
		listworkshops.setMultipleMode(true);
		for(int i = 0; i < workshopsarr.length; i++) {
			listworkshops.add(workshopsarr[i]);
		}
		listworkshops.setBounds(61, 252, 417, 120);
		frame.getContentPane().add(listworkshops);
		
		JLabel lblPrice = new JLabel("");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPrice.setBounds(559, 324, 217, 48);
		frame.getContentPane().add(lblPrice);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(Color.LIGHT_GRAY);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnCalculate.setBounds(549, 252, 238, 60);
		frame.getContentPane().add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int price = 0;
				int customer = Integer.parseInt(group.getSelection().getActionCommand());
				int dinner = 0;
				if(chckbxDinner.isSelected()) {
					dinner = Integer.parseInt(chckbxDinner.getActionCommand());
				}
				String[] workshops = listworkshops.getSelectedItems();
				
				price = customer + dinner;
				for(int i = 0; i < workshops.length; i++)
					price += (Integer.parseInt(workshops[i].substring(workshops[i].indexOf("$") + 1)));
				lblPrice.setText("$" + price);
			
			}
		});
		
	}
}
