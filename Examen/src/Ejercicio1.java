import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("CALENDARIO");
		superCalendario();
	}
	public static void superCalendario(){
		String Mes = pideMes();
		String Dia = pideDia();
		//muestraDiasSemana();
		calendario(Mes,Dia);
		verOtro();
	}
	public static String pideMes(){
		Scanner sc = new Scanner(System.in);
		 
		String mes;
		System.out.println("Introduce un mes");
		
		mes = sc.nextLine();
		
		if (!mes.equalsIgnoreCase("diciembre") && !mes.equalsIgnoreCase("noviembre") && !mes.equalsIgnoreCase("octubre") && !mes.equalsIgnoreCase("septiembre") && !mes.equalsIgnoreCase("agosto") && !mes.equalsIgnoreCase("julio") && !mes.equalsIgnoreCase("junio") && !mes.equalsIgnoreCase("mayo") && !mes.equalsIgnoreCase("abril") && !mes.equalsIgnoreCase("marzo") && !mes.equalsIgnoreCase("febrero") && !mes.equalsIgnoreCase("enero") )
		{
			System.out.println("Este mes no existe.");
			System.out.println("Introduce un mes");
			mes = sc.nextLine();
		}
		return mes;
		
		
	}
	public static String pideDia() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un dia por el que comienza");
		 
		String dia="";
		
		dia = sc.next();
		
		while (!dia.equalsIgnoreCase("lunes") && !dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miercoles") && !dia.equalsIgnoreCase("jueves") && !dia.equalsIgnoreCase("viernes") && !dia.equalsIgnoreCase("sabado") && !dia.equalsIgnoreCase("domingo") ){
			System.out.println("Este dia no existe.");
			System.out.println("Introduzca un dia por el que comienza");
			dia=sc.next();
		}
		
		return dia;
		
		
		
	}
	
	public static void muestraDiasSemana(){
		
		String diasSemana = ("DL DM DX DJ DV DS DG");
		System.out.println(diasSemana);
	}
	
	
	public static void calendario(String Mes, String Dia){
		int salto = 0;
		String cadenaNumeros = "";
		
		//Numero de dias del mes.
		int numMes=0;
		if (Mes.equalsIgnoreCase("enero")){
			numMes = 32;
		}
		if (Mes.equalsIgnoreCase("febrero")){
			numMes = 29;
		}
		if (Mes.equalsIgnoreCase("marzo")){
			numMes = 32;
		}
		if (Mes.equalsIgnoreCase("abril")){
			numMes = 31;
		}
		if (Mes.equalsIgnoreCase("mayo")){
			numMes = 32;
		}
		if (Mes.equalsIgnoreCase("junio")){
			numMes = 31;
		}
		if (Mes.equalsIgnoreCase("julio")){
			numMes = 32;
		}
		if (Mes.equalsIgnoreCase("agosto")){
			numMes = 32;
		}
		if (Mes.equalsIgnoreCase("septiembre")){
			numMes = 31;
		}
		if (Mes.equalsIgnoreCase("octubre")){
			numMes = 32;
		}
		if (Mes.equalsIgnoreCase("noviembre")){
			numMes = 31;
		}
		if (Mes.equalsIgnoreCase("diciembre")){
			numMes = 32;
		}
		
	
		
		
		// Separacion en el calendario de dias.
		if (Dia.equalsIgnoreCase("lunes")){
			salto = 0;
		}
		if (Dia.equalsIgnoreCase("martes")){
			salto = 1;
		}
		if (Dia.equalsIgnoreCase("miercoles")){
			salto = 2;
		}
		if (Dia.equalsIgnoreCase("jueves")){
			salto = 3;
		}
		if (Dia.equalsIgnoreCase("viernes")){
			salto = 4;
		}
		if (Dia.equalsIgnoreCase("sabado")){
			salto = 5;
		}
		if (Dia.equalsIgnoreCase("domingo")){
			salto = 6;
		}
		
		while(salto!=0){
			
			cadenaNumeros = cadenaNumeros + ("   ");
			salto -=1;
		}	
		
		
		for (int i = 1; i < numMes; i++){
			
			if (cadenaNumeros.length()==21 || cadenaNumeros.length()==44 || cadenaNumeros.length()==67 || cadenaNumeros.length()==90 || cadenaNumeros.length()==113){
				
				cadenaNumeros = cadenaNumeros +(" \n");
			}
			
			String pe = "";
			pe = pe +i;
			if (pe.length()==2){
				cadenaNumeros = cadenaNumeros + i+(" ");
			}else{
			cadenaNumeros = cadenaNumeros + i+("  ");
			}
			
		
		}
		System.out.println("calendario de "+ Mes.toUpperCase() +" que empieza por "+Dia.toUpperCase());
		muestraDiasSemana();
		System.out.println(cadenaNumeros);
		
	}
		
	public static void verOtro(){
	Scanner sc = new Scanner(System.in);

	String otraVez = "";
	
	System.out.println("¿Quieres ver otro calendario? pulsa (S) para SI, y cualquier otra para NO");
	
	otraVez = sc.nextLine();
	
	if (otraVez.equalsIgnoreCase("S")){
		superCalendario();
		}else{
			System.out.println("!ADIOS!");
		}
	}
}
