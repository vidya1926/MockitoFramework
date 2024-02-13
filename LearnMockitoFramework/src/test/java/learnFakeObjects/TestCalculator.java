package learnFakeObjects;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class TestCalculator {

	@Mock
	CalService mock;
	@InjectMocks
	Calculator c;
	
	@Test
	public void test() {		
		
		when(mock.inputX()).thenReturn(10);
		when(mock.inputY()).thenReturn(10);

		assertEquals(20,c.add());
		
	}

}
