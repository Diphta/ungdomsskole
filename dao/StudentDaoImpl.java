/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import naestvedundgomsskole.Student;

/**
 *
 * @author philip
 */
public class StudentDaoImpl {
    ArrayList<Student> students;
    
    public StudentDaoImpl() {
        students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
    }
    
    public ArrayList<Student> getAllStudents() {
        return students;
    }
    
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }
    
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
    }
}
