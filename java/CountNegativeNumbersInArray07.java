public class CountNegativeNumbersInArray07{
    public static int countNegative(int[] arr){
        int count = 0;
        for(int i : arr){
            if(i < 0) count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {5, -8, -8, -52, 5, -4, -8, 5, 6, -7, 85, 96, -45};
        int result = countNegative(arr);
        System.out.println("result" + " " +  result);
    }
}