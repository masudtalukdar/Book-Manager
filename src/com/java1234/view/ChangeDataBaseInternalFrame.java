package com.java1234.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeDataBaseInternalFrame extends JInternalFrame {
	private JTextField dbUrlTxt;
	private JTextField dbUserNameTxt;
	private JTextField dbPasswordTxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeDataBaseInternalFrame frame = new ChangeDataBaseInternalFrame();
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
	public ChangeDataBaseInternalFrame() {
		setFrameIcon(new ImageIcon(ChangeDataBaseInternalFrame.class.getResource("/images/bookIcon.png")));
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
		
		dbPasswordTxt = new JTextField();
		dbPasswordTxt.setColumns(10);
		
		btnNewButton = new JButton("Connect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setActionPerformed(e);
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
						.addComponent(dbUrlTxt, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
						.addComponent(dbUserNameTxt, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
						.addComponent(dbPasswordTxt, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
					.addContainerGap(81, Short.MAX_VALUE))
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
					.addContainerGap(90, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	private void setActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	private void resetValueActionPerformed(ActionEvent evt) {
		this.dbUrlTxt.setText("");
		this.dbUserNameTxt.setText("");
		this.dbPasswordTxt.setText("");
	}
}
