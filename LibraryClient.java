//Client class to test the Library Item class


public class LibraryClient {
	
	public boolean checkOut() {
		return true;		
	}
	
	public static void main(String[] args) {
		
		//Test Book
		Book theHobbit = new Book(6552, "The Hobbit", "J.R.R. Tolkien", "Ballantine Books", 1937);
		theHobbit.setItemNumber(6552);
		theHobbit.setTitle("The Hobbit");
		System.out.println(theHobbit);
		System.out.println();
		
		//Test Magazine
		Magazine people = new Magazine(10227, "People", "June 18, 2018");
		people.setItemNumber(10227);
		people.setTitle("People");
		System.out.println(people);
		System.out.println();
		
		//Test DVD
		DVD youveGotMail = new DVD (128853, "You've Got Mail", "Nora Ephron", "December 18, 1998");
		youveGotMail.setItemNumber(128853);
		youveGotMail.setTitle("You've Got Mail");
		System.out.println(youveGotMail);
		System.out.println();
		
		//Test CD
		CD  jaggedLittlePill = new CD (1585010680, "Jagged Little Bill", "Alanis Morissette", "June 13, 1995");
		jaggedLittlePill.setItemNumber(1585010680);
		jaggedLittlePill.setTitle("Jagged Little Pill");
		System.out.println(jaggedLittlePill);
		System.out.println();
		
		//Reserve an item.
		youveGotMail.setReserved(true);
		System.out.println(youveGotMail);
		
		//Check-out an item.
		theHobbit.checkOut();		
		System.out.println();
		
		//Check-in an item and find the amount of the overdue fine
		theHobbit.checkIn();
		theHobbit.setDaysLate(10);
		System.out.println("This item is " + theHobbit.getDaysLate() + " day/s late. The fee is $" + String.format("%.2f", theHobbit.fineAccrued()));			
		}		
		
}