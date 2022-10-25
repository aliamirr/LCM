import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a, b, i, x, lcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        x = (a > b) ? a : b;

        for(i = x; i<= a*b; i = i+x)
        {
            if(i % a == 0 && i % b == 0)
                break;
        }

        System.out.println("LCM of " + a + " and " + b + "is: " + i);
    }
}