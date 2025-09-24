package Main;

import java.util.Scanner;

import Model.Book;
import Model.bookservice;

public class Main {

	public final static bookservice services=new bookservice();

	public static void Addbooks()
	{
		services.addBook(new Book("Chava", "Shivaji Sawant", 1000, 900));
		services.addBook(new Book("Atomic Habbits", "james ", 500, 300));
		services.addBook(new Book("Atom", "james ", 500, 300));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int choice;
		Addbooks();
		do {
			System.out.println("\n===== Book Management System =====");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Update Book Price");
			System.out.println("4. Display All Books");
			System.out.println("5. Display Specific Book");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1 -> {
				System.out.print("Enter Book Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Author Name: ");
				String author = sc.nextLine();
				System.out.print("Enter Pages: ");
				int pages = sc.nextInt();
				System.out.print("Enter Price: ");
				int price = sc.nextInt();
				sc.nextLine(); 
				services.addBook(new Book(name, author, pages, price));
				System.out.println(" Book added successfully!");
			}
			case 2 -> {
				System.out.print("Enter the Book Name to remove: ");
				String name = sc.nextLine();
				services.removeBook(name);
			}
			case 3 -> {
				System.out.print("Enter the book name: ");
				String bookName = sc.nextLine();
				System.out.print("Enter new Book Price: ");
				int price = sc.nextInt();
				services.update(bookName, price);
				
			}
			case 4 -> {
				System.out.println(" All Books:");
				services.DisplayAll().forEach(System.out::println);
			}
			case 5 -> {
				System.out.print("Enter book Name: ");
				String bkName = sc.nextLine();
				services.Display(bkName);
			}
			case 6 -> {
				System.out.println(" Exiting... Thank you!");
			}
			default -> System.out.println(" Invalid choice!");
			}
		}while(choice!=6);
		
	}

}
