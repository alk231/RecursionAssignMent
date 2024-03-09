import java.util.Scanner;

public class P2 {
    public static int sumNaturalNoWithAlterSign(int n){
        int sum =0;
        if(n==0) return 0;
        else{
            if(n%2==0){
                sum=sum-n+sumNaturalNoWithAlterSign(n-1);
            }
            else{
                sum=sum+n+sumNaturalNoWithAlterSign(n-1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNaturalNoWithAlterSign(n));
    }
}
