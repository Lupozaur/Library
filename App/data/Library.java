package data;

public class Library {

	public final static int MAX_PUBLICATIONS = 2000;
	private Publication[] publications;
	private int publicationsNumber;

	public Publication[] getPublications() {
		return publications;
	}

	public int getPublicationsNumber() {
		return publicationsNumber;
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

	private void addPublication(Publication pub) throws ArrayIndexOutOfBoundsException {
		if (publicationsNumber == MAX_PUBLICATIONS) {
			throw new ArrayIndexOutOfBoundsException("MAX_PUBLICATIONS " + MAX_PUBLICATIONS);
		}
		publications[publicationsNumber] = pub;
		publicationsNumber++;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < publicationsNumber; i++) {
			builder.append(publications[i]);
			builder.append("\n");
		}
		return builder.toString();
	}
}