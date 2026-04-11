package hw5;

public class InkBrush extends Pen{
	
	// 呼叫父類別建構子
	public InkBrush(String brand, double price) {
		super(brand,price);
	}
	
	// 實作 write()
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	// override 售價
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
	
}
