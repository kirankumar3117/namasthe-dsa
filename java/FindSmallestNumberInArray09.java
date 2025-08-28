public class FindSmallestNumberInArray09{
    public static int findSmallest(int[] arr){
        int largest = arr[0];
        for(int num: arr){
            if(num < largest) largest = num;
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {-10, -7, -2, -1, -8, -225, -56};
        int result = findSmallest(arr);
        System.out.println("Smallest: " +  result);
    }
}