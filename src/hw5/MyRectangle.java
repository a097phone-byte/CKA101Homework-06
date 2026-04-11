package hw5;

public class MyRectangle {

	private double width;
	private double depth;

	// setter 將收到的引數指定給width屬性
	public void setWidth(double width) {
		this.width = width;
	}

	// setter 將收到的引數指定給depth屬性
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	// getter 能計算該長方形的面積
	public double getArea() {
		return width * depth;
	}

	// 建構子:不帶參數也無內容的建構子
	public MyRectangle() {
	}
	
	// 建構子:傳入的兩個引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	


}
