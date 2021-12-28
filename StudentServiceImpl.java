package com.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;

import com.model.Student;
import com.service.StudentService;

public class StudentServiceImpl   implements StudentService {

	@Override
	public boolean addStudent(Student student) {
		
		
		String sql = "insert into student(fname,lname,gender,college,dob,age,city,country,phone,faculty,email,rollno,state)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setString(1, student.getFname());
			pstm.setString(2, student.getLname());
			pstm.setString(3, student.getGender());
			pstm.setString(4, student.getCollege());
			pstm.setDate(5, student.getDob());
			pstm.setInt(6, student.getAge());
			pstm.setString(7, student.getCity());
			pstm.setString(8, student.getCountry());
			pstm.setString(9, student.getPhone());
			pstm.setString(10, student.getFaculty());
			pstm.setString(11, student.getEmail());
			pstm.setInt(12, student.getRollno());			
			pstm.setString(13, student.getState());
			
			
			
			
			
			pstm.execute();
			return true;
					
			
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {

        String sql = "delete from student where id = "+id;
        
        try {
			Statement stm = DB.getConnection().createStatement();
			
			stm.execute(sql);
			return true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		

		String sql = "update student set fname= ?,lname= ?,gender= ?,college= ?,dob= ?,age= ?,city= ?,country= ?,phone= ?,faculty= ?,email= ?,rollno= ?,state= ? where id = ?";
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setString(1, student.getFname());
			pstm.setString(2, student.getLname());
			pstm.setString(3, student.getGender());
			pstm.setString(4, student.getCollege());
			pstm.setDate(5, student.getDob());
			pstm.setInt(6, student.getAge());
			pstm.setString(7, student.getCity());
			pstm.setString(8, student.getCountry());
			pstm.setString(9, student.getPhone());
			pstm.setString(10, student.getFaculty());
			pstm.setString(11, student.getEmail());
			pstm.setInt(12, student.getRollno());			
			pstm.setString(13, student.getState());
			pstm.setInt(14, student.getId());
			
			
			
			
			pstm.execute();
			return true;
						
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	
		return false;
	}

	

	@Override
	public List<Student> getAllstudents() {
		
		List<Student> slist = new ArrayList<>();
		
      
		
		String sql = "select id,fname,lname,college,city from student";
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				
				Student s =new  Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setCity(rs.getString("city"));
				
				
				slist.add(s);
		
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		


		return slist;
	}

	@Override
	public List<Student> searchStudent(String data) {
		
	
		List<Student> slist = new ArrayList<>();
		
      
		
		String sql = "select id,fname,lname,college,city from student where fname like '%"+data+"%' OR college like '%"+data+"%' ";
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				
				
				Student s =new  Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setCollege(rs.getString("college"));
				s.setCity(rs.getString("city"));
				
				
				slist.add(s);			
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		

		return slist;
	}

	@Override
	public Student getStudentById(int id) {
		
		Student s = new Student();


		String sql = "select * from student";
		
		try {
			Statement stm = DB.getConnection().createStatement();
			ResultSet rs  =  stm.executeQuery(sql);
			
			while(rs.next()) {
				
				
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setAge(rs.getInt("age"));
				s.setCity(rs.getString("city"));
				s.setCountry(rs.getString("country"));
				s.setEmail(rs.getString("email"));
				s.setFaculty(rs.getString("faculty"));
				s.setState(rs.getString("state"));
				s.setDob(rs.getDate("dob"));
				s.setGender(rs.getString("gender"));
				s.setCollege(rs.getString("college"));
				s.setRollno(rs.getInt("rollno"));
				s.setPhone(rs.getString("phone"));
				
			
				
			}
			
		} catch (SQLException e) {
					
			e.printStackTrace();
		}
		
		
		
		return s;
	}

	@Override
	public boolean submitStudent(Student singup) {
	
		String sql = "insert into singup(fname, lname, userName,password)values(?,?,?,?)";
		
		
		try {
			PreparedStatement pstm = DB.getConnection().prepareStatement(sql);
			
			pstm.setString(1, singup.getFname());
			pstm.setString(2, singup.getLname());
			pstm.setString(3, singup.getUserName());
			pstm.setString(4, singup.getPassword());
			
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean loginStudent(String userName, String password) {
		
		
		
		
		return false;
	}

}
