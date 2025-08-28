public class SearchElementFromArray06{
    public static int searchIndex(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 10, 9, 25, 35};
        int x = 5;
        int res1 = searchIndex(arr, x);
        System.out.println(res1);
    }
}