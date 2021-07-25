package ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {

	public static void main(String[] args) {
		System.out.println("\nInicio de Programa");
				
		System.out.println("\n*****Ingero de clientes*****");	
		
		Client newClient = new Client("Diego","Molina","111111",true);		
		System.out.println("\nEl nuevo cliente es: " + newClient.getName()+ " "+ newClient.getLastName());		
		newClient.setName("Andres");		
		System.out.println("\nEl nuevo cliente es: " + newClient.getName()+ " "+ newClient.getLastName());	
		newClient.setHasChildren(true);
		System.out.println("\nEl cliente tiene hijos (true/false)"  + newClient.getHasChildren());
		
		Client newClient2 =  new Client ("Francisco","Guillen","22222", false );
		System.out.println("\nEl segundo Cliente es: "+ newClient2.getName()+ " "+ newClient2.getLastName()+" "+ "Cedula:"+ newClient2.getnId() );
		
		Client newClient3 = new Client ("Andres","Rojas","33333", false);
		System.out.println("\nEl tercer Cliente es: "+ newClient3.getName()+ " "+ newClient3.getLastName()+" "+ "Cedula:"+ newClient3.getnId());
		
		System.out.println("\nCambio de cedula del Cliente 2: ");
		newClient2.setnId("444444");
		System.out.println("\nEl segundo Cliente es: "+ newClient2.getName()+ " "+ newClient2.getLastName()+" "+ "Cedula:"+ newClient2.getnId() );

		System.out.println("\nCambio de cedula del Cliente 3: ");
		newClient3.setnId("55555");
		System.out.println("\nEl segundo Cliente es: "+ newClient3.getName()+ " "+ newClient3.getLastName()+" "+ "Cedula:"+ newClient3.getnId() );
		
		
		System.out.println("\n*****Ingero de Podcutos***** ");		
		Product newProduc = new Product("Diana", "Arroz" ,  1200 , 10 );
		System.out.println("\n*****PRODUCTO 1******" + "\nMarca: "+ newProduc.getBrand()+   "\nTipo: " + newProduc.getName() + "\nPrecio: " + newProduc.getPrice()+ " \nCantidad: " + newProduc.getQuantity());		
		Product newProduc2 = new Product("Jep", "Chocoatina" ,  1700 , 20 );
		System.out.println("\n*****PRODUCTO 2******" + "\nMarca: "+ newProduc2.getBrand()+   "\nTipo: " + newProduc2.getName() + "\nPrecio: " + newProduc2.getPrice()+ " \nCantidad: " + newProduc2.getQuantity());		
		Product newProduc3 = new Product("Colanta", "Leche" ,  3400 , 50 );
		System.out.println("\n*****PRODUCTO 3******" + "\nMarca: "+ newProduc3.getBrand()+   "\nTipo: " + newProduc3.getName() + "\nPrecio: " + newProduc3.getPrice()+ " \nCantidad: " + newProduc3.getQuantity());		
		
		System.out.println("\n*****Menu*****");
		Recipe newRecipe = new Recipe( "Bandeja Paisa" , 25000 );
		System.out.println("\n*****Menu 1******" + "\nNombre: " + newRecipe.getName()+ "\nPrecio: " + newRecipe.getPrice());
		Recipe newRecipe2 = new Recipe( "Sancocho de Pollo" , 20000 );
		System.out.println("\n*****Menu 2******" + "\nNombre: " + newRecipe2.getName()+ "\nPrecio: " + newRecipe2.getPrice());
		Recipe newRecipe3 = new Recipe( "Pescado Frito" , 30000 );
		System.out.println("\n*****Menu 3******" + "\nNombre: " + newRecipe3.getName()+ "\nPrecio: " + newRecipe3.getPrice());
		
		System.out.println("\nMesas: ");
		Table newTable = new Table("Mesa 1:", 5, "VIP");
		System.out.println(newTable.getNumber()+ "\nSu capacidad es: " + newTable.getCapacity() + "\nLa Zona es: " + newTable.getLocation());
		Table newTable2 = new Table("Mesa 2:", 20, "Media");
		System.out.println(newTable2.getNumber()+ "\nSu capacidad es: " + newTable2.getCapacity() + "\nLa Zona es: " + newTable2.getLocation());
		Table newTable3 = new Table("Mesa 3:", 50, "Alta");
		System.out.println(newTable3.getNumber()+ "\nSu capacidad es: " + newTable3.getCapacity() + "\nLa Zona es: " + newTable3.getLocation());

		System.out.println("\n******Cambios En Productos******");		
		newProduc.setPrice(2000);
		System.out.println("\n*****PRODUCTO 1******" + "\nMarca: "+ newProduc.getBrand()+   "\nTipo: " + newProduc.getName() + "\nPrecio: " + newProduc.getPrice()+ " \nCantidad: " + newProduc.getQuantity());		
		
		System.out.println("\n******Cambios En Recetas******");		
		newRecipe.setName("Sanchollo de Gallina");
		newRecipe.setPrice(40000);
		System.out.println("\n*****Menu 1******" + "\nNombre: " + newRecipe.getName()+ "\nPrecio: " + newRecipe.getPrice());

		System.out.println("\n******Cambios En Las Mesas******");
		newTable3.setCapacity(70);
		System.out.println(newTable3.getNumber()+ "\nSu capacidad es: " + newTable3.getCapacity() + "\nLa Zona es: " + newTable3.getLocation());
		
		
		
		
	}

}

// 3 variables de caa clase : cliente/producto/receta/mesa
// Tarea, para el Martes en la mañana:
//Por cada una de las clases CLiente Producto Receta y Mesa, 
//crear 3 objetos nuevos imprimir sus valores en pantalla, y luego cambiar algun atributo con los metodos set 
//y volver a imprimir en pantalla para ver el cambio.