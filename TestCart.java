package project;

public class TestCart {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		System.out.println("Max Gst : "+ cart.maxGst());
		
		System.out.println("Total Price paid :" + cart.totalCost());
		
		//To Add Item
		/*
		 * Item i = new Item("Shoes", 1200, 18 , 2)
		 * shoppingCart.addItem(i);
		 */
	}
}
