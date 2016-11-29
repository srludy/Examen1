import java.util.Scanner;


public class examen {

	public static void main(String[] args) {
		
		juego();
		
		volver();
		
	}
	
	
	public static void juego (){
	String cadena = introduceCadena();
	comprobar(cadena);
	}
	
	public static String introduceCadena(){
	
		Scanner sc = new Scanner(System.in);
		
		String cadena = sc.nextLine();
		
		return cadena;
 }
	
	public static void comprobar(String cadena){
		Scanner sc = new Scanner(System.in);
		
		int numeroCaracteres = cadena.length();
		
		String cadenaPerDavant = "";
		
		String cadenaPerDarrere = "";
		
		String espacio = " ";
		
		char espacioChar = espacio.charAt(0);
		
		
				
			
		for (int i=0;i<numeroCaracteres;i++){
			
			if (cadena.charAt(i)!=espacioChar){


				char añadirLetra = cadena.charAt(i);
			
				cadenaPerDavant = cadenaPerDavant + añadirLetra;
				
			}
	
		}
			
		int numeroCaracteresNovaCadena = cadenaPerDavant.length();
		
		System.out.println(cadenaPerDavant);
		
		
		
		for (int r=numeroCaracteresNovaCadena-1;r!=-1;r--){
		
			cadenaPerDarrere = cadenaPerDarrere + cadenaPerDavant.charAt(r);
			
		
		
		}
			System.out.println(cadenaPerDarrere);
			
		if (cadenaPerDavant.equals(cadenaPerDarrere)){
			
			System.out.println("Son palindromos");
		}else{
			System.out.println("No son palindromos");
		}
	}
	
	public static void volver(){
		System.out.println("Quieres volver a jugar?, presiona (S) si es asi.");
		Scanner sc = new Scanner(System.in);
		String otraVez= sc.nextLine();
		if (otraVez.equalsIgnoreCase("s")){
		juego();
	}else{
		System.out.println("adios");
	}

}
	
}
