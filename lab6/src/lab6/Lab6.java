package lab6;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
    	Inword solver = new Inword();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n != -1)
                System.out.println(solver.inWords(n));
            else
                break;
        }
    }
}