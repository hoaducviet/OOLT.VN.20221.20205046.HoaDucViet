import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;  // Numbers max of cart
	private float totalcost = 0;  //Price of cart
	ArrayList<DigitalVideoDisc> itemsOderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);	// Arraylist lưu danh sách các đĩa DVD trong giỏ hàng 
	public int qtyOrdered = 0;  // numbers DVD in cart
	
	//Remove 1 dvd from cart
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOderedList.size();
	}
	
	// Add 1 dvd to cart
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		//If not max, add
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOderedList.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");
			qtyOrdered = itemsOderedList.size();
		}
		// If max, print
		else System.out.println("The cart is almost full");
	}
	
	//Sum price dvd in cart
	public float totalCost() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
			totalcost += itemsOderedList.get(i).getCost();
		}
		return totalcost;
	}
}
