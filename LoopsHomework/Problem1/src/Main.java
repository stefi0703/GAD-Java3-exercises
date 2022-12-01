public class Main {
    public static void main(String[] args) {
        //pattern 1
        int size = 6;
        for(int i = 0; i < size ; i++)
        {
            for(int j = 2*(size-i) ; j >= 0 ;j--)
                System.out.print(" ");
            for(int j = 0; j <= i; j++)
               System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        //pattern 2

        for(int i = size; i >=0 ; i--)
        {
            for(int j = 0; j <= size; j++)
                if( i < j ) System.out.print("* ");
                else System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        //pattern 3
       for(int i = size; i >=0 ; i--)
       {
           for(int j = 0; j <= i; j++)
               System.out.print("* ");
           System.out.println();
       }
        System.out.println();
       //pattern 4
        size = 7;
        for(int i = size; i >=0 ; i--)
        {
            for(int j = 0; j <= size; j++)
                if( i <= j ) System.out.print("*");
                 else System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        //pattern 5
        int no = 1;
        for(int i = 0; i < size ; i++)
        {

            for(int j = 0; j <= i; j++) {
                System.out.print(no++ + " ");
            }
            System.out.println();
        }
    }
}