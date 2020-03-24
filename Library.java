//------------------------------------------------------------------------------
//A Library object represents an item in the library that has an item number and
//a title.

public abstract class Library {

	//Fields:
	private int itemNumber;
	private String title;
	private boolean checkedIn;
	private boolean reserved;
	private boolean overdue;
	private int daysLate;
	
	//Constructor:
	public Library(int itemNumber, String title) {
		this.itemNumber = itemNumber;
		this.title = title;
	}
	
	//Getters:
	public int getItemNumber() {
		return itemNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getDaysLate() {
		return daysLate;
	}
	
	//Setters:
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setReserved (boolean reserved) {
		this.reserved = true;
	}
	
	public void setOverdue(boolean overdue) {
		this.overdue = true;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}
	
	//Methods:
	//Is the item checked in?
	public boolean checkedIn() {
		return checkedIn = true;
	}
	
	//Is the item reserved?
	public boolean reserved() {
		return reserved;		
	}
	
	//Is the item overdue?
	public boolean overdue() {
		return overdue;
	}
	
	//Check-out an item
	public boolean checkOut() {
		return this.checkedIn = false;
	}

	//Check-in an item
	public boolean checkIn() {
		return this.checkedIn = true;
	}
	
	//Check on the state of an item
	public String returnState() {
		String state = "";
		if (this.checkedIn == true) {
			state = "checked-in";
		}if (this.overdue == true) {
			state = "overdue";
		}if (this.reserved == true) {
			state = "reserved";
		}else state = "checked-out";
		return state;
	}
	
	//Calculate fines accrued.
	public double fineAccrued() {
		return getDaysLate() * 0.50;
	}

	//Abstract methods	
	//Returns the number of days an item can be checked out.
	public abstract int checkOutPeriod();
	
	//Returns a String via toString.
	public abstract String toString();

}