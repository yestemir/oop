package lab5;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Repeat r = new Repeat();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n]; 
		
		for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
		
		r.arr = array;
		
		System.out.print(r.toString());
	}
}
