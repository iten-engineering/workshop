package day3;

public class Book implements Comparable<Book> {

	private String title;
	private String author;
	private Integer edition;

	public Book(String title, String author, Integer edition) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
	}

	@Override
	public int compareTo(Book obj) {
		final int LESS = -1;
		final int EQUAL = 0;
		final int GREATER = 1;

		// Wenn obj null ist oder nicht vom gleichen Typ,
		// so ist keine inhaltliche Prüfung möglich
		if (obj == null || this.getClass() != obj.getClass()) {
			return LESS;
		}

		// Wenn obj auf das gleiche Objekt zeigt,
		// dann ist die inhaltliche Prüfung nicht notwendig
		if (this == obj) {
			return EQUAL;
		}

		// Die inhaltliche Prüfung soll in folgender Reihenfolge
		// gemacht werden: title, author und edition
		int result;

		result = this.title.compareTo(obj.title);
		if (result != EQUAL) {
			return result;
		}

		result = this.author.compareTo(obj.author);
		if (result != EQUAL) {
			return result;
		}

		result = this.edition.compareTo(obj.edition);
		if (result != EQUAL) {
			return result;
		}

		// Alle Felder sind gleich.
		return EQUAL;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();

		buf.append("'").append(title).append("'");
		buf.append(" von ").append(author);
		buf.append(", Auflage ").append(edition).append(" Stück");

		return buf.toString();
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
