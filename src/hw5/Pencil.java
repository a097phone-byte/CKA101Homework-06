package hw5;

public class Pencil extends Pen{
	
	// 呼叫父類別建構子
	public Pencil(String brand, double price) {
		super(brand,price);
	}
	
	// 實作 write()
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	// override 售價
	public double getPrice() {
		return super.getPrice() * 0.8;
	}
	
}
