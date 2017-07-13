package Dan2;

public class Zadatk3 {
public static int max(int br1, int br2){
	if (br1>br2){
		return br1;
	}
	else {
		return br2;
	}
}
public static double max(double broj1, double broj2) {
    if (broj1>broj2){
    	return broj1;
    }
    else {
    	return broj2;
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(max(3,6));
System.out.println(max(3.0,7.5));
	}

}
