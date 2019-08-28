package Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private String name;
	private String cls;
	private int age;
	public void Student(String name, String cls, int age) {
		this.name = name;
		this.cls = cls;
		this.age = age;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Main> std = new ArrayList<Main>();
		System.out.println("학생 정보를 입력하시오: ");
		for(int i = 0; i < 2; i++) {
			System.out.print((i+1) + "이름: ");
			String name = scan.nextLine();
			System.out.print((i+1) + "반: ");
			String cls = scan.nextLine();
			System.out.print((i+1) + "나이: ");
			String age = scan.nextLine();
			
			double score = scan.nextDouble();
			
			
		}
		
		System.out.println(std);
	}

}
