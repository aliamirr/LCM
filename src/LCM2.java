import java.util.Scanner;

public class LCM2
{
    public static void main(String[] args) {
        int a, b, i, gcd, lcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        for(i = 1; i <=a && i<=b ; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                lcm = (a * b) / gcd;
            }
        }
        System.out.println("LCM of " + a + " and " + b + "is: " + i);
    }
}
