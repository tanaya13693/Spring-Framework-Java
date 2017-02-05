package springConstructor;

public class Products {
	private int id;  
	private String name;
	private float price;
  
	public Products() 
	{
		System.out.println("No product update");
	}  
  
	public Products(int id) 
	{
		this.id = id;
	}  
  
	public Products(String name) 
	{  
		this.name = name;
	}  
  
	public Products(float price) 
	{
		this.price = price;
	}
	
	public Products(int id, String name, float price) 
	{  
		this.id = id;  
		this.name = name;  
		this.price = price;
	}  
  
	void display()
	{  
		System.out.println(id+" "+name+" "+price);  
	}  
}  