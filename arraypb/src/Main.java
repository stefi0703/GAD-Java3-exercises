public class Main {
    public static void printSumOfArrayElements(int[] numbers) {
        int sum = 0;
        for(int i = 0; i <= numbers.length - 1; i++)
            sum += numbers[i];
        System.out.println(sum);


    }
    public static void main(String[] args)
    {
        int[] numbers2 = {23, 45, 12};
        printSumOfArrayElements(numbers2);
    }
}