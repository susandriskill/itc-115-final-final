//------------------------------------------------------------------------------
//A Magazine represents a magazine in the library with an item number, a title,
//and a publication date.

public class Magazine extends Library {

	//Fields:
	//Additional Fields:
	private String publicationDate;
	
	//Constructor:
	public Magazine(int itemNumber, String title, String publicationDate) {
		super(itemNumber, title);
		this.publicationDate = publicationDate;
	}
	
	public int checkOutPeriod() {
		return 21;
	}
	
	@Override
	public String toString() {
		return "This issue of \"" + getTitle() + "\" magazine was published on "
				+ publicationDate + ". \nIts check-out period is " + checkOutPeriod() + 
				" days. \nIt is currently " + returnState() + ".";
	}

}