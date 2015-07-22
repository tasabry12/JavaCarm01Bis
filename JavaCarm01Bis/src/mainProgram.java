
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto p1 = new Punto();
		Punto p2 = new Punto();
	
		
		p1.x=2;
		p1.y=3;
		
		p2.x=4;
		p2.y=6;
		
		System.out.println("Punto 1: ("+p1.x+", "+p1.y+")");
		System.out.println("Punto 2: ("+p2.x+", "+p2.y+")");
		
		double distanza = distanzaTraDuePunti(p1.x, p2.x, p1.y, p2.y);
		
		System.out.println("Distanza tra due punti : " + distanza);


	}
	private static double distanzaTraDuePunti(double x1, double x2, double y1, double y2) {
		return  Math.sqrt(Math.pow(x1-x2 ,2)+Math.pow(y1-y2 ,2));
		
	}

}
