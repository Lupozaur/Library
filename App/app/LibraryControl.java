package app;

import utils.DataReader;
import data.Book;
import data.Library;
import data.Magazine;

public class LibraryControl {

	
	// zmienna do komunikacji z użytkownikiem
	private DataReader dataReader;

	// "biblioteka" przechowujaca dane
	private Library library;

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();

	}
	/*
	 * Glowna petla programu, ktora pozwala na wybor opcji i interakcje
	 */

	public void controlLoop() {
		Option option;
		printOptions();
		while ((option = Option.createFromInt(dataReader.getInt())) != Option.EXIT) {
			switch (option) {
			case ADD_BOOK:
				addBook();
				break;
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case PRINT_BOOKS:
				printBooks();
				break;
			case PRINT_MAGAZINES:
				printMagazine();
				break;
			case EXIT:
				System.out.println("Zamykam progam!");
				break;
			}
			printOptions();
		}
		// zamykam strumien wejscia
		dataReader.close();
	}

	private void printOptions() {
		System.out.println("Wybierz opcje");
		for(Option o : Option.values())
			System.out.println(o);
	}

	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void printBooks() {
		library.printBooks();
	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	private void printMagazine() {
		library.printMagazines();
	}

}
