import java.awt.EventQueue;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Property_Tax {

	private JFrame frame;
	private JTextField Valuetxt;
	private JLabel Taxlabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Property_Tax window = new Property_Tax();
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
	public Property_Tax() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 66));
		frame.setBounds(100, 100, 1338, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Property Tax");
		Font titlefont = lblTitle.getFont();
		lblTitle.setFont(new Font(titlefont.getFontName(), Font.PLAIN, 80));
		lblTitle.setBounds(21, 21, 825, 122);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblValuelabel = new JLabel("What is the value of your property?");
		Font valuefont = lblValuelabel.getFont();
		lblValuelabel.setFont(new Font(valuefont.getFontName(), Font.PLAIN, 30));
		lblValuelabel.setBounds(379, 164, 541, 86);
		frame.getContentPane().add(lblValuelabel);
		
		Valuetxt = new JTextField();
		Valuetxt.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Valuetxt.setBounds(407, 232, 297, 70);
		frame.getContentPane().add(Valuetxt);
		Valuetxt.setColumns(10);
		
		Taxlabel = new JLabel("");
		Taxlabel.setBounds(322, 323, 937, 86);
		frame.getContentPane().add(Taxlabel);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label.setBounds(379, 233, 115, 67);
		frame.getContentPane().add(label);
		
		JButton btnCaclulate = new JButton("Calculate");
		btnCaclulate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCaclulate.setBackground(Color.LIGHT_GRAY);
		btnCaclulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double value = Double.parseDouble(Valuetxt.getText());
				value = value * .6;
				value = value / 100;
				value = value * .64;
				Taxlabel.setFont(new Font(titlefont.getFontName(), Font.PLAIN, 30));
				DecimalFormat df = new DecimalFormat("##.##");
				Taxlabel.setText("Your tax payment for your property will be $" + df.format(value));
			}
		});
		btnCaclulate.setBounds(705, 232, 150, 70);
		frame.getContentPane().add(btnCaclulate);
	}
}
