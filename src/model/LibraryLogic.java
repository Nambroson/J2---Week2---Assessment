package model;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class LibraryLogic {
	
	public boolean inStock(Library library) {
		boolean bookAvailable;
		int outOfStock = 0;
		
		if (library.getInStock() > outOfStock) {
			bookAvailable = true;
		}else {
			bookAvailable = false;
		}
		
		return bookAvailable;
	}
	
	public String titleDisplay(Library library) {
		return library.getTitle();
	}

}
