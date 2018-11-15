package data;

public class Library {
	public final static int MAX_PUBLICATIONS = 2000;
	private Publication[] publications;
	private int publicationsNumber;

	public Publication[] getPublications() {
		return publications;
	}

	public void setPublications(Publication[] publications) {
		this.publications = publications;
	}

	public int getPublicationsNumber() {
		return publicationsNumber;
	}

	public void setPublicationsNumber(int publicationsNumber) {
		this.publicationsNumber = publicationsNumber;
	}

	public Library() {
		publications = new Publication[MAX_PUBLICATIONS];
	}

	public void addBook(Book book) {
		addPublication(book);
	}

	public void addMagazine(Magazine magazine) {
		addPublication(magazine);
	}

	private void addPublication(Publication pub) {
		if (publicationsNumber < MAX_PUBLICATIONS) {
			publications[publicationsNumber] = pub;
			publicationsNumber++;
		} else {
			System.out.println("Maksymalna liczba publikacji została osiągnięta!");
		}

	}

	public void printBooks() {
		int countBooks = 0;
		for (int i = 0; i < publicationsNumber; i++) {
			if (publications[i] instanceof Book) {
				System.out.println(publications[i]);
				countBooks++;
			}
		}

		if (countBooks == 0)
			System.out.println("Brak książek w bibliotece");
	}

	public void printMagazines() {
		int countMagazines = 0;
		for (int i = 0; i < publicationsNumber; i++) {
			if (publications[i] instanceof Magazine) {
				System.out.println(publications[i]);
				countMagazines++;
			}
		}
		if (countMagazines == 0)
			System.out.println("Brak magazynów w bibliotece");
	}
}