package models;

public class Recipe {
	
	//atribute
	
	private String name;
	private int price;
	
	//constructor
	
	public Recipe(String name, int price ){
		this.name = name;
		this.price = price;
	}
	
	//Method
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
