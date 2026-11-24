public class JavaSwitchCase {
public static void main(String[]args) {
double num1 = 40;
double num2 = 30;
char operator = '+';
switch (operator) {
 case '+':
System.out.println("Addition:" + (num1 + num2));
break;
case '-':
System.out.println("Subtraction: " + (num1 - num2));
break;
case '*':
System.out.println("Multiplication:" + (num1 * num2));
break;
case '/':
if (num1 != 0) {
System.out.println("Division:" + (num1 / num2));
} else {
System.out.println("Cannot divide by Zero");
}
break;
default:
System.out.println("Invalid operator");
}
}
}

