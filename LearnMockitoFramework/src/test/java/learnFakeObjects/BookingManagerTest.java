package learnFakeObjects;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookingManagerTest {

	@Mock
	HotelService hotelSerMock;
	@InjectMocks
	BookingManager bookingManager;
	List<String> availableRooms;
	@Before // executes before every @Test method
	public void setup() throws SQLException {
		// hotelSerMock = mock(HotelService.class);
		// bookingManager = new BookingManager(hotelSerMock);
		availableRooms = Arrays.asList("A", "C", "F", "G", "T");
	}

	@Test
	public void checkAvailableRoomsTrue() throws SQLException {
		when(hotelSerMock.fetchAvailableRooms()).thenReturn(availableRooms);
		assertTrue(bookingManager.checkRoomAvailability("A"));
		
	}

	/*
	 * @Test public void checkAvailableRoomsfALSE() throws SQLException {
	 * 
	 * when(hotelSerMock.fetchAvailableRooms()).thenReturn(availableRooms);
	 * assertTrue(bookingManager.checkRoomAvailability("B")); }
	 * 
	 * @Test public void checkAvailableRooms() throws SQLException {
	 * 
	 * when(hotelSerMock.fetchAvailableRooms()).thenReturn(availableRooms);
	 * assertTrue(bookingManager.checkRoomAvailability("R")); }
	 */

}
