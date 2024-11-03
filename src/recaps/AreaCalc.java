package recaps;

import java.util.Scanner;

public class AreaCalc {
	
	public static void main(String[]args) {
		var scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius=scanner.nextDouble();
//		System.out.println("The area of a circle of radius "+radius+" is " + circleArea(radius));
		System.out.printf("%s %.2f %s %.2f%n", "The area of a circle of radius ",radius,"is",circleArea(radius));
		
		System.out.println("Enter the lenth of the Rectangle");
		double length=scanner.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width=scanner.nextDouble();
		System.out.printf("%s %.2f %s %.2f %s %.2f","The area of a Rectangle of "
				+ "lenth",length,"and width",width,"is",recArea(length,width));
		kmToMilesConverter();
		}
	
	public static double circleArea(double radius) {
		final double PI=3.142;
		double area=radius*radius*PI;
		return area;
	}
	public static double recArea(double length, double width) {
		double area = length*width;
		return area;
	}
	public static double kmToMiles(double km) {
		final double con=1.60;
		return con*km;
	}
	public static void kmToMilesConverter() {
		System.out.println("Enter Kms to be converted");
		Scanner scan= new Scanner(System.in);
		var km=scan.nextDouble();
		System.out.printf("%.2f %s %.2f %s", km,"Kilometres make ", kmToMiles(km),"miles");
	}
}
  