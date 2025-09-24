package Model;

import java.util.List;
import java.util.ArrayList;

public class bookservice {

	private List<Book> booklist;

	public bookservice()
	{
		booklist = new ArrayList<Book>();
	}

	
	public void addBook(Book book)
	{
		if(book!=null)
		{
			booklist.add(book);
			return ;
		}
		else {
			System.out.println("Book Data Not Found ..");
		}
	}
	
	
	public void removeBook(String title)
	{
		for(Book book:booklist)
		{
			if(book.getTitle().equalsIgnoreCase(title))
			{
				booklist.remove(book);
				System.out.println(book);
				System.out.println("Book Remove Succesfully");
				return;
			}
		}
		System.out.println("Book not remove try again.. ");
	}
	
	
	public List<Book> DisplayAll()
	{
		return booklist;
	}
	
	
	public void Display(String bkName)
	{
		for(Book book:booklist)
		{
			if(book.getTitle().equalsIgnoreCase(bkName))
			{
				System.out.println(book);
				return;
			}
		}
		System.out.println("Book Not Found ....");	
	}

	public void update(String BookName, int price)
	{
		for(Book book:booklist)
		{
			if(book.getTitle().equalsIgnoreCase(BookName))
			{
				book.setPrice(price);
				System.out.println("Price change succesfully ..");
				System.out.println("New Book Price"+price+" :rs");
				System.out.println(book);
				return;
			}
			System.out.println("price not Change Please try Again");
			}
	}

}
