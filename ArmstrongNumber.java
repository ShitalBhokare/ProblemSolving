import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        
        System.out.println(sum == num ? "Armstrong Number" : "Not an Armstrong Number");
        sc.close();
    }
}
