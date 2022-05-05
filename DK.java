package nxtd_ata;
import java.util.Scanner;
class DK
{
    public static boolean isPrime(int num) {
        int c=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                c++;
        }
        if (c==2)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();


        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                while(!isPrime(count)){
                    count++;
                }
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}