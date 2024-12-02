package methods;

import java.util.Scanner;

public class MonthDisplay {

	public static void main(String[] args) {
//		System.out.println(getStartDay(11, 2024));
//		printMonthBody(11, 2024);
		printCalender();
//		yearCalender();
	}

	public static boolean isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public static int daysInMonth(int month, int year) {
		return switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 2 -> isLeap(year) ? 29 : 28;
		case 4, 6, 9, 11 -> 30;
		default -> 0;
		};
	}

	public static int getTotalNumberOfDays(int month, int year) {
		int totalNumberOfDays = 0;
		for (int i = 1800; i <= year; i++) {
			if (i == year) {
				for (int k = 1; k < month; k++) {
					totalNumberOfDays += daysInMonth(k, i);
				}
				break;
			}
			for (int j = 1; j <= 12; j++) {
				totalNumberOfDays += daysInMonth(j, i);
			}

		}
		return totalNumberOfDays;
	}

	public static int getStartDay(int month, int year) {
		final int START_DAY_OF_JAN_1800 = 3;
		return (START_DAY_OF_JAN_1800 + getTotalNumberOfDays(month, year)) % 7;
	}

	public static String getMonthName(int month) {
		return switch (month) {
		case 1 -> "JANUARY";
		case 2 -> "FEBRUARY";
		case 3 -> "MARCH";
		case 4 -> "APRIL";
		case 5 -> "MAY";
		case 6 -> "JUNE";
		case 7 -> "JULY";
		case 8 -> "AUGUST";
		case 9 -> "SEPTEMBER";
		case 10 -> "OCTOBER";
		case 11 -> "NOVEMBER";
		case 12 -> "DECEMBER";
		default -> "INVALID MONTH";
		};
	}

	public static void printMonthBody(int month, int year) {
		System.out.printf("%25s\n\n", getMonthName(month) + " " + year);
		System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", "MON", "TUES", "WED", "THURS", "FRI", "SAT", "SUN");
//		System.out.println(".".repeat(35));
		int daysInMonth = daysInMonth(month, year);
		int startday = getStartDay(month, year);
		if (startday == 0) {
			startday = 7;
		}
		for (int j = 0; j < startday; j++) {
			System.out.printf("%4s ", " ");
		}
		for (int i = 1; i <= daysInMonth; i++) {
			System.out.printf("%4s ", "" + i);
			if ((i + (startday)-1) % 7 == 0) {
				System.out.println();
				System.out.println(".".repeat(35));
			}
		}
		System.out.println("\n");

	}

	public static void printCalender() {

		try (Scanner scan = new Scanner(System.in)) {
			int year = 0;
			int month = 0;
			do {
				System.out.println("ENTER THE YEAR (SHOULD BE ABOVE 1800)");
				year = scan.nextInt();
				System.out.println("ENTER THE MONTH OF THE YEAR (BTWN 1 AND 12)");
				month = scan.nextInt();
				if (month < 1 || month > 12 || year < 1800) {
					System.out.println("INVALID INPUT");
					continue;
				}
				printMonthBody(month, year);
			} while (year < 1800 || (month < 1 || month > 12));
		} catch (Exception e) {
			System.out.println("INVALID INPUT\nONLY INTEGERS ALLOWED");
		}
	}

	public static void yearCalender() {
		try (Scanner scan = new Scanner(System.in)) {
			int year = 0;
			do {
				System.out.println("ENTER THE YEAR (SHOULD BE ABOVE 1800)");
				year = scan.nextInt();

				if (year < 1800) {
					System.out.println("INVALID INPUT");
					continue;
				}
//				printMonthBody(month, year);
			} while (year < 1800);
			for (int i = 1; i <= 12; i++) {
				printMonthBody(i, year);
			}

		} catch (Exception e) {
			System.out.println("INVALID INPUT\nONLY INTEGERS ALLOWED");
		}
	}
}
