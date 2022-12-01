import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sumOdd=0, sumEven=0,no;
        char choice;
        do{
            System.out.println("Your imput number is: ");

            no = in.nextInt();
            if(no%2==0)sumEven+=no;
            else sumOdd+=no;
            System.out.println("Add another number? y/n");
            choice = in.next().charAt(0);

        }while(choice=='y');
        System.out.println("Sum of even integers: "+sumEven+ " and sum of odd integers: "+sumOdd);
    }}