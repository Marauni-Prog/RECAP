package loops;

import java.util.Scanner;

public class LoopQZ {
	public static void main(String[] args) {
//		multiQz();
		tempConverter();
		inchToCm();
		tempConverter1();
		squareMetreToPing();
		feePrediction(10);
		findHighScore();
	}

//	5.2
//	(Repeat multiplications) Listing 5.4, SubtractionQuizLoop.java, generates five
//	random subtraction questions. Revise the program to generate ten random multi-
//	plication questions for two integers between 1 and 12. Display the correct count
//	and test time.
	public static void multiQz() {
		try (Scanner scan = new Scanner(System.in)) {
			int count = 0;
			int rightcount = 0;
			int wrongcount = 0;
			long startTime = System.currentTimeMillis();

			while (count < 5) {
				int a = (int) (Math.random() * 13);
				int b = (int) (Math.random() * 13);

				System.out.println("What is " + a + " x " + b + " ?");
				int answer = scan.nextInt();
				if (answer == (a * b)) {
					rightcount++;
					System.out.println("BRAVO!");
				} else {
					wrongcount++;
					System.out.println("OOPS! THE ANSWER IS " + (a * b));
				}
				count++;
			}

			long endTime = System.currentTimeMillis();
			System.out.println("\nYOU HAVE GOT " + rightcount + " RIGHT\nAND " + wrongcount + " WRONG\n"
					+ "TOTAL TIME TAKEN " + (endTime - startTime) / 100 + " SECS");
		}
	}
// (Conversion from C° to F°) Write a program that displays the following table
// (note that Fahrenheit = Celsius * 9/5 + 32):
// Celsius
// 0
// 2
// . . .
// 98
// 100
// Fahrenheit
// 32.0
// 35.6
// 208.4
// 212.0

	public static void tempConverter() {
		System.out.printf("%20s %20s", "CELSIUS", "FAHRENHEIT\n");
		for (int i = 0; i < 10; i++) {
			double Cel = Math.random() * 100;
			double Fer = (Cel * 9 / 5) + 32;
			System.out.printf("%20.2f%20.2f\n", Cel, Fer);
		}
		System.out.println();
	}

// (Conversion from inch to centimeter) Write a program that displays the following
// table (note that 1 inch is 2.54 centimeters):
//	 Inches
//	 1
//	 2
//	 . . .
//	 9
//	 10
//	 Centimetres
//	 2.54
//	 5.08
//	 22.86
//	 25.4
	public static void inchToCm() {
		System.out.printf("%20s %20s", "INCHES", "CM\n");
		for (int i = 0; i < 10; i++) {
			double inch = Math.random() * 100;
			double cm = inch * 2.54;
			System.out.printf("%20.2f%20.2f\n", inch, cm);
		}
		System.out.println();
	}

// (Conversion from C o to F o and Fo to C o) Write a program that displays the fol-
// lowing two tables side by side:
// Celsius
//  Fahrenheit
//  |
//  Fahrenheit
//  Celsius
// 0
//  32.000
//  |
//  20
//  −6.667
// 2
//  35.600
//  |
//  25
//  −3.889
// . . .
// 98
//  208.400
//  |
//  265
//  129.444
// 100
//  212.000
//  |
//  270
//  132.222
	public static void tempConverter1() {
		System.out.printf("%10s %20s| %5s%20s", "CELSIUS", "FAHRENHEIT", "FAHRENHEIT", "CELSIUS\n");
		System.out.println(".".repeat(70));
		for (int i = 0; i < 10; i++) {
			double cel1 = Math.random() * 100;
			double cel2 = Math.random() * 100;
			double Fer1 = (cel1 * 9 / 5) + 32;
			double Fer2 = (cel2 * 9 / 5) + 32;
			System.out.printf("%10.2f%20.2f | %5.2f%20.2f\n", cel1, Fer1, Fer2, cel2);
			System.out.println(".".repeat(70));
		}
		System.out.println();
	}

// (Conversion from square meter to ping) Write a program that displays the fol-
// lowing two tables side by side (note that 1 ping = 3.305 square meters):
	public static void squareMetreToPing() {
		System.out.printf("%10s %20s| %5s%15s", "PING", "SQUAREMETRE", "SQUAREMETRE", "PING\n");
		System.out.println("_".repeat(70));
		for (int i = 0; i < 10; i++) {
			double sq1 = Math.random() * 100;
			double sq2 = Math.random() * 100;
			double ping1 = (sq1 * 3.305);
			double ping2 = (sq2 * 3.305);
			System.out.printf("%10.2f%20.2f | %5.2f%20.2f\n", ping1, sq1, sq2, ping2);
			System.out.println("_".repeat(70));
		}
		System.out.println();
	}

// (Financial application: compute future tuition) Suppose that the tuition for a
// ­university is $10,000 this year and increases 6% every year. In one year, the
// ­tuition will be $10,600. Write a program that computes the tuition in ten years
// and the total cost of four years’ worth of tuition after the tenth year
	public static void feePrediction(int years) {
		double currentFee = 10000;
		double annualInterest = 1.06;
		for (int i = 0; i < years; i++) {
			double temp = currentFee * annualInterest;
			currentFee = temp;
		}
//	 tution after years;
		double totalTution = currentFee;
		for (int i = 0; i < 4; i++) {
			double temp = totalTution * annualInterest;
			totalTution = temp;
		}
		System.out.printf("%s %d %s %.2f \n%s %d %s %.2f", "THE TUTION FEE AFTER ", years, " YEARS IS ", currentFee,
				"THE TOTAL FEE FOR 4 YEAR COURSE AFTER ", years, " YEARS WILL BE ", totalTution);
	}

//(Find the highest score) Write a program that prompts the user to enter the num-
//ber of students and each student’s name and score, and finally displays the name
//of the student with the highest score. Use the next() method in the Scanner
//class to read a name, rather than using the nextLine() method. Assume that the
//number of students is at least 1.
//(Find the two lowest scores)
	public static void findHighScore() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("ENTER THE NUMBER OF STUDENTS:");
			int students = scan.nextInt();
			String[] names = new String[students];
			int[] scores = new int[students];

			int lowestScore = 0;
			int lowestScoreIndex = 0;
			int highScore = 0;
			int highScoreIndex = 0;

			for (int i = 0; i < students; i++) {
				System.out.println("ENTER THE NAME OF THE STUDENT THEN THE STUDENTS SCORE");
				names[i] = scan.next();
				scores[i] = scan.nextInt();
			}

			System.out.printf("%s %d\n", "" + names[highScore(scores)[1]] + " HAD THE HIGHEST SCORE OF ",
					highScore(scores)[0]);
			System.out.printf("%s %d\n", "" + names[lowScore(scores)[1]] + " HAD THE LOWEST SCORE OF ",
					lowScore(scores)[0]);
		}
	}

// used in method above;
	public static int[] highScore(int[] b) {
		int high = b[0];
		int highIndex = 0;

		for (int i = 0; i < b.length; i++) {
			if (high < b[i]) {
				high = b[i];
				highIndex = i;
			}

		}
		int[] a = { high, highIndex };
		return a;
	}

// used in method above
	public static int[] lowScore(int[] b) {
		int lowIndex = 0;
		int low = b[0];
		for (int i = 0; i < b.length; i++) {
			if (low > b[i]) {
				low = b[i];
				lowIndex = i;
			}
		}
		int[] a = { low, lowIndex };
		return a;
	}
}
