
public class Soda {
	//Fields
	private String brand;
	private double price;
	
	
	//Constructor
	public Soda(){}
	public Soda(String brand){
		this.brand = brand;
	}
	public Soda(String brand, double price){
		this.brand = brand;
		this.price = price;
	}
	//AM
	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}
	
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
		
	//Methods
	public String formatDecimal(float number) {
		  float epsilon = 0.004f; // 4 tenths of a cent
		  if (Math.abs(Math.round(number) - number) < epsilon) {
		     return String.format("%10.0f", number); // sdb
		  } else {
		     return String.format("%10.2f", number); // dj_segfault
		  }
		}
	
	//toString()
	@Override
	public String toString(){
		return brand ;
	}
}
