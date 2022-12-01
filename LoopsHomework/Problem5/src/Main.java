import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int no1 = 0, no2 = 1, no3 = 1, terms = 3,n,currentNo;
        System.out.println("how many terms you want in your Fibo series?");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.print("Your fibo series is:"+no1+" "+no2+" "+no3);
        while(terms<n) {
            currentNo=no2+no3;
            no2=no3;
            no3=currentNo;
            terms++;
            System.out.print(" "+currentNo);
        }

    }
}