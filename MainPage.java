import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainPage {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button button = new Button("Admin");
		button.setBackground(new Color(128, 128, 192));
		button.setForeground(new Color(64, 0, 64));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLog ad = new AdminLog();
				ad.frame3.setVisible(true);
				frame.dispose();
			}
		});
		button.setBounds(142, 92, 141, 35);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Librarian");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLog ad = new LibrarianLog();
				ad.LoginLibrarianframe.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setBackground(new Color(128, 128, 192));
		button_1.setForeground(new Color(64, 0, 64));
		button_1.setBounds(142, 151, 145, 35);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_2 = new JLabel("Main Page");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setForeground(new Color(64, 0, 64));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(168, 25, 115, 37);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
