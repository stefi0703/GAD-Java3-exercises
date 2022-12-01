import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your imput number is: ");
        Scanner in = new Scanner(System.in);
        Integer no = in.nextInt();
        System.out.println("Your multiplier is: ");
        Integer multiplier = in.nextInt();
        System.out.println("The multiplication table for "+no+" until "+multiplier+" is: ");
        for(int i = 1; i <= multiplier; i++)
            System.out.print(no*i+" ");

    }
}