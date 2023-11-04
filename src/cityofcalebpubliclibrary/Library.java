package cityofcalebpubliclibrary;
import java.util.List;
public class Library {
    //staff
    //city, county, state, country --> address
    //activities
    //posters
    //rooms

    private List<Room> listOfRoom;

    public List<Room> getListOfRoom(){
        return this.listOfRoom;
    }

    public void setListOfRoom(List<Room> listOfRoom) {
        this.listOfRoom = listOfRoom;
    }

    public void addRoom(Room myRoom) {
        this.listOfRoom.add(myRoom);
    }



}
