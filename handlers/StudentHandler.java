/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import dao.StudentDaoImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import naestvedundgomsskole.Student;

/**
 *
 * @author Tanja
 */
public class StudentHandler {
    private static StudentHandler instance;
    StudentDaoImpl listig;
    Connection conn;
    PreparedStatement prestm = null;
    
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String pswrd = "root";
    String schema = "/UngdomsskoleNaestved";
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    private StudentHandler() {
        try {
            connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("æv");
        } catch (SQLException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("øv");
        }
    }
    
    public static StudentHandler getInstance() {
        if (instance == null) {
            instance = new StudentHandler();
        }
        return instance;
    }
    
    public void connect() throws ClassNotFoundException, SQLException {
        try { 
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(url + schema, user, pswrd);
//        String stmnt = "SELECT * FROM students;";
//        
//        prestm = conn.prepareStatement(stmnt);
//        ResultSet rs = prestm.executeQuery(stmnt);
//        
//        while (rs.next()) {
//            Student student = new Student(rs.getInt("students.idstudent"), rs.getString("students.studentName"), rs.getInt("students.studentTlf"),
//            rs.getInt("students.birthYear"), rs.getString("students.school"), rs.getString("students.className"),
//            rs.getString("students.stPassword"), rs.getString("students.stUsername"));
//            listig.addStudent(student);
//                    
//        }
//        prestm.setInt(1, id);
//        prestm.setString(2, author);
//        int rowsUpdate = prestm.executeUpdate();
            //System.out.println("Data inserred - rows infected" + rowsUpdate + ".");
        
        
    } catch (SQLException e) {
    //TODO Auto-generate catch block
    e.printStackTrace();
    }
    }
}
