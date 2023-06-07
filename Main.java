import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int num1, num2, num3, num4, num5;
    int a = 5;
    System.out.println("wprowadź pierwszą liczbę:");
    Scanner scanner = new Scanner(System.in);
    num1 = scanner.nextInt();
    System.out.println("wprowadź drugą liczbę:");
    num2 = scanner.nextInt();
    System.out.println("wprowadź trzecią liczbę:");
    num3 = scanner.nextInt();
    System.out.println("wprowadź czwartą liczbę:");
    num4 = scanner.nextInt();
    System.out.println("wprowadź piątą liczbę:");
    num5 = scanner.nextInt();
    
    System.out.println("Suma tych liczb wynosi: " + (num1 + num2 + num3 + num4 + num5));

    System.out.println("Średnia tych liczb wynosi: " + (num1 + num2 + num3 + num4 + num5) / a);
  }
}