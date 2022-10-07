/*Crea un programa on l’usuari/ària introdueix tres notes i el programa calcula la mitja.
Si la mitja és inferior a 5 ha de mostrar el següent missatge per pantalla: “No has superat el curs. Has de recuperar”.
Si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat, però hauries de continuar practicant”.
Si la mitja és superior a 7 ha de mostrar: "Enhorabona! Has superat el curs! Passa ja al següent nivell!"
el segon paràmetre es una crida a un mètode
marksList.size()
aplques el mètode size() a la variable markLists
markLists es una llista? per poder aplicar-li el mètode size()?
a més és un paràmetre, estas definint que vols que t'enviin
vols que t'enviin un double amb el llarg de la llsita o amb el num d'elements? doncs a la deficinió només has de posar el nom i el tipus de variable del parametre
es més senzill del que fas
*/


//IMPORT
import java.util.ArrayList;
import java.util.Scanner;
//CLASS
public class AppM7E1 {
	//MAIN METHOD
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> marksList = new ArrayList<Double>();//CREATION AL 
		//var
		double resultSumMarks;
		double averageResult;
		
		//CALL METHODS
		printMessage("Introdueix 3 notes. El programa calcula la mitja. Digue'm la primera");
		marksList.add(input.nextDouble());
		printMessage("Ara, digue'm la segona");
		marksList.add(input.nextDouble());
		printMessage("Per finalitzar, digue'm l'última");
		marksList.add(input.nextDouble());
		
		sumMarks(ArrayList<Double> marksList);//CALL METHOD TO SUM THE VALUE OF THE ELEMENTS OF THE AL
		resultSumMarks = sum;
		
		ArrayList size = marksList.size();
		averageMethod(resultSumMarks,size);//CALL METHOD TO CALCULATE THE AVERAGE OF THE ELEMENTS OF THE AL
		averageResult = result;
		
		check (averageResult);//CALL METHOD TO CHECK THE AVERAGE RESULT AND PRINT MESSAGE
		
		input.close();
	}
	//DEFINITION OF METHODS

	static double printMessage (String mensaje) {
		Scanner input = new Scanner(System.in);//s'ha de crear aquí tb?
		System.out.println("mensaje"); 
		return input.nextDouble();
	}
		
	static double sumMarks(ArrayList<Double> List) {
		    int sum = 0;
		    for(int i = 0; i<List.size(); i++){
		    	sum+=List.get(i);
		    }
		    return sum;
	}
	
	static double averageMethod(double resultSum, int size) {
		double result = resultSum/size;
		return result;
	}
	static void check (double result) {
		if (result < 5) {
			System.out.println("No has superat el curs. Has de recuperar."); 
		}
		else if(result >= 5 && result <=7) {
			System.out.println("Enhorabona! Has aprovat, però hauries de continuar practicant”"); 
		}else {
			System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!"); 
		}
	System.out.println("Fi");
	}
}
