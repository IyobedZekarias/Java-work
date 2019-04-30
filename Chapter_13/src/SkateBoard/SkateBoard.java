package SkateBoard;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SkateBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkateBoard window = new SkateBoard();
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
	public SkateBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 66));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1220, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblSkateBoardMaker = new JLabel("Skate Board Maker");
		lblSkateBoardMaker.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblSkateBoardMaker.setBounds(21, 21, 381, 67);
		frame.getContentPane().add(lblSkateBoardMaker);
		
		String[] decks = {"Choose One...", "The Master Thrasher $60", "The Dictator $45", "The Street King $50"};
		JComboBox DeckSelect = new JComboBox(decks);
		DeckSelect.setFont(new Font("Tahoma", Font.PLAIN, 27));
		DeckSelect.setBackground(Color.LIGHT_GRAY);
		DeckSelect.setBounds(21, 155, 318, 32);
		frame.getContentPane().add(DeckSelect);
		
		JLabel Decklbl = new JLabel("Deck");
		Decklbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Decklbl.setBounds(21, 118, 101, 32);
		frame.getContentPane().add(Decklbl);
		
		JLabel Truckslbl = new JLabel("Trucks");
		Truckslbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Truckslbl.setBounds(375, 118, 101, 32);
		frame.getContentPane().add(Truckslbl);
		
		String[] trucks = {"Choose One...", "7.75-inch $35", "8-inch $40", "8.5-inch $45"};
		JComboBox TruckSelect = new JComboBox(trucks);
		TruckSelect.setFont(new Font("Tahoma", Font.PLAIN, 27));
		TruckSelect.setBackground(Color.LIGHT_GRAY);
		TruckSelect.setBounds(375, 155, 218, 32);
		frame.getContentPane().add(TruckSelect);
		
		JLabel Wheelslbl = new JLabel("Wheels");
		Wheelslbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Wheelslbl.setBounds(635, 118, 101, 32);
		frame.getContentPane().add(Wheelslbl);

		String[] wheels = {"Choose One...", "51mm $20", "55mm $22", "58mm $24", "61mm $28"};
		JComboBox WheelsSelect = new JComboBox(wheels);
		WheelsSelect.setFont(new Font("Tahoma", Font.PLAIN, 27));
		WheelsSelect.setBackground(Color.LIGHT_GRAY);
		WheelsSelect.setBounds(635, 155, 218, 32);
		frame.getContentPane().add(WheelsSelect);
	
		String[] mscitems = {"Grip Tape $10", "Bearings $30", "Riser Pads $2", "N&Bolts Kit $3"};
		List MiscItemslist = new List();
		for(int i=0; i < mscitems.length; i++) {
			MiscItemslist.add(mscitems[i]);
		}
		MiscItemslist.setMultipleMode(true);
		MiscItemslist.setFont(new Font("Tahoma", Font.PLAIN, 27));
		MiscItemslist.setBounds(923, 155, 234, 146);
		frame.getContentPane().add(MiscItemslist);
		
		JLabel lblOtherItems = new JLabel("Other Items");
		lblOtherItems.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOtherItems.setBounds(922, 118, 200, 32);
		frame.getContentPane().add(lblOtherItems);
		
		
		JLabel Pricelbl = new JLabel("");
		Pricelbl.setVerticalAlignment(SwingConstants.TOP);
		Pricelbl.setHorizontalAlignment(SwingConstants.CENTER);
		Pricelbl.setFont(new Font("Tahoma", Font.PLAIN, 31));
		Pricelbl.setBounds(343, 307, 292, 59);
		frame.getContentPane().add(Pricelbl);
		
		JButton btnCalculate = new JButton("Calculate Price");
		btnCalculate.setBackground(Color.LIGHT_GRAY);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnCalculate.setBounds(343, 266, 292, 35);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int price = 0;
				String truck = TruckSelect.getSelectedItem().toString();
				String deck = DeckSelect.getSelectedItem().toString();
				String wheel = WheelsSelect.getSelectedItem().toString();
				String[] items = MiscItemslist.getSelectedItems();
				
				int deckprice = Integer.parseInt(deck.substring(deck.indexOf("$") + 1));
				int truckprice = Integer.parseInt(truck.substring(truck.indexOf("$") + 1));
				int wheelprice = Integer.parseInt(wheel.substring(wheel.indexOf("$") + 1));
				price = deckprice + truckprice + wheelprice;
				for(int i = 0; i < items.length; i++)
					price += (Integer.parseInt(items[i].substring(items[i].indexOf("$") + 1)));
				Pricelbl.setText("$" + price);
			
			}
		});
		frame.getContentPane().add(btnCalculate);
	}
}
