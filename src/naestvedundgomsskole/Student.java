
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

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
