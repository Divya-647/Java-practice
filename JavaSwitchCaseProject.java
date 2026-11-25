import java.util.Scanner ;
public class JavaswitchCaseProject {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
int choice;
do {
System.out.println("\n=================================");
System.out.println("        JAVA SWITCH CASE PROJECT ");
System.out.println("1. Simple Calculator");
System.out.println("2. Day Finder");
System.out.println("3. Month Finder");
System.out.println("4. Vowel or Consonanat");
System.out.println("5. Number Checker");
System.out.println("6. Exit");
System.out.println("===================================");
System.out.print("Enter Your choice");
choice = sc.nextInt();

switch (choice) {

// SIMPLE CALCULATOR
case 1:
System.out.println("\n--- SIMPLE CALCULATOR");
System.out.print("Enetr first number:");
double num1 =sc.nextDouble();
System.out.print("Enter second number:");
double num2 = sc.nextDouble();
System.out.println("\nSelect Operator:");
System.out.println("1. Addition (+)");
System.out.println("2. Subtraction (-)");
System.out.println("3. Multiplication (*)");
System.out.println("4. Division (/)");
System.out.println("Enter operator:");
int operation = sc.nextInt();
switch (operation) {
case 1:
System.out.println("Result: "+ (num1 + num2));
break;
case 2:
System.out.println("Result: "+ (num1 - num2));
break;
case 3:
System.out.println("Result: "+ (num1 * num2));
break;
case 4:
if (num2 != 0) {
System.out.println("Result: "+ (num1 / num2));
} else {
System.out.println("Error Division by Zero is not allowed!");
}
break;
default:
System.out.println("Invalid operation!");
}
break;

	// DAY FINDER 
case 2:
System.out.println("\n--- DAY FINDER ----");
System.out.print("Enter day number (1-7)");
int day = sc.nextInt();
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invalid day number!");
}
break;
 // MONTH FINDER
case 3:
System.out.println("\n--- MONTH FINDER ---");
System.out.print("Enter month number (1-12):");
int month = sc.nextInt();
switch (month)
{
case 1:
System.out.println("January");
break;
case 2:
System.out.println("February");
break;
case 3:
System.out.println("March");
break;
case 4:
System.out.println("April");
break;
case 5:
System.out.println("May");
break;
case 6:
System.out.println("June");
break;
case 7:
System.out.println("July");
break;
case 8:
System.out.println("August");
break;
case 9:
System.out.println("September");
break;
case 10:
System.out.println("October");
break;
case 11:
System.out.println("November");
break;
case 12:
System.out.println("December");
break;
  default:
System.out.println("Invalid month number!");
}
break;

		// VOWEL OR CONSONANT CHECKER 
case 4:
System.out.println("\n--- VOWEL OR CONSONANT CHECKER ---");
System.out.print("Enter an alphabet:");
char ch = sc.next().toLowerCase().charAt(0);
switch (ch) {
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("It is a vowel.");
break;
default:
if (ch >= 'a' && ch <= 'z') {
System.out.println("It is a Consonant.");
} else {
System.out.println("Invalid character!");
}
}
break;
		// NUMBER CHECKER
case 5:
System.out.println("\n--- NUMBER CHECKER ---");
System.out.print("Enter a number: ");
double number = sc.nextDouble();
switch (number > 0 ? 1 : number < 0 ? 2 : 3) {
case 1:
System.out.println("Positive Number");
break;
case 2:
System.out.println("Negative Number");
break;
case 3:
System.out.println("Number is Zero");
break;
}
break;
// EXIT
case 6 :
System.out.println("\nThank you for using Java Switch Case Project!");
break;
// INVALID CHOICE 
default:
System.out.println("\nInvalid choice! Please try again.");
}
} while (choice != 6);
sc.close();
}
}
