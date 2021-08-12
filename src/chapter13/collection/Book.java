package chapter13.collection;

public class Book implements Comparable<Book> {

	private String title;
	private String author;
	private Integer edition;

	public Book() {
		super();
	}

	public Book(String title, String author, Integer edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("'");
		sb.append(title);
		sb.append("'");
		sb.append(" von ");
		sb.append(author);
		sb.append(", Auflage ");
		sb.append(edition);
		sb.append(" St�ck");

		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((edition == null) ? 0 : edition.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (edition == null) {
			if (other.edition != null)
				return false;
		} else if (!edition.equals(other.edition))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book obj) {
		final int LESS = -1;
		final int EQUAL = 0;
		final int GREATER = 1;

		// Wenn obj null ist oder nicht vom gleichen Typ,
		// so ist keine inhaltliche Pr�fung m�glich
		if (obj == null || this.getClass() != obj.getClass()) {
			return LESS;
		}

		// Wenn obj auf das gleiche Objekt zeigt,
		// dann ist die inhaltliche Pr�fung nicht notwendig
		if (this == obj) {
			return EQUAL;
		}

		// Die inhaltliche Pr�fung soll in folgender Reihenfolge
		// gemacht werden: titel, author, edition
		int result;

		result = this.title.compareTo(obj.title);
		if (result != EQUAL) {
			return result;
		}

		result = this.author.compareTo(obj.author);
		if (result != EQUAL) {
			return result;
		}

		if (this.edition < obj.edition) {
			return LESS;
		}

		if (this.edition > obj.edition) {
			return GREATER;
		}

		// Alle Felder sind gleich.
		return EQUAL;
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

	public Integer getEdition() {
		return edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}

}
