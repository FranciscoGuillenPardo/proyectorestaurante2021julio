package models;

public class Table {
	
	//atribute
	
	private String number;
	private int capacity;
	private String location;
	
	//constructor
	
	public Table( String number, int capacity, String location ){
		
		this.number = number;
		this.capacity = capacity;
		this.location = location;
		
	}
	
	//method
	
	public void setNumber(String number) {
		
		this.number = number;
				
	}
	
	public String getNumber() {
		
		return number;
	}
	
	public void setCapacity (int capacity) {
		
		this.capacity = capacity;
	}
	
	public int getCapacity () {
		
		return capacity;
	}
	
	public void setLocation( String location) {
		
		this.location = location;
	}
	
	public String getLocation () {
		
		return location;
		
	}
	
}
