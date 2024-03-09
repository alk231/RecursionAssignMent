import java.util.Scanner;

public class P5 {

  public static int isArmstrong(int n) {
    if (n == 0)
      return 0;
    else {
      return (int) Math.pow(n % 10, 3) + isArmstrong(n / 10);
    }

  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    if (n == isArmstrong(n)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
