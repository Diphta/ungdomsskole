
package naestvedundgomsskole;

/**
 *
 * @author Tanja
 */
public class Course {
    private int weekday;
    private String courseName;

    public Course(int weekday, String courseName) {
        this.weekday = weekday;
        this.courseName = courseName;
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
    
    
    
    
    
    public void ageRestriction() {
        //Her vil vi gerne lave noget kode der gør at man skal være mindst 15 år
        //for at tage knallert kørekort
    }
}
