package loops;

import java.util.Scanner;

public class WhileLoopsRecap {
	
	public static void main (String[]args) {
//		whileSimple(20);
//		int count=0;
//		while(count<5) {
//			addition();
//			count++;
//		}
//		magicNumber();
		subtraction();
	}
	
//	THE WHILE LOOP.
	public static void whileSimple(int times) {
		if(times <=0) {
			times=10;
		}
		int count =0;
		while(count<times) {
			System.out.println("JAVA PROGRAMMING IS FUN");
			count++;
		}
	}
	
	public static void addition() {
		Scanner scan= new Scanner(System.in);
		int a= (int)(Math.random()*100);
		int b= (int)(Math.random()*100);
		
		System.out.println("WHAT IS "+a+" + "+b+"?");
		int answer=scan.nextInt();
		while(a+b!=answer) {
			System.out.println("YOU ARE WRONG\nWHAT IS "+a+" + "+b+"?");
			answer=scan.nextInt();
//			REMEMBER THE CONDITION TO AVOID AN INFINITE LOOP
		}
	}
	
	public static void magicNumber() {
		int magic = (int)(Math.random()*100);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER YOUR MAGIC NUMBER (MAGIC >=0 && MAGIC <=100");
		int guess= scan.nextInt();
		boolean stop=true;
		
		while(stop) {
		if(magic==guess) {
			System.out.println("BRAVO");
			stop = false;
			}
		if(guess< magic) {
			System.out.println("TOO LOW\nTRY AGAIN");
			guess=scan.nextInt();
			}
		if(guess> magic){
			System.out.println("TOO HIGHT\nTRY AGAIN");
			guess= scan.nextInt();
			}
		}
			
	}
	
	public static void subtraction() {
		final int TRYS = 5;
		int countRight=0;
		int countWrong=0;
		Scanner scan = new Scanner(System.in);
		
		long startTime= System.currentTimeMillis();
		int count =0;
		while(count<TRYS) {
			int a=(int)(Math.random()*100);
			int b =(int)(Math.random()*100);
			if(a<b) {
				int temp= a;
				a=b;
				b=temp;
			}
			System.out.println("WHAT IS "+a+" - "+b+" ?");
			int answer=scan.nextInt();
			if((a-b)==answer) {
				System.out.println("BRAVO!");
				countRight++;
			}else {
				System.out.println("WRONG");
				countWrong++;
			}
			count++;
		}
		long endTime=System.currentTimeMillis();
		String statement="YOU GOT:\n "+countRight+" RIGHT\n "+countWrong+" WRONG\nTEST TIME = "+(endTime-startTime)/100+" Secs";
		System.out.println(statement);
	}
	

}
