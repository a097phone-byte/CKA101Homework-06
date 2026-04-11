package hw5;

public class PenPoly {
	
	public static void main(String[] args) {
		Pen[] p = new Pen[2];
		
		p[0] = new Pencil("Pentel",100);
		p[1] = new InkBrush("Sennelier",770);
		
		for(int i = 0; i < p.length; i++) {
			System.out.print(p[i].getBrand());
			p[i].write();
			System.out.println("售價金額:"+ p[i].getPrice());
			System.out.println("=============");
		}
	}

}
