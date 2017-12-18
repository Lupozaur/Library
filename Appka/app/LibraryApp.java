package app;

public class LibraryApp {
	public static final String appName = "Biblioteka v0.8";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(appName);
		LibraryControl libContr = new LibraryControl();
		libContr.controlLoop();

	}

}
