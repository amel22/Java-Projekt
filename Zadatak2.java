package Dan2;

public class Zadatak2 {
public static int getGrade(double bodovi){
	 
	if (bodovi>=50){
		return 10;
	}
	else if(bodovi<=49){
		
		return 5;
		
	}
	else 
		return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
double bodovi = 55.5;
System.out.println("Vasa ocjena je : " );
getGrade(bodovi);
	}

}
