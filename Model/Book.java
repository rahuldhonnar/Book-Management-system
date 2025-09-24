package Model;

public class Book {
	
	private String title;
	private String author;
	private int noOfPages;
	private int price;
	
	public Book(String title, String author, int noOfPages, int price) {
		super();
		this.title = title;
		this.author = author;
		this.noOfPages = noOfPages;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", noOfPages=" + noOfPages + ", price=" + price + "]";
	}
	
	

}
