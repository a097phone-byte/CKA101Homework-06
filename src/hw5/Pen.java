package hw5;

public abstract class Pen {
	
	// 宣告實體變數
	private String brand;
	private double price;
	
	// 無參數建構子
	public Pen() {
	}

	// 有參數建構子
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	// getter/setter
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// 抽象方法
	public abstract void write();
}
