package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Library;
import model.LibraryLogic;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class TestLibrary2 {
	LibraryLogic libLogic = new LibraryLogic();
	Library library = new Library("Java for dummies");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTitleDisplay() {
		String bookTitle = "Java for dummies";
		assertEquals(bookTitle, library.getTitle());
	}
	
	@Test
	public void testTitleNotNull() {
		assertNotNull(library.getTitle());
	}

}
