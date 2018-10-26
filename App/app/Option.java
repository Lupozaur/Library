package app;

public enum Option {

	EXIT(0, "Wyjście z programu"),
	ADD_BOOK(1, "Dodanie książki"),
	ADD_MAGAZINE(2, "Dodanie książki"),
	PRINT_BOOKS(3, "Wyświetlanie dostępnych książek"),
	PRINT_MAGAZINES(4, "Wyświetlanie dostępnych czasopism");
	
	private int value;
	private String description;
	
	public int getValue() {
		return value;
	}
	
	public String getDescription() {
		return description;
	}
	
	Option(int value, String description){
		this.value = value;
		this.description = description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value + " - " + description;
	}
	
	public static Option createFromInt(int option) {
		return Option.values()[option];
	}
}
