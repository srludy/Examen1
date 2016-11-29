import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		float lado=pideDato();
		calculaPerimetro(lado);
		calculaArea(lado);
	}
	public static float pideDato(){
		Scanner sc= new Scanner(System.in);
		
		float lado = sc.nextFloat();
		
		return lado;
	}
	
	public static void calculaPerimetro(float lado){
	
	
	float perimetro = lado+lado+lado;
	
	
	System.out.println(perimetro);
	
	}

	public static void calculaArea (float lado){
	
	float area = (float)(Math.sqrt(3)/4*Math.pow(lado,2));
		
		System.out.println(area);
	
	}
}
