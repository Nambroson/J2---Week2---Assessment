package model;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Sep 14, 2021
 */
public class Library {
	
	private String title;
	private int pages;
	private int inStock;
	
	public Library() {
	}
	
	public Library(String title) {
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}


	

}
