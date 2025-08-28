public class FindLargetsNumberInArray08{
    public static int findLargets(int[] arr){
        int largest = arr[0];
        for(int num: arr){
            if(num > largest) largest = num;
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {-10, -7, -2, -1, -8, -225, -56};
        int result = findLargets(arr);
        System.out.println("largets: " +  result);
    }
}