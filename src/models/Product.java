package models;

public class Product {
	
	/// Attributes
	
	private int quantity; //CamelCase ojo
	private String brand;
	private String name;	
	private double price;
	
	/// Constructor
	public Product(String brand, String name, double price, int quantity){
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
		
	/// Methods cosas que pueden hacer la clase ejemplo perro ladra los metodos son acciones
	/// setters / getters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
}

/*elementos de la vida real
 * arroz
 * frjoles
 * silla 
 * huevos
 */
