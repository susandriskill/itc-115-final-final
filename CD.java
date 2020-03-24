//------------------------------------------------------------------------------
//A CD represents a CD in the library with an item number, a title, an artist,
//an album, and a 
//director, and a distribution year.

public class CD extends Library {
	
	//Fields:
	//Additional Fields:
	private String artist;
	private String releaseDate;
	
	//Constructor:
	public CD (int itemNumber, String title, String artist, String releaseDate) {
		super(itemNumber, title);
		this.artist = artist;
		this.releaseDate = releaseDate;
	}
	
	public int checkOutPeriod() {
		return 14;
	}
	
	@Override
	public String toString() {
		return "The CD \"" + getTitle() + "\" by " + artist + " was released on "
				+ releaseDate + ". \nIts check-out period is " + checkOutPeriod()
				+ " days. \nIt is currently " + returnState() + ".";
		}
}
