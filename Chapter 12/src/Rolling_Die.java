import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Rolling_Die {

	private JFrame frame;
	Timer timer1;
	Timer timer2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rolling_Die window = new Rolling_Die();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public Rolling_Die() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 1666, 1195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		BufferedImage[] img = { ImageIO.read(new File("Dice-1.png")), ImageIO.read(new File("Dice-2.png")),
				ImageIO.read(new File("Dice-3.png")), ImageIO.read(new File("Dice-4.png")),
				ImageIO.read(new File("Dice-5.png")), ImageIO.read(new File("Dice-5.png")),
				ImageIO.read(new File("Dice-6.png")) };
		JLabel first_die = new JLabel("");
		JLabel second_die = new JLabel("");
		

		JButton btnRoll = new JButton("Click Here to Roll");
		btnRoll.setFont(new Font("Tahoma", Font.PLAIN, 42));
		btnRoll.setBackground(Color.LIGHT_GRAY);
		btnRoll.setBounds(0, 0, 1640, 106);
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timer1 = new Timer();
				timer2 = new Timer();
				timer1.schedule(new changePic1(first_die, timer1, img), 0, 100);
				timer2.schedule(new changePic1(second_die, timer2, img), 0, 100);
			}
		});
		frame.getContentPane().add(btnRoll);

		first_die.setBounds(117, 265, 606, 606);
		frame.getContentPane().add(first_die);

		second_die.setBounds(914, 265, 606, 606);
		frame.getContentPane().add(second_die);

	}

}

class changePic1 extends TimerTask {
	public JLabel Die = new JLabel("");
	public Timer Timer = new Timer();
	public int currentimg = 0;
	private BufferedImage[] Img;
	
	public changePic1(JLabel die, Timer timer, BufferedImage[] img) {
		Die = die;
		Timer = timer;
		Img = img;
	}
	
	public void run() {
		int numberoftimes = 0;
		while (numberoftimes < 20) {
			Random rand = new Random();
			currentimg = rand.nextInt(7);
			Image dimg = Img[currentimg].getScaledInstance(Die.getWidth(), Die.getHeight(),
					Image.SCALE_SMOOTH);

			ImageIcon imageIcon = new ImageIcon(dimg);
			Die.setIcon(imageIcon);
			numberoftimes++;
		}
		Timer.cancel();
		numberoftimes = 0;

	}
}
