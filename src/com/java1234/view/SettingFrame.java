package com.java1234.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.java1234.util.DbUtil;
import com.java1234.util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class SettingFrame extends JFrame {
	private JTextField dbUrlTxt;
	private JTextField dbUserNameTxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	private JPanel contentPane;
	private JPasswordField dbPasswordTxt;
	
	private DbUtil dbUtil=new DbUtil();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingFrame frame = new SettingFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SettingFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SettingFrame.class.getResource("/images/bookIcon.png")));
		setBounds(100, 100, 665, 457);
		
		JLabel lblNewLabel = new JLabel("dbUrl:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("dbUserName:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_2 = new JLabel("dbPassword:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		dbUrlTxt = new JTextField();
		dbUrlTxt.setColumns(10);
		
		dbUserNameTxt = new JTextField();
		dbUserNameTxt.setColumns(10);
		
		btnNewButton = new JButton("Connect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setActionPerformed(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(ChangeDataBaseInternalFrame.class.getResource("/images/login.png")));
		
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ChangeDataBaseInternalFrame.class.getResource("/images/reset.png")));
		
		dbPasswordTxt = new JPasswordField();
		dbPasswordTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
							.addGap(128))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(90)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(dbPasswordTxt)
						.addComponent(dbUrlTxt, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
						.addComponent(dbUserNameTxt, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
					.addContainerGap(79, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(101)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(177))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(dbUrlTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(dbUserNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(dbPasswordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(78)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	private void setActionPerformed(ActionEvent e) throws IOException {
		
		
		String dbUrl = dbUrlTxt.getText();
		if (StringUtil.isEmpty(dbUrl)) {
			JOptionPane.showMessageDialog(null, "Dburl cannot be empty");
			return;
		}
		String dbUserName = dbUserNameTxt.getText();
		if (StringUtil.isEmpty(dbUserName)) {
			JOptionPane.showMessageDialog(null, "DbUserName cannot be empty");
			return;
		}
		String dbPassword=new String(this.dbPasswordTxt.getPassword());
		
		if (StringUtil.isEmpty(dbPassword)) {
			JOptionPane.showMessageDialog(null, "dbPassword cannot be empty");
			return;
		}
		if(!(dbUrl==null) && !(dbUserName==null) && !(dbPassword==null)) {

			 Properties props = new Properties();

			    String propsFileName = "confiq.properties";
			    try {
			      //first load old one:
			      FileInputStream configStream = new FileInputStream(propsFileName);
			      props.load(configStream);
			      configStream.close();

			      //modifies existing or adds new property
			      props.setProperty("dbUrl", dbUrl);
					props.setProperty("dbUserName", dbUserName);
					props.setProperty("dbPassword", dbPassword);

			      //save modified property file
			      FileOutputStream output = new FileOutputStream(propsFileName);
			      props.store(output, "This description goes to the header of a file");
			      output.close();

			    } catch (IOException ex) {
			      ex.printStackTrace();
			    }
				JOptionPane.showMessageDialog(null, "Your database setting done");
			    dispose();
			    
				new LogOnFrm().setVisible(true);
//				System.out.println(props.getProperty("dbUrl"));
//				System.out.println(props.getProperty("dbUserName"));
//				System.out.println(props.getProperty("dbPassword"));
	
		}

		
		
	}

	private void resetValueActionPerformed(ActionEvent evt) {
		this.dbUrlTxt.setText("");
		this.dbUserNameTxt.setText("");
		this.dbPasswordTxt.setText("");
	}
}
