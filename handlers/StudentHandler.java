/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import dao.StudentDaoImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import naestvedundgomsskole.Student;

/**
 *
 * @author Tanja
 */
public class StudentHandler {
    private static StudentHandler instance;
    StudentDaoImpl listig;
    PreparedStatement prestm = null;
    
   
    
    private StudentHandler() {
        listig = new StudentDaoImpl();
    }
    
    public static StudentHandler getInstance() {
        if (instance == null) {
            instance = new StudentHandler();
        }
        return instance;
    }
    
    
        
        public void getStudentsDB() throws ClassNotFoundException, SQLException {
        String stmnt = "SELECT * FROM students;";
        
        prestm = DBHandler.getInstance().conn.prepareStatement(stmnt);
        ResultSet rs = prestm.executeQuery(stmnt);
        
        while (rs.next()) {
            Student student = new Student(rs.getInt("students.idstudent"), rs.getString("students.studentName"), rs.getInt("students.studentTlf"),
            rs.getInt("students.birthYear"), rs.getString("students.school"), rs.getString("students.className"),
            rs.getString("students.stPassword"), rs.getString("students.stUsername"));
            listig.addStudent(student);
            System.out.println(student.toString());
                    
        }
    }
    
    public void saveStudentDB (Student student) {
       String statement;
       statement = "INSERT INTO students (studentName, studentTlf, birthYear, school, className, stPassword, stUsername)"
               + " VALUES ( '" + student.getName()+
               "','" + student.getTelephone()+
               "','" + student.getbYear()+
               "','" + student.getSchool()+
               "','" + student.getClassName()+
               "','" + student.getPassword()+
               "','" + student.getUsername()+"')";
       
       try {
           DBHandler.getInstance().conn.createStatement().executeUpdate(statement);
       } catch (SQLException ex) {
           System.out.println(statement);
           System.out.println("SQLException" + ex.getMessage());
       }
             
    }
}
