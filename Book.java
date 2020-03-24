//------------------------------------------------------------------------------
//A Book represents a book in the library with an item number, a title, an
//author, a publisher, and a year published.

public class Book extends Library {

	//Fields:
	//Additional Fields:
	private String author;
	private String publisher;
	private int yearPublished;

	//Constructor:
	public Book(int itemNumber, String title, String author, String publisher, 
			int yearPublished) {
		super(itemNumber, title);
		this.author = author;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
	}

	public int checkOutPeriod() {
		return 28;
	}
	
	@Override
	public String toString() {
		return "The book \"" + getTitle() + "\" by " + author + " was published in "
				+ yearPublished + " by " + publisher + ". \nIts check-out period " +
				"is " + checkOutPeriod() + " days. \nIt is currently " + returnState()
				+ ".";
	}

}
