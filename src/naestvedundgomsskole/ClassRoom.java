
package naestvedundgomsskole;

import java.util.ArrayList;

/**
 *
 * @author Tanja
 */
public class ClassRoom {
    private String roomName;
    private ArrayList<Course> course;
    
    
    public ClassRoom(String roomName) {
        this.roomName = roomName;
        this.course = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    
}
