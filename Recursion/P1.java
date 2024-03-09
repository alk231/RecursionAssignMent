import java.util.Scanner;
class P1{
    public static int sumOfDigits(int n){
        int sum =0;
        if(n==0) return 0;
        else{
            sum= sum+(n%10)+sumOfDigits(n/10);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}