package learnFakeObjects;
import java.sql.SQLException;
import java.util.List;

public class BookingManager {

    private HotelService service;

    public BookingManager(HotelService service) {
        this.service = service;
    }

    public boolean checkRoomAvailability(String roomName) throws SQLException {

        List<String> roomsAvailable = service.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }

}