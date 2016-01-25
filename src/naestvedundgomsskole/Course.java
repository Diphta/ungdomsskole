
package naestvedundgomsskole;

import java.util.ArrayList;

/**
 *
 * @author Tanja
 */
public class Course {
    private int weekday;
    private String courseName;
    private ArrayList<Student> student;
    private Teacher teacher;
    private ClassRoom classRoom;

    public Course(int weekday, String courseName, Teacher teacher, ClassRoom classRoom) {
        this.weekday = weekday;
        this.courseName = courseName;
        student = new ArrayList<>();
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
    
    
    
    
    
    public void ageRestriction(int age) {
        
        //Her vil vi gerne lave noget kode der gør at man skal være mindst 15 år
        //for at tage knallert kørekort
    }
}
