//package com.java1234.util;
//
//import java.awt.Color;
//import java.awt.Font;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class MyFrame extends JFrame {
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	MyFrame(){
//		ImageIcon Image = new ImageIcon("icon.png");
//		this.setIconImage(Image.getImage());
//		
//		
//		
//		JLabel label = new JLabel();
//		label.setText("BookManager");
//		label.setIcon(Image);
//		label.setForeground(Color.black);
//		label.setFont( new Font("Roboto",Font.LAYOUT_LEFT_TO_RIGHT ,30));
//		label.setIconTextGap(15);
//		label.setVerticalAlignment(JLabel.TOP );
//		label.setHorizontalAlignment(JLabel.CENTER );
//		
//		
//		
//		
//		JPanel panel1 = new JPanel();
//		panel1.setBounds(100,100,300,100);
//		panel1.add(label);
//		
//		
//		JLabel label2 = new JLabel();
//		label2.setText("BookManager");
//		label2.setIcon(Image);
//		label2.setForeground(Color.black);
//		label2.setFont( new Font("Roboto",Font.LAYOUT_LEFT_TO_RIGHT ,15));
//		label2.setIconTextGap(5);
//		label2.setVerticalAlignment(JLabel.CENTER);
//		label2.setHorizontalAlignment(JLabel.LEFT );
//		label2.setBounds(0,0,100,100);
//		
//		
//		JLabel label3 = new JLabel();
//		label3.setText("this is TextField");
//		label3.setForeground(Color.black);
//		label3.setFont( new Font("Roboto",Font.LAYOUT_LEFT_TO_RIGHT ,15));
//		
//		label3.setVerticalAlignment(JLabel.CENTER );
//		label3.setHorizontalAlignment(JLabel.RIGHT );
//		label3.setBounds(150,0,150,100);
//		
//		
//		JLabel label4 = new JLabel();
//		label4.setText("BookManager");
//		label4.setIcon(Image);
//		label4.setForeground(Color.black);
//		label4.setFont( new Font("Roboto",Font.LAYOUT_LEFT_TO_RIGHT ,15));
//		label4.setIconTextGap(5);
//		label4.setVerticalAlignment(JLabel.CENTER);
//		label4.setHorizontalAlignment(JLabel.LEFT );
//		label4.setBounds(0,0,100,100);
//		
//		
//		JLabel label5 = new JLabel();
//		label5.setText("this is TextField");
//		label5.setForeground(Color.black);
//		label5.setFont( new Font("Roboto",Font.LAYOUT_LEFT_TO_RIGHT ,15));
//		label5.setIconTextGap(5);
//		label5.setVerticalAlignment(JLabel.CENTER );
//		label5.setHorizontalAlignment(JLabel.RIGHT );
//		label5.setBounds(150,0,150,100);
//		
//		
//		
//		JPanel panel2 = new JPanel();
//		panel2.setBounds(100,225,300,100);
//		panel2.setLayout(null);
//		panel2.add(label2);
//		panel2.add(label3);
////		
////		JPanel panel3 = new JPanel();
////		panel3.setBounds(100,375,300,100);
////		panel3.add(label);
//		
//		
//		
//		this.setSize(500,500);
//		this.setTitle("BookManager");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setResizable(true);
//		this.setVisible(true);
//		this.setLayout(null);
//		this.add(panel1);
//		this.add(panel2);
////		this.add(panel3);
//		
//		
//		
//		
//	}
//
//}
