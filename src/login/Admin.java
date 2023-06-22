package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Window.Type;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;

import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class Admin {

	private JFrame frame;
	private JTextField user;
	private JPasswordField pass;
	private ImageIcon icon;
	private Cursor cursor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		icon = new ImageIcon(getClass().getResource("logo.png"));
		frame = new JFrame("Hospital Management System");
		frame.setType(Type.POPUP);
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.getContentPane().setForeground(SystemColor.window);
		frame.setBounds(250, 150, 963, 573);
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		JLabel Title = new JLabel("Hospital Management System");
		Title.setBounds(329, 61, 359, 29);
		Title.setForeground(Color.RED);
		Title.setFont(new Font("Tahoma", Font.BOLD, 24));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lb1 = new JLabel("Enter User Name :");
		lb1.setBounds(205, 181, 139, 19);
		lb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		
		user = new JTextField();
		user.setBounds(359, 176, 146, 29);
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		user.setForeground(Color.RED);
		user.setFont(new Font("Tahoma", Font.BOLD, 15));
		user.setColumns(10);
		
		JLabel pass1 = new JLabel(" Enter Password :");
		pass1.setBounds(205, 230, 134, 19);
		pass1.setHorizontalAlignment(SwingConstants.CENTER);
		pass1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Title);
		frame.getContentPane().add(lb1);
		frame.getContentPane().add(user);
		frame.getContentPane().add(pass1);
		
		pass = new JPasswordField();
		pass.setForeground(Color.RED);
		pass.setBounds(359, 222, 146, 29);
		frame.getContentPane().add(pass);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setCursor(cursor);
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String us ="Admin";
				String pas ="Admin" ;
				
				String n1 = user.getText();
				String n2 = pass.getText();
				

				if(n1.equals("") && n2.equals("")){
					
				JOptionPane.showMessageDialog(null, "Please,Enter User name and Password!");
				
			}else if(n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Please,Enter User Name!");
				}else if(n2.equals("")){
					
					JOptionPane.showMessageDialog(null, "Please,Enter Password!");
					
					}else if(us.equals(n1) && pas.equals(n2) ){
					Administrator frame1 = new Administrator();
					frame1.setVisible(true);
					frame.dispose();
				}else if((us != n1) && (pas != n2 )) {
					JOptionPane.showMessageDialog(null, "Incorrect Pass or User Name!,Please Try again.");
			}
		}
		});
		loginbtn.setBackground(new Color(253, 245, 230));
		loginbtn.setForeground(new Color(0, 0, 255));
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		loginbtn.setBounds(369, 293, 119, 47);
		frame.getContentPane().add(loginbtn);
		
		JLabel lblNewLabel = new JLabel("User name: Admin & Pass : Admin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(290, 124, 347, 29);
		frame.getContentPane().add(lblNewLabel);
	}
}
