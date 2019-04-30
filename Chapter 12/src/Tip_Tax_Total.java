import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Tip_Tax_Total {

	private JFrame frame;
	private JTextField Valuetxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tip_Tax_Total window = new Tip_Tax_Total();
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
	public Tip_Tax_Total() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 66));
		frame.setBounds(100, 100, 1058, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Tip Tax Total");
		Font titlefont = lblTitle.getFont();
		lblTitle.setFont(new Font(titlefont.getFontName(), Font.PLAIN, 80));
		lblTitle.setBounds(21, 21, 825, 122);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblValuelabel = new JLabel("What is the charge for your food?");
		Font valuefont = lblValuelabel.getFont();
		lblValuelabel.setFont(new Font(valuefont.getFontName(), Font.PLAIN, 30));
		lblValuelabel.setBounds(379, 129, 541, 86);
		frame.getContentPane().add(lblValuelabel);
		
		Valuetxt = new JTextField();
		Valuetxt.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Valuetxt.setBounds(407, 192, 297, 70);
		frame.getContentPane().add(Valuetxt);
		Valuetxt.setColumns(10);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.PLAIN, 50));
		label.setBounds(379, 193, 115, 67);
		frame.getContentPane().add(label);
		
		JLabel tip_label = new JLabel("");
		tip_label.setFont(new Font("Tahoma", Font.PLAIN, 28));
		tip_label.setBounds(379, 312, 476, 47);
		frame.getContentPane().add(tip_label);
		
		JLabel tax_label = new JLabel("");
		tax_label.setFont(new Font("Tahoma", Font.PLAIN, 28));
		tax_label.setBounds(379, 351, 476, 47);
		frame.getContentPane().add(tax_label);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_1.setBounds(379, 370, 476, 47);
		frame.getContentPane().add(label_1);
		
		JLabel tot_label = new JLabel("");
		tot_label.setFont(new Font("Tahoma", Font.PLAIN, 28));
		tot_label.setBounds(379, 419, 476, 47);
		frame.getContentPane().add(tot_label);
		
		JButton btnCaclulate = new JButton("Calculate");
		btnCaclulate.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCaclulate.setBackground(Color.LIGHT_GRAY);
		btnCaclulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double foodvalue = Double.parseDouble(Valuetxt.getText());
				double tip = foodvalue * .18;
				double tax = foodvalue * .07;
				double total = foodvalue + tip + tax;
				DecimalFormat df = new DecimalFormat("##.##");
				tip_label.setText("Tip:     $" + df.format(tip));
				tax_label.setText("Tax:    $" + df.format(tax));
				tot_label.setText("Total:  $" + df.format(total));
				label_1.setText("________________");
			}
		});
		btnCaclulate.setBounds(705, 192, 150, 70);
		frame.getContentPane().add(btnCaclulate);
	
	}
}
