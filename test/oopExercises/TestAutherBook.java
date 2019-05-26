package oopExercises;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAutherBook {
	
	@Test
	
	public void testAuthor(){
		Author superman = new Author("Fahad", "durrani@gmail.com", 'm');
		
		assertEquals("Fahad", superman.getName());
		// System.out.println(superman.toString());
	}
	
	@Test
	
	public void testBook() {
		
		Author superman = new Author("Fahad", "durrani@gmail.com", 'm');
		Book myBook = new Book("Spiderman", superman, 33.30 );
		
		assertEquals("Fahad", superman.getName());
		assertEquals("Fahad", myBook.getAuthor().getName());
		
		assertEquals("Spiderman", myBook.getName());
		assertEquals( 33.30 , myBook.getPrice(), 0.0);
	}
	

}
