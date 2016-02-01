
package naestvedundgomsskole;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanja
 */
public class Course {
    private int weekday;
    private String courseName;
    private ArrayList<Student> students;
    private Teacher teacher;
    private ClassRoom classRoom;
    private int spots = 20;

    public Course(int weekday, String courseName, Teacher teacher, ClassRoom classRoom) {
        this.weekday = weekday;
        this.courseName = courseName;
        students = new ArrayList<>();
        this.teacher = teacher;
        this.classRoom = classRoom;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String toString() {
        return courseName + "\t" + classRoom.getRoomName() + "\t" + teacher.getName();
    }
    
    public void addStudent(Student student) {
        if (students.size() >= spots) {
            System.out.println("Ikke flere pladser, spasser");
        } else {
            students.add(student);
            spots -= 1;
        }
    }

    public int getSpots() {
        return spots;
    }
    
    

    public ArrayList<Student> getStudents() {
        return students;
    }
    
    
    
    
    
    public void ageRestriction(int age) {
        
        //Her vil vi gerne lave noget kode der gør at man skal være mindst 15 år
        //for at tage knallert kørekort
    }
}
