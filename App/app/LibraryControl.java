package app;

import utils.DataReader;
import data.Book;
import data.Library;
import data.Magazine;

public class LibraryControl {

	// zmienne do kontrolowania programu
	public static final int EXIT = 0;
	public static final int ADD_BOOK = 1;
	public static final int ADD_MAGAZINE = 2;
	public static final int PRINT_BOOKS = 3;
	public static final int PRINT_MAGAZINE = 4;

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
		int options;
		printOptions();
		while ((options = dataReader.getInt()) != EXIT) {
			switch (options) {
			case ADD_BOOK:
				addBook();
				break;
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case PRINT_BOOKS:
				printBooks();
				break;
			case PRINT_MAGAZINE:
				printMagazine();
				break;
			case EXIT:
				System.out.println("Zamykam progam!");
				break;
			default:
				System.out.println("Nie ma takiej opcji.");
			}
			printOptions();
		}
		// zamykam strumien wejscia
		dataReader.close();
	}

	private void printOptions() {
		System.out.println("Wybierz opcje");
		System.out.println(EXIT + " - wyjscie z programu");
		System.out.println(ADD_BOOK + " - dodaj książke");
		System.out.println(ADD_MAGAZINE + " - dodaj magazyn");
		System.out.println(PRINT_BOOKS + " - wyswietl dostepne książki");
		System.out.println(PRINT_MAGAZINE + " - wyswietl dostepne ksiazki");
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
