package models;

public class Client {
	
	/// Attribute
	
	private String name;	
	private String lastName;
	private String nId;
	private boolean hasChildren;
	
	//constructor
	
	public Client(String name, String lastName, String nId, boolean hasChildren   ) {
		
		this.name = name;
		this.lastName = lastName;
		this.nId = nId;
		this.hasChildren = hasChildren;
		
	}
	
	/// Methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLastName (String lastNamee) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setnId(String nId) {
		this.nId = nId;
	}
	
	public String getnId() {
		return nId;
	}
	
	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}
	
	public boolean getHasChildren() {
		return hasChildren;
	}
	

}
