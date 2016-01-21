
package naestvedundgomsskole;

/**
 *
 * @author Tanja
 */
public class Student {
    private String name;
    private int telephone;
    private int bYear;
    private String school;
    private String className;
    private String password;
    private String username;

    public Student(String name, int telephone, int bYear, String school, String className, String password, String username) {
        this.name = name;
        this.telephone = telephone;
        this.bYear = bYear;
        this.school = school;
        this.className = className;
        this.password = password;
        this.username = username;
    }
    
    public String getName() {
        return name;
    }
    public int getTelephone() {
        return telephone;
    }
}
