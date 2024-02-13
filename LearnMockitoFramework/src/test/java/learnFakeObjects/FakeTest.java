package learnFakeObjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class FakeTest {

	@Test
	public void test() {

		BookRepository fakeRepo = new FakeBookRepository();
		BookService bookSer = new BookService(fakeRepo);
		bookSer.addBook(new Book("234", "Learn Mockito From Scratch"));
		bookSer.addBook(new Book("12", "Learn Junit From Scratch"));
		bookSer.addBook(new Book("45", "Learn Mockito with Junit"));
		assertEquals(3, bookSer.noOfBook());

	}

}
