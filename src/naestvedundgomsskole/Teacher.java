
package naestvedundgomsskole;

import java.util.ArrayList;

/**
 *
 * @author Tanja
 */
public class Teacher {
    private String name;
    private ArrayList<Course> course;

    public Teacher(String name) {
        this.name = name;
        this.course = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
