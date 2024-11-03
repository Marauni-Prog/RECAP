package recaps;

import java.util.Scanner;

public class SubtractionQz {
public static void main(String[]args) {
	subtract();
}
public static void subtract() {
	for(int i=0;i<5;i++) {
	int a= (int)(Math.random()*10);
	int b=(int)(Math.random()*100);
	int c=b-a;
	Scanner scan= new Scanner(System.in);
	System.out.println("What is "+b+" - "+a+" ?");
	int answer=scan.nextInt();
	if(c==answer) {
		System.out.println("Bravo");
	}else {
		System.out.println("Ooops, "+b+" - "+a+" = "+c);
	}
	}
System.out.println("Bravo, the end.");
}
}
