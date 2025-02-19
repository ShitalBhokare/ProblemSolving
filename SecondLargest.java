import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        
        System.out.println(second == Integer.MIN_VALUE ? "No second largest" : second);
        sc.close();
    }
}
