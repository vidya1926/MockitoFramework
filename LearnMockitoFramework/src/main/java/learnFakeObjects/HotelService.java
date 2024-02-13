package learnFakeObjects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelService {

    public List<String> fetchAvailableRooms() throws SQLException {
        List<String> availableRooms = new ArrayList<String>();
        Connection conn = DriverManager.getConnection("DATABASE_URL");
        Statement statement = conn.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM ROOMS WHERE AVAILABLE like '1'");
        while(rs.next()){
            availableRooms.add(rs.getString("Room name"));
        }
        return availableRooms;
    }
    
    protected List<String> roomsDetails() throws SQLException {
    	 List<String> availableRooms = new ArrayList<String>();
         Connection conn = DriverManager.getConnection("DATABASE_URL");
         Statement statement = conn.createStatement();
         ResultSet rs;
         rs = statement.executeQuery("SELECT * FROM ROOMS");
         while(rs.next()){
             availableRooms.add(rs.getString("Room name"));
         }
         return availableRooms;
     }
    
    
    private void callMethod() {
    	System.out.println("Method with private access modifier");
    }
    
      
    
  
    }
    

