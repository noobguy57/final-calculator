import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is your semester grade?");
    double semester = in.nextDouble();
    System.out.println("How much is your final worth?");
    int percentFinal = in.nextInt();
    System.out.println("What do you want in the class?");
    int wantedScore = in.nextInt();
    double requiredScore = (100*wantedScore-(100-percentFinal)*semester)/percentFinal;
    System.out.println("You need "+ requiredScore+" to get "+wantedScore);
    if (requiredScore>100)
    {
      System.out.println("Sadly that score is impossible to get. Aim a little lower.");
    }
    if (requiredScore<80)
    {
      System.out.println("EZ PZ LEMON SQUEEZY");
    }
    in.close();
  }
}
