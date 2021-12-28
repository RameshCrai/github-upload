package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.model.Student;
import com.service.StudentService;
import com.serviceImpl.StudentServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;

public class StudentForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField lnametxt;
	private JTextField fnametxt;
	private JLabel lblNewLabel_2;
	private JTextField agetxt;
	private JLabel lblNewLabel_3;
	private JTextField citytxt;
	private JTextField countrytxt;
	private JTextField emailtxt;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JComboBox facultycombo;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JComboBox statecombo;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JRadioButton malerbt;
	private JRadioButton femalerbt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField collegetxt;
	private JLabel lblNewLabel_10;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_11;
	private JTextField searchtxt;
	private JLabel lblNewLabel_12;
	private JTextField rolltxt;
	private JLabel lblNewLabel_13;
	private JTextField phonetxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setTitle("registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 5, 1239, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLnametxt());
		contentPane.add(getFnametxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getAgetxt());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getCitytxt());
		contentPane.add(getCountrytxt());
		contentPane.add(getEmailtxt());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getFacultycombo());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getStatecombo());
		contentPane.add(getDateChooser());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getMalerbt());
		contentPane.add(getFemalerbt());
		contentPane.add(getCollegetxt());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_11());
		contentPane.add(getSearchtxt());
		contentPane.add(getLblNewLabel_12());
		contentPane.add(getRolltxt());
		contentPane.add(getLblNewLabel_13());
		contentPane.add(getPhonetxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
	    displayData();
		//first load data  show message 
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("firstName");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel.setBounds(42, 48, 82, 30);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("lastName");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_1.setBounds(42, 100, 82, 36);
		}
		return lblNewLabel_1;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
			lnametxt.setBounds(148, 89, 201, 41);
			lnametxt.setColumns(10);
		}
		return lnametxt;
	}
	private JTextField getFnametxt() {
		if (fnametxt == null) {
			fnametxt = new JTextField();
			fnametxt.setBounds(148, 40, 201, 41);
			fnametxt.setColumns(10);
		}
		return fnametxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("age");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_2.setBounds(42, 155, 82, 30);
		}
		return lblNewLabel_2;
	}
	private JTextField getAgetxt() {
		if (agetxt == null) {
			agetxt = new JTextField();
			agetxt.setBounds(148, 141, 201, 44);
			agetxt.setColumns(10);
		}
		return agetxt;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("city");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_3.setBounds(42, 206, 82, 41);
		}
		return lblNewLabel_3;
	}
	private JTextField getCitytxt() {
		if (citytxt == null) {
			citytxt = new JTextField();
			citytxt.setBounds(148, 196, 201, 41);
			citytxt.setColumns(10);
		}
		return citytxt;
	}
	private JTextField getCountrytxt() {
		if (countrytxt == null) {
			countrytxt = new JTextField();
			countrytxt.setBounds(148, 248, 201, 41);
			countrytxt.setColumns(10);
		}
		return countrytxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setBounds(148, 300, 201, 44);
			emailtxt.setColumns(10);
		}
		return emailtxt;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("country");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_4.setBounds(42, 261, 82, 28);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("email");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_5.setBounds(42, 301, 92, 36);
		}
		return lblNewLabel_5;
	}
	private JComboBox getFacultycombo() {
		if (facultycombo == null) {
			facultycombo = new JComboBox();
			facultycombo.setModel(new DefaultComboBoxModel(new String[] {"====select faculty=======", "BCA", "Science", "Humaniy", "Management"}));
			facultycombo.setBounds(148, 355, 201, 44);
		}
		return facultycombo;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("faculty");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_6.setBounds(42, 359, 82, 30);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("state");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_7.setBounds(42, 416, 82, 41);
		}
		return lblNewLabel_7;
	}
	private JComboBox getStatecombo() {
		if (statecombo == null) {
			statecombo = new JComboBox();
			statecombo.setModel(new DefaultComboBoxModel(new String[] {"=======select state======", "province - 1", "province - 2", "province - 3", "province - 4", "province - 5", "province - 6", "province - 7"}));
			statecombo.setBounds(148, 410, 201, 44);
		}
		return statecombo;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(148, 465, 201, 41);
		}
		return dateChooser;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("date of birth");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_8.setBounds(42, 468, 96, 38);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("gender");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_9.setBounds(42, 517, 92, 30);
		}
		return lblNewLabel_9;
	}
	private JRadioButton getMalerbt() {
		if (malerbt == null) {
			malerbt = new JRadioButton("Male");
			buttonGroup.add(malerbt);
			malerbt.setFont(new Font("Tahoma", Font.PLAIN, 18));
			malerbt.setBounds(148, 514, 92, 36);
		}
		return malerbt;
	}
	private JRadioButton getFemalerbt() {
		if (femalerbt == null) {
			femalerbt = new JRadioButton("Female");
			buttonGroup.add(femalerbt);
			femalerbt.setFont(new Font("Tahoma", Font.PLAIN, 18));
			femalerbt.setBounds(246, 514, 103, 36);
		}
		return femalerbt;
	}
	private JTextField getCollegetxt() {
		if (collegetxt == null) {
			collegetxt = new JTextField();
			collegetxt.setBounds(148, 557, 201, 41);
			collegetxt.setColumns(10);
		}
		return collegetxt;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("college");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
			
			lblNewLabel_10.setBounds(42, 562, 82, 30);
		}
		return lblNewLabel_10;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(376, 40, 8, 558);
		}
		return separator;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(394, 86, 831, 384);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "FirstName", "LastName", "college", "city"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("Search");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_11.setBounds(784, 48, 82, 30);
		}
		return lblNewLabel_11;
	}
	private JTextField getSearchtxt() {
		if (searchtxt == null) {
			searchtxt = new JTextField();
			searchtxt.addKeyListener(new KeyAdapter() {
				
				
				
				@Override
				public void keyReleased(KeyEvent e) {
				//action listener 
				
					String searchData = searchtxt.getText().trim();
					
					
					StudentService ss = new StudentServiceImpl();
					
					List<Student> slist = ss.searchStudent(searchData);
					
					
					 DefaultTableModel tmodel =  (DefaultTableModel) table.getModel();
					 tmodel.setRowCount(0);
					 
					 for(Student st : slist) {
						 
						 tmodel.addRow(new Object[] {st.getId(),st.getFname(),st.getLname(),st.getCollege(),st.getCity()});
						 
						 
					 }
					
				
					
				}
			});
			searchtxt.setBounds(913, 37, 312, 38);
			searchtxt.setColumns(10);
		}
		return searchtxt;
	}
	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("rollno");
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_12.setBounds(394, 492, 65, 36);
		}
		return lblNewLabel_12;
	}
	private JTextField getRolltxt() {
		if (rolltxt == null) {
			rolltxt = new JTextField();
			rolltxt.setBounds(479, 489, 190, 44);
			rolltxt.setColumns(10);
		}
		return rolltxt;
	}
	private JLabel getLblNewLabel_13() {
		if (lblNewLabel_13 == null) {
			lblNewLabel_13 = new JLabel("contact");
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_13.setBounds(394, 559, 65, 30);
		}
		return lblNewLabel_13;
	}
	private JTextField getPhonetxt() {
		if (phonetxt == null) {
			phonetxt = new JTextField();
			phonetxt.setBounds(479, 557, 190, 41);
			phonetxt.setColumns(10);
		}
		return phonetxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//form validation 
					
					if(fnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "firstName is required ");
						return;
						
					}
					if(lnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "lastName is required ");
						return;	
						
					}
					if(agetxt.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(null, "age is required ");
						return;
						
					}
					if(citytxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "city is required ");
						return;
						
					}
					if(collegetxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "college is required ");
						return;
						
					}
					if(countrytxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "country  is required ");
						return;
						
					}
					if(facultycombo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "faculty is required ");
						return;
						
					}
					if(statecombo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "state  is required ");
						return;
						
						
					}
					if(dateChooser.getDate()==null) {
						JOptionPane.showMessageDialog(dateChooser, "Select date ");
						return;
						
					}
					if(emailtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "email is required ");
						return;
						
					}
					
					
					if(!malerbt.isSelected() && !femalerbt.isSelected()) {
						
						JOptionPane.showMessageDialog(null, "gender is required ");
						return;
						
					}
					if(rolltxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "roll number  is required ");
						return;
						
					}
					if(phonetxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "phone number is required ");
						return;
						
					}
					
					
					Student s  = new Student();
					
					
					s.setFname(fnametxt.getText());
					s.setLname(lnametxt.getText());
					s.setAge(Integer.parseInt(agetxt.getText()));
					s.setCity(citytxt.getText());
					s.setCollege(collegetxt.getText());
					s.setCountry(countrytxt.getText());
					s.setDob(new Date(dateChooser.getDate().getTime()));
					s.setEmail(emailtxt.getText());
					s.setFaculty(facultycombo.getSelectedItem().toString());
					s.setState(statecombo.getSelectedItem().toString());

                    if(malerbt.isSelected()) {
                    	s.setGender("male");
                    	
                    }else {
                    	s.setGender("female");
                    }
					
                    
                   s.setPhone(phonetxt.getText());
                   s.setRollno(Integer.parseInt(rolltxt.getText()));
                   
                   
                   StudentService ss = new StudentServiceImpl();
                   
                   if(ss.addStudent(s)) {
                	   JOptionPane.showMessageDialog(null, "added success");
                	   displayData();
                	   
                   }else {
                	   JOptionPane.showMessageDialog(null, "failed");
                	   
                	   
                   }
                   
                  
                   
                   
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton.setBounds(697, 491, 201, 45);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Delete");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()< 0) {
						JOptionPane.showMessageDialog(null, "Please Select any data");
						return;
						
						
					}
					
					// get id of selected row 
					int row  = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					
					StudentService ss = new StudentServiceImpl();
					
					if(ss.deleteStudent(id)){
						
						JOptionPane.showMessageDialog(null, "deleted success");
						displayData();
						
					}else {
						JOptionPane.showMessageDialog(null, "deleted failed");
						
					}
					
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton_1.setBounds(981, 492, 218, 44);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Edit");
			btnNewButton_2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please Select any data");
						return;
						
						
					}
					
					// get id of selected row 
					int row  = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					EditForm ef = new EditForm();
					     ef.setDataToEdit(id);
					     ef.setVisible(true);
					
					dispose();
					
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton_2.setBounds(697, 557, 201, 41);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("View");
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton_3.setBounds(981, 557, 218, 41);
		}
		return btnNewButton_3;
	}
	
	//display data in jtable
	private void displayData() {
		StudentService ss = new StudentServiceImpl();
		
		List<Student> slist = ss.getAllstudents();
	
		 DefaultTableModel tmodel =  (DefaultTableModel) table.getModel();
		 tmodel.setRowCount(0);
		 
		 for(Student st : slist) {
			 
			 tmodel.addRow(new Object[] {st.getId(),st.getFname(),st.getLname(),st.getCollege(),st.getCity()});
			 
			 
		 }
		
		
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("View");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please Select any data");
						return;
						
						
					}
					
					// get id of selected row 
					int row  = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					viewForm ef = new viewForm();
					     ef.setDataToEdit(id);
					     ef.setVisible(true);
					
					dispose();
					
				}
			});
			btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton_4.setBounds(981, 552, 218, 46);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("Print");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					try {
						table.print();
					} catch (PrinterException e1) {
						
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton_5.setBounds(424, 32, 113, 30);
		}
		return btnNewButton_5;
	}
}
