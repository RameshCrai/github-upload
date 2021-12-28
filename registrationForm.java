package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Student;
import com.service.StudentService;
import com.serviceImpl.StudentServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField usernametxt;
	private JPasswordField passwordtxt;
	private JLabel lblLastname;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationForm frame = new registrationForm();
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
	public registrationForm() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getFnametxt());
		contentPane.add(getLnametxt());
		contentPane.add(getUsernametxt());
		contentPane.add(getPasswordtxt());
		contentPane.add(getLblLastname());
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getBtnNewButton());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("FirstName :");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel.setBounds(67, 61, 125, 28);
		}
		return lblNewLabel;
	}
	private JTextField getFnametxt() {
		if (fnametxt == null) {
			fnametxt = new JTextField();
			fnametxt.setBounds(202, 59, 333, 39);
			fnametxt.setColumns(10);
		}
		return fnametxt;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
			lnametxt.setColumns(10);
			lnametxt.setBounds(202, 124, 333, 39);
		}
		return lnametxt;
	}
	private JTextField getUsernametxt() {
		if (usernametxt == null) {
			usernametxt = new JTextField();
			usernametxt.setColumns(10);
			usernametxt.setBounds(202, 187, 333, 39);
		}
		return usernametxt;
	}
	private JPasswordField getPasswordtxt() {
		if (passwordtxt == null) {
			passwordtxt = new JPasswordField();
			passwordtxt.setBounds(202, 251, 333, 47);
		}
		return passwordtxt;
	}
	private JLabel getLblLastname() {
		if (lblLastname == null) {
			lblLastname = new JLabel("LastName :");
			lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblLastname.setBounds(67, 124, 125, 28);
		}
		return lblLastname;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("UserName :");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblUsername.setBounds(67, 187, 125, 28);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password :");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblPassword.setBounds(67, 251, 125, 28);
		}
		return lblPassword;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Submit ");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					//
					
					Student subm = new Student();
					
					subm.setFname(fnametxt.getText());
					subm.setLname(lnametxt.getText());
					subm.setUserName(usernametxt.getText());
					subm.setPassword(passwordtxt.getText());
					
					StudentService ss = new StudentServiceImpl();
					
					if(ss.submitStudent(subm)) {
						
						JOptionPane.showMessageDialog(null, "Register Success");
						new LoginForm().setVisible(true);
						dispose();
					}else {
						
					
						JOptionPane.showMessageDialog(null, "Register failed ");
					}
					
					
					
					
					
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton.setBounds(248, 329, 240, 39);
		}
		return btnNewButton;
	}
}
