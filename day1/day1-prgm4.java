import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x = sc.nextInt();
        int originalNum = x;
        int reversed = 0;
        
        while (x > 0) {
            int remainder = x % 10;  
            reversed = reversed * 10 + remainder;  
            x = x / 10;  
        }
        
        if (reversed == originalNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
