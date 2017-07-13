package Dan2;

public class Zadatak4 {
	public static int sumDigits(long n){
		int temp = (int)Math.abs(n);
		int sum = 0;
		while (temp!=0){
			int reminder = temp%10;
			sum+=reminder;
			temp= temp/10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 java.util.Scanner unos = new java.util.Scanner(System.in);
 System.out.println("Unesite broj : ");
 int broj = unos.nextInt();
 System.out.println("Zbir cifara broja " + broj +" je : " + sumDigits(broj));
	}

}
