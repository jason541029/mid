package com.fju.mid;
import java.util.Scanner;
public class Numers {

	public static void main(String[] args) {
		System.out.println("1-10");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i= 1;i<10;i++){
		if(n%5 == 0){
			System.out.println("#");
			System.out.print(i+" ");
			if(i==10);
		}
		break;
		
		

	}

	}
}