//------------------------------------------------------------------------------
//A DVD represents a DVD in the library with an item number, a title, a 
//director, and a release date.

public class DVD extends Library {

	//Fields:
	//Additional Fields:
	private String director;
	private String releaseDate;

	//Constructor:
	public DVD (int itemNumber, String title, String director, String releaseDate) {
		super(itemNumber, title);
		this.director = director;
		this.releaseDate = releaseDate;
	}

	public int checkOutPeriod() {
		return 7;
	}

	@Override
	public String toString() {
		return "The DVD \"" + getTitle() + "\" directed by " + director + " was " +
				"released on " + releaseDate + ". \nIts check-out period is " + 
				checkOutPeriod() + " days. \nIt is currently " + returnState() + ".";
	}
}