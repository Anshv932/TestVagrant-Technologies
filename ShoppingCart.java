package project;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	public static List<Item> item = new ArrayList<>();
	
	static{
		item.add(new Item("Leather Wallet", 1100, 18 , 1));
		item.add(new Item("Umbrella", 900, 12 , 2));
		item.add(new Item("Cigarette", 200, 18 , 3));
		item.add(new Item("Honey", 100, 0 , 4));
	}
	
	public double totalCost() {
		double totalPrice=0;
		for(Item i : item) {
		   double price = (double) i.getUnitPrice() -calculateGst(i) - discount(i) ;
		   price=price* i.getQty();
		   totalPrice+=price;
		}
		return totalPrice;
	}
	
	private double calculateGst(Item i) {
		return (double) i.getUnitPrice() * ((double) i.getGst() /100);
	}
	private double discount(Item i) {
		if(i.getUnitPrice()>500) {
			return i.getUnitPrice()* 0.05;
		}
		return 0;
	}
	
	public Item maxGst() {
		Item maxGstItem=null;
		double maxGst=0;
		for(Item i : item) {
			double gst= (double) i.getUnitPrice() * ((double) i.getGst() /100);
			if(gst > maxGst) {
				maxGstItem=i;
			}
		}
		return maxGstItem;
	}
	
	public static void addItem(Item i) {
		item.add(i);
	}
	
}
