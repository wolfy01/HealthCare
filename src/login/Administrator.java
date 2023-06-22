package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;

public class Administrator extends JFrame {

	private JPanel f2;
	private JTextField name;
	private JTextField id;
	private JTextField phone;
	private JTextField room;
	private JTable table;
	DefaultTableModel model;
	private Administrator frame ;
	private ImageIcon icon;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrator frame = new Administrator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Administrator() {
		setType(Type.UTILITY);
		
	
		setTitle("Administration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 594);
		f2 = new JPanel();
		f2.setBackground(new Color(64, 224, 208));
		f2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(f2);
		f2.setLayout(null);
		
		//Administrator frame = new Administrator();
		//frame.setResizable(false);
		//frame.setResizable(false);
		
		JLabel adminlb = new JLabel("Doctor Registration Form");
		adminlb.setBackground(Color.BLACK);
		adminlb.setForeground(Color.RED);
		adminlb.setFont(new Font("Tahoma", Font.BOLD, 28));
		adminlb.setHorizontalAlignment(SwingConstants.CENTER);
		adminlb.setBounds(245, 21, 433, 81);
		f2.add(adminlb);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(53, 158, 59, 23);
		f2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID NO :");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(53, 209, 59, 23);
		f2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(53, 262, 59, 23);
		f2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Room No :");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(25, 312, 102, 23);
		f2.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 12));
		name.setForeground(new Color(0, 0, 205));
		name.setBounds(122, 159, 124, 23);
		f2.add(name);
		name.setColumns(10);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.BOLD, 12));
		id.setForeground(new Color(0, 0, 205));
		id.setBounds(122, 210, 124, 23);
		f2.add(id);
		id.setColumns(10);
		
		phone = new JTextField();
		phone.setForeground(new Color(0, 0, 205));
		phone.setFont(new Font("Tahoma", Font.BOLD, 12));
		phone.setBounds(122, 262, 146, 23);
		f2.add(phone);
		phone.setColumns(10);
		
		room = new JTextField();
		room.setFont(new Font("Tahoma", Font.BOLD, 12));
		room.setForeground(new Color(0, 0, 205));
		room.setBounds(122, 312, 124, 23);
		f2.add(room);
		room.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(351, 112, 474, 398);
		f2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				
				id.setText(model.getValueAt(i, 0).toString());
				name.setText(model.getValueAt(i, 1).toString());
				phone.setText(model.getValueAt(i, 2).toString());
				room.setText(model.getValueAt(i, 2).toString());
				
				
				
			}
		});
		table.setBackground(new Color(240, 248, 255));
		model = new DefaultTableModel();
		Object [] column = {"ID","Name","Phone Number","Room No"};
		Object [] row = new Object[5];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton addbtn = new JButton("Add");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(name.getText().equals("") || id.getText().equals("") || phone.getText().equals("") || room.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fillup the Information Properly!");
				}else {
					
					row[0] = id.getText();
					row[1] = name.getText();
					row[2] = phone.getText();
					row[3] = room.getText();
					model.addRow(row);
					
					id.setText("");
					name.setText("");
					phone.setText("");
					room.setText("");
					
					JOptionPane.showMessageDialog(null,"Saved Succesfully!");
				}
				
				
			}
		});
		addbtn.setForeground(new Color(0, 0, 255));
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		addbtn.setBounds(25, 381, 119, 36);
		f2.add(addbtn);
		
		JButton updatebtn = new JButton("Update");
		updatebtn.setForeground(new Color(0, 0, 255));
		updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i >= 0) {
					
					model.setValueAt(id.getText(),i, 0);
					model.setValueAt(name.getText(),i, 1);
					model.setValueAt(phone.getText(),i, 2);
					model.setValueAt(room.getText(),i, 3);
					JOptionPane.showMessageDialog(null, "Update Succesful!");
				}else {
					JOptionPane.showMessageDialog(null, "Please fillup the Information Properly!");
					
				}
			}
		});
		updatebtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		updatebtn.setBounds(171, 381, 110, 36);
		f2.add(updatebtn);
		
		JButton delbtn = new JButton("Delete");
		delbtn.setForeground(new Color(0, 0, 255));
		delbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				
				if(i >= 0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,"Delete Succesfully!");
				}else {
					JOptionPane.showMessageDialog(null,"Please Select a Row First!");
				}
				
			}
		});
		delbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		delbtn.setBounds(25, 446, 119, 36);
		f2.add(delbtn);
		
		JButton clearbtn = new JButton("Clear");
		clearbtn.setForeground(new Color(0, 0, 255));
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				name.setText("");
				phone.setText("");
				room.setText("");
			}
		});
		clearbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		clearbtn.setBounds(171, 446, 110, 36);
		f2.add(clearbtn);
		
		JButton logoutbtn = new JButton("Logout & Exit");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Administrator frame = new Administrator();
			
				System.exit(0);
				
			}
		});
		logoutbtn.setForeground(new Color(0, 0, 255));
		logoutbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		logoutbtn.setBounds(25, 509, 119, 38);
		f2.add(logoutbtn);
	}
}
