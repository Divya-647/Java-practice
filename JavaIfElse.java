public class JavaIfElse {
  public static void main(String[]args){
    checkPassFail();
    checkOddEven();
    checkPositiveNegative();
    findGreatest();
    checkVotingAge();
  }
    // 1. pass or fail
    static void checkPassFail() {
    int marks = 75;
    if (marks >= 40) {
      System.out.println("Result: pass");
    }
    else {
      System.out.println("Result: Fail");
    }
    }
  // 2. Odd or even
    static void checkOddEven() {
    int number = 24;
    if (number % 2 == 0){
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
    }
  // 3. Positive or negative 
  static void checkPositiveNegative() {
    int num = -10;
    if (num > 0) {
      System.out.println("Positive");
    }
    else if (num < 0) {
      System.out.println("Negative");
    }
    else {
      System.out.println("Zero");
    }
  }
    // 4. Greatest of Two Numbers
    static void findGreatest() {
      int a = 50;
      int b = 30;
      if (a > b) {
        System.out.println("A is greater ");
      }
    else {
      System.out.println("B is greater or equal");
    }
    }
    // 5. Voting Eligibility
    static void checkVotingAge() {
      int age = 23;
      if (age >= 18) {
        System.out.println("Eligible to vote");
      }
    else {
      System.out.println("Not eligilble to vote");
    }
    }
  }





      
