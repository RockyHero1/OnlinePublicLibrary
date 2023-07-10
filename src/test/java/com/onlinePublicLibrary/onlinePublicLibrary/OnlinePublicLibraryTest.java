package com.onlinePublicLibrary.onlinePublicLibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class OnlinePublicLibraryApplicationTests {

	ArrayList<Book> books = new ArrayList<Book>();


	@Test
	@DisplayName("Should be able to show all the books in the library")
	void showAllBooksInOnlinePublicLibrary(){

		Book book1 = new Book("Introduction To Java");
		Book book2 = new Book("Introduction To SpringBoot");
		books.add(book1);
		books.add(book2);

		OnlinePublicLibrary publicLibrary = new OnlinePublicLibrary(books);
		ArrayList<Book> booksInLibrary = publicLibrary.showAllBooks();
		Assertions.assertEquals(books, booksInLibrary);
	}

}
