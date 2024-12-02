package methods;

public class MethodRecaps {
	
	public static void main(String[]args) {
		display(100,'e','z');
		display(100,'A','O');
	}
	
	public static char getRandomCharacter(char a,char b) {
		return (char)(a +Math.random()*((b-a)+1));
	}
	
	public static void display(int times,char a,char b) {
		for(int i=1;i<=times;i++) {
			System.out.print(getRandomCharacter(a,b)+" ");
			if(i%10==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	

}
