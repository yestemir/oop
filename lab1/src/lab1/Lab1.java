package lab1;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Student student = new Student("pervash", "017110354");
	        System.out.println(student.getName());
	        System.out.println(student.getId());
	        System.out.println(student.year);
	        student.year_of_study();
	        System.out.println(student.year);
	}

}
