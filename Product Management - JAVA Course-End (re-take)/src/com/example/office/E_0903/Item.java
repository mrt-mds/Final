/**
 * 
 */
/**
 * @author mariz.salinas
 *
 */
package com.example.office.E_0903;

public abstract class Item {

	static int count;
	int itemCode;
	String title;
	int price, stock;

	public Item(String title, int price, int stock) {
		this.title = title;
		this.price = price; // no getTotal method pa
		this.stock = stock;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPrice(double price) {
		this.setPrice(price);
	}

	public int getItemCode() {
		return itemCode;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public static int getCount() {
		// if(count == Setting.SHELFSIZE){
		// System.out.print("Stop");
		// }
		// count++;
		// return count;
	}

	public abstract void printItemProperty();

	public void printInfo() {
		// System.out.println("Item Code: " + getCount());
		// System.out.println("Item Name: " + this.title);
		// System.out.println("Price: " + this.price);
		// System.out.println("Tax Amount: " + this.getTax());
		// System.out.println("Inventory: " + this.stock);
	}

}