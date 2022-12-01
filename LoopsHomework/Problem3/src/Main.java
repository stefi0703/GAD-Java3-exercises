import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your imput number is: ");
        Scanner in = new Scanner(System.in);
        Integer no = in.nextInt();
        int newNo = 0;
        int aux = no;
        while(aux!=0){
            int r = aux % 10;
            newNo = newNo * 10 + r;
            aux = aux / 10;
        }
        System.out.println("Your reversed number is: "+newNo);
    }
}