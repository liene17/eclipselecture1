class Book {
	String author;
	int pages;
	String title;

	Book() {
		this("", 100, "");
	}

	Book(String title) {
		this("Hemingvejs", 100, title);
		// "hello", 100, null
	}

	Book(String author, int pages, String title) {
		this.author = author;
		this.pages = pages;
		this.title = title;

		System.out.println("This is the book");

	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	int getPages() {
		return pages;
	}

	void setPages(int pages) {
		this.pages = pages;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "author:" + author + " pages:" + pages + " title:" + title;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Book book1 = new Book("Hello");
		System.out.println(book1.toString());

		Book book2 = new Book("Bye");
		System.out.println(book2.toString());

	}

}
