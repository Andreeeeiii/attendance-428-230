import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;



public class LibrarianLog {

	 JFrame LoginLibrarianframe;
	 private final JLabel lblNewLabel = new JLabel("Username:");
	 private JTextField textField;
	 private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLog window = new LibrarianLog();
					window.LoginLibrarianframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginLibrarianframe = new JFrame();
		LoginLibrarianframe.setBounds(100, 100, 460, 553);
		LoginLibrarianframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginLibrarianframe.getContentPane().setLayout(null);
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(156, 193, 98, 31);
		LoginLibrarianframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1.setBounds(156, 275, 98, 25);
		LoginLibrarianframe.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(128, 128, 255));
		textField.setBounds(48, 226, 331, 31);
		LoginLibrarianframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(128, 128, 255));
		passwordField.setBounds(48, 311, 331, 31);
		LoginLibrarianframe.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField.getText();
				String username = textField.getText();

				if(password.contains("LibOne")&& username.contains("Librarian_01") //This is the pattern or format in logins 
				   || password.contains("LibTwo") && username.contains("Librarian_02")
				   || password.contains("LibThree") && username.contains("Librarian_03")) {
					passwordField.setText(null);
					textField.setText(null);
					JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN.");
					
					
					MainPage mp = new MainPage();
					mp.frame.setVisible(true);
					LoginLibrarianframe.dispose();
				}
				else {

					JOptionPane.showMessageDialog(null, "Incorrect Username or Password. "
							+ "\nPlease try again!");
					passwordField.setText(null);
					textField.setText(null);
				}
			
				
				
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(LibrarianLog.class.getResource("/image/loginbttn.png")));
		btnNewButton.setBounds(48, 326, 331, 31);
		LoginLibrarianframe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Librarian");
		lblNewLabel_2.setForeground(new Color(64, 0, 64));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_2.setBounds(162, 90, 202, 31);
		LoginLibrarianframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login Form");
		lblNewLabel_3.setForeground(new Color(64, 0, 64));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_3.setBounds(150, 123, 192, 31);
		LoginLibrarianframe.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("LOG IN");
		btnNewButton_1.setForeground(new Color(0, 128, 192));
		btnNewButton_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1.setBounds(48, 385, 344, 31);
		LoginLibrarianframe.getContentPane().add(btnNewButton_1);
	}
}