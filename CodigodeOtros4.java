//Este programa es un juego de dos jugadores (2 input) y una salida
//¨Piedra papel o tijera 

//Reglas 
//Piedra gana Tijera, Tiejera gana Papel, Papel gana Piedra

package CodigodeOtros4;
import java.util.Scanner;

public class cod4 {

	//NO habia un metodo principal - Se agrego 
	public static void main(String[] args) {
		
		//Faltaba System.in
		 Scanner s = new Scanner(System.in);
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine();
		    
		    
		    //Faltaba cambiar a jugador 2
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		    
		    //Esta linea de codigo es innecesaria porque se puede usar el mismo Scanner
		    //Scanner s2 = new Scanner();
		    String j2 = s.nextLine();
		    
		    //Se debe utilizar Equals para comparar los valores
		    //Ninguno debe llevar " == "
		    if (j1.equals(j2)) {
		      System.out.println("Empate");
		    } else {
		      int g = 2; //Por defecto, gana el jugador 2, es un problema porque si el jugador 1 coloca cualquier cosa distinta gana el dos. 
		      // Por otro lado si el jugador coloca cualquier valor distinto de t, p, p ganara por dafault.
		      switch(j1) {
		        case "piedra":
		          if (j2.equals("tijeras")) {
		            g = 1;
		          }
		          break;//Faltaban los breaks
		        case "papel":
		          if (j2.equals("piedra")) {
		            g = 1;
		          } //Aqui no estaba bien cerrado el corchete
		          break; //Faltaban los breaks
		        case "tijera":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          break;//Faltaban los breaks
		        default:
		      }
		      System.out.println("Gana el jugador " + g);
		
		    }
	 }
}